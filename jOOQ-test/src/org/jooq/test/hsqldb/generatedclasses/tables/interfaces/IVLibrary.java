/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IVLibrary extends java.io.Serializable {

	/**
	 * Setter for <code>PUBLIC.V_LIBRARY.AUTHOR</code>.
	 */
	public void setAuthor(java.lang.String value);

	/**
	 * Getter for <code>PUBLIC.V_LIBRARY.AUTHOR</code>.
	 */
	public java.lang.String getAuthor();

	/**
	 * Setter for <code>PUBLIC.V_LIBRARY.TITLE</code>.
	 */
	public void setTitle(java.lang.String value);

	/**
	 * Getter for <code>PUBLIC.V_LIBRARY.TITLE</code>.
	 */
	public java.lang.String getTitle();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IVLibrary
	 */
	public void from(org.jooq.test.hsqldb.generatedclasses.tables.interfaces.IVLibrary from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IVLibrary
	 */
	public <E extends org.jooq.test.hsqldb.generatedclasses.tables.interfaces.IVLibrary> E into(E into);
}
