/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.testcontainersflyway.db.tables;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.example.testcontainersflyway.db.Indexes;
import org.jooq.example.testcontainersflyway.db.Keys;
import org.jooq.example.testcontainersflyway.db.Public;
import org.jooq.example.testcontainersflyway.db.tables.records.PaymentRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Payment extends TableImpl<PaymentRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.payment</code>
     */
    public static final Payment PAYMENT = new Payment();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PaymentRecord> getRecordType() {
        return PaymentRecord.class;
    }

    /**
     * The column <code>public.payment.payment_id</code>.
     */
    public final TableField<PaymentRecord, Long> PAYMENT_ID = createField(DSL.name("payment_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.payment.customer_id</code>.
     */
    public final TableField<PaymentRecord, Long> CUSTOMER_ID = createField(DSL.name("customer_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.payment.staff_id</code>.
     */
    public final TableField<PaymentRecord, Long> STAFF_ID = createField(DSL.name("staff_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.payment.rental_id</code>.
     */
    public final TableField<PaymentRecord, Long> RENTAL_ID = createField(DSL.name("rental_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.payment.amount</code>.
     */
    public final TableField<PaymentRecord, BigDecimal> AMOUNT = createField(DSL.name("amount"), SQLDataType.NUMERIC(5, 2).nullable(false), this, "");

    /**
     * The column <code>public.payment.payment_date</code>.
     */
    public final TableField<PaymentRecord, LocalDateTime> PAYMENT_DATE = createField(DSL.name("payment_date"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "");

    private Payment(Name alias, Table<PaymentRecord> aliased) {
        this(alias, aliased, null);
    }

    private Payment(Name alias, Table<PaymentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.payment</code> table reference
     */
    public Payment(String alias) {
        this(DSL.name(alias), PAYMENT);
    }

    /**
     * Create an aliased <code>public.payment</code> table reference
     */
    public Payment(Name alias) {
        this(alias, PAYMENT);
    }

    /**
     * Create a <code>public.payment</code> table reference
     */
    public Payment() {
        this(DSL.name("payment"), null);
    }

    public <O extends Record> Payment(Table<O> child, ForeignKey<O, PaymentRecord> key) {
        super(child, key, PAYMENT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_FK_CUSTOMER_ID, Indexes.IDX_FK_STAFF_ID);
    }

    @Override
    public Identity<PaymentRecord, Long> getIdentity() {
        return (Identity<PaymentRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<PaymentRecord> getPrimaryKey() {
        return Keys.PAYMENT_PKEY;
    }

    @Override
    public List<ForeignKey<PaymentRecord, ?>> getReferences() {
        return Arrays.asList(Keys.PAYMENT__PAYMENT_CUSTOMER_ID_FKEY, Keys.PAYMENT__PAYMENT_STAFF_ID_FKEY, Keys.PAYMENT__PAYMENT_RENTAL_ID_FKEY);
    }

    private transient Customer _customer;
    private transient Staff _staff;
    private transient Rental _rental;

    /**
     * Get the implicit join path to the <code>public.customer</code> table.
     */
    public Customer customer() {
        if (_customer == null)
            _customer = new Customer(this, Keys.PAYMENT__PAYMENT_CUSTOMER_ID_FKEY);

        return _customer;
    }

    /**
     * Get the implicit join path to the <code>public.staff</code> table.
     */
    public Staff staff() {
        if (_staff == null)
            _staff = new Staff(this, Keys.PAYMENT__PAYMENT_STAFF_ID_FKEY);

        return _staff;
    }

    /**
     * Get the implicit join path to the <code>public.rental</code> table.
     */
    public Rental rental() {
        if (_rental == null)
            _rental = new Rental(this, Keys.PAYMENT__PAYMENT_RENTAL_ID_FKEY);

        return _rental;
    }

    @Override
    public Payment as(String alias) {
        return new Payment(DSL.name(alias), this);
    }

    @Override
    public Payment as(Name alias) {
        return new Payment(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Payment rename(String name) {
        return new Payment(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Payment rename(Name name) {
        return new Payment(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, Long, Long, Long, BigDecimal, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
