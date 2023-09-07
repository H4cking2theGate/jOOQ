/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.duckdb.system.information_schema.tables;


import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.InverseForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.meta.duckdb.system.information_schema.InformationSchema;
import org.jooq.meta.duckdb.system.information_schema.Keys;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Schemata extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>system.information_schema.schemata</code>
     */
    public static final Schemata SCHEMATA = new Schemata();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>system.information_schema.schemata.catalog_name</code>.
     */
    public final TableField<Record, String> CATALOG_NAME = createField(DSL.name("catalog_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>system.information_schema.schemata.schema_name</code>.
     */
    public final TableField<Record, String> SCHEMA_NAME = createField(DSL.name("schema_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>system.information_schema.schemata.schema_owner</code>.
     */
    public final TableField<Record, String> SCHEMA_OWNER = createField(DSL.name("schema_owner"), SQLDataType.VARCHAR, this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<Record, Object> DEFAULT_CHARACTER_SET_CATALOG = createField(DSL.name("default_character_set_catalog"), org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<Record, Object> DEFAULT_CHARACTER_SET_SCHEMA = createField(DSL.name("default_character_set_schema"), org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<Record, Object> DEFAULT_CHARACTER_SET_NAME = createField(DSL.name("default_character_set_name"), org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>system.information_schema.schemata.sql_path</code>.
     */
    public final TableField<Record, String> SQL_PATH = createField(DSL.name("sql_path"), SQLDataType.VARCHAR, this, "");

    private Schemata(Name alias, Table<Record> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Schemata(Name alias, Table<Record> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view(), where);
    }

    /**
     * Create an aliased <code>system.information_schema.schemata</code> table
     * reference
     */
    public Schemata(String alias) {
        this(DSL.name(alias), SCHEMATA);
    }

    /**
     * Create an aliased <code>system.information_schema.schemata</code> table
     * reference
     */
    public Schemata(Name alias) {
        this(alias, SCHEMATA);
    }

    /**
     * Create a <code>system.information_schema.schemata</code> table reference
     */
    public Schemata() {
        this(DSL.name("schemata"), null);
    }

    public <O extends Record> Schemata(Table<O> path, ForeignKey<O, Record> childPath, InverseForeignKey<O, Record> parentPath) {
        super(path, childPath, parentPath, SCHEMATA);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.SYNTHETIC_PK_SCHEMATA;
    }

    private transient Columns _columns;

    /**
     * Get the implicit to-many join path to the
     * <code>system.information_schema.columns</code> table
     */
    public Columns columns() {
        if (_columns == null)
            _columns = new Columns(this, null, Keys.SYNTHETIC_FK_COLUMNS__SYNTHETIC_PK_SCHEMATA.getInverseKey());

        return _columns;
    }

    private transient Tables _tables;

    /**
     * Get the implicit to-many join path to the
     * <code>system.information_schema.tables</code> table
     */
    public Tables tables() {
        if (_tables == null)
            _tables = new Tables(this, null, Keys.SYNTHETIC_FK_TABLES__SYNTHETIC_PK_SCHEMATA.getInverseKey());

        return _tables;
    }

    @Override
    public Schemata as(String alias) {
        return new Schemata(DSL.name(alias), this);
    }

    @Override
    public Schemata as(Name alias) {
        return new Schemata(alias, this);
    }

    @Override
    public Schemata as(Table<?> alias) {
        return new Schemata(alias.getQualifiedName(), this);
    }
}
