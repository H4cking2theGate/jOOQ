/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.testcontainersflyway.db.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

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
import org.jooq.UniqueKey;
import org.jooq.example.testcontainersflyway.db.Indexes;
import org.jooq.example.testcontainersflyway.db.Keys;
import org.jooq.example.testcontainersflyway.db.Public;
import org.jooq.example.testcontainersflyway.db.tables.City.CityPath;
import org.jooq.example.testcontainersflyway.db.tables.Customer.CustomerPath;
import org.jooq.example.testcontainersflyway.db.tables.Staff.StaffPath;
import org.jooq.example.testcontainersflyway.db.tables.Store.StorePath;
import org.jooq.example.testcontainersflyway.db.tables.records.AddressRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Address extends TableImpl<AddressRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.address</code>
     */
    public static final Address ADDRESS = new Address();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AddressRecord> getRecordType() {
        return AddressRecord.class;
    }

    /**
     * The column <code>public.address.address_id</code>.
     */
    public final TableField<AddressRecord, Long> ADDRESS_ID = createField(DSL.name("address_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.address.address</code>.
     */
    public final TableField<AddressRecord, String> ADDRESS_ = createField(DSL.name("address"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>public.address.address2</code>.
     */
    public final TableField<AddressRecord, String> ADDRESS2 = createField(DSL.name("address2"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.address.district</code>.
     */
    public final TableField<AddressRecord, String> DISTRICT = createField(DSL.name("district"), SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>public.address.city_id</code>.
     */
    public final TableField<AddressRecord, Long> CITY_ID = createField(DSL.name("city_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.address.postal_code</code>.
     */
    public final TableField<AddressRecord, String> POSTAL_CODE = createField(DSL.name("postal_code"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>public.address.phone</code>.
     */
    public final TableField<AddressRecord, String> PHONE = createField(DSL.name("phone"), SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>public.address.last_update</code>.
     */
    public final TableField<AddressRecord, LocalDateTime> LAST_UPDATE = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.LOCALDATETIME)), this, "");

    private Address(Name alias, Table<AddressRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Address(Name alias, Table<AddressRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>public.address</code> table reference
     */
    public Address(String alias) {
        this(DSL.name(alias), ADDRESS);
    }

    /**
     * Create an aliased <code>public.address</code> table reference
     */
    public Address(Name alias) {
        this(alias, ADDRESS);
    }

    /**
     * Create a <code>public.address</code> table reference
     */
    public Address() {
        this(DSL.name("address"), null);
    }

    public <O extends Record> Address(Table<O> path, ForeignKey<O, AddressRecord> childPath, InverseForeignKey<O, AddressRecord> parentPath) {
        super(path, childPath, parentPath, ADDRESS);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class AddressPath extends Address implements Path<AddressRecord> {

        private static final long serialVersionUID = 1L;
        public <O extends Record> AddressPath(Table<O> path, ForeignKey<O, AddressRecord> childPath, InverseForeignKey<O, AddressRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private AddressPath(Name alias, Table<AddressRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public AddressPath as(String alias) {
            return new AddressPath(DSL.name(alias), this);
        }

        @Override
        public AddressPath as(Name alias) {
            return new AddressPath(alias, this);
        }

        @Override
        public AddressPath as(Table<?> alias) {
            return new AddressPath(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_FK_CITY_ID);
    }

    @Override
    public Identity<AddressRecord, Long> getIdentity() {
        return (Identity<AddressRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<AddressRecord> getPrimaryKey() {
        return Keys.ADDRESS_PKEY;
    }

    @Override
    public List<ForeignKey<AddressRecord, ?>> getReferences() {
        return Arrays.asList(Keys.ADDRESS__ADDRESS_CITY_ID_FKEY);
    }

    private transient CityPath _city;

    /**
     * Get the implicit join path to the <code>public.city</code> table.
     */
    public CityPath city() {
        if (_city == null)
            _city = new CityPath(this, Keys.ADDRESS__ADDRESS_CITY_ID_FKEY, null);

        return _city;
    }

    private transient CustomerPath _customer;

    /**
     * Get the implicit to-many join path to the <code>public.customer</code>
     * table
     */
    public CustomerPath customer() {
        if (_customer == null)
            _customer = new CustomerPath(this, null, Keys.CUSTOMER__CUSTOMER_ADDRESS_ID_FKEY.getInverseKey());

        return _customer;
    }

    private transient StaffPath _staff;

    /**
     * Get the implicit to-many join path to the <code>public.staff</code> table
     */
    public StaffPath staff() {
        if (_staff == null)
            _staff = new StaffPath(this, null, Keys.STAFF__STAFF_ADDRESS_ID_FKEY.getInverseKey());

        return _staff;
    }

    private transient StorePath _store;

    /**
     * Get the implicit to-many join path to the <code>public.store</code> table
     */
    public StorePath store() {
        if (_store == null)
            _store = new StorePath(this, null, Keys.STORE__STORE_ADDRESS_ID_FKEY.getInverseKey());

        return _store;
    }

    @Override
    public Address as(String alias) {
        return new Address(DSL.name(alias), this);
    }

    @Override
    public Address as(Name alias) {
        return new Address(alias, this);
    }

    @Override
    public Address as(Table<?> alias) {
        return new Address(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Address rename(String name) {
        return new Address(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Address rename(Name name) {
        return new Address(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Address rename(Table<?> name) {
        return new Address(name.getQualifiedName(), null);
    }

    /**
     * Apply this table to a function, see also {@link Functions#let(Function1)}
     */
    public <R> R let(Function<? super Address, ? extends R> function) {
        return function.apply(this);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Address where(Condition condition) {
        return new Address(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Address where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Address where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Address where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Address where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Address where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Address where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Address where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Address whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Address whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
