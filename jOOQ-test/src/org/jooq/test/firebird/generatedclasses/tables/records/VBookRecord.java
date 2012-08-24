/**
 * This class is generated by jOOQ
 */
package org.jooq.test.firebird.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class VBookRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.firebird.generatedclasses.tables.records.VBookRecord> implements org.jooq.test.firebird.generatedclasses.tables.interfaces.IVBook {

	private static final long serialVersionUID = -1018136637;

	/**
	 * The table column <code>V_BOOK.ID</code>
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.firebird.generatedclasses.tables.VBook.V_BOOK.ID, value);
	}

	/**
	 * The table column <code>V_BOOK.ID</code>
	 */
	@Override
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.firebird.generatedclasses.tables.VBook.V_BOOK.ID);
	}

	/**
	 * The table column <code>V_BOOK.AUTHOR_ID</code>
	 */
	@Override
	public void setAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.firebird.generatedclasses.tables.VBook.V_BOOK.AUTHOR_ID, value);
	}

	/**
	 * The table column <code>V_BOOK.AUTHOR_ID</code>
	 */
	@Override
	public java.lang.Integer getAuthorId() {
		return getValue(org.jooq.test.firebird.generatedclasses.tables.VBook.V_BOOK.AUTHOR_ID);
	}

	/**
	 * The table column <code>V_BOOK.CO_AUTHOR_ID</code>
	 */
	@Override
	public void setCoAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.firebird.generatedclasses.tables.VBook.V_BOOK.CO_AUTHOR_ID, value);
	}

	/**
	 * The table column <code>V_BOOK.CO_AUTHOR_ID</code>
	 */
	@Override
	public java.lang.Integer getCoAuthorId() {
		return getValue(org.jooq.test.firebird.generatedclasses.tables.VBook.V_BOOK.CO_AUTHOR_ID);
	}

	/**
	 * The table column <code>V_BOOK.DETAILS_ID</code>
	 */
	@Override
	public void setDetailsId(java.lang.Integer value) {
		setValue(org.jooq.test.firebird.generatedclasses.tables.VBook.V_BOOK.DETAILS_ID, value);
	}

	/**
	 * The table column <code>V_BOOK.DETAILS_ID</code>
	 */
	@Override
	public java.lang.Integer getDetailsId() {
		return getValue(org.jooq.test.firebird.generatedclasses.tables.VBook.V_BOOK.DETAILS_ID);
	}

	/**
	 * The table column <code>V_BOOK.TITLE</code>
	 */
	@Override
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.test.firebird.generatedclasses.tables.VBook.V_BOOK.TITLE, value);
	}

	/**
	 * The table column <code>V_BOOK.TITLE</code>
	 */
	@Override
	public java.lang.String getTitle() {
		return getValue(org.jooq.test.firebird.generatedclasses.tables.VBook.V_BOOK.TITLE);
	}

	/**
	 * The table column <code>V_BOOK.PUBLISHED_IN</code>
	 */
	@Override
	public void setPublishedIn(java.lang.Integer value) {
		setValue(org.jooq.test.firebird.generatedclasses.tables.VBook.V_BOOK.PUBLISHED_IN, value);
	}

	/**
	 * The table column <code>V_BOOK.PUBLISHED_IN</code>
	 */
	@Override
	public java.lang.Integer getPublishedIn() {
		return getValue(org.jooq.test.firebird.generatedclasses.tables.VBook.V_BOOK.PUBLISHED_IN);
	}

	/**
	 * The table column <code>V_BOOK.LANGUAGE_ID</code>
	 */
	@Override
	public void setLanguageId(java.lang.Integer value) {
		setValue(org.jooq.test.firebird.generatedclasses.tables.VBook.V_BOOK.LANGUAGE_ID, value);
	}

	/**
	 * The table column <code>V_BOOK.LANGUAGE_ID</code>
	 */
	@Override
	public java.lang.Integer getLanguageId() {
		return getValue(org.jooq.test.firebird.generatedclasses.tables.VBook.V_BOOK.LANGUAGE_ID);
	}

	/**
	 * The table column <code>V_BOOK.CONTENT_TEXT</code>
	 */
	@Override
	public void setContentText(java.lang.String value) {
		setValue(org.jooq.test.firebird.generatedclasses.tables.VBook.V_BOOK.CONTENT_TEXT, value);
	}

	/**
	 * The table column <code>V_BOOK.CONTENT_TEXT</code>
	 */
	@Override
	public java.lang.String getContentText() {
		return getValue(org.jooq.test.firebird.generatedclasses.tables.VBook.V_BOOK.CONTENT_TEXT);
	}

	/**
	 * The table column <code>V_BOOK.CONTENT_PDF</code>
	 */
	@Override
	public void setContentPdf(byte[] value) {
		setValue(org.jooq.test.firebird.generatedclasses.tables.VBook.V_BOOK.CONTENT_PDF, value);
	}

	/**
	 * The table column <code>V_BOOK.CONTENT_PDF</code>
	 */
	@Override
	public byte[] getContentPdf() {
		return getValue(org.jooq.test.firebird.generatedclasses.tables.VBook.V_BOOK.CONTENT_PDF);
	}

	/**
	 * The table column <code>V_BOOK.REC_VERSION</code>
	 */
	@Override
	public void setRecVersion(java.lang.Integer value) {
		setValue(org.jooq.test.firebird.generatedclasses.tables.VBook.V_BOOK.REC_VERSION, value);
	}

	/**
	 * The table column <code>V_BOOK.REC_VERSION</code>
	 */
	@Override
	public java.lang.Integer getRecVersion() {
		return getValue(org.jooq.test.firebird.generatedclasses.tables.VBook.V_BOOK.REC_VERSION);
	}

	/**
	 * Create a detached VBookRecord
	 */
	public VBookRecord() {
		super(org.jooq.test.firebird.generatedclasses.tables.VBook.V_BOOK);
	}
}
