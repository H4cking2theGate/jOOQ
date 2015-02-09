/**
 * Copyright (c) 2009-2015, Data Geekery GmbH (http://www.datageekery.com)
 * All rights reserved.
 *
 * This work is dual-licensed
 * - under the Apache Software License 2.0 (the "ASL")
 * - under the jOOQ License and Maintenance Agreement (the "jOOQ License")
 * =============================================================================
 * You may choose which license applies to you:
 *
 * - If you're using this work with Open Source databases, you may choose
 *   either ASL or jOOQ License.
 * - If you're using this work with at least one commercial database, you must
 *   choose jOOQ License
 *
 * For more information, please visit http://www.jooq.org/licenses
 *
 * Apache Software License 2.0:
 * -----------------------------------------------------------------------------
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
 * jOOQ License and Maintenance Agreement:
 * -----------------------------------------------------------------------------
 * Data Geekery grants the Customer the non-exclusive, timely limited and
 * non-transferable license to install and use the Software under the terms of
 * the jOOQ License and Maintenance Agreement.
 *
 * This library is distributed with a LIMITED WARRANTY. See the jOOQ License
 * and Maintenance Agreement for more details: http://www.jooq.org/licensing
 */
package org.jooq.impl;

import static org.jooq.Clause.CONSTRAINT;
import static org.jooq.impl.DSL.name;
import static org.jooq.impl.Utils.DATA_DROP_CONSTRAINT;
import static org.jooq.impl.Utils.fieldsByName;

import org.jooq.Clause;
import org.jooq.ConstraintTypeStep;
import org.jooq.Context;
import org.jooq.Field;
import org.jooq.Name;

/**
 * @author Lukas Eder
 */
class ConstraintImpl extends AbstractQueryPart implements ConstraintTypeStep {

    /**
     * Generated UID
     */
    private static final long     serialVersionUID = 1018023703769802616L;
    private static final Clause[] CLAUSES          = { CONSTRAINT };

    private final Name            name;
    private Field<?>[]            unique;
    private Field<?>[]            primaryKey;

    ConstraintImpl(String name) {
        this.name = name(name);
    }

    @Override
    public final Clause[] clauses(Context<?> ctx) {
        return CLAUSES;
    }

    @Override
    public final void accept(Context<?> ctx) {
        ctx.keyword("constraint")
           .sql(" ")
           .visit(name);

        if (ctx.data(DATA_DROP_CONSTRAINT) == null) {
            boolean qualify = ctx.qualify();

            if (unique != null) {
                ctx.sql(" ")
                   .keyword("unique")
                   .sql(" (")
                   .qualify(false)
                   .visit(new QueryPartList<Field<?>>(unique))
                   .qualify(qualify)
                   .sql(")");
            }
            else if (primaryKey != null) {
                ctx.sql(" ")
                   .keyword("primary key")
                   .sql(" (")
                   .qualify(false)
                   .visit(new QueryPartList<Field<?>>(primaryKey))
                   .qualify(qualify)
                   .sql(")");
            }
        }
    }

    @Override
    public final ConstraintImpl unique(String... fields) {
        return unique(fieldsByName(fields));
    }

    @Override
    public final ConstraintImpl unique(Field<?>... fields) {
        unique = fields;
        return this;
    }

    @Override
    public final ConstraintImpl primaryKey(String... fields) {
        return primaryKey(fieldsByName(fields));
    }

    @Override
    public final ConstraintImpl primaryKey(Field<?>... fields) {
        primaryKey = fields;
        return this;
    }
}
