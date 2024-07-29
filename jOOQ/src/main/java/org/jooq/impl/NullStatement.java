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
 * Apache-2.0 license and offer limited warranties, support, maintenance, and
 * commercial database integrations.
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


// ...
import static org.jooq.impl.DSL.falseCondition;
import static org.jooq.impl.DSL.one;
import static org.jooq.impl.DSL.select;
import static org.jooq.impl.Keywords.K_IF;
import static org.jooq.impl.Keywords.K_NULL;

import org.jooq.Context;
import org.jooq.impl.QOM.UTransient;

/**
 * @author Lukas Eder
 */
final class NullStatement
extends
    AbstractStatement
implements
    QOM.NullStatement,
    UTransient
{

    static final NullStatement INSTANCE = new NullStatement();

    @Override
    public final void accept(Context<?> ctx) {
        switch (ctx.family()) {












            default:
                ctx.visit(K_NULL).sql(';');
                break;
        }
    }
}
