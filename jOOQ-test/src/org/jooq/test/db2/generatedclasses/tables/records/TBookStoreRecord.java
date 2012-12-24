/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TBookStoreRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.db2.generatedclasses.tables.records.TBookStoreRecord> implements org.jooq.Record1<java.lang.String> {

	private static final long serialVersionUID = 125586058;

	/**
	 * Setter for <code>LUKAS.T_BOOK_STORE.NAME</code>. 
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.test.db2.generatedclasses.tables.TBookStore.NAME, value);
	}

	/**
	 * Getter for <code>LUKAS.T_BOOK_STORE.NAME</code>. 
	 */
	public java.lang.String getName() {
		return getValue(org.jooq.test.db2.generatedclasses.tables.TBookStore.NAME);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.String> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record1 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.String> fieldsRow() {
		return org.jooq.impl.Factory.row(field1());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.String> valuesRow() {
		return org.jooq.impl.Factory.row(value1());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.jooq.test.db2.generatedclasses.tables.TBookStore.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getName();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TBookStoreRecord
	 */
	public TBookStoreRecord() {
		super(org.jooq.test.db2.generatedclasses.tables.TBookStore.T_BOOK_STORE);
	}
}
