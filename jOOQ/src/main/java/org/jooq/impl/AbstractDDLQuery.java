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

import static org.jooq.impl.Keywords.K_CASCADE;
import static org.jooq.impl.Keywords.K_RESTRICT;
import static org.jooq.impl.QOM.Cascade.CASCADE;
import static org.jooq.impl.QOM.Cascade.RESTRICT;

import org.jooq.Configuration;
import org.jooq.Context;
import org.jooq.DDLQuery;
import org.jooq.impl.QOM.Cascade;

/**
 * @author Lukas Eder
 */
abstract class AbstractDDLQuery extends AbstractRowCountQuery implements DDLQuery {

    AbstractDDLQuery(Configuration configuration) {
        super(configuration);
    }

    static final void acceptCascade(Context<?> ctx, Cascade cascade) {
        if (cascade == CASCADE)
            ctx.sql(' ').visit(K_CASCADE);
        else if (cascade == RESTRICT)
            ctx.sql(' ').visit(K_RESTRICT);
    }
}
