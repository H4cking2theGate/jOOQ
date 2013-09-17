/**
 * Copyright (c) 2009-2013, Data Geekery GmbH (http://www.datageekery.com)
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
 * and Maintenance Agreement for more details: http://www.jooq.org/eula
 */
package org.jooq.impl;

import static org.jooq.Clause.FIELD_ROW;
import static org.jooq.impl.Utils.visitAll;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.jooq.BindContext;
import org.jooq.Clause;
import org.jooq.Context;
import org.jooq.Field;
import org.jooq.RenderContext;

/**
 * @author Lukas Eder
 */
class FieldMapForInsert extends AbstractQueryPartMap<Field<?>, Field<?>> {

    /**
     * Generated UID
     */
    private static final long     serialVersionUID = -2192833491610583485L;
    private static final Clause[] CLAUSES          = { FIELD_ROW };

    FieldMapForInsert() {
    }

    @Override
    public final void toSQL(RenderContext context) {
        boolean indent = (size() > 1);

        context.sql("(");

        if (indent) {
            context.formatIndentStart();
        }

        String separator = "";
        for (Field<?> field : values()) {
            context.sql(separator);

            if (indent) {
                context.formatNewLine();
            }

            context.visit(field);
            separator = ", ";
        }

        if (indent) {
            context.formatIndentEnd()
                   .formatNewLine();
        }

        context.sql(")");
    }

    final void toSQLReferenceKeys(RenderContext context) {
        boolean indent = (size() > 1);

        context.sql("(");

        if (indent) {
            context.formatIndentStart();
        }

        // [#989] Avoid qualifying fields in INSERT field declaration
        boolean qualify = context.qualify();
        context.qualify(false);

        String separator = "";
        for (Field<?> field : keySet()) {
            context.sql(separator);

            if (indent) {
                context.formatNewLine();
            }

            context.visit(field);
            separator = ", ";
        }

        context.qualify(qualify);

        if (indent) {
            context.formatIndentEnd()
                   .formatNewLine();
        }

        context.sql(")");
    }

    @Override
    public final void bind(BindContext context) {
        visitAll(context, keySet());
        visitAll(context, values());
    }

    @Override
    public final Clause[] clauses(Context<?> ctx) {
        return CLAUSES;
    }

    final void putFields(Collection<? extends Field<?>> fields) {
        for (Field<?> field : fields) {
            put(field, null);
        }
    }

    final void putValues(Collection<? extends Field<?>> values) {
        if (values.size() != size()) {
            throw new IllegalArgumentException("The number of values must match the number of fields: " + this);
        }

        Iterator<? extends Field<?>> it = values.iterator();
        for (Entry<Field<?>, Field<?>> entry : entrySet()) {
            entry.setValue(it.next());
        }
    }

    final void set(Map<? extends Field<?>, ?> map) {
        for (Entry<? extends Field<?>, ?> entry : map.entrySet()) {
            Field<?> field = entry.getKey();
            Object value = entry.getValue();

            put(entry.getKey(), Utils.field(value, field));
        }
    }
}
