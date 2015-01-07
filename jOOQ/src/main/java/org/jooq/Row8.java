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

import static org.jooq.SQLDialect.ASE;
import static org.jooq.SQLDialect.CUBRID;
import static org.jooq.SQLDialect.DB2;
import static org.jooq.SQLDialect.DERBY;
import static org.jooq.SQLDialect.FIREBIRD;
import static org.jooq.SQLDialect.H2;
import static org.jooq.SQLDialect.HSQLDB;
import static org.jooq.SQLDialect.INGRES;
import static org.jooq.SQLDialect.MARIADB;
import static org.jooq.SQLDialect.MYSQL;
import static org.jooq.SQLDialect.ORACLE;
import static org.jooq.SQLDialect.POSTGRES;
import static org.jooq.SQLDialect.SQLSERVER;
import static org.jooq.SQLDialect.SYBASE;

import org.jooq.Comparator;
import org.jooq.impl.DSL;

import java.util.Collection;

import javax.annotation.Generated;

/**
 * A model type for a row value expression with degree <code>8</code>.
 * <p>
 * Note: Not all databases support row value expressions, but many row value
 * expression operations can be emulated on all databases. See relevant row
 * value expression method Javadocs for details.
 *
 * @author Lukas Eder
 */
@Generated("This class was generated using jOOQ-tools")
public interface Row8<T1, T2, T3, T4, T5, T6, T7, T8> extends Row {

    // ------------------------------------------------------------------------
    // Field accessors
    // ------------------------------------------------------------------------

    /**
     * Get the first field.
     */
    Field<T1> field1();

    /**
     * Get the second field.
     */
    Field<T2> field2();

    /**
     * Get the third field.
     */
    Field<T3> field3();

    /**
     * Get the fourth field.
     */
    Field<T4> field4();

    /**
     * Get the fifth field.
     */
    Field<T5> field5();

    /**
     * Get the sixth field.
     */
    Field<T6> field6();

    /**
     * Get the seventh field.
     */
    Field<T7> field7();

    /**
     * Get the eighth field.
     */
    Field<T8> field8();

    // ------------------------------------------------------------------------
    // Generic comparison predicates
    // ------------------------------------------------------------------------
    
    /**
     * Compare this row value expression with another row value expression
     * using a dynamic comparator.
     * <p>
     * See the explicit comparison methods for details. Note, not all
     * {@link Comparator} types are supported
     *
     * @see #equal(Row8)
     * @see #notEqual(Row8)
     * @see #lessThan(Row8)
     * @see #lessOrEqual(Row8)
     * @see #greaterThan(Row8)
     * @see #greaterOrEqual(Row8)
     */
    @Support
    Condition compare(Comparator comparator, Row8<T1, T2, T3, T4, T5, T6, T7, T8> row);

    /**
     * Compare this row value expression with a record
     * using a dynamic comparator.
     * <p>
     * See the explicit comparison methods for details. Note, not all
     * {@link Comparator} types are supported
     *
     * @see #equal(Record8)
     * @see #notEqual(Record8)
     * @see #lessThan(Record8)
     * @see #lessOrEqual(Record8)
     * @see #greaterThan(Record8)
     * @see #greaterOrEqual(Record8)
     */
    @Support
    Condition compare(Comparator comparator, Record8<T1, T2, T3, T4, T5, T6, T7, T8> record);

    /**
     * Compare this row value expression with another row value expression
     * using a dynamic comparator.
     * <p>
     * See the explicit comparison methods for details. Note, not all
     * {@link Comparator} types are supported
     *
     * @see #equal(Row8)
     * @see #notEqual(Row8)
     * @see #lessThan(Row8)
     * @see #lessOrEqual(Row8)
     * @see #greaterThan(Row8)
     * @see #greaterOrEqual(Row8)
     */
    @Support
    Condition compare(Comparator comparator, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8);

    /**
     * Compare this row value expression with another row value expression
     * using a dynamic comparator.
     * <p>
     * See the explicit comparison methods for details. Note, not all
     * {@link Comparator} types are supported
     *
     * @see #equal(Row8)
     * @see #notEqual(Row8)
     * @see #lessThan(Row8)
     * @see #lessOrEqual(Row8)
     * @see #greaterThan(Row8)
     * @see #greaterOrEqual(Row8)
     */
    @Support
    Condition compare(Comparator comparator, Field<T1> t1, Field<T2> t2, Field<T3> t3, Field<T4> t4, Field<T5> t5, Field<T6> t6, Field<T7> t7, Field<T8> t8);

    /**
     * Compare this row value expression with a subselect
     * using a dynamic comparator.
     * <p>
     * See the explicit comparison methods for details. Note, not all
     * {@link Comparator} types are supported
     *
     * @see #equal(Select)
     * @see #notEqual(Select)
     * @see #lessThan(Select)
     * @see #lessOrEqual(Select)
     * @see #greaterThan(Select)
     * @see #greaterOrEqual(Select)
     */
    @Support
    Condition compare(Comparator comparator, Select<? extends Record8<T1, T2, T3, T4, T5, T6, T7, T8>> select);

    /**
     * Compare this row value expression with a subselect
     * using a dynamic comparator.
     * <p>
     * See the explicit comparison methods for details. Note, not all
     * {@link Comparator} types are supported
     *
     * @see #equal(Select)
     * @see #notEqual(Select)
     * @see #lessThan(Select)
     * @see #lessOrEqual(Select)
     * @see #greaterThan(Select)
     * @see #greaterOrEqual(Select)
     */
    @Support
    Condition compare(Comparator comparator, QuantifiedSelect<? extends Record8<T1, T2, T3, T4, T5, T6, T7, T8>> select);

    // ------------------------------------------------------------------------
    // Equal / Not equal comparison predicates
    // ------------------------------------------------------------------------

    /**
     * Compare this row value expression with another row value expression for
     * equality.
     * <p>
     * Row equality comparison predicates can be emulated in those databases
     * that do not support such predicates natively:
     * <code>(A, B) = (1, 2)</code> is equivalent to
     * <code>A = 1 AND B = 2</code>
     */
    @Support
    Condition equal(Row8<T1, T2, T3, T4, T5, T6, T7, T8> row);

    /**
     * Compare this row value expression with a record for equality.
     *
     * @see #equal(Row8)
     */
    @Support
    Condition equal(Record8<T1, T2, T3, T4, T5, T6, T7, T8> record);

    /**
     * Compare this row value expression with another row value expression for
     * equality.
     *
     * @see #equal(Row8)
     */
    @Support
    Condition equal(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8);

    /**
     * Compare this row value expression with another row value expression for
     * equality.
     *
     * @see #equal(Row8)
     */
    @Support
    Condition equal(Field<T1> t1, Field<T2> t2, Field<T3> t3, Field<T4> t4, Field<T5> t5, Field<T6> t6, Field<T7> t7, Field<T8> t8);

    /**
     * Compare this row value expression with a subselect for equality.
     *
     * @see #equal(Row8)
     */
    @Support
    Condition equal(Select<? extends Record8<T1, T2, T3, T4, T5, T6, T7, T8>> select);

    /**
     * Compare this row value expression with a subselect for equality.
     *
     * @see DSL#all(Field)
     * @see DSL#all(Select)
     * @see DSL#all(Object...)
     * @see DSL#any(Field)
     * @see DSL#any(Select)
     * @see DSL#any(Object...)
     */
    @Support({ ASE, CUBRID, DB2, DERBY, FIREBIRD, H2, HSQLDB, INGRES, MARIADB, MYSQL, ORACLE, POSTGRES, SQLSERVER, SYBASE })
    Condition equal(QuantifiedSelect<? extends Record8<T1, T2, T3, T4, T5, T6, T7, T8>> select);

    /**
     * Compare this row value expression with another row value expression for
     * equality.
     *
     * @see #equal(Row8)
     */
    @Support
    Condition eq(Row8<T1, T2, T3, T4, T5, T6, T7, T8> row);

    /**
     * Compare this row value expression with a record for equality.
     *
     * @see #equal(Row8)
     */
    @Support
    Condition eq(Record8<T1, T2, T3, T4, T5, T6, T7, T8> record);

    /**
     * Compare this row value expression with another row value expression for
     * equality.
     *
     * @see #equal(Row8)
     */
    @Support
    Condition eq(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8);

    /**
     * Compare this row value expression with another row value expression for
     * equality.
     *
     * @see #equal(Row8)
     */
    @Support
    Condition eq(Field<T1> t1, Field<T2> t2, Field<T3> t3, Field<T4> t4, Field<T5> t5, Field<T6> t6, Field<T7> t7, Field<T8> t8);

    /**
     * Compare this row value expression with a subselect for equality.
     *
     * @see #equal(Row8)
     */
    @Support
    Condition eq(Select<? extends Record8<T1, T2, T3, T4, T5, T6, T7, T8>> select);

    /**
     * Compare this row value expression with a subselect for equality.
     *
     * @see DSL#all(Field)
     * @see DSL#all(Select)
     * @see DSL#all(Object...)
     * @see DSL#any(Field)
     * @see DSL#any(Select)
     * @see DSL#any(Object...)
     */
    @Support({ ASE, CUBRID, DB2, DERBY, FIREBIRD, H2, HSQLDB, INGRES, MARIADB, MYSQL, ORACLE, POSTGRES, SQLSERVER, SYBASE })
    Condition eq(QuantifiedSelect<? extends Record8<T1, T2, T3, T4, T5, T6, T7, T8>> select);

    /**
     * Compare this row value expression with another row value expression for
     * non-equality.
     * <p>
     * Row non-equality comparison predicates can be emulated in those
     * databases that do not support such predicates natively:
     * <code>(A, B) <> (1, 2)</code> is equivalent to
     * <code>NOT(A = 1 AND B = 2)</code>
     */
    @Support
    Condition notEqual(Row8<T1, T2, T3, T4, T5, T6, T7, T8> row);

    /**
     * Compare this row value expression with a record for non-equality
     *
     * @see #notEqual(Row8)
     */
    @Support
    Condition notEqual(Record8<T1, T2, T3, T4, T5, T6, T7, T8> record);

    /**
     * Compare this row value expression with another row value expression for.
     * non-equality
     *
     * @see #notEqual(Row8)
     */
    @Support
    Condition notEqual(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8);

    /**
     * Compare this row value expression with another row value expression for
     * non-equality.
     *
     * @see #notEqual(Row8)
     */
    @Support
    Condition notEqual(Field<T1> t1, Field<T2> t2, Field<T3> t3, Field<T4> t4, Field<T5> t5, Field<T6> t6, Field<T7> t7, Field<T8> t8);

    /**
     * Compare this row value expression with a subselect for non-equality.
     *
     * @see #notEqual(Row8)
     */
    @Support
    Condition notEqual(Select<? extends Record8<T1, T2, T3, T4, T5, T6, T7, T8>> select);

    /**
     * Compare this row value expression with a subselect for non-equality.
     *
     * @see DSL#all(Field)
     * @see DSL#all(Select)
     * @see DSL#all(Object...)
     * @see DSL#any(Field)
     * @see DSL#any(Select)
     * @see DSL#any(Object...)
     */
    @Support({ ASE, CUBRID, DB2, DERBY, FIREBIRD, H2, HSQLDB, INGRES, MARIADB, MYSQL, ORACLE, POSTGRES, SQLSERVER, SYBASE })
    Condition notEqual(QuantifiedSelect<? extends Record8<T1, T2, T3, T4, T5, T6, T7, T8>> select);

    /**
     * Compare this row value expression with another row value expression for
     * non-equality.
     *
     * @see #notEqual(Row8)
     */
    @Support
    Condition ne(Row8<T1, T2, T3, T4, T5, T6, T7, T8> row);

    /**
     * Compare this row value expression with a record for non-equality.
     *
     * @see #notEqual(Row8)
     */
    @Support
    Condition ne(Record8<T1, T2, T3, T4, T5, T6, T7, T8> record);

    /**
     * Compare this row value expression with another row value expression for
     * non-equality.
     *
     * @see #notEqual(Row8)
     */
    @Support
    Condition ne(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8);

    /**
     * Compare this row value expression with another row value expression for
     * non-equality.
     *
     * @see #notEqual(Row8)
     */
    @Support
    Condition ne(Field<T1> t1, Field<T2> t2, Field<T3> t3, Field<T4> t4, Field<T5> t5, Field<T6> t6, Field<T7> t7, Field<T8> t8);

    /**
     * Compare this row value expression with a subselect for non-equality.
     *
     * @see #notEqual(Row8)
     */
    @Support
    Condition ne(Select<? extends Record8<T1, T2, T3, T4, T5, T6, T7, T8>> select);

    /**
     * Compare this row value expression with a subselect for non-equality.
     *
     * @see DSL#all(Field)
     * @see DSL#all(Select)
     * @see DSL#all(Object...)
     * @see DSL#any(Field)
     * @see DSL#any(Select)
     * @see DSL#any(Object...)
     */
    @Support({ ASE, CUBRID, DB2, DERBY, FIREBIRD, H2, HSQLDB, INGRES, MARIADB, MYSQL, ORACLE, POSTGRES, SQLSERVER, SYBASE })
    Condition ne(QuantifiedSelect<? extends Record8<T1, T2, T3, T4, T5, T6, T7, T8>> select);

    // ------------------------------------------------------------------------
    // Ordering comparison predicates
    // ------------------------------------------------------------------------

    /**
     * Compare this row value expression with another row value expression for
     * order.
     * <p>
     * Row order comparison predicates can be emulated in those
     * databases that do not support such predicates natively:
     * <code>(A, B, C) < (1, 2, 3)</code> is equivalent to
     * <code>A < 1 OR (A = 1 AND B < 2) OR (A = 1 AND B = 2 AND C < 3)</code>
     */
    @Support
    Condition lessThan(Row8<T1, T2, T3, T4, T5, T6, T7, T8> row);

    /**
     * Compare this row value expression with a record for order.
     *
     * @see #lessThan(Row8)
     */
    @Support
    Condition lessThan(Record8<T1, T2, T3, T4, T5, T6, T7, T8> record);

    /**
     * Compare this row value expression with another row value expression for
     * order.
     *
     * @see #lessThan(Row8)
     */
    @Support
    Condition lessThan(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8);

    /**
     * Compare this row value expression with another row value expression for
     * order.
     *
     * @see #lessThan(Row8)
     */
    @Support
    Condition lessThan(Field<T1> t1, Field<T2> t2, Field<T3> t3, Field<T4> t4, Field<T5> t5, Field<T6> t6, Field<T7> t7, Field<T8> t8);

    /**
     * Compare this row value expression with a subselect for order.
     *
     * @see #lessThan(Row8)
     */
    @Support
    Condition lessThan(Select<? extends Record8<T1, T2, T3, T4, T5, T6, T7, T8>> select);

    /**
     * Compare this row value expression with a subselect for order.
     *
     * @see DSL#all(Field)
     * @see DSL#all(Select)
     * @see DSL#all(Object...)
     * @see DSL#any(Field)
     * @see DSL#any(Select)
     * @see DSL#any(Object...)
     */
    @Support({ ASE, CUBRID, DB2, DERBY, FIREBIRD, H2, HSQLDB, INGRES, MARIADB, MYSQL, ORACLE, POSTGRES, SQLSERVER, SYBASE })
    Condition lessThan(QuantifiedSelect<? extends Record8<T1, T2, T3, T4, T5, T6, T7, T8>> select);

    /**
     * Compare this row value expression with another row value expression for
     * order.
     *
     * @see #lessThan(Row8)
     */
    @Support
    Condition lt(Row8<T1, T2, T3, T4, T5, T6, T7, T8> row);

    /**
     * Compare this row value expression with a record for order.
     *
     * @see #lessThan(Row8)
     */
    @Support
    Condition lt(Record8<T1, T2, T3, T4, T5, T6, T7, T8> record);

    /**
     * Compare this row value expression with another row value expression for
     * order.
     *
     * @see #lessThan(Row8)
     */
    @Support
    Condition lt(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8);

    /**
     * Compare this row value expression with another row value expression for
     * order.
     *
     * @see #lessThan(Row8)
     */
    @Support
    Condition lt(Field<T1> t1, Field<T2> t2, Field<T3> t3, Field<T4> t4, Field<T5> t5, Field<T6> t6, Field<T7> t7, Field<T8> t8);

    /**
     * Compare this row value expression with a subselect for order.
     *
     * @see #lessThan(Row8)
     */
    @Support
    Condition lt(Select<? extends Record8<T1, T2, T3, T4, T5, T6, T7, T8>> select);

    /**
     * Compare this row value expression with a subselect for order.
     *
     * @see DSL#all(Field)
     * @see DSL#all(Select)
     * @see DSL#all(Object...)
     * @see DSL#any(Field)
     * @see DSL#any(Select)
     * @see DSL#any(Object...)
     */
    @Support({ ASE, CUBRID, DB2, DERBY, FIREBIRD, H2, HSQLDB, INGRES, MARIADB, MYSQL, ORACLE, POSTGRES, SQLSERVER, SYBASE })
    Condition lt(QuantifiedSelect<? extends Record8<T1, T2, T3, T4, T5, T6, T7, T8>> select);

    /**
     * Compare this row value expression with another row value expression for
     * order.
     * <p>
     * Row order comparison predicates can be emulated in those
     * databases that do not support such predicates natively:
     * <code>(A, B) <= (1, 2)</code> is equivalent to
     * <code>A < 1 OR (A = 1 AND B < 2) OR (A = 1 AND B = 2)</code>
     */
    @Support
    Condition lessOrEqual(Row8<T1, T2, T3, T4, T5, T6, T7, T8> row);

    /**
     * Compare this row value expression with a record for order.
     *
     * @see #lessOrEqual(Row8)
     */
    @Support
    Condition lessOrEqual(Record8<T1, T2, T3, T4, T5, T6, T7, T8> record);

    /**
     * Compare this row value expression with another row value expression for
     * order.
     *
     * @see #lessOrEqual(Row8)
     */
    @Support
    Condition lessOrEqual(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8);

    /**
     * Compare this row value expression with another row value expression for
     * order.
     *
     * @see #lessOrEqual(Row8)
     */
    @Support
    Condition lessOrEqual(Field<T1> t1, Field<T2> t2, Field<T3> t3, Field<T4> t4, Field<T5> t5, Field<T6> t6, Field<T7> t7, Field<T8> t8);

    /**
     * Compare this row value expression with a subselect for order.
     *
     * @see #lessOrEqual(Row8)
     */
    @Support
    Condition lessOrEqual(Select<? extends Record8<T1, T2, T3, T4, T5, T6, T7, T8>> select);

    /**
     * Compare this row value expression with a subselect for order.
     *
     * @see DSL#all(Field)
     * @see DSL#all(Select)
     * @see DSL#all(Object...)
     * @see DSL#any(Field)
     * @see DSL#any(Select)
     * @see DSL#any(Object...)
     */
    @Support({ ASE, CUBRID, DB2, DERBY, FIREBIRD, H2, HSQLDB, INGRES, MARIADB, MYSQL, ORACLE, POSTGRES, SQLSERVER, SYBASE })
    Condition lessOrEqual(QuantifiedSelect<? extends Record8<T1, T2, T3, T4, T5, T6, T7, T8>> select);

    /**
     * Compare this row value expression with another row value expression for
     * order.
     *
     * @see #lessOrEqual(Row8)
     */
    @Support
    Condition le(Row8<T1, T2, T3, T4, T5, T6, T7, T8> row);

    /**
     * Compare this row value expression with a record for order.
     *
     * @see #lessOrEqual(Row8)
     */
    @Support
    Condition le(Record8<T1, T2, T3, T4, T5, T6, T7, T8> record);

    /**
     * Compare this row value expression with another row value expression for
     * order.
     *
     * @see #lessOrEqual(Row8)
     */
    @Support
    Condition le(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8);

    /**
     * Compare this row value expression with another row value expression for
     * order.
     *
     * @see #lessOrEqual(Row8)
     */
    @Support
    Condition le(Field<T1> t1, Field<T2> t2, Field<T3> t3, Field<T4> t4, Field<T5> t5, Field<T6> t6, Field<T7> t7, Field<T8> t8);

    /**
     * Compare this row value expression with a subselect for order.
     *
     * @see #lessOrEqual(Row8)
     */
    @Support
    Condition le(Select<? extends Record8<T1, T2, T3, T4, T5, T6, T7, T8>> select);

    /**
     * Compare this row value expression with a subselect for order.
     *
     * @see DSL#all(Field)
     * @see DSL#all(Select)
     * @see DSL#all(Object...)
     * @see DSL#any(Field)
     * @see DSL#any(Select)
     * @see DSL#any(Object...)
     */
    @Support({ ASE, CUBRID, DB2, DERBY, FIREBIRD, H2, HSQLDB, INGRES, MARIADB, MYSQL, ORACLE, POSTGRES, SQLSERVER, SYBASE })
    Condition le(QuantifiedSelect<? extends Record8<T1, T2, T3, T4, T5, T6, T7, T8>> select);

    /**
     * Compare this row value expression with another row value expression for
     * order.
     * <p>
     * Row order comparison predicates can be emulated in those
     * databases that do not support such predicates natively:
     * <code>(A, B, C) > (1, 2, 3)</code> is equivalent to
     * <code>A > 1 OR (A = 1 AND B > 2) OR (A = 1 AND B = 2 AND C > 3)</code>
     */
    @Support
    Condition greaterThan(Row8<T1, T2, T3, T4, T5, T6, T7, T8> row);

    /**
     * Compare this row value expression with a record for order.
     *
     * @see #greaterThan(Row8)
     */
    @Support
    Condition greaterThan(Record8<T1, T2, T3, T4, T5, T6, T7, T8> record);

    /**
     * Compare this row value expression with another row value expression for
     * order.
     *
     * @see #greaterThan(Row8)
     */
    @Support
    Condition greaterThan(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8);

    /**
     * Compare this row value expression with another row value expression for
     * order.
     *
     * @see #greaterThan(Row8)
     */
    @Support
    Condition greaterThan(Field<T1> t1, Field<T2> t2, Field<T3> t3, Field<T4> t4, Field<T5> t5, Field<T6> t6, Field<T7> t7, Field<T8> t8);

    /**
     * Compare this row value expression with a subselect for order.
     *
     * @see #greaterThan(Row8)
     */
    @Support
    Condition greaterThan(Select<? extends Record8<T1, T2, T3, T4, T5, T6, T7, T8>> select);

    /**
     * Compare this row value expression with a subselect for order.
     *
     * @see DSL#all(Field)
     * @see DSL#all(Select)
     * @see DSL#all(Object...)
     * @see DSL#any(Field)
     * @see DSL#any(Select)
     * @see DSL#any(Object...)
     */
    @Support({ ASE, CUBRID, DB2, DERBY, FIREBIRD, H2, HSQLDB, INGRES, MARIADB, MYSQL, ORACLE, POSTGRES, SQLSERVER, SYBASE })
    Condition greaterThan(QuantifiedSelect<? extends Record8<T1, T2, T3, T4, T5, T6, T7, T8>> select);

    /**
     * Compare this row value expression with another row value expression for
     * order.
     *
     * @see #greaterThan(Row8)
     */
    @Support
    Condition gt(Row8<T1, T2, T3, T4, T5, T6, T7, T8> row);

    /**
     * Compare this row value expression with a record for order.
     *
     * @see #greaterThan(Row8)
     */
    @Support
    Condition gt(Record8<T1, T2, T3, T4, T5, T6, T7, T8> record);

    /**
     * Compare this row value expression with another row value expression for
     * order.
     *
     * @see #greaterThan(Row8)
     */
    @Support
    Condition gt(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8);

    /**
     * Compare this row value expression with another row value expression for
     * order.
     *
     * @see #greaterThan(Row8)
     */
    @Support
    Condition gt(Field<T1> t1, Field<T2> t2, Field<T3> t3, Field<T4> t4, Field<T5> t5, Field<T6> t6, Field<T7> t7, Field<T8> t8);

    /**
     * Compare this row value expression with a subselect for order.
     *
     * @see #greaterThan(Row8)
     */
    @Support
    Condition gt(Select<? extends Record8<T1, T2, T3, T4, T5, T6, T7, T8>> select);

    /**
     * Compare this row value expression with a subselect for order.
     *
     * @see DSL#all(Field)
     * @see DSL#all(Select)
     * @see DSL#all(Object...)
     * @see DSL#any(Field)
     * @see DSL#any(Select)
     * @see DSL#any(Object...)
     */
    @Support({ ASE, CUBRID, DB2, DERBY, FIREBIRD, H2, HSQLDB, INGRES, MARIADB, MYSQL, ORACLE, POSTGRES, SQLSERVER, SYBASE })
    Condition gt(QuantifiedSelect<? extends Record8<T1, T2, T3, T4, T5, T6, T7, T8>> select);

    /**
     * Compare this row value expression with another row value expression for
     * order.
     * <p>
     * Row order comparison predicates can be emulated in those
     * databases that do not support such predicates natively:
     * <code>(A, B) >= (1, 2)</code> is equivalent to
     * <code>A > 1 OR (A = 1 AND B > 2) OR (A = 1 AND B = 2)</code>
     */
    @Support
    Condition greaterOrEqual(Row8<T1, T2, T3, T4, T5, T6, T7, T8> row);

    /**
     * Compare this row value expression with a record for order.
     *
     * @see #greaterOrEqual(Row8)
     */
    @Support
    Condition greaterOrEqual(Record8<T1, T2, T3, T4, T5, T6, T7, T8> record);

    /**
     * Compare this row value expression with another row value expression for
     * order.
     *
     * @see #greaterOrEqual(Row8)
     */
    @Support
    Condition greaterOrEqual(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8);

    /**
     * Compare this row value expression with another row value expression for
     * order.
     *
     * @see #greaterOrEqual(Row8)
     */
    @Support
    Condition greaterOrEqual(Field<T1> t1, Field<T2> t2, Field<T3> t3, Field<T4> t4, Field<T5> t5, Field<T6> t6, Field<T7> t7, Field<T8> t8);

    /**
     * Compare this row value expression with a subselect for order.
     *
     * @see #greaterOrEqual(Row8)
     */
    @Support
    Condition greaterOrEqual(Select<? extends Record8<T1, T2, T3, T4, T5, T6, T7, T8>> select);

    /**
     * Compare this row value expression with a subselect for order.
     *
     * @see DSL#all(Field)
     * @see DSL#all(Select)
     * @see DSL#all(Object...)
     * @see DSL#any(Field)
     * @see DSL#any(Select)
     * @see DSL#any(Object...)
     */
    @Support({ ASE, CUBRID, DB2, DERBY, FIREBIRD, H2, HSQLDB, INGRES, MARIADB, MYSQL, ORACLE, POSTGRES, SQLSERVER, SYBASE })
    Condition greaterOrEqual(QuantifiedSelect<? extends Record8<T1, T2, T3, T4, T5, T6, T7, T8>> select);

    /**
     * Compare this row value expression with another row value expression for
     * order.
     *
     * @see #greaterOrEqual(Row8)
     */
    @Support
    Condition ge(Row8<T1, T2, T3, T4, T5, T6, T7, T8> row);

    /**
     * Compare this row value expression with a record for order.
     *
     * @see #greaterOrEqual(Row8)
     */
    @Support
    Condition ge(Record8<T1, T2, T3, T4, T5, T6, T7, T8> record);

    /**
     * Compare this row value expression with another row value expression for
     * order.
     *
     * @see #greaterOrEqual(Row8)
     */
    @Support
    Condition ge(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8);

    /**
     * Compare this row value expression with another row value expression for
     * order.
     *
     * @see #greaterOrEqual(Row8)
     */
    @Support
    Condition ge(Field<T1> t1, Field<T2> t2, Field<T3> t3, Field<T4> t4, Field<T5> t5, Field<T6> t6, Field<T7> t7, Field<T8> t8);

    /**
     * Compare this row value expression with a subselect for order.
     *
     * @see #greaterOrEqual(Row8)
     */
    @Support
    Condition ge(Select<? extends Record8<T1, T2, T3, T4, T5, T6, T7, T8>> select);

    /**
     * Compare this row value expression with a subselect for order.
     *
     * @see DSL#all(Field)
     * @see DSL#all(Select)
     * @see DSL#all(Object...)
     * @see DSL#any(Field)
     * @see DSL#any(Select)
     * @see DSL#any(Object...)
     */
    @Support({ ASE, CUBRID, DB2, DERBY, FIREBIRD, H2, HSQLDB, INGRES, MARIADB, MYSQL, ORACLE, POSTGRES, SQLSERVER, SYBASE })
    Condition ge(QuantifiedSelect<? extends Record8<T1, T2, T3, T4, T5, T6, T7, T8>> select);

    // ------------------------------------------------------------------------
    // [NOT] BETWEEN predicates
    // ------------------------------------------------------------------------

    /**
     * Check if this row value expression is within a range of two other row
     * value expressions.
     *
     * @see #between(Row8, Row8)
     */
    @Support
    BetweenAndStep8<T1, T2, T3, T4, T5, T6, T7, T8> between(T1 minValue1, T2 minValue2, T3 minValue3, T4 minValue4, T5 minValue5, T6 minValue6, T7 minValue7, T8 minValue8);

    /**
     * Check if this row value expression is within a range of two other row
     * value expressions.
     *
     * @see #between(Row8, Row8)
     */
    @Support
    BetweenAndStep8<T1, T2, T3, T4, T5, T6, T7, T8> between(Field<T1> minValue1, Field<T2> minValue2, Field<T3> minValue3, Field<T4> minValue4, Field<T5> minValue5, Field<T6> minValue6, Field<T7> minValue7, Field<T8> minValue8);

    /**
     * Check if this row value expression is within a range of two other row
     * value expressions.
     *
     * @see #between(Row8, Row8)
     */
    @Support
    BetweenAndStep8<T1, T2, T3, T4, T5, T6, T7, T8> between(Row8<T1, T2, T3, T4, T5, T6, T7, T8> minValue);

    /**
     * Check if this row value expression is within a range of two records.
     *
     * @see #between(Row8, Row8)
     */
    @Support
    BetweenAndStep8<T1, T2, T3, T4, T5, T6, T7, T8> between(Record8<T1, T2, T3, T4, T5, T6, T7, T8> minValue);

    /**
     * Check if this row value expression is within a range of two other row
     * value expressions.
     * <p>
     * This is the same as calling <code>between(minValue).and(maxValue)</code>
     * <p>
     * The expression <code>A BETWEEN B AND C</code> is equivalent to the
     * expression <code>A >= B AND A <= C</code> for those SQL dialects that do
     * not properly support the <code>BETWEEN</code> predicate for row value
     * expressions
     */
    @Support
    Condition between(Row8<T1, T2, T3, T4, T5, T6, T7, T8> minValue,
                      Row8<T1, T2, T3, T4, T5, T6, T7, T8> maxValue);

    /**
     * Check if this row value expression is within a range of two records.
     * <p>
     * This is the same as calling <code>between(minValue).and(maxValue)</code>
     *
     * @see #between(Row8, Row8)
     */
    @Support
    Condition between(Record8<T1, T2, T3, T4, T5, T6, T7, T8> minValue,
                      Record8<T1, T2, T3, T4, T5, T6, T7, T8> maxValue);

    /**
     * Check if this row value expression is within a symmetric range of two
     * other row value expressions.
     *
     * @see #betweenSymmetric(Row8, Row8)
     */
    @Support
    BetweenAndStep8<T1, T2, T3, T4, T5, T6, T7, T8> betweenSymmetric(T1 minValue1, T2 minValue2, T3 minValue3, T4 minValue4, T5 minValue5, T6 minValue6, T7 minValue7, T8 minValue8);

    /**
     * Check if this row value expression is within a symmetric range of two
     * other row value expressions.
     *
     * @see #betweenSymmetric(Row8, Row8)
     */
    @Support
    BetweenAndStep8<T1, T2, T3, T4, T5, T6, T7, T8> betweenSymmetric(Field<T1> minValue1, Field<T2> minValue2, Field<T3> minValue3, Field<T4> minValue4, Field<T5> minValue5, Field<T6> minValue6, Field<T7> minValue7, Field<T8> minValue8);

    /**
     * Check if this row value expression is within a symmetric range of two
     * other row value expressions.
     *
     * @see #betweenSymmetric(Row8, Row8)
     */
    @Support
    BetweenAndStep8<T1, T2, T3, T4, T5, T6, T7, T8> betweenSymmetric(Row8<T1, T2, T3, T4, T5, T6, T7, T8> minValue);

    /**
     * Check if this row value expression is within a symmetric range of two
     * records.
     *
     * @see #betweenSymmetric(Row8, Row8)
     */
    @Support
    BetweenAndStep8<T1, T2, T3, T4, T5, T6, T7, T8> betweenSymmetric(Record8<T1, T2, T3, T4, T5, T6, T7, T8> minValue);

    /**
     * Check if this row value expression is within a symmetric range of two
     * other row value expressions.
     * <p>
     * This is the same as calling <code>betweenSymmetric(minValue).and(maxValue)</code>
     * <p>
     * The expression <code>A BETWEEN SYMMETRIC B AND C</code> is equivalent to
     * the expression <code>(A >= B AND A <= C) OR (A >= C AND A <= B)</code>
     * for those SQL dialects that do not properly support the
     * <code>BETWEEN</code> predicate for row value expressions
     */
    @Support
    Condition betweenSymmetric(Row8<T1, T2, T3, T4, T5, T6, T7, T8> minValue,
                               Row8<T1, T2, T3, T4, T5, T6, T7, T8> maxValue);

    /**
     * Check if this row value expression is within a symmetric range of two
     * records.
     * <p>
     * This is the same as calling <code>betweenSymmetric(minValue).and(maxValue)</code>
     *
     * @see #betweenSymmetric(Row8, Row8)
     */
    @Support
    Condition betweenSymmetric(Record8<T1, T2, T3, T4, T5, T6, T7, T8> minValue,
                               Record8<T1, T2, T3, T4, T5, T6, T7, T8> maxValue);

    /**
     * Check if this row value expression is not within a range of two other
     * row value expressions.
     *
     * @see #between(Row8, Row8)
     */
    @Support
    BetweenAndStep8<T1, T2, T3, T4, T5, T6, T7, T8> notBetween(T1 minValue1, T2 minValue2, T3 minValue3, T4 minValue4, T5 minValue5, T6 minValue6, T7 minValue7, T8 minValue8);

    /**
     * Check if this row value expression is not within a range of two other
     * row value expressions.
     *
     * @see #notBetween(Row8, Row8)
     */
    @Support
    BetweenAndStep8<T1, T2, T3, T4, T5, T6, T7, T8> notBetween(Field<T1> minValue1, Field<T2> minValue2, Field<T3> minValue3, Field<T4> minValue4, Field<T5> minValue5, Field<T6> minValue6, Field<T7> minValue7, Field<T8> minValue8);

    /**
     * Check if this row value expression is not within a range of two other
     * row value expressions.
     *
     * @see #notBetween(Row8, Row8)
     */
    @Support
    BetweenAndStep8<T1, T2, T3, T4, T5, T6, T7, T8> notBetween(Row8<T1, T2, T3, T4, T5, T6, T7, T8> minValue);

    /**
     * Check if this row value expression is within a range of two records.
     *
     * @see #notBetween(Row8, Row8)
     */
    @Support
    BetweenAndStep8<T1, T2, T3, T4, T5, T6, T7, T8> notBetween(Record8<T1, T2, T3, T4, T5, T6, T7, T8> minValue);

    /**
     * Check if this row value expression is not within a range of two other
     * row value expressions.
     * <p>
     * This is the same as calling <code>notBetween(minValue).and(maxValue)</code>
     * <p>
     * The expression <code>A NOT BETWEEN B AND C</code> is equivalent to the
     * expression <code>A < B OR A > C</code> for those SQL dialects that do
     * not properly support the <code>BETWEEN</code> predicate for row value
     * expressions
     */
    @Support
    Condition notBetween(Row8<T1, T2, T3, T4, T5, T6, T7, T8> minValue,
                         Row8<T1, T2, T3, T4, T5, T6, T7, T8> maxValue);

    /**
     * Check if this row value expression is within a range of two records.
     * <p>
     * This is the same as calling <code>notBetween(minValue).and(maxValue)</code>
     *
     * @see #notBetween(Row8, Row8)
     */
    @Support
    Condition notBetween(Record8<T1, T2, T3, T4, T5, T6, T7, T8> minValue,
                         Record8<T1, T2, T3, T4, T5, T6, T7, T8> maxValue);

    /**
     * Check if this row value expression is not within a symmetric range of two
     * other row value expressions.
     *
     * @see #notBetweenSymmetric(Row8, Row8)
     */
    @Support
    BetweenAndStep8<T1, T2, T3, T4, T5, T6, T7, T8> notBetweenSymmetric(T1 minValue1, T2 minValue2, T3 minValue3, T4 minValue4, T5 minValue5, T6 minValue6, T7 minValue7, T8 minValue8);

    /**
     * Check if this row value expression is not within a symmetric range of two
     * other row value expressions.
     *
     * @see #notBetweenSymmetric(Row8, Row8)
     */
    @Support
    BetweenAndStep8<T1, T2, T3, T4, T5, T6, T7, T8> notBetweenSymmetric(Field<T1> minValue1, Field<T2> minValue2, Field<T3> minValue3, Field<T4> minValue4, Field<T5> minValue5, Field<T6> minValue6, Field<T7> minValue7, Field<T8> minValue8);

    /**
     * Check if this row value expression is not within a symmetric range of two
     * other row value expressions.
     *
     * @see #notBetweenSymmetric(Row8, Row8)
     */
    @Support
    BetweenAndStep8<T1, T2, T3, T4, T5, T6, T7, T8> notBetweenSymmetric(Row8<T1, T2, T3, T4, T5, T6, T7, T8> minValue);

    /**
     * Check if this row value expression is not within a symmetric range of two
     * records.
     *
     * @see #notBetweenSymmetric(Row8, Row8)
     */
    @Support
    BetweenAndStep8<T1, T2, T3, T4, T5, T6, T7, T8> notBetweenSymmetric(Record8<T1, T2, T3, T4, T5, T6, T7, T8> minValue);

    /**
     * Check if this row value expression is not within a symmetric range of two
     * other row value expressions.
     * <p>
     * This is the same as calling <code>notBetweenSymmetric(minValue).and(maxValue)</code>
     * <p>
     * The expression <code>A NOT BETWEEN SYMMETRIC B AND C</code> is equivalent
     * to the expression <code>(A < B OR A > C) AND (A < C OR A > B)</code> for
     * those SQL dialects that do not properly support the <code>BETWEEN</code>
     * predicate for row value expressions
     */
    @Support
    Condition notBetweenSymmetric(Row8<T1, T2, T3, T4, T5, T6, T7, T8> minValue,
                                  Row8<T1, T2, T3, T4, T5, T6, T7, T8> maxValue);

    /**
     * Check if this row value expression is not within a symmetric range of two
     * records.
     * <p>
     * This is the same as calling <code>notBetweenSymmetric(minValue).and(maxValue)</code>
     *
     * @see #notBetweenSymmetric(Row8, Row8)
     */
    @Support
    Condition notBetweenSymmetric(Record8<T1, T2, T3, T4, T5, T6, T7, T8> minValue,
                                  Record8<T1, T2, T3, T4, T5, T6, T7, T8> maxValue);

    // ------------------------------------------------------------------------
    // [NOT] DISTINCT predicates
    // ------------------------------------------------------------------------


    // ------------------------------------------------------------------------
    // [NOT] IN predicates
    // ------------------------------------------------------------------------

    /**
     * Compare this row value expression with a set of row value expressions for
     * equality.
     * <p>
     * Row IN predicates can be emulated in those databases that do not support
     * such predicates natively: <code>(A, B) IN ((1, 2), (3, 4))</code> is
     * equivalent to <code>((A, B) = (1, 2)) OR ((A, B) = (3, 4))</code>, which
     * is equivalent to <code>(A = 1 AND B = 2) OR (A = 3 AND B = 4)</code>
     */
    @Support
    Condition in(Collection<? extends Row8<T1, T2, T3, T4, T5, T6, T7, T8>> rows);

    /**
     * Compare this row value expression with a set of records for
     * equality.
     * <p>
     * Row IN predicates can be emulated in those databases that do not support
     * such predicates natively: <code>(A, B) IN ((1, 2), (3, 4))</code> is
     * equivalent to <code>((A, B) = (1, 2)) OR ((A, B) = (3, 4))</code>, which
     * is equivalent to <code>(A = 1 AND B = 2) OR (A = 3 AND B = 4)</code>
     */
    @Support
    Condition in(Result<? extends Record8<T1, T2, T3, T4, T5, T6, T7, T8>> result);

    /**
     * Compare this row value expression with a set of row value expressions for
     * equality.
     *
     * @see #in(Collection)
     */
    @Support
    Condition in(Row8<T1, T2, T3, T4, T5, T6, T7, T8>... rows);

    /**
     * Compare this row value expression with a set of records for equality.
     *
     * @see #in(Collection)
     */
    @Support
    Condition in(Record8<T1, T2, T3, T4, T5, T6, T7, T8>... record);

    /**
     * Compare this row value expression with a subselect for equality.
     *
     * @see #in(Collection)
     */
    @Support
    Condition in(Select<? extends Record8<T1, T2, T3, T4, T5, T6, T7, T8>> select);

    /**
     * Compare this row value expression with a set of row value expressions for
     * equality.
     * <p>
     * Row NOT IN predicates can be emulated in those databases that do not
     * support such predicates natively:
     * <code>(A, B) NOT IN ((1, 2), (3, 4))</code> is equivalent to
     * <code>NOT(((A, B) = (1, 2)) OR ((A, B) = (3, 4)))</code>, which is
     * equivalent to <code>NOT((A = 1 AND B = 2) OR (A = 3 AND B = 4))</code>
     */
    @Support
    Condition notIn(Collection<? extends Row8<T1, T2, T3, T4, T5, T6, T7, T8>> rows);

    /**
     * Compare this row value expression with a set of records for
     * equality.
     * <p>
     * Row NOT IN predicates can be emulated in those databases that do not
     * support such predicates natively:
     * <code>(A, B) NOT IN ((1, 2), (3, 4))</code> is equivalent to
     * <code>NOT(((A, B) = (1, 2)) OR ((A, B) = (3, 4)))</code>, which is
     * equivalent to <code>NOT((A = 1 AND B = 2) OR (A = 3 AND B = 4))</code>
     */
    @Support
    Condition notIn(Result<? extends Record8<T1, T2, T3, T4, T5, T6, T7, T8>> result);

    /**
     * Compare this row value expression with a set of row value expressions for
     * equality.
     *
     * @see #notIn(Collection)
     */
    @Support
    Condition notIn(Row8<T1, T2, T3, T4, T5, T6, T7, T8>... rows);

    /**
     * Compare this row value expression with a set of records for non-equality.
     *
     * @see #notIn(Collection)
     */
    @Support
    Condition notIn(Record8<T1, T2, T3, T4, T5, T6, T7, T8>... record);

    /**
     * Compare this row value expression with a subselect for non-equality.
     *
     * @see #notIn(Collection)
     */
    @Support
    Condition notIn(Select<? extends Record8<T1, T2, T3, T4, T5, T6, T7, T8>> select);

}
