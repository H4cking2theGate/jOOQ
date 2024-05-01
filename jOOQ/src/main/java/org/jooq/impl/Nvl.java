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
 * The <code>NVL</code> statement.
 */
@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
final class Nvl<T>
extends
    AbstractField<T>
implements
    QOM.Nvl<T>
{

    final Field<T> value;
    final Field<T> defaultValue;

    Nvl(
        Field<T> value,
        Field<T> defaultValue
    ) {
        super(
            N_NVL,
            anyNotNull((DataType) dataType(value), value, defaultValue)
        );

        this.value = nullSafeNotNull(value, (DataType) OTHER);
        this.defaultValue = nullSafeNotNull(defaultValue, (DataType) OTHER);
    }

    // -------------------------------------------------------------------------
    // XXX: QueryPart API
    // -------------------------------------------------------------------------

    @Override
    final boolean parenthesised(Context<?> ctx) {
        switch (ctx.family()) {








            case DERBY:
                return false;













            case CUBRID:
            case DUCKDB:
            case FIREBIRD:
            case IGNITE:
            case POSTGRES:
            case TRINO:
            case YUGABYTEDB:
                return true;




            case CLICKHOUSE:
            case MARIADB:
            case MYSQL:
            case SQLITE:
                return true;

            default:
                return true;
        }
    }

    @Override
    public final void accept(Context<?> ctx) {
        switch (ctx.family()) {
























            case DERBY:
                ctx.visit(DSL.coalesce(value, defaultValue));
                break;













            case CUBRID:
            case DUCKDB:
            case FIREBIRD:
            case IGNITE:
            case POSTGRES:
            case TRINO:
            case YUGABYTEDB:
                ctx.visit(function(N_COALESCE, getDataType(), value, defaultValue));
                break;




            case CLICKHOUSE:
            case MARIADB:
            case MYSQL:
            case SQLITE:
                ctx.visit(function(N_IFNULL, getDataType(), value, defaultValue));
                break;

            default:
                ctx.visit(function(N_NVL, getDataType(), value, defaultValue));
                break;
        }
    }














    // -------------------------------------------------------------------------
    // XXX: Query Object Model
    // -------------------------------------------------------------------------

    @Override
    public final Field<T> $arg1() {
        return value;
    }

    @Override
    public final Field<T> $arg2() {
        return defaultValue;
    }

    @Override
    public final QOM.Nvl<T> $arg1(Field<T> newValue) {
        return $constructor().apply(newValue, $arg2());
    }

    @Override
    public final QOM.Nvl<T> $arg2(Field<T> newValue) {
        return $constructor().apply($arg1(), newValue);
    }

    @Override
    public final Function2<? super Field<T>, ? super Field<T>, ? extends QOM.Nvl<T>> $constructor() {
        return (a1, a2) -> new Nvl<>(a1, a2);
    }

    // -------------------------------------------------------------------------
    // XXX: The Object API
    // -------------------------------------------------------------------------

    @Override
    public boolean equals(Object that) {
        if (that instanceof QOM.Nvl<?> o) {
            return
                StringUtils.equals($value(), o.$value()) &&
                StringUtils.equals($defaultValue(), o.$defaultValue())
            ;
        }
        else
            return super.equals(that);
    }
}
