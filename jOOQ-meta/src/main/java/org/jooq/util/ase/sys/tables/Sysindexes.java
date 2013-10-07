/**
 * This class is generated by jOOQ
 */
package org.jooq.util.ase.sys.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "3.0.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class Sysindexes extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 752996752;

	/**
	 * The singleton instance of <code>dbo.sysindexes</code>
	 */
	public static final org.jooq.util.ase.sys.tables.Sysindexes SYSINDEXES = new org.jooq.util.ase.sys.tables.Sysindexes();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>dbo.sysindexes.name</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, SYSINDEXES);

	/**
	 * The column <code>dbo.sysindexes.id</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, SYSINDEXES);

	/**
	 * The column <code>dbo.sysindexes.indid</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> INDID = createField("indid", org.jooq.impl.SQLDataType.SMALLINT, SYSINDEXES);

	/**
	 * The column <code>dbo.sysindexes.doampg</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> DOAMPG = createField("doampg", org.jooq.impl.SQLDataType.INTEGER, SYSINDEXES);

	/**
	 * The column <code>dbo.sysindexes.ioampg</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> IOAMPG = createField("ioampg", org.jooq.impl.SQLDataType.INTEGER, SYSINDEXES);

	/**
	 * The column <code>dbo.sysindexes.oampgtrips</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> OAMPGTRIPS = createField("oampgtrips", org.jooq.impl.SQLDataType.INTEGER, SYSINDEXES);

	/**
	 * The column <code>dbo.sysindexes.status3</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> STATUS3 = createField("status3", org.jooq.impl.SQLDataType.SMALLINT, SYSINDEXES);

	/**
	 * The column <code>dbo.sysindexes.status2</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> STATUS2 = createField("status2", org.jooq.impl.SQLDataType.SMALLINT, SYSINDEXES);

	/**
	 * The column <code>dbo.sysindexes.ipgtrips</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> IPGTRIPS = createField("ipgtrips", org.jooq.impl.SQLDataType.INTEGER, SYSINDEXES);

	/**
	 * The column <code>dbo.sysindexes.first</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> FIRST = createField("first", org.jooq.impl.SQLDataType.INTEGER, SYSINDEXES);

	/**
	 * The column <code>dbo.sysindexes.root</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> ROOT = createField("root", org.jooq.impl.SQLDataType.INTEGER, SYSINDEXES);

	/**
	 * The column <code>dbo.sysindexes.distribution</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> DISTRIBUTION = createField("distribution", org.jooq.impl.SQLDataType.INTEGER, SYSINDEXES);

	/**
	 * The column <code>dbo.sysindexes.usagecnt</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> USAGECNT = createField("usagecnt", org.jooq.impl.SQLDataType.SMALLINT, SYSINDEXES);

	/**
	 * The column <code>dbo.sysindexes.segment</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> SEGMENT = createField("segment", org.jooq.impl.SQLDataType.SMALLINT, SYSINDEXES);

	/**
	 * The column <code>dbo.sysindexes.status</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> STATUS = createField("status", org.jooq.impl.SQLDataType.SMALLINT, SYSINDEXES);

	/**
	 * The column <code>dbo.sysindexes.maxrowsperpage</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> MAXROWSPERPAGE = createField("maxrowsperpage", org.jooq.impl.SQLDataType.SMALLINT, SYSINDEXES);

	/**
	 * The column <code>dbo.sysindexes.minlen</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> MINLEN = createField("minlen", org.jooq.impl.SQLDataType.SMALLINT, SYSINDEXES);

	/**
	 * The column <code>dbo.sysindexes.maxlen</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> MAXLEN = createField("maxlen", org.jooq.impl.SQLDataType.SMALLINT, SYSINDEXES);

	/**
	 * The column <code>dbo.sysindexes.maxirow</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> MAXIROW = createField("maxirow", org.jooq.impl.SQLDataType.SMALLINT, SYSINDEXES);

	/**
	 * The column <code>dbo.sysindexes.keycnt</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> KEYCNT = createField("keycnt", org.jooq.impl.SQLDataType.SMALLINT, SYSINDEXES);

	/**
	 * The column <code>dbo.sysindexes.keys1</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, byte[]> KEYS1 = createField("keys1", org.jooq.impl.SQLDataType.VARBINARY, SYSINDEXES);

	/**
	 * The column <code>dbo.sysindexes.keys2</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, byte[]> KEYS2 = createField("keys2", org.jooq.impl.SQLDataType.VARBINARY, SYSINDEXES);

	/**
	 * The column <code>dbo.sysindexes.soid</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Byte> SOID = createField("soid", org.jooq.impl.SQLDataType.TINYINT, SYSINDEXES);

	/**
	 * The column <code>dbo.sysindexes.csid</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Byte> CSID = createField("csid", org.jooq.impl.SQLDataType.TINYINT, SYSINDEXES);

	/**
	 * The column <code>dbo.sysindexes.base_partition</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> BASE_PARTITION = createField("base_partition", org.jooq.impl.SQLDataType.INTEGER, SYSINDEXES);

	/**
	 * The column <code>dbo.sysindexes.fill_factor</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> FILL_FACTOR = createField("fill_factor", org.jooq.impl.SQLDataType.SMALLINT, SYSINDEXES);

	/**
	 * The column <code>dbo.sysindexes.res_page_gap</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> RES_PAGE_GAP = createField("res_page_gap", org.jooq.impl.SQLDataType.SMALLINT, SYSINDEXES);

	/**
	 * The column <code>dbo.sysindexes.exp_rowsize</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> EXP_ROWSIZE = createField("exp_rowsize", org.jooq.impl.SQLDataType.SMALLINT, SYSINDEXES);

	/**
	 * The column <code>dbo.sysindexes.keys3</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, byte[]> KEYS3 = createField("keys3", org.jooq.impl.SQLDataType.VARBINARY, SYSINDEXES);

	/**
	 * The column <code>dbo.sysindexes.identitygap</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> IDENTITYGAP = createField("identitygap", org.jooq.impl.SQLDataType.INTEGER, SYSINDEXES);

	/**
	 * The column <code>dbo.sysindexes.crdate</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.sql.Timestamp> CRDATE = createField("crdate", org.jooq.impl.SQLDataType.TIMESTAMP, SYSINDEXES);

	/**
	 * The column <code>dbo.sysindexes.partitiontype</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> PARTITIONTYPE = createField("partitiontype", org.jooq.impl.SQLDataType.SMALLINT, SYSINDEXES);

	/**
	 * The column <code>dbo.sysindexes.conditionid</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> CONDITIONID = createField("conditionid", org.jooq.impl.SQLDataType.INTEGER, SYSINDEXES);

	/**
	 * No further instances allowed
	 */
	private Sysindexes() {
		super("sysindexes", org.jooq.util.ase.sys.Dbo.DBO);
	}
}
