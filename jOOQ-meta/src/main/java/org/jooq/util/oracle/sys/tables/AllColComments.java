/**
 * This class is generated by jOOQ
 */
package org.jooq.util.oracle.sys.tables;

/**
 * This class is generated by jOOQ.
 *
 * Comments on columns of accessible tables and views
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class AllColComments extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 1390108865;

	/**
	 * The singleton instance of SYS.ALL_COL_COMMENTS
	 */
	public static final org.jooq.util.oracle.sys.tables.AllColComments ALL_COL_COMMENTS = new org.jooq.util.oracle.sys.tables.AllColComments();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * Owner of the object
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> OWNER = createField("OWNER", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Name of the object
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Name of the column
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> COLUMN_NAME = createField("COLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Comment on the column
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> COMMENTS = createField("COMMENTS", org.jooq.impl.SQLDataType.VARCHAR, this);

	public AllColComments() {
		super("ALL_COL_COMMENTS", org.jooq.util.oracle.sys.Sys.SYS);
	}

	public AllColComments(java.lang.String alias) {
		super(alias, org.jooq.util.oracle.sys.Sys.SYS, org.jooq.util.oracle.sys.tables.AllColComments.ALL_COL_COMMENTS);
	}

	@Override
	public org.jooq.util.oracle.sys.tables.AllColComments as(java.lang.String alias) {
		return new org.jooq.util.oracle.sys.tables.AllColComments(alias);
	}
}
