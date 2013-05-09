/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ITAuthor extends java.io.Serializable {

	/**
	 * Setter for <code>MULTI_SCHEMA.T_AUTHOR.ID</code>. 
	 */
	public void setId(java.math.BigDecimal value);

	/**
	 * Getter for <code>MULTI_SCHEMA.T_AUTHOR.ID</code>. 
	 */
	public java.math.BigDecimal getId();

	/**
	 * Setter for <code>MULTI_SCHEMA.T_AUTHOR.FIRST_NAME</code>. 
	 */
	public void setFirstName(java.lang.String value);

	/**
	 * Getter for <code>MULTI_SCHEMA.T_AUTHOR.FIRST_NAME</code>. 
	 */
	public java.lang.String getFirstName();

	/**
	 * Setter for <code>MULTI_SCHEMA.T_AUTHOR.LAST_NAME</code>. 
	 */
	public void setLastName(java.lang.String value);

	/**
	 * Getter for <code>MULTI_SCHEMA.T_AUTHOR.LAST_NAME</code>. 
	 */
	public java.lang.String getLastName();

	/**
	 * Setter for <code>MULTI_SCHEMA.T_AUTHOR.DATE_OF_BIRTH</code>. 
	 */
	public void setDateOfBirth(java.sql.Date value);

	/**
	 * Getter for <code>MULTI_SCHEMA.T_AUTHOR.DATE_OF_BIRTH</code>. 
	 */
	public java.sql.Date getDateOfBirth();

	/**
	 * Setter for <code>MULTI_SCHEMA.T_AUTHOR.YEAR_OF_BIRTH</code>. 
	 */
	public void setYearOfBirth(java.math.BigDecimal value);

	/**
	 * Getter for <code>MULTI_SCHEMA.T_AUTHOR.YEAR_OF_BIRTH</code>. 
	 */
	public java.math.BigDecimal getYearOfBirth();

	/**
	 * Setter for <code>MULTI_SCHEMA.T_AUTHOR.ADDRESS</code>. 
	 */
	public void setAddress(java.lang.Object value);

	/**
	 * Getter for <code>MULTI_SCHEMA.T_AUTHOR.ADDRESS</code>. 
	 */
	public java.lang.Object getAddress();

	/**
	 * Setter for <code>MULTI_SCHEMA.T_AUTHOR.ID</code>. 
	 */
	public void setId(java.math.BigDecimal value);

	/**
	 * Getter for <code>MULTI_SCHEMA.T_AUTHOR.ID</code>. 
	 */
	public java.math.BigDecimal getId();

	/**
	 * Setter for <code>MULTI_SCHEMA.T_AUTHOR.FIRST_NAME</code>. 
	 */
	public void setFirstName(java.lang.String value);

	/**
	 * Getter for <code>MULTI_SCHEMA.T_AUTHOR.FIRST_NAME</code>. 
	 */
	public java.lang.String getFirstName();

	/**
	 * Setter for <code>MULTI_SCHEMA.T_AUTHOR.LAST_NAME</code>. 
	 */
	public void setLastName(java.lang.String value);

	/**
	 * Getter for <code>MULTI_SCHEMA.T_AUTHOR.LAST_NAME</code>. 
	 */
	public java.lang.String getLastName();

	/**
	 * Setter for <code>MULTI_SCHEMA.T_AUTHOR.DATE_OF_BIRTH</code>. 
	 */
	public void setDateOfBirth(java.sql.Date value);

	/**
	 * Getter for <code>MULTI_SCHEMA.T_AUTHOR.DATE_OF_BIRTH</code>. 
	 */
	public java.sql.Date getDateOfBirth();

	/**
	 * Setter for <code>MULTI_SCHEMA.T_AUTHOR.YEAR_OF_BIRTH</code>. 
	 */
	public void setYearOfBirth(java.math.BigDecimal value);

	/**
	 * Getter for <code>MULTI_SCHEMA.T_AUTHOR.YEAR_OF_BIRTH</code>. 
	 */
	public java.math.BigDecimal getYearOfBirth();

	/**
	 * Setter for <code>MULTI_SCHEMA.T_AUTHOR.ADDRESS</code>. 
	 */
	public void setAddress(java.lang.Object value);

	/**
	 * Getter for <code>MULTI_SCHEMA.T_AUTHOR.ADDRESS</code>. 
	 */
	public java.lang.Object getAddress();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface ITAuthor
	 */
	public void from(org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.interfaces.ITAuthor from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface ITAuthor
	 */
	public <E extends org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.interfaces.ITAuthor> E into(E into);
}
