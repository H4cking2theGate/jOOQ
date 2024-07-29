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
package org.jooq;


import org.jooq.impl.QOM;

import org.jetbrains.annotations.ApiStatus.Experimental;
import org.jetbrains.annotations.NotNull;


/**
 * A common base type for all qualifiable, named objects.
 * <p>
 * Instances of this type cannot be created directly, only of its subtypes.
 *
 * @author Lukas Eder
 */
public interface Named extends QueryPart {

    /**
     * The unqualified name of this object.
     */
    @NotNull
    String getName();

    /**
     * The qualified name of this object.
     */
    @NotNull
    Name getQualifiedName();

    /**
     * The unqualified name of this object.
     */
    @NotNull
    Name getUnqualifiedName();

    /**
     * The comment on this object.
     * <p>
     * This is the same as calling {@link #getCommentPart()} and then
     * {@link Comment#getComment()}.
     */
    @NotNull
    String getComment();

    /**
     * The comment on this object as a {@link QueryPart}.
     */
    @NotNull
    Comment getCommentPart();

    // -------------------------------------------------------------------------
    // XXX: Query Object Model
    // -------------------------------------------------------------------------

    /**
     * Experimental query object model accessor method, see also {@link QOM}.
     * Subject to change in future jOOQ versions, use at your own risk.
     */
    @Experimental
    @NotNull Name $name();
}
