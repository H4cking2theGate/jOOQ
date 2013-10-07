/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.1.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -907476560;

	/**
	 * The singleton instance of <code>information_schema.TABLES</code>
	 */
	public static final org.jooq.util.mysql.information_schema.tables.Tables TABLES = new org.jooq.util.mysql.information_schema.tables.Tables();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>information_schema.TABLES.TABLE_CATALOG</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_CATALOG = createField("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(512), TABLES);

	/**
	 * The column <code>information_schema.TABLES.TABLE_SCHEMA</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(64), TABLES);

	/**
	 * The column <code>information_schema.TABLES.TABLE_NAME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64), TABLES);

	/**
	 * The column <code>information_schema.TABLES.TABLE_TYPE</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_TYPE = createField("TABLE_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(64), TABLES);

	/**
	 * The column <code>information_schema.TABLES.ENGINE</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> ENGINE = createField("ENGINE", org.jooq.impl.SQLDataType.VARCHAR.length(64), TABLES);

	/**
	 * The column <code>information_schema.TABLES.VERSION</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, org.jooq.types.ULong> VERSION = createField("VERSION", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, TABLES);

	/**
	 * The column <code>information_schema.TABLES.ROW_FORMAT</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> ROW_FORMAT = createField("ROW_FORMAT", org.jooq.impl.SQLDataType.VARCHAR.length(10), TABLES);

	/**
	 * The column <code>information_schema.TABLES.TABLE_ROWS</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, org.jooq.types.ULong> TABLE_ROWS = createField("TABLE_ROWS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, TABLES);

	/**
	 * The column <code>information_schema.TABLES.AVG_ROW_LENGTH</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, org.jooq.types.ULong> AVG_ROW_LENGTH = createField("AVG_ROW_LENGTH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, TABLES);

	/**
	 * The column <code>information_schema.TABLES.DATA_LENGTH</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, org.jooq.types.ULong> DATA_LENGTH = createField("DATA_LENGTH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, TABLES);

	/**
	 * The column <code>information_schema.TABLES.MAX_DATA_LENGTH</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, org.jooq.types.ULong> MAX_DATA_LENGTH = createField("MAX_DATA_LENGTH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, TABLES);

	/**
	 * The column <code>information_schema.TABLES.INDEX_LENGTH</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, org.jooq.types.ULong> INDEX_LENGTH = createField("INDEX_LENGTH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, TABLES);

	/**
	 * The column <code>information_schema.TABLES.DATA_FREE</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, org.jooq.types.ULong> DATA_FREE = createField("DATA_FREE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, TABLES);

	/**
	 * The column <code>information_schema.TABLES.AUTO_INCREMENT</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, org.jooq.types.ULong> AUTO_INCREMENT = createField("AUTO_INCREMENT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, TABLES);

	/**
	 * The column <code>information_schema.TABLES.CREATE_TIME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.sql.Timestamp> CREATE_TIME = createField("CREATE_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, TABLES);

	/**
	 * The column <code>information_schema.TABLES.UPDATE_TIME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.sql.Timestamp> UPDATE_TIME = createField("UPDATE_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, TABLES);

	/**
	 * The column <code>information_schema.TABLES.CHECK_TIME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.sql.Timestamp> CHECK_TIME = createField("CHECK_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, TABLES);

	/**
	 * The column <code>information_schema.TABLES.TABLE_COLLATION</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_COLLATION = createField("TABLE_COLLATION", org.jooq.impl.SQLDataType.VARCHAR.length(32), TABLES);

	/**
	 * The column <code>information_schema.TABLES.CHECKSUM</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, org.jooq.types.ULong> CHECKSUM = createField("CHECKSUM", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, TABLES);

	/**
	 * The column <code>information_schema.TABLES.CREATE_OPTIONS</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> CREATE_OPTIONS = createField("CREATE_OPTIONS", org.jooq.impl.SQLDataType.VARCHAR.length(255), TABLES);

	/**
	 * The column <code>information_schema.TABLES.TABLE_COMMENT</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_COMMENT = createField("TABLE_COMMENT", org.jooq.impl.SQLDataType.VARCHAR.length(2048), TABLES);

	/**
	 * No further instances allowed
	 */
	private Tables() {
		super("TABLES", org.jooq.util.mysql.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}
}
