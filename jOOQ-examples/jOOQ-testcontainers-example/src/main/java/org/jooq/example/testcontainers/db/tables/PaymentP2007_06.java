/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.testcontainers.db.tables;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

import org.jooq.Check;
import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function1;
import org.jooq.Functions;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.InverseForeignKey;
import org.jooq.Name;
import org.jooq.Path;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.Record;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.example.testcontainers.db.Indexes;
import org.jooq.example.testcontainers.db.Keys;
import org.jooq.example.testcontainers.db.Public;
import org.jooq.example.testcontainers.db.tables.Customer.CustomerPath;
import org.jooq.example.testcontainers.db.tables.Rental.RentalPath;
import org.jooq.example.testcontainers.db.tables.Staff.StaffPath;
import org.jooq.example.testcontainers.db.tables.records.PaymentP2007_06Record;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PaymentP2007_06 extends TableImpl<PaymentP2007_06Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.payment_p2007_06</code>
     */
    public static final PaymentP2007_06 PAYMENT_P2007_06 = new PaymentP2007_06();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PaymentP2007_06Record> getRecordType() {
        return PaymentP2007_06Record.class;
    }

    /**
     * The column <code>public.payment_p2007_06.payment_id</code>.
     */
    public final TableField<PaymentP2007_06Record, Long> PAYMENT_ID = createField(DSL.name("payment_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.payment_p2007_06.customer_id</code>.
     */
    public final TableField<PaymentP2007_06Record, Long> CUSTOMER_ID = createField(DSL.name("customer_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.payment_p2007_06.staff_id</code>.
     */
    public final TableField<PaymentP2007_06Record, Long> STAFF_ID = createField(DSL.name("staff_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.payment_p2007_06.rental_id</code>.
     */
    public final TableField<PaymentP2007_06Record, Long> RENTAL_ID = createField(DSL.name("rental_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.payment_p2007_06.amount</code>.
     */
    public final TableField<PaymentP2007_06Record, BigDecimal> AMOUNT = createField(DSL.name("amount"), SQLDataType.NUMERIC(5, 2).nullable(false), this, "");

    /**
     * The column <code>public.payment_p2007_06.payment_date</code>.
     */
    public final TableField<PaymentP2007_06Record, LocalDateTime> PAYMENT_DATE = createField(DSL.name("payment_date"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "");

    private PaymentP2007_06(Name alias, Table<PaymentP2007_06Record> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private PaymentP2007_06(Name alias, Table<PaymentP2007_06Record> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>public.payment_p2007_06</code> table reference
     */
    public PaymentP2007_06(String alias) {
        this(DSL.name(alias), PAYMENT_P2007_06);
    }

    /**
     * Create an aliased <code>public.payment_p2007_06</code> table reference
     */
    public PaymentP2007_06(Name alias) {
        this(alias, PAYMENT_P2007_06);
    }

    /**
     * Create a <code>public.payment_p2007_06</code> table reference
     */
    public PaymentP2007_06() {
        this(DSL.name("payment_p2007_06"), null);
    }

    public <O extends Record> PaymentP2007_06(Table<O> path, ForeignKey<O, PaymentP2007_06Record> childPath, InverseForeignKey<O, PaymentP2007_06Record> parentPath) {
        super(path, childPath, parentPath, PAYMENT_P2007_06);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class PaymentP2007_06Path extends PaymentP2007_06 implements Path<PaymentP2007_06Record> {

        private static final long serialVersionUID = 1L;
        public <O extends Record> PaymentP2007_06Path(Table<O> path, ForeignKey<O, PaymentP2007_06Record> childPath, InverseForeignKey<O, PaymentP2007_06Record> parentPath) {
            super(path, childPath, parentPath);
        }
        private PaymentP2007_06Path(Name alias, Table<PaymentP2007_06Record> aliased) {
            super(alias, aliased);
        }

        @Override
        public PaymentP2007_06Path as(String alias) {
            return new PaymentP2007_06Path(DSL.name(alias), this);
        }

        @Override
        public PaymentP2007_06Path as(Name alias) {
            return new PaymentP2007_06Path(alias, this);
        }

        @Override
        public PaymentP2007_06Path as(Table<?> alias) {
            return new PaymentP2007_06Path(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_FK_PAYMENT_P2007_06_CUSTOMER_ID, Indexes.IDX_FK_PAYMENT_P2007_06_STAFF_ID);
    }

    @Override
    public Identity<PaymentP2007_06Record, Long> getIdentity() {
        return (Identity<PaymentP2007_06Record, Long>) super.getIdentity();
    }

    @Override
    public List<ForeignKey<PaymentP2007_06Record, ?>> getReferences() {
        return Arrays.asList(Keys.PAYMENT_P2007_06__PAYMENT_P2007_06_CUSTOMER_ID_FKEY, Keys.PAYMENT_P2007_06__PAYMENT_P2007_06_STAFF_ID_FKEY, Keys.PAYMENT_P2007_06__PAYMENT_P2007_06_RENTAL_ID_FKEY);
    }

    private transient CustomerPath _customer;

    /**
     * Get the implicit join path to the <code>public.customer</code> table.
     */
    public CustomerPath customer() {
        if (_customer == null)
            _customer = new CustomerPath(this, Keys.PAYMENT_P2007_06__PAYMENT_P2007_06_CUSTOMER_ID_FKEY, null);

        return _customer;
    }

    private transient StaffPath _staff;

    /**
     * Get the implicit join path to the <code>public.staff</code> table.
     */
    public StaffPath staff() {
        if (_staff == null)
            _staff = new StaffPath(this, Keys.PAYMENT_P2007_06__PAYMENT_P2007_06_STAFF_ID_FKEY, null);

        return _staff;
    }

    private transient RentalPath _rental;

    /**
     * Get the implicit join path to the <code>public.rental</code> table.
     */
    public RentalPath rental() {
        if (_rental == null)
            _rental = new RentalPath(this, Keys.PAYMENT_P2007_06__PAYMENT_P2007_06_RENTAL_ID_FKEY, null);

        return _rental;
    }

    @Override
    public List<Check<PaymentP2007_06Record>> getChecks() {
        return Arrays.asList(
            Internal.createCheck(this, DSL.name("payment_p2007_06_payment_date_check"), "(((payment_date >= '2007-06-01 00:00:00'::timestamp without time zone) AND (payment_date < '2007-07-01 00:00:00'::timestamp without time zone)))", true)
        );
    }

    @Override
    public PaymentP2007_06 as(String alias) {
        return new PaymentP2007_06(DSL.name(alias), this);
    }

    @Override
    public PaymentP2007_06 as(Name alias) {
        return new PaymentP2007_06(alias, this);
    }

    @Override
    public PaymentP2007_06 as(Table<?> alias) {
        return new PaymentP2007_06(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PaymentP2007_06 rename(String name) {
        return new PaymentP2007_06(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PaymentP2007_06 rename(Name name) {
        return new PaymentP2007_06(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PaymentP2007_06 rename(Table<?> name) {
        return new PaymentP2007_06(name.getQualifiedName(), null);
    }

    /**
     * Apply this table to a function, see also {@link Functions#let(Function1)}
     */
    public <R> R let(Function<? super PaymentP2007_06, ? extends R> function) {
        return function.apply(this);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PaymentP2007_06 where(Condition condition) {
        return new PaymentP2007_06(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PaymentP2007_06 where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PaymentP2007_06 where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PaymentP2007_06 where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PaymentP2007_06 where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PaymentP2007_06 where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PaymentP2007_06 where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PaymentP2007_06 where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PaymentP2007_06 whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PaymentP2007_06 whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
