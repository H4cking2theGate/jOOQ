/**
 * This class is generated by jOOQ
 */
package org.jooq.test.vertica.generatedclasses.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.test.vertica.generatedclasses.Keys;
import org.jooq.test.vertica.generatedclasses.Public;
import org.jooq.test.vertica.generatedclasses.tables.records.TBookToBookStoreRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBookToBookStore extends TableImpl<TBookToBookStoreRecord> {

	private static final long serialVersionUID = 1306493144;

	/**
	 * The reference instance of <code>public.t_book_to_book_store</code>
	 */
	public static final TBookToBookStore T_BOOK_TO_BOOK_STORE = new TBookToBookStore();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TBookToBookStoreRecord> getRecordType() {
		return TBookToBookStoreRecord.class;
	}

	/**
	 * The column <code>public.t_book_to_book_store.book_store_name</code>.
	 */
	public final TableField<TBookToBookStoreRecord, String> BOOK_STORE_NAME = createField("book_store_name", org.jooq.impl.SQLDataType.VARCHAR.length(400).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.t_book_to_book_store.book_id</code>.
	 */
	public final TableField<TBookToBookStoreRecord, Integer> BOOK_ID = createField("book_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.t_book_to_book_store.stock</code>.
	 */
	public final TableField<TBookToBookStoreRecord, Integer> STOCK = createField("stock", org.jooq.impl.SQLDataType.INTEGER.defaulted(true), this, "");

	/**
	 * Create a <code>public.t_book_to_book_store</code> table reference
	 */
	public TBookToBookStore() {
		this("t_book_to_book_store", null);
	}

	/**
	 * Create an aliased <code>public.t_book_to_book_store</code> table reference
	 */
	public TBookToBookStore(String alias) {
		this(alias, T_BOOK_TO_BOOK_STORE);
	}

	private TBookToBookStore(String alias, Table<TBookToBookStoreRecord> aliased) {
		this(alias, aliased, null);
	}

	private TBookToBookStore(String alias, Table<TBookToBookStoreRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<TBookToBookStoreRecord> getPrimaryKey() {
		return Keys.PK_B2BS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<TBookToBookStoreRecord>> getKeys() {
		return Arrays.<UniqueKey<TBookToBookStoreRecord>>asList(Keys.PK_B2BS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<TBookToBookStoreRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<TBookToBookStoreRecord, ?>>asList(Keys.FK_B2BS_BS_NAME, Keys.FK_B2BS_B_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookToBookStore as(String alias) {
		return new TBookToBookStore(alias, this);
	}

	/**
	 * Rename this table
	 */
	public TBookToBookStore rename(String name) {
		return new TBookToBookStore(name, null);
	}
}
