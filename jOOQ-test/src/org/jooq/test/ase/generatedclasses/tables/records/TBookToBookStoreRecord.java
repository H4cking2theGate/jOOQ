/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ase.generatedclasses.tables.records;

import org.jooq.Record3;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TBookToBookStoreRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.ase.generatedclasses.tables.records.TBookToBookStoreRecord> implements org.jooq.Record3<java.lang.String, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = 2090793927;

	/**
	 * The table column <code>dbo.t_book_to_book_store.book_store_name</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT t_book_to_book_store__fk_b2bs_bs_name
	 * FOREIGN KEY (book_store_name)
	 * REFERENCES dbo.t_book_store (name)
	 * </pre></code>
	 */
	public void setBookStoreName(java.lang.String value) {
		setValue(org.jooq.test.ase.generatedclasses.tables.TBookToBookStore.BOOK_STORE_NAME, value);
	}

	/**
	 * The table column <code>dbo.t_book_to_book_store.book_store_name</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT t_book_to_book_store__fk_b2bs_bs_name
	 * FOREIGN KEY (book_store_name)
	 * REFERENCES dbo.t_book_store (name)
	 * </pre></code>
	 */
	public java.lang.String getBookStoreName() {
		return getValue(org.jooq.test.ase.generatedclasses.tables.TBookToBookStore.BOOK_STORE_NAME);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.ase.generatedclasses.tables.records.TBookStoreRecord
	 * TBookStoreRecord}
	 */
	public void setBookStoreName(org.jooq.test.ase.generatedclasses.tables.records.TBookStoreRecord value) {
		if (value == null) {
			setValue(org.jooq.test.ase.generatedclasses.tables.TBookToBookStore.BOOK_STORE_NAME, null);
		}
		else {
			setValue(org.jooq.test.ase.generatedclasses.tables.TBookToBookStore.BOOK_STORE_NAME, value.getValue(org.jooq.test.ase.generatedclasses.tables.TBookStore.NAME));
		}
	}

	/**
	 * The table column <code>dbo.t_book_to_book_store.book_store_name</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT t_book_to_book_store__fk_b2bs_bs_name
	 * FOREIGN KEY (book_store_name)
	 * REFERENCES dbo.t_book_store (name)
	 * </pre></code>
	 */
	public org.jooq.test.ase.generatedclasses.tables.records.TBookStoreRecord fetchTBookStore() {
		return create()
			.selectFrom(org.jooq.test.ase.generatedclasses.tables.TBookStore.T_BOOK_STORE)
			.where(org.jooq.test.ase.generatedclasses.tables.TBookStore.NAME.equal(getValue(org.jooq.test.ase.generatedclasses.tables.TBookToBookStore.BOOK_STORE_NAME)))
			.fetchOne();
	}

	/**
	 * The table column <code>dbo.t_book_to_book_store.book_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT t_book_to_book_store__fk_b2bs_b_id
	 * FOREIGN KEY (book_id)
	 * REFERENCES dbo.t_book (id)
	 * </pre></code>
	 */
	public void setBookId(java.lang.Integer value) {
		setValue(org.jooq.test.ase.generatedclasses.tables.TBookToBookStore.BOOK_ID, value);
	}

	/**
	 * The table column <code>dbo.t_book_to_book_store.book_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT t_book_to_book_store__fk_b2bs_b_id
	 * FOREIGN KEY (book_id)
	 * REFERENCES dbo.t_book (id)
	 * </pre></code>
	 */
	public java.lang.Integer getBookId() {
		return getValue(org.jooq.test.ase.generatedclasses.tables.TBookToBookStore.BOOK_ID);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.ase.generatedclasses.tables.records.TBookRecord
	 * TBookRecord}
	 */
	public void setBookId(org.jooq.test.ase.generatedclasses.tables.records.TBookRecord value) {
		if (value == null) {
			setValue(org.jooq.test.ase.generatedclasses.tables.TBookToBookStore.BOOK_ID, null);
		}
		else {
			setValue(org.jooq.test.ase.generatedclasses.tables.TBookToBookStore.BOOK_ID, value.getValue(org.jooq.test.ase.generatedclasses.tables.TBook.ID));
		}
	}

	/**
	 * The table column <code>dbo.t_book_to_book_store.book_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT t_book_to_book_store__fk_b2bs_b_id
	 * FOREIGN KEY (book_id)
	 * REFERENCES dbo.t_book (id)
	 * </pre></code>
	 */
	public org.jooq.test.ase.generatedclasses.tables.records.TBookRecord fetchTBook() {
		return create()
			.selectFrom(org.jooq.test.ase.generatedclasses.tables.TBook.T_BOOK)
			.where(org.jooq.test.ase.generatedclasses.tables.TBook.ID.equal(getValue(org.jooq.test.ase.generatedclasses.tables.TBookToBookStore.BOOK_ID)))
			.fetchOne();
	}

	/**
	 * The table column <code>dbo.t_book_to_book_store.stock</code>
	 */
	public void setStock(java.lang.Integer value) {
		setValue(org.jooq.test.ase.generatedclasses.tables.TBookToBookStore.STOCK, value);
	}

	/**
	 * The table column <code>dbo.t_book_to_book_store.stock</code>
	 */
	public java.lang.Integer getStock() {
		return getValue(org.jooq.test.ase.generatedclasses.tables.TBookToBookStore.STOCK);
	}

	/**
	 * Create a detached TBookToBookStoreRecord
	 */
	public TBookToBookStoreRecord() {
		super(org.jooq.test.ase.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE);
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.String, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return org.jooq.impl.DSL.row(field1(), field2(), field3());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.String, java.lang.Integer, java.lang.Integer> valuesRow() {
		return org.jooq.impl.DSL.row(value1(), value2(), value3());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.jooq.test.ase.generatedclasses.tables.TBookToBookStore.BOOK_STORE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.ase.generatedclasses.tables.TBookToBookStore.BOOK_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.jooq.test.ase.generatedclasses.tables.TBookToBookStore.STOCK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getBookStoreName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getBookId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getStock();
	}

    @Override
    public Record3<String, Integer, Integer> value1(String value) {
        return null;
    }

    @Override
    public Record3<String, Integer, Integer> value2(Integer value) {
        return null;
    }

    @Override
    public Record3<String, Integer, Integer> value3(Integer value) {
        return null;
    }

    @Override
    public Record3<String, Integer, Integer> values(String t1, Integer t2, Integer t3) {
        return null;
    }
}
