/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding books
 */
@java.lang.SuppressWarnings("all")
public class TBook extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.h2.generatedclasses.tables.records.TBookRecord> {

	private static final long serialVersionUID = 328169272;

	/**
	 * The singleton instance of <code>PUBLIC.T_BOOK</code>
	 */
	public static final org.jooq.test.h2.generatedclasses.tables.TBook T_BOOK = new org.jooq.test.h2.generatedclasses.tables.TBook();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.h2.generatedclasses.tables.records.TBookRecord> getRecordType() {
		return org.jooq.test.h2.generatedclasses.tables.records.TBookRecord.class;
	}

	/**
	 * The column <code>PUBLIC.T_BOOK.ID</code>. The book ID
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TBookRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The column <code>PUBLIC.T_BOOK.AUTHOR_ID</code>. The author ID in entity 'author'
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TBookRecord, java.lang.Integer> AUTHOR_ID = createField("AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The column <code>PUBLIC.T_BOOK.CO_AUTHOR_ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TBookRecord, java.lang.Integer> CO_AUTHOR_ID = createField("CO_AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The column <code>PUBLIC.T_BOOK.DETAILS_ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TBookRecord, java.lang.Integer> DETAILS_ID = createField("DETAILS_ID", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The column <code>PUBLIC.T_BOOK.TITLE</code>. The book's title
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TBookRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR.length(400), T_BOOK);

	/**
	 * The column <code>PUBLIC.T_BOOK.PUBLISHED_IN</code>. The year the book was published in
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TBookRecord, java.lang.Integer> PUBLISHED_IN = createField("PUBLISHED_IN", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The column <code>PUBLIC.T_BOOK.LANGUAGE_ID</code>. The language of the book
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TBookRecord, java.lang.Integer> LANGUAGE_ID = createField("LANGUAGE_ID", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The column <code>PUBLIC.T_BOOK.CONTENT_TEXT</code>. Some textual content of the book
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TBookRecord, java.lang.String> CONTENT_TEXT = createField("CONTENT_TEXT", org.jooq.impl.SQLDataType.CLOB, T_BOOK);

	/**
	 * The column <code>PUBLIC.T_BOOK.CONTENT_PDF</code>. Some binary content of the book
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TBookRecord, byte[]> CONTENT_PDF = createField("CONTENT_PDF", org.jooq.impl.SQLDataType.BLOB, T_BOOK);

	/**
	 * The column <code>PUBLIC.T_BOOK.REC_VERSION</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TBookRecord, java.lang.Integer> REC_VERSION = createField("REC_VERSION", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The column <code>PUBLIC.T_BOOK.REC_TIMESTAMP</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TBookRecord, java.sql.Timestamp> REC_TIMESTAMP = createField("REC_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP, T_BOOK);

	/**
	 * No further instances allowed
	 */
	private TBook() {
		super("T_BOOK", org.jooq.test.h2.generatedclasses.Public.PUBLIC);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.h2.generatedclasses.tables.records.TBookRecord> getMainKey() {
		return org.jooq.test.h2.generatedclasses.Keys.PK_T_BOOK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.h2.generatedclasses.tables.records.TBookRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.h2.generatedclasses.tables.records.TBookRecord>>asList(org.jooq.test.h2.generatedclasses.Keys.PK_T_BOOK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.h2.generatedclasses.tables.records.TBookRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.h2.generatedclasses.tables.records.TBookRecord, ?>>asList(org.jooq.test.h2.generatedclasses.Keys.FK_T_BOOK_AUTHOR_ID, org.jooq.test.h2.generatedclasses.Keys.FK_T_BOOK_CO_AUTHOR_ID, org.jooq.test.h2.generatedclasses.Keys.FK_T_BOOK_LANGUAGE_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TBookRecord, java.lang.Integer> getRecordVersion() {
		return org.jooq.test.h2.generatedclasses.tables.TBook.REC_VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TBookRecord, java.sql.Timestamp> getRecordTimestamp() {
		return org.jooq.test.h2.generatedclasses.tables.TBook.REC_TIMESTAMP;
	}
}
