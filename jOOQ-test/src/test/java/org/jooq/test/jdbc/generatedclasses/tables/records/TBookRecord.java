/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbc.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBookRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.jdbc.generatedclasses.tables.records.TBookRecord> implements org.jooq.Record11<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, byte[], java.lang.Integer, java.sql.Timestamp>, org.jooq.test.jdbc.generatedclasses.tables.interfaces.ITBook {

	private static final long serialVersionUID = -1747559271;

	/**
	 * Setter for <code>PUBLIC.T_BOOK.ID</code>.
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_BOOK.ID</code>.
	 */
	@Override
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>PUBLIC.T_BOOK.AUTHOR_ID</code>.
	 */
	@Override
	public void setAuthorId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_BOOK.AUTHOR_ID</code>.
	 */
	@Override
	public java.lang.Integer getAuthorId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>PUBLIC.T_BOOK.CO_AUTHOR_ID</code>.
	 */
	@Override
	public void setCoAuthorId(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_BOOK.CO_AUTHOR_ID</code>.
	 */
	@Override
	public java.lang.Integer getCoAuthorId() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>PUBLIC.T_BOOK.DETAILS_ID</code>.
	 */
	@Override
	public void setDetailsId(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_BOOK.DETAILS_ID</code>.
	 */
	@Override
	public java.lang.Integer getDetailsId() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>PUBLIC.T_BOOK.TITLE</code>.
	 */
	@Override
	public void setTitle(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_BOOK.TITLE</code>.
	 */
	@Override
	public java.lang.String getTitle() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>PUBLIC.T_BOOK.PUBLISHED_IN</code>.
	 */
	@Override
	public void setPublishedIn(java.lang.Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_BOOK.PUBLISHED_IN</code>.
	 */
	@Override
	public java.lang.Integer getPublishedIn() {
		return (java.lang.Integer) getValue(5);
	}

	/**
	 * Setter for <code>PUBLIC.T_BOOK.LANGUAGE_ID</code>.
	 */
	@Override
	public void setLanguageId(java.lang.Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_BOOK.LANGUAGE_ID</code>.
	 */
	@Override
	public java.lang.Integer getLanguageId() {
		return (java.lang.Integer) getValue(6);
	}

	/**
	 * Setter for <code>PUBLIC.T_BOOK.CONTENT_TEXT</code>.
	 */
	@Override
	public void setContentText(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_BOOK.CONTENT_TEXT</code>.
	 */
	@Override
	public java.lang.String getContentText() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>PUBLIC.T_BOOK.CONTENT_PDF</code>.
	 */
	@Override
	public void setContentPdf(byte[] value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_BOOK.CONTENT_PDF</code>.
	 */
	@Override
	public byte[] getContentPdf() {
		return (byte[]) getValue(8);
	}

	/**
	 * Setter for <code>PUBLIC.T_BOOK.REC_VERSION</code>.
	 */
	@Override
	public void setRecVersion(java.lang.Integer value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_BOOK.REC_VERSION</code>.
	 */
	@Override
	public java.lang.Integer getRecVersion() {
		return (java.lang.Integer) getValue(9);
	}

	/**
	 * Setter for <code>PUBLIC.T_BOOK.REC_TIMESTAMP</code>.
	 */
	@Override
	public void setRecTimestamp(java.sql.Timestamp value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_BOOK.REC_TIMESTAMP</code>.
	 */
	@Override
	public java.sql.Timestamp getRecTimestamp() {
		return (java.sql.Timestamp) getValue(10);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record11 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, byte[], java.lang.Integer, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row11) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, byte[], java.lang.Integer, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row11) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.jdbc.generatedclasses.tables.TBook.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.jdbc.generatedclasses.tables.TBook.AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.jooq.test.jdbc.generatedclasses.tables.TBook.CO_AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return org.jooq.test.jdbc.generatedclasses.tables.TBook.DETAILS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.jooq.test.jdbc.generatedclasses.tables.TBook.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field6() {
		return org.jooq.test.jdbc.generatedclasses.tables.TBook.PUBLISHED_IN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field7() {
		return org.jooq.test.jdbc.generatedclasses.tables.TBook.LANGUAGE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return org.jooq.test.jdbc.generatedclasses.tables.TBook.CONTENT_TEXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<byte[]> field9() {
		return org.jooq.test.jdbc.generatedclasses.tables.TBook.CONTENT_PDF;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field10() {
		return org.jooq.test.jdbc.generatedclasses.tables.TBook.REC_VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field11() {
		return org.jooq.test.jdbc.generatedclasses.tables.TBook.REC_TIMESTAMP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getAuthorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getCoAuthorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getDetailsId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value6() {
		return getPublishedIn();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value7() {
		return getLanguageId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getContentText();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value9() {
		return getContentPdf();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value10() {
		return getRecVersion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value11() {
		return getRecTimestamp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value2(java.lang.Integer value) {
		setAuthorId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value3(java.lang.Integer value) {
		setCoAuthorId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value4(java.lang.Integer value) {
		setDetailsId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value5(java.lang.String value) {
		setTitle(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value6(java.lang.Integer value) {
		setPublishedIn(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value7(java.lang.Integer value) {
		setLanguageId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value8(java.lang.String value) {
		setContentText(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value9(byte[] value) {
		setContentPdf(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value10(java.lang.Integer value) {
		setRecVersion(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value11(java.sql.Timestamp value) {
		setRecTimestamp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.Integer value3, java.lang.Integer value4, java.lang.String value5, java.lang.Integer value6, java.lang.Integer value7, java.lang.String value8, byte[] value9, java.lang.Integer value10, java.sql.Timestamp value11) {
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.jdbc.generatedclasses.tables.interfaces.ITBook from) {
		setId(from.getId());
		setAuthorId(from.getAuthorId());
		setCoAuthorId(from.getCoAuthorId());
		setDetailsId(from.getDetailsId());
		setTitle(from.getTitle());
		setPublishedIn(from.getPublishedIn());
		setLanguageId(from.getLanguageId());
		setContentText(from.getContentText());
		setContentPdf(from.getContentPdf());
		setRecVersion(from.getRecVersion());
		setRecTimestamp(from.getRecTimestamp());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.jdbc.generatedclasses.tables.interfaces.ITBook> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TBookRecord
	 */
	public TBookRecord() {
		super(org.jooq.test.jdbc.generatedclasses.tables.TBook.T_BOOK);
	}

	/**
	 * Create a detached, initialised TBookRecord
	 */
	public TBookRecord(java.lang.Integer id, java.lang.Integer authorId, java.lang.Integer coAuthorId, java.lang.Integer detailsId, java.lang.String title, java.lang.Integer publishedIn, java.lang.Integer languageId, java.lang.String contentText, byte[] contentPdf, java.lang.Integer recVersion, java.sql.Timestamp recTimestamp) {
		super(org.jooq.test.jdbc.generatedclasses.tables.TBook.T_BOOK);

		setValue(0, id);
		setValue(1, authorId);
		setValue(2, coAuthorId);
		setValue(3, detailsId);
		setValue(4, title);
		setValue(5, publishedIn);
		setValue(6, languageId);
		setValue(7, contentText);
		setValue(8, contentPdf);
		setValue(9, recVersion);
		setValue(10, recTimestamp);
	}
}
