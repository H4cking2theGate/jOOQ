/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables;

/**
 * This class is generated by jOOQ.
 *
 * A book store
 */
@java.lang.SuppressWarnings("all")
public class TBookStore extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookStoreRecord> {

	private static final long serialVersionUID = -1822946867;

	/**
	 * The singleton instance of <code>TEST.T_BOOK_STORE</code>
	 */
	public static final org.jooq.test.oracle.generatedclasses.test.tables.TBookStore T_BOOK_STORE = new org.jooq.test.oracle.generatedclasses.test.tables.TBookStore();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookStoreRecord> getRecordType() {
		return org.jooq.test.oracle.generatedclasses.test.tables.records.TBookStoreRecord.class;
	}

	/**
	 * The books store name
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookStoreRecord, java.lang.String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	public TBookStore() {
		super("T_BOOK_STORE", org.jooq.test.oracle.generatedclasses.test.Test.TEST);
	}

	public TBookStore(java.lang.String alias) {
		super(alias, org.jooq.test.oracle.generatedclasses.test.Test.TEST, org.jooq.test.oracle.generatedclasses.test.tables.TBookStore.T_BOOK_STORE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookStoreRecord> getMainKey() {
		return org.jooq.test.oracle.generatedclasses.test.Keys.UK_T_BOOK_STORE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookStoreRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookStoreRecord>>asList(org.jooq.test.oracle.generatedclasses.test.Keys.UK_T_BOOK_STORE_NAME);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle.generatedclasses.test.tables.TBookStore as(java.lang.String alias) {
		return new org.jooq.test.oracle.generatedclasses.test.tables.TBookStore(alias);
	}
}
