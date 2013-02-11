/**
 * This class is generated by jOOQ
 */
package org.jooq.test.firebird.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "X_TEST_CASE_64_69")
public interface IXTestCase_64_69 extends java.io.Serializable {

	/**
	 * Setter for <code>X_TEST_CASE_64_69.ID</code>. 
	 */
	public void setId(java.lang.Integer value);

	/**
	 * Getter for <code>X_TEST_CASE_64_69.ID</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, length = 4)
	@javax.validation.constraints.NotNull
	public java.lang.Integer getId();

	/**
	 * Setter for <code>X_TEST_CASE_64_69.UNUSED_ID</code>. 
	 */
	public void setUnusedId(java.lang.Integer value);

	/**
	 * Getter for <code>X_TEST_CASE_64_69.UNUSED_ID</code>. 
	 */
	@javax.persistence.Column(name = "UNUSED_ID", length = 4)
	public java.lang.Integer getUnusedId();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IXTestCase_64_69
	 */
	public void from(org.jooq.test.firebird.generatedclasses.tables.interfaces.IXTestCase_64_69 from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IXTestCase_64_69
	 */
	public <E extends org.jooq.test.firebird.generatedclasses.tables.interfaces.IXTestCase_64_69> E into(E into);
}
