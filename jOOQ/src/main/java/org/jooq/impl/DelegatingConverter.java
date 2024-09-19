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
package org.jooq.impl;

import org.jooq.ConverterContext;
import org.jooq.ContextConverter;

/**
 * @author Lukas Eder
 */
public class DelegatingConverter<T, U> extends AbstractContextConverter<T, U> {

    private final ContextConverter<T, U> delegate;

    public DelegatingConverter(ContextConverter<T, U> delegate) {
        super(delegate.fromType(), delegate.toType());

        this.delegate = delegate;
    }

    @Override
    public final boolean fromSupported() {
        return delegate.fromSupported();
    }

    @Override
    public final boolean toSupported() {
        return delegate.toSupported();
    }

    @Override
    public final U from(T t, ConverterContext scope) {
        return delegate.from(t, scope);
    }

    @Override
    public final U from(T t) {
        return delegate.from(t);
    }

    @Override
    public final T to(U u, ConverterContext scope) {
        return delegate.to(u, scope);
    }

    @Override
    public final T to(U u) {
        return delegate.to(u);
    }

    @Override
    public String toString() {
        return "Converter [ " + fromType().getName() + " -> " + toType().getName() + " ]";
    }
}
