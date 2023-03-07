/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 *
 * For more information, please visit: http://www.jooq.org/licenses
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.jooq.impl;

import static org.jooq.Clause.TABLE_VALUES;
// ...
// ...
// ...
// ...
// ...
// ...
import static org.jooq.SQLDialect.DERBY;
// ...
import static org.jooq.SQLDialect.FIREBIRD;
// ...
// ...
// ...
// ...
import static org.jooq.SQLDialect.MARIADB;
// ...
import static org.jooq.SQLDialect.MYSQL;
// ...
// ...
import static org.jooq.SQLDialect.POSTGRES;
// ...
// ...
// ...
// ...
// ...
import static org.jooq.SQLDialect.YUGABYTEDB;
import static org.jooq.conf.ParamType.INLINED;
import static org.jooq.impl.DSL.name;
import static org.jooq.impl.DSL.row;
import static org.jooq.impl.Keywords.K_MULTISET;
import static org.jooq.impl.Keywords.K_ROW;
import static org.jooq.impl.Keywords.K_STRUCT;
import static org.jooq.impl.Keywords.K_TABLE;
import static org.jooq.impl.Keywords.K_UNNEST;
import static org.jooq.impl.Keywords.K_VALUES;
import static org.jooq.impl.Names.N_VALUES;
import static org.jooq.impl.QueryPartListView.wrap;
import static org.jooq.impl.SubqueryCharacteristics.DERIVED_TABLE;
import static org.jooq.impl.Tools.EMPTY_ROW;
import static org.jooq.impl.Tools.anyMatch;
import static org.jooq.impl.Tools.isEmpty;
import static org.jooq.impl.Tools.isVal;
import static org.jooq.impl.Tools.map;
import static org.jooq.impl.Tools.visitSubquery;

import java.util.Set;

import org.jooq.Context;
import org.jooq.DataType;
import org.jooq.Field;
import org.jooq.Function1;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row;
import org.jooq.SQLDialect;
import org.jooq.Select;
import org.jooq.Table;
import org.jooq.TableOptions;
import org.jooq.conf.ParamType;
import org.jooq.impl.QOM.UnmodifiableList;


/**
 * An implementation for the <code>VALUES(…)</code> table constructor
 *
 * @author Lukas Eder
 */
final class Values<R extends Record> extends AbstractTable<R> implements QOM.Values<R> {

    static final Set<SQLDialect>         NO_SUPPORT_VALUES              = SQLDialect.supportedUntil(FIREBIRD, MARIADB);
    static final Set<SQLDialect>         REQUIRE_ROWTYPE_CAST           = SQLDialect.supportedBy(DERBY, FIREBIRD);
    static final Set<SQLDialect>         REQUIRE_ROWTYPE_CAST_FIRST_ROW = SQLDialect.supportedBy(POSTGRES, YUGABYTEDB);
    static final Set<SQLDialect>         NO_SUPPORT_PARENTHESES         = SQLDialect.supportedBy();

    private final QueryPartListView<Row> rows;
    private transient DataType<?>[]      types;

    Values(Row[] rows) {
        super(TableOptions.expression(), N_VALUES);

        this.rows = assertNotEmpty(rows);
    }

    static final QueryPartListView<Row> assertNotEmpty(Row[] rows) {
        if (rows == null || rows.length == 0)
            throw new IllegalArgumentException("Cannot create a VALUES() constructor with an empty set of rows");

        return QueryPartListView.wrap(rows);
    }

    private final DataType<?>[] rowType() {
        if (types == null) {
            types = new DataType[rows.get(0).size()];

            typeLoop:
            for (int i = 0; i < types.length; i++) {
                types[i] = rows.get(0).dataType(i);

                if (types[i].getType() == Object.class) {
                    for (int j = 1; j < rows.size(); j++) {
                        DataType<?> type = rows.get(j).dataType(i);

                        if (type.getType() != Object.class) {
                            types[i] = type;
                            continue typeLoop;
                        }
                    }
                }
            }
        }

        return types;
    }

    private final Field<?>[] castToRowType(Field<?>[] fields) {
        Field<?>[] result = new Field[fields.length];

        for (int i = 0; i < result.length; i++) {
            DataType<?> type = rowType()[i];
            result[i] = fields[i].getDataType().equals(type) ? fields[i] : fields[i].cast(type);
        }

        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    public final Class<? extends R> getRecordType() {
        // TODO: [#4695] Calculate the correct Record[B] type
        return (Class<? extends R>) RecordImplN.class;
    }

    @Override
    public final Table<R> as(Name alias) {
        return new TableAlias<>(this, alias, c -> !NO_SUPPORT_PARENTHESES.contains(c.dialect()));
    }

    @Override
    public final Table<R> as(Name alias, Name... fieldAliases) {
        return new TableAlias<>(this, alias, fieldAliases, c -> !NO_SUPPORT_PARENTHESES.contains(c.dialect()));
    }

    private final Row castNullLiteralToRowType(Context<?> ctx, Row row) {
        if (anyMatch(row.fields(), f -> rendersNullLiteral(ctx, f))) {
            Field<?>[] result = new Field[row.size()];

            for (int i = 0; i < result.length; i++)
                if (rendersNullLiteral(ctx, row.field(i)) && rowType()[i].getType() != Object.class)
                    result[i] = row.field(i).cast(rowType()[i]);
                else
                    result[i] = row.field(i);

            return row(result);
        }
        else
            return row;
    }

    private final boolean rendersNullLiteral(Context<?> ctx, Field<?> field) {
        return isVal(field) && ((Val<?>) field).getValue() == null && ((Val<?>) field).isInline(ctx)
            || field instanceof NullCondition;
    }

    @Override
    public final void accept(Context<?> ctx) {
        // [#915] Emulate VALUES(..) with SELECT .. UNION ALL SELECT ..
        // for those dialects that do not support a VALUES() constructor
        if (NO_SUPPORT_VALUES.contains(ctx.dialect())) {
            Select<Record> selects = null;
            boolean cast = REQUIRE_ROWTYPE_CAST.contains(ctx.dialect());

            for (Row row : rows) {
                Select<Record> select = DSL.select(cast ? castToRowType(row.fields()) : row.fields());

                if (selects == null)
                    selects = select;
                else
                    selects = selects.unionAll(select);
            }

            visitSubquery(ctx, selects, DERIVED_TABLE, false);
        }







        // [#915] Native support of VALUES(..)
        else {
            ctx.start(TABLE_VALUES);















            ctx.visit(K_VALUES);

            if (rows.size() > 1)
                ctx.formatIndentStart()
                   .formatSeparator();
            else
                ctx.sql(' ');

            for (int i = 0; i < rows.size(); i++) {
                if (i > 0)
                    ctx.sql(',')
                       .formatSeparator();

                if (ctx.family() == MYSQL)
                    ctx.visit(K_ROW).sql(" ");





                // [#11015] NULL literals of known type should be cast in PostgreSQL in the first row
                if (i == 0 && REQUIRE_ROWTYPE_CAST_FIRST_ROW.contains(ctx.dialect()))
                    ctx.visit(castNullLiteralToRowType(ctx, rows.get(i)));

                // [#11015] Or in Derby in any other row, too
                else if (REQUIRE_ROWTYPE_CAST.contains(ctx.dialect()))
                    ctx.visit(castNullLiteralToRowType(ctx, rows.get(i)));
                else
                    ctx.visit(rows.get(i));
            }

            if (rows.size() > 1)
                ctx.formatIndentEnd()
                   .formatNewLine();










            ctx.end(TABLE_VALUES);
        }
    }

    @Override
    final FieldsImpl<R> fields0() {
        return new FieldsImpl<>(rows.get(0).fields());
    }

    // -------------------------------------------------------------------------
    // XXX: Query Object Model
    // -------------------------------------------------------------------------

    @Override
    public final Function1<? super UnmodifiableList<? extends Row>, ? extends Table<R>> $constructor() {
        return r -> new Values<>(r.toArray(EMPTY_ROW));
    }

    @Override
    public final UnmodifiableList<? extends Row> $arg1() {
        return QOM.unmodifiable(rows);
    }
}
