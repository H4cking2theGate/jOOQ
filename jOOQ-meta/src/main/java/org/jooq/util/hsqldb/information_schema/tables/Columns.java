/**
 * This class is generated by jOOQ
 */
package org.jooq.util.hsqldb.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.1.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Columns extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 1470709481;

	/**
	 * The singleton instance of <code>INFORMATION_SCHEMA.COLUMNS</code>
	 */
	public static final org.jooq.util.hsqldb.information_schema.tables.Columns COLUMNS = new org.jooq.util.hsqldb.information_schema.tables.Columns();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.TABLE_CATALOG</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_CATALOG = createField("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.TABLE_SCHEMA</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.TABLE_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.COLUMN_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> COLUMN_NAME = createField("COLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.ORDINAL_POSITION</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> ORDINAL_POSITION = createField("ORDINAL_POSITION", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.COLUMN_DEFAULT</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> COLUMN_DEFAULT = createField("COLUMN_DEFAULT", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.IS_NULLABLE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> IS_NULLABLE = createField("IS_NULLABLE", org.jooq.impl.SQLDataType.VARCHAR.length(3), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.DATA_TYPE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DATA_TYPE = createField("DATA_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.CHARACTER_MAXIMUM_LENGTH</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> CHARACTER_MAXIMUM_LENGTH = createField("CHARACTER_MAXIMUM_LENGTH", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.CHARACTER_OCTET_LENGTH</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> CHARACTER_OCTET_LENGTH = createField("CHARACTER_OCTET_LENGTH", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.NUMERIC_PRECISION</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> NUMERIC_PRECISION = createField("NUMERIC_PRECISION", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.NUMERIC_PRECISION_RADIX</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> NUMERIC_PRECISION_RADIX = createField("NUMERIC_PRECISION_RADIX", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.NUMERIC_SCALE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> NUMERIC_SCALE = createField("NUMERIC_SCALE", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.DATETIME_PRECISION</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> DATETIME_PRECISION = createField("DATETIME_PRECISION", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.INTERVAL_TYPE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> INTERVAL_TYPE = createField("INTERVAL_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.INTERVAL_PRECISION</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> INTERVAL_PRECISION = createField("INTERVAL_PRECISION", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.CHARACTER_SET_CATALOG</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CHARACTER_SET_CATALOG = createField("CHARACTER_SET_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.CHARACTER_SET_SCHEMA</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CHARACTER_SET_SCHEMA = createField("CHARACTER_SET_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.CHARACTER_SET_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CHARACTER_SET_NAME = createField("CHARACTER_SET_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.COLLATION_CATALOG</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> COLLATION_CATALOG = createField("COLLATION_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.COLLATION_SCHEMA</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> COLLATION_SCHEMA = createField("COLLATION_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.COLLATION_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> COLLATION_NAME = createField("COLLATION_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.DOMAIN_CATALOG</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DOMAIN_CATALOG = createField("DOMAIN_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.DOMAIN_SCHEMA</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DOMAIN_SCHEMA = createField("DOMAIN_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.DOMAIN_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DOMAIN_NAME = createField("DOMAIN_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.UDT_CATALOG</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> UDT_CATALOG = createField("UDT_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.UDT_SCHEMA</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> UDT_SCHEMA = createField("UDT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.UDT_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> UDT_NAME = createField("UDT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.SCOPE_CATALOG</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SCOPE_CATALOG = createField("SCOPE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.SCOPE_SCHEMA</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SCOPE_SCHEMA = createField("SCOPE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.SCOPE_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SCOPE_NAME = createField("SCOPE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.MAXIMUM_CARDINALITY</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> MAXIMUM_CARDINALITY = createField("MAXIMUM_CARDINALITY", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.DTD_IDENTIFIER</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DTD_IDENTIFIER = createField("DTD_IDENTIFIER", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.IS_SELF_REFERENCING</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> IS_SELF_REFERENCING = createField("IS_SELF_REFERENCING", org.jooq.impl.SQLDataType.VARCHAR.length(3), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.IS_IDENTITY</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> IS_IDENTITY = createField("IS_IDENTITY", org.jooq.impl.SQLDataType.VARCHAR.length(3), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.IDENTITY_GENERATION</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> IDENTITY_GENERATION = createField("IDENTITY_GENERATION", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.IDENTITY_START</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> IDENTITY_START = createField("IDENTITY_START", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.IDENTITY_INCREMENT</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> IDENTITY_INCREMENT = createField("IDENTITY_INCREMENT", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.IDENTITY_MAXIMUM</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> IDENTITY_MAXIMUM = createField("IDENTITY_MAXIMUM", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.IDENTITY_MINIMUM</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> IDENTITY_MINIMUM = createField("IDENTITY_MINIMUM", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.IDENTITY_CYCLE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> IDENTITY_CYCLE = createField("IDENTITY_CYCLE", org.jooq.impl.SQLDataType.VARCHAR.length(3), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.IS_GENERATED</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> IS_GENERATED = createField("IS_GENERATED", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.GENERATION_EXPRESSION</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> GENERATION_EXPRESSION = createField("GENERATION_EXPRESSION", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.IS_UPDATABLE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> IS_UPDATABLE = createField("IS_UPDATABLE", org.jooq.impl.SQLDataType.VARCHAR.length(3), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.DECLARED_DATA_TYPE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DECLARED_DATA_TYPE = createField("DECLARED_DATA_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.DECLARED_NUMERIC_PRECISION</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> DECLARED_NUMERIC_PRECISION = createField("DECLARED_NUMERIC_PRECISION", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.DECLARED_NUMERIC_SCALE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> DECLARED_NUMERIC_SCALE = createField("DECLARED_NUMERIC_SCALE", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * Create a <code>INFORMATION_SCHEMA.COLUMNS</code> table reference
	 */
	public Columns() {
		super("COLUMNS", org.jooq.util.hsqldb.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}

	/**
	 * Create an aliased <code>INFORMATION_SCHEMA.COLUMNS</code> table reference
	 */
	public Columns(java.lang.String alias) {
		super(alias, org.jooq.util.hsqldb.information_schema.InformationSchema.INFORMATION_SCHEMA, org.jooq.util.hsqldb.information_schema.tables.Columns.COLUMNS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.util.hsqldb.information_schema.tables.Columns as(java.lang.String alias) {
		return new org.jooq.util.hsqldb.information_schema.tables.Columns(alias);
	}
}
