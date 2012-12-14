/**
 * This class is generated by jOOQ
 */
package org.jooq.test.cubrid.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class VLibrary extends org.jooq.impl.TableImpl<org.jooq.test.cubrid.generatedclasses.tables.records.VLibraryRecord> {

	private static final long serialVersionUID = -106651054;

	/**
	 * The singleton instance of <code>DBA.v_library</code>
	 */
	public static final org.jooq.test.cubrid.generatedclasses.tables.VLibrary V_LIBRARY = new org.jooq.test.cubrid.generatedclasses.tables.VLibrary();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.cubrid.generatedclasses.tables.records.VLibraryRecord> getRecordType() {
		return org.jooq.test.cubrid.generatedclasses.tables.records.VLibraryRecord.class;
	}

	/**
	 * The column <code>DBA.v_library.author</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.VLibraryRecord, java.lang.String> AUTHOR = createField("author", org.jooq.impl.SQLDataType.VARCHAR, V_LIBRARY);

	/**
	 * The column <code>DBA.v_library.title</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.VLibraryRecord, java.lang.String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR, V_LIBRARY);

	/**
	 * No further instances allowed
	 */
	private VLibrary() {
		super("v_library", org.jooq.test.cubrid.generatedclasses.Dba.DBA);
	}
}
