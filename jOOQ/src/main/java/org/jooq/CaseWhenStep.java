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
package org.jooq;

/**
 * The final step in creating a case statement of the type <code><pre>
 * CASE x WHEN 1 THEN 'one'
 *        WHEN 2 THEN 'two'
 *        ELSE        'three'
 * END
 * </pre></code>
 *
 * @param <V> The type of values being compared in this case statement
 * @param <T> The type returned by this case statement
 * @author Lukas Eder
 * @see Case
 */
public interface CaseWhenStep<V, T> extends Field<T> {

    /**
     * Compare a value to the already constructed case statement, return result
     * if values are equal.
     *
     * @param compareValue The value to compare with the already constructed
     *            case statement
     * @param result The result value if values are equal
     * @return An intermediary step for case statement construction
     */
    @Support
    CaseWhenStep<V, T> when(V compareValue, T result);

    /**
     * Compare a value to the already constructed case statement, return result
     * if values are equal.
     *
     * @param compareValue The value to compare with the already constructed
     *            case statement
     * @param result The result value if values are equal
     * @return An intermediary step for case statement construction
     */
    @Support
    CaseWhenStep<V, T> when(V compareValue, Field<T> result);

    /**
     * Compare a value to the already constructed case statement, return result
     * if values are equal.
     *
     * @param compareValue The value to compare with the already constructed
     *            case statement
     * @param result The result value if values are equal
     * @return An intermediary step for case statement construction
     */
    @Support
    CaseWhenStep<V, T> when(Field<V> compareValue, T result);

    /**
     * Compare a value to the already constructed case statement, return result
     * if values are equal.
     *
     * @param compareValue The value to compare with the already constructed
     *            case statement
     * @param result The result value if values are equal
     * @return An intermediary step for case statement construction
     */
    @Support
    CaseWhenStep<V, T> when(Field<V> compareValue, Field<T> result);

    /**
     * Add an else clause to the already constructed case statement
     *
     * @param result The result value if no other value matches the case
     * @return The resulting field from case statement construction
     */
    @Support
    Field<T> otherwise(T result);

    /**
     * Add an else clause to the already constructed case statement
     *
     * @param result The result value if no other value matches the case
     * @return The resulting field from case statement construction
     */
    @Support
    Field<T> otherwise(Field<T> result);
}
