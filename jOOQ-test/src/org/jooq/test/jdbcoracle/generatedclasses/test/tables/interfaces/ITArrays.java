/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ITArrays extends java.io.Serializable {

	/**
	 * Setter for <code>TEST.T_ARRAYS.ID</code>. 
	 */
	public void setId(java.math.BigDecimal value);

	/**
	 * Getter for <code>TEST.T_ARRAYS.ID</code>. 
	 */
	public java.math.BigDecimal getId();

	/**
	 * Setter for <code>TEST.T_ARRAYS.STRING_ARRAY</code>. 
	 */
	public void setStringArray(java.lang.Object value);

	/**
	 * Getter for <code>TEST.T_ARRAYS.STRING_ARRAY</code>. 
	 */
	public java.lang.Object getStringArray();

	/**
	 * Setter for <code>TEST.T_ARRAYS.NUMBER_ARRAY</code>. 
	 */
	public void setNumberArray(java.lang.Object value);

	/**
	 * Getter for <code>TEST.T_ARRAYS.NUMBER_ARRAY</code>. 
	 */
	public java.lang.Object getNumberArray();

	/**
	 * Setter for <code>TEST.T_ARRAYS.NUMBER_LONG_ARRAY</code>. 
	 */
	public void setNumberLongArray(java.lang.Object value);

	/**
	 * Getter for <code>TEST.T_ARRAYS.NUMBER_LONG_ARRAY</code>. 
	 */
	public java.lang.Object getNumberLongArray();

	/**
	 * Setter for <code>TEST.T_ARRAYS.DATE_ARRAY</code>. 
	 */
	public void setDateArray(java.lang.Object value);

	/**
	 * Getter for <code>TEST.T_ARRAYS.DATE_ARRAY</code>. 
	 */
	public java.lang.Object getDateArray();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface ITArrays
	 */
	public void from(org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.ITArrays from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface ITArrays
	 */
	public <E extends org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.ITArrays> E into(E into);
}
