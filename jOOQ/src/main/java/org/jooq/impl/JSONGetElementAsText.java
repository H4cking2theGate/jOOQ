/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  https://www.apache.org/licenses/LICENSE-2.0
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
 * For more information, please visit: https://www.jooq.org/legal/licensing
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

import static org.jooq.impl.DSL.*;
import static org.jooq.impl.Internal.*;
import static org.jooq.impl.Keywords.*;
import static org.jooq.impl.Names.*;
import static org.jooq.impl.SQLDataType.*;
import static org.jooq.impl.Tools.*;
import static org.jooq.impl.Tools.BooleanDataKey.*;
import static org.jooq.impl.Tools.ExtendedDataKey.*;
import static org.jooq.impl.Tools.SimpleDataKey.*;
import static org.jooq.SQLDialect.*;

import org.jooq.*;
import org.jooq.Function1;
import org.jooq.Record;
import org.jooq.conf.ParamType;
import org.jooq.tools.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;



/**
 * The <code>JSON GET ELEMENT AS TEXT</code> statement.
 */
@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
final class JSONGetElementAsText
extends
    AbstractField<String>
implements
    QOM.JSONGetElementAsText
{

    final Field<JSON>    field;
    final Field<Integer> index;

    JSONGetElementAsText(
        Field<JSON> field,
        Field<Integer> index
    ) {
        super(
            N_JSON_GET_ELEMENT_AS_TEXT,
            allNotNull(VARCHAR, field, index)
        );

        this.field = nullSafeNotNull(field, JSON);
        this.index = nullSafeNotNull(index, INTEGER);
    }

    // -------------------------------------------------------------------------
    // XXX: QueryPart API
    // -------------------------------------------------------------------------

    @Override
    public final void accept(Context<?> ctx) {
        switch (ctx.family()) {





























            case MYSQL:
                ctx.visit(function(N_JSON_UNQUOTE, JSON, DSL.nullif(function(N_JSON_EXTRACT, JSON, field, inline("$[").concat(index).concat(inline("]"))), inline("null").cast(JSON))));
                break;

            case MARIADB:
                ctx.visit(function(N_JSON_UNQUOTE, JSON, DSL.nullif(function(N_JSON_EXTRACT, JSON, field, inline("$[").concat(index).concat(inline("]"))).cast(VARCHAR), inline("null"))));
                break;

            case SQLITE:
                ctx.visit(function(N_JSON_EXTRACT, JSON, field, inline("$[").concat(index).concat(inline("]"))));
                break;

            case CLICKHOUSE:
                ctx.visit(function(N_JSONExtractString, JSON, field, isub(index, one())));
                break;

            default:
                ctx.sql('(').visit(field).sql("->>").visit(index).sql(')');
                break;
        }
    }














    // -------------------------------------------------------------------------
    // XXX: Query Object Model
    // -------------------------------------------------------------------------

    @Override
    public final Field<JSON> $arg1() {
        return field;
    }

    @Override
    public final Field<Integer> $arg2() {
        return index;
    }

    @Override
    public final QOM.JSONGetElementAsText $arg1(Field<JSON> newValue) {
        return $constructor().apply(newValue, $arg2());
    }

    @Override
    public final QOM.JSONGetElementAsText $arg2(Field<Integer> newValue) {
        return $constructor().apply($arg1(), newValue);
    }

    @Override
    public final Function2<? super Field<JSON>, ? super Field<Integer>, ? extends QOM.JSONGetElementAsText> $constructor() {
        return (a1, a2) -> new JSONGetElementAsText(a1, a2);
    }

    // -------------------------------------------------------------------------
    // XXX: The Object API
    // -------------------------------------------------------------------------

    @Override
    public boolean equals(Object that) {
        if (that instanceof QOM.JSONGetElementAsText o) {
            return
                StringUtils.equals($field(), o.$field()) &&
                StringUtils.equals($index(), o.$index())
            ;
        }
        else
            return super.equals(that);
    }
}
