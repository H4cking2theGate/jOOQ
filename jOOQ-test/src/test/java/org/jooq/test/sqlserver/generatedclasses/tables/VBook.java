/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.tables;


import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.test.sqlserver.generatedclasses.Dbo;
import org.jooq.test.sqlserver.generatedclasses.tables.records.VBookRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VBook extends TableImpl<VBookRecord> {

	private static final long serialVersionUID = -780826532;

	/**
	 * The reference instance of <code>dbo.v_book</code>
	 */
	public static final VBook V_BOOK = new VBook();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<VBookRecord> getRecordType() {
		return VBookRecord.class;
	}

	/**
	 * The column <code>dbo.v_book.ID</code>.
	 */
	public final TableField<VBookRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>dbo.v_book.AUTHOR_ID</code>.
	 */
	public final TableField<VBookRecord, Integer> AUTHOR_ID = createField("AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>dbo.v_book.CO_AUTHOR_ID</code>.
	 */
	public final TableField<VBookRecord, Integer> CO_AUTHOR_ID = createField("CO_AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>dbo.v_book.DETAILS_ID</code>.
	 */
	public final TableField<VBookRecord, Integer> DETAILS_ID = createField("DETAILS_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>dbo.v_book.TITLE</code>.
	 */
	public final TableField<VBookRecord, String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR.length(400).nullable(false), this, "");

	/**
	 * The column <code>dbo.v_book.PUBLISHED_IN</code>.
	 */
	public final TableField<VBookRecord, Integer> PUBLISHED_IN = createField("PUBLISHED_IN", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>dbo.v_book.LANGUAGE_ID</code>.
	 */
	public final TableField<VBookRecord, Integer> LANGUAGE_ID = createField("LANGUAGE_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>dbo.v_book.CONTENT_TEXT</code>.
	 */
	public final TableField<VBookRecord, String> CONTENT_TEXT = createField("CONTENT_TEXT", org.jooq.impl.SQLDataType.CLOB.length(2147483647), this, "");

	/**
	 * The column <code>dbo.v_book.CONTENT_PDF</code>.
	 */
	public final TableField<VBookRecord, byte[]> CONTENT_PDF = createField("CONTENT_PDF", org.jooq.impl.SQLDataType.VARBINARY, this, "");

	/**
	 * Create a <code>dbo.v_book</code> table reference
	 */
	public VBook() {
		this("v_book", null);
	}

	/**
	 * Create an aliased <code>dbo.v_book</code> table reference
	 */
	public VBook(String alias) {
		this(alias, V_BOOK);
	}

	private VBook(String alias, Table<VBookRecord> aliased) {
		this(alias, aliased, null);
	}

	private VBook(String alias, Table<VBookRecord> aliased, Field<?>[] parameters) {
		super(alias, Dbo.DBO, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VBook as(String alias) {
		return new VBook(alias, this);
	}

	/**
	 * Rename this table
	 */
	public VBook rename(String name) {
		return new VBook(name, null);
	}
}
