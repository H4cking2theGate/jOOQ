/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IVIncomplete extends java.io.Serializable {

	/**
	 * Setter for <code>TEST.V_INCOMPLETE.ID</code>. 
	 */
	public void setId(java.lang.Object value);

	/**
	 * Getter for <code>TEST.V_INCOMPLETE.ID</code>. 
	 */
	public java.lang.Object getId();

	/**
	 * Setter for <code>TEST.V_INCOMPLETE.AUTHOR_ID</code>. 
	 */
	public void setAuthorId(java.lang.Object value);

	/**
	 * Getter for <code>TEST.V_INCOMPLETE.AUTHOR_ID</code>. 
	 */
	public java.lang.Object getAuthorId();

	/**
	 * Setter for <code>TEST.V_INCOMPLETE.CO_AUTHOR_ID</code>. 
	 */
	public void setCoAuthorId(java.lang.Object value);

	/**
	 * Getter for <code>TEST.V_INCOMPLETE.CO_AUTHOR_ID</code>. 
	 */
	public java.lang.Object getCoAuthorId();

	/**
	 * Setter for <code>TEST.V_INCOMPLETE.DETAILS_ID</code>. 
	 */
	public void setDetailsId(java.lang.Object value);

	/**
	 * Getter for <code>TEST.V_INCOMPLETE.DETAILS_ID</code>. 
	 */
	public java.lang.Object getDetailsId();

	/**
	 * Setter for <code>TEST.V_INCOMPLETE.TITLE</code>. 
	 */
	public void setTitle(java.lang.Object value);

	/**
	 * Getter for <code>TEST.V_INCOMPLETE.TITLE</code>. 
	 */
	public java.lang.Object getTitle();

	/**
	 * Setter for <code>TEST.V_INCOMPLETE.PUBLISHED_IN</code>. 
	 */
	public void setPublishedIn(java.lang.Object value);

	/**
	 * Getter for <code>TEST.V_INCOMPLETE.PUBLISHED_IN</code>. 
	 */
	public java.lang.Object getPublishedIn();

	/**
	 * Setter for <code>TEST.V_INCOMPLETE.LANGUAGE_ID</code>. 
	 */
	public void setLanguageId(java.lang.Object value);

	/**
	 * Getter for <code>TEST.V_INCOMPLETE.LANGUAGE_ID</code>. 
	 */
	public java.lang.Object getLanguageId();

	/**
	 * Setter for <code>TEST.V_INCOMPLETE.CONTENT_TEXT</code>. 
	 */
	public void setContentText(java.lang.Object value);

	/**
	 * Getter for <code>TEST.V_INCOMPLETE.CONTENT_TEXT</code>. 
	 */
	public java.lang.Object getContentText();

	/**
	 * Setter for <code>TEST.V_INCOMPLETE.CONTENT_PDF</code>. 
	 */
	public void setContentPdf(java.lang.Object value);

	/**
	 * Getter for <code>TEST.V_INCOMPLETE.CONTENT_PDF</code>. 
	 */
	public java.lang.Object getContentPdf();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IVIncomplete
	 */
	public void from(org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IVIncomplete from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IVIncomplete
	 */
	public <E extends org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IVIncomplete> E into(E into);
}
