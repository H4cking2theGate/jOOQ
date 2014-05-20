/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbc.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ITAuthor extends java.io.Serializable {

	/**
	 * Setter for <code>PUBLIC.T_AUTHOR.ID</code>.
	 */
	public void setId(java.lang.Integer value);

	/**
	 * Getter for <code>PUBLIC.T_AUTHOR.ID</code>.
	 */
	public java.lang.Integer getId();

	/**
	 * Setter for <code>PUBLIC.T_AUTHOR.FIRST_NAME</code>.
	 */
	public void setFirstName(java.lang.String value);

	/**
	 * Getter for <code>PUBLIC.T_AUTHOR.FIRST_NAME</code>.
	 */
	public java.lang.String getFirstName();

	/**
	 * Setter for <code>PUBLIC.T_AUTHOR.LAST_NAME</code>.
	 */
	public void setLastName(java.lang.String value);

	/**
	 * Getter for <code>PUBLIC.T_AUTHOR.LAST_NAME</code>.
	 */
	public java.lang.String getLastName();

	/**
	 * Setter for <code>PUBLIC.T_AUTHOR.DATE_OF_BIRTH</code>.
	 */
	public void setDateOfBirth(java.sql.Date value);

	/**
	 * Getter for <code>PUBLIC.T_AUTHOR.DATE_OF_BIRTH</code>.
	 */
	public java.sql.Date getDateOfBirth();

	/**
	 * Setter for <code>PUBLIC.T_AUTHOR.YEAR_OF_BIRTH</code>.
	 */
	public void setYearOfBirth(java.lang.Integer value);

	/**
	 * Getter for <code>PUBLIC.T_AUTHOR.YEAR_OF_BIRTH</code>.
	 */
	public java.lang.Integer getYearOfBirth();

	/**
	 * Setter for <code>PUBLIC.T_AUTHOR.ADDRESS</code>.
	 */
	public void setAddress(java.lang.String value);

	/**
	 * Getter for <code>PUBLIC.T_AUTHOR.ADDRESS</code>.
	 */
	public java.lang.String getAddress();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface ITAuthor
	 */
	public void from(org.jooq.test.jdbc.generatedclasses.tables.interfaces.ITAuthor from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface ITAuthor
	 */
	public <E extends org.jooq.test.jdbc.generatedclasses.tables.interfaces.ITAuthor> E into(E into);
}
