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
package org.jooq.test;

import static org.jooq.test.data.Table1.FIELD_ID1;
import static org.junit.Assert.assertEquals;

import org.jooq.impl.SQLDataType;

import org.junit.Test;


/**
 * Unit tests for casting.
 *
 * @author Lukas Eder
 */
public class CastTest extends AbstractTest {

    @Test
    public void testCastDecimal() {
        assertEquals("cast(`TABLE1`.`ID1` as decimal)", create.render(FIELD_ID1.cast(SQLDataType.DECIMAL)));
        assertEquals("cast(`TABLE1`.`ID1` as decimal(2))", create.render(FIELD_ID1.cast(SQLDataType.DECIMAL.precision(2))));
        assertEquals("cast(`TABLE1`.`ID1` as decimal(2, 1))", create.render(FIELD_ID1.cast(SQLDataType.DECIMAL.precision(2, 1))));
    }
}
