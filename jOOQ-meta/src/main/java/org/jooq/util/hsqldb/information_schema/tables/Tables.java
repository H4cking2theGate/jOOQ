/**
 * This class is generated by jOOQ
 */
package org.jooq.util.hsqldb.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.6"},
                            comments = "This class is generated by jOOQ")
public class Tables extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -332419757;

	/**
	 * The singleton instance of INFORMATION_SCHEMA.TABLES
	 */
	public static final org.jooq.util.hsqldb.information_schema.tables.Tables TABLES = new org.jooq.util.hsqldb.information_schema.tables.Tables();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.Record> __RECORD_TYPE = org.jooq.Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_CATALOG = createField("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_TYPE = createField("TABLE_TYPE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SELF_REFERENCING_COLUMN_NAME = createField("SELF_REFERENCING_COLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> REFERENCE_GENERATION = createField("REFERENCE_GENERATION", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> USER_DEFINED_TYPE_CATALOG = createField("USER_DEFINED_TYPE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> USER_DEFINED_TYPE_SCHEMA = createField("USER_DEFINED_TYPE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> USER_DEFINED_TYPE_NAME = createField("USER_DEFINED_TYPE_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> IS_INSERTABLE_INTO = createField("IS_INSERTABLE_INTO", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> IS_TYPED = createField("IS_TYPED", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> COMMIT_ACTION = createField("COMMIT_ACTION", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * No further instances allowed
	 */
	private Tables() {
		super("TABLES", org.jooq.util.hsqldb.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}

	/**
	 * No further instances allowed
	 */
	private Tables(java.lang.String alias) {
		super(alias, org.jooq.util.hsqldb.information_schema.InformationSchema.INFORMATION_SCHEMA, org.jooq.util.hsqldb.information_schema.tables.Tables.TABLES);
	}

	@Override
	public org.jooq.util.hsqldb.information_schema.tables.Tables as(java.lang.String alias) {
		return new org.jooq.util.hsqldb.information_schema.tables.Tables(alias);
	}
}
