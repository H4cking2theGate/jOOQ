/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.oracle.generatedclasses.test.tables.TBook;


/**
 * An entity holding books
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "T_BOOK", schema = "TEST")
public class TBookRecord extends UpdatableRecordImpl<TBookRecord> implements Record11<Integer, Integer, Integer, Integer, String, Integer, Integer, String, byte[], BigDecimal, Timestamp> {

	private static final long serialVersionUID = 1706802685;

	/**
	 * Setter for <code>TEST.T_BOOK.ID</code>. The book ID
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOK.ID</code>. The book ID
	 */
	@Id
	@Column(name = "ID", unique = true, nullable = false, precision = 7)
	@NotNull
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>TEST.T_BOOK.AUTHOR_ID</code>. The author ID in entity 'author'
	 */
	public void setAuthorId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOK.AUTHOR_ID</code>. The author ID in entity 'author'
	 */
	@Column(name = "AUTHOR_ID", nullable = false, precision = 7)
	@NotNull
	public Integer getAuthorId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>TEST.T_BOOK.CO_AUTHOR_ID</code>.
	 */
	public void setCoAuthorId(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOK.CO_AUTHOR_ID</code>.
	 */
	@Column(name = "CO_AUTHOR_ID", precision = 7)
	public Integer getCoAuthorId() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>TEST.T_BOOK.DETAILS_ID</code>.
	 */
	public void setDetailsId(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOK.DETAILS_ID</code>.
	 */
	@Column(name = "DETAILS_ID", precision = 7)
	public Integer getDetailsId() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>TEST.T_BOOK.TITLE</code>. The book's title
	 */
	public void setTitle(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOK.TITLE</code>. The book's title
	 */
	@Column(name = "TITLE", nullable = false, length = 400)
	@NotNull
	@Size(max = 400)
	public String getTitle() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>TEST.T_BOOK.PUBLISHED_IN</code>. The year the book was published in
	 */
	public void setPublishedIn(Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOK.PUBLISHED_IN</code>. The year the book was published in
	 */
	@Column(name = "PUBLISHED_IN", nullable = false, precision = 7)
	@NotNull
	public Integer getPublishedIn() {
		return (Integer) getValue(5);
	}

	/**
	 * Setter for <code>TEST.T_BOOK.LANGUAGE_ID</code>. The language of the book
	 */
	public void setLanguageId(Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOK.LANGUAGE_ID</code>. The language of the book
	 */
	@Column(name = "LANGUAGE_ID", nullable = false, precision = 7)
	@NotNull
	public Integer getLanguageId() {
		return (Integer) getValue(6);
	}

	/**
	 * Setter for <code>TEST.T_BOOK.CONTENT_TEXT</code>. Some textual content of the book
	 */
	public void setContentText(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOK.CONTENT_TEXT</code>. Some textual content of the book
	 */
	@Column(name = "CONTENT_TEXT")
	public String getContentText() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>TEST.T_BOOK.CONTENT_PDF</code>. Some binary content of the book
	 */
	public void setContentPdf(byte[] value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOK.CONTENT_PDF</code>. Some binary content of the book
	 */
	@Column(name = "CONTENT_PDF")
	public byte[] getContentPdf() {
		return (byte[]) getValue(8);
	}

	/**
	 * Setter for <code>TEST.T_BOOK.REC_VERSION</code>.
	 */
	public void setRecVersion(BigDecimal value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOK.REC_VERSION</code>.
	 */
	@Column(name = "REC_VERSION")
	public BigDecimal getRecVersion() {
		return (BigDecimal) getValue(9);
	}

	/**
	 * Setter for <code>TEST.T_BOOK.REC_TIMESTAMP</code>.
	 */
	public void setRecTimestamp(Timestamp value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOK.REC_TIMESTAMP</code>.
	 */
	@Column(name = "REC_TIMESTAMP")
	public Timestamp getRecTimestamp() {
		return (Timestamp) getValue(10);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record11 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row11<Integer, Integer, Integer, Integer, String, Integer, Integer, String, byte[], BigDecimal, Timestamp> fieldsRow() {
		return (Row11) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row11<Integer, Integer, Integer, Integer, String, Integer, Integer, String, byte[], BigDecimal, Timestamp> valuesRow() {
		return (Row11) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return TBook.T_BOOK.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return TBook.T_BOOK.AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return TBook.T_BOOK.CO_AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return TBook.T_BOOK.DETAILS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return TBook.T_BOOK.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return TBook.T_BOOK.PUBLISHED_IN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field7() {
		return TBook.T_BOOK.LANGUAGE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return TBook.T_BOOK.CONTENT_TEXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<byte[]> field9() {
		return TBook.T_BOOK.CONTENT_PDF;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field10() {
		return TBook.T_BOOK.REC_VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field11() {
		return TBook.T_BOOK.REC_TIMESTAMP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getAuthorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getCoAuthorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getDetailsId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getPublishedIn();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value7() {
		return getLanguageId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
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
	public BigDecimal value10() {
		return getRecVersion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value11() {
		return getRecTimestamp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value2(Integer value) {
		setAuthorId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value3(Integer value) {
		setCoAuthorId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value4(Integer value) {
		setDetailsId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value5(String value) {
		setTitle(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value6(Integer value) {
		setPublishedIn(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value7(Integer value) {
		setLanguageId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value8(String value) {
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
	public TBookRecord value10(BigDecimal value) {
		setRecVersion(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value11(Timestamp value) {
		setRecTimestamp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord values(Integer value1, Integer value2, Integer value3, Integer value4, String value5, Integer value6, Integer value7, String value8, byte[] value9, BigDecimal value10, Timestamp value11) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		value11(value11);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TBookRecord
	 */
	public TBookRecord() {
		super(TBook.T_BOOK);
	}

	/**
	 * Create a detached, initialised TBookRecord
	 */
	public TBookRecord(Integer id, Integer authorId, Integer coAuthorId, Integer detailsId, String title, Integer publishedIn, Integer languageId, String contentText, byte[] contentPdf, BigDecimal recVersion, Timestamp recTimestamp) {
		super(TBook.T_BOOK);

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
