/**
 * This class is generated by jOOQ
 */
package org.jooq.util.oracle.sys.tables;

/**
 * This class is generated by jOOQ.
 *
 * Comments on columns of accessible tables and views
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "3.0.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class AllColComments extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 2000099989;

	/**
	 * The singleton instance of <code>SYS.ALL_COL_COMMENTS</code>
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
	 * The column <code>SYS.ALL_COL_COMMENTS.OWNER</code>. Owner of the object
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> OWNER = createField("OWNER", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_COL_COMMENTS.TABLE_NAME</code>. Name of the object
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_COL_COMMENTS.COLUMN_NAME</code>. Name of the column
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> COLUMN_NAME = createField("COLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_COL_COMMENTS.COMMENTS</code>. Comment on the column
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> COMMENTS = createField("COMMENTS", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Create a <code>SYS.ALL_COL_COMMENTS</code> table reference
	 */
	public AllColComments() {
		super("ALL_COL_COMMENTS", org.jooq.util.oracle.sys.Sys.SYS);
	}

	/**
	 * Create an aliased <code>SYS.ALL_COL_COMMENTS</code> table reference
	 */
	public AllColComments(java.lang.String alias) {
		super(alias, org.jooq.util.oracle.sys.Sys.SYS, org.jooq.util.oracle.sys.tables.AllColComments.ALL_COL_COMMENTS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.util.oracle.sys.tables.AllColComments as(java.lang.String alias) {
		return new org.jooq.util.oracle.sys.tables.AllColComments(alias);
	}
}
