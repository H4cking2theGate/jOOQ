/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.testcontainersflyway.db.tables;


import java.util.Collection;
import java.util.function.Function;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Function1;
import org.jooq.Functions;
import org.jooq.Name;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.example.testcontainersflyway.db.Public;
import org.jooq.example.testcontainersflyway.db.tables.records.StaffListRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class StaffList extends TableImpl<StaffListRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.staff_list</code>
     */
    public static final StaffList STAFF_LIST = new StaffList();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StaffListRecord> getRecordType() {
        return StaffListRecord.class;
    }

    /**
     * The column <code>public.staff_list.id</code>.
     */
    public final TableField<StaffListRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.staff_list.name</code>.
     */
    public final TableField<StaffListRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.staff_list.address</code>.
     */
    public final TableField<StaffListRecord, String> ADDRESS = createField(DSL.name("address"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.staff_list.zip code</code>.
     */
    public final TableField<StaffListRecord, String> ZIP_CODE = createField(DSL.name("zip code"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>public.staff_list.phone</code>.
     */
    public final TableField<StaffListRecord, String> PHONE = createField(DSL.name("phone"), SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>public.staff_list.city</code>.
     */
    public final TableField<StaffListRecord, String> CITY = createField(DSL.name("city"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.staff_list.country</code>.
     */
    public final TableField<StaffListRecord, String> COUNTRY = createField(DSL.name("country"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.staff_list.sid</code>.
     */
    public final TableField<StaffListRecord, Long> SID = createField(DSL.name("sid"), SQLDataType.BIGINT, this, "");

    private StaffList(Name alias, Table<StaffListRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private StaffList(Name alias, Table<StaffListRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "staff_list" as  SELECT s.staff_id AS id,
         (((s.first_name)::text || ' '::text) || (s.last_name)::text) AS name,
         a.address,
         a.postal_code AS "zip code",
         a.phone,
         city.city,
         country.country,
         s.store_id AS sid
        FROM (((staff s
          JOIN address a ON ((s.address_id = a.address_id)))
          JOIN city ON ((a.city_id = city.city_id)))
          JOIN country ON ((city.country_id = country.country_id)));
        """), where);
    }

    /**
     * Create an aliased <code>public.staff_list</code> table reference
     */
    public StaffList(String alias) {
        this(DSL.name(alias), STAFF_LIST);
    }

    /**
     * Create an aliased <code>public.staff_list</code> table reference
     */
    public StaffList(Name alias) {
        this(alias, STAFF_LIST);
    }

    /**
     * Create a <code>public.staff_list</code> table reference
     */
    public StaffList() {
        this(DSL.name("staff_list"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public StaffList as(String alias) {
        return new StaffList(DSL.name(alias), this);
    }

    @Override
    public StaffList as(Name alias) {
        return new StaffList(alias, this);
    }

    @Override
    public StaffList as(Table<?> alias) {
        return new StaffList(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public StaffList rename(String name) {
        return new StaffList(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public StaffList rename(Name name) {
        return new StaffList(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public StaffList rename(Table<?> name) {
        return new StaffList(name.getQualifiedName(), null);
    }

    /**
     * Apply this table to a function, see also {@link Functions#let(Function1)}
     */
    public <R> R let(Function<? super StaffList, ? extends R> function) {
        return function.apply(this);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public StaffList where(Condition condition) {
        return new StaffList(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public StaffList where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public StaffList where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public StaffList where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public StaffList where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public StaffList where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public StaffList where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public StaffList where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public StaffList whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public StaffList whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
