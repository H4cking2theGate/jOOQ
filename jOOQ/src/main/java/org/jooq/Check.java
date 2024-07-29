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
 * Apache-2.0 and offer limited warranties, support, maintenance, and commercial
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
package org.jooq;


/**
 * A check constraint.
 * <p>
 * Instances of this type cannot be created directly. They are available from
 * generated code.
 *
 * @param <R> The <code>CHECK</code>'s owner table record
 * @author Lukas Eder
 */
public interface Check<R extends Record> extends Named {

    /**
     * The <code>Key</code>'s owner table
     */
    Table<R> getTable();

    /**
     * The <code>CHECK</code> constraint's condition.
     */
    Condition condition();

    /**
     * Get this <code>CHECK</code> as a formal {@link Constraint} specification.
     */
    Constraint constraint();

    /**
     * Whether this check is being enforced.
     */
    boolean enforced();
}
