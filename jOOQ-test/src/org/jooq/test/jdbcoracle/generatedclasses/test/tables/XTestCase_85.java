/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XTestCase_85 extends org.jooq.impl.TableImpl<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.XTestCase_85Record> {

	private static final long serialVersionUID = -1864763874;

	/**
	 * The singleton instance of <code>TEST.X_TEST_CASE_85</code>
	 */
	public static final org.jooq.test.jdbcoracle.generatedclasses.test.tables.XTestCase_85 X_TEST_CASE_85 = new org.jooq.test.jdbcoracle.generatedclasses.test.tables.XTestCase_85();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.XTestCase_85Record> getRecordType() {
		return org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.XTestCase_85Record.class;
	}

	/**
	 * The column <code>TEST.X_TEST_CASE_85.ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.XTestCase_85Record, java.math.BigDecimal> ID = createField("ID", org.jooq.impl.SQLDataType.NUMERIC, X_TEST_CASE_85);

	/**
	 * The column <code>TEST.X_TEST_CASE_85.X_UNUSED_ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.XTestCase_85Record, java.math.BigDecimal> X_UNUSED_ID = createField("X_UNUSED_ID", org.jooq.impl.SQLDataType.NUMERIC, X_TEST_CASE_85);

	/**
	 * The column <code>TEST.X_TEST_CASE_85.X_UNUSED_NAME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.XTestCase_85Record, java.lang.String> X_UNUSED_NAME = createField("X_UNUSED_NAME", org.jooq.impl.SQLDataType.VARCHAR, X_TEST_CASE_85);

	/**
	 * No further instances allowed
	 */
	private XTestCase_85() {
		super("X_TEST_CASE_85", org.jooq.test.jdbcoracle.generatedclasses.test.Test.TEST);
	}
}
