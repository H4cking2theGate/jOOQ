/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class TBookToBookStore extends org.jooq.impl.TableImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.TBookToBookStoreRecord> {

	private static final long serialVersionUID = -1929104321;

	/**
	 * The singleton instance of <code>dbo.t_book_to_book_store</code>
	 */
	public static final org.jooq.test.sqlserver.generatedclasses.tables.TBookToBookStore T_BOOK_TO_BOOK_STORE = new org.jooq.test.sqlserver.generatedclasses.tables.TBookToBookStore();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlserver.generatedclasses.tables.records.TBookToBookStoreRecord> getRecordType() {
		return org.jooq.test.sqlserver.generatedclasses.tables.records.TBookToBookStoreRecord.class;
	}

	/**
	 * The column <code>dbo.t_book_to_book_store.BOOK_STORE_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TBookToBookStoreRecord, java.lang.String> BOOK_STORE_NAME = createField("BOOK_STORE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(400), this);

	/**
	 * The column <code>dbo.t_book_to_book_store.BOOK_ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TBookToBookStoreRecord, java.lang.Integer> BOOK_ID = createField("BOOK_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>dbo.t_book_to_book_store.STOCK</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TBookToBookStoreRecord, java.lang.Integer> STOCK = createField("STOCK", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>dbo.t_book_to_book_store</code> table reference
	 */
	public TBookToBookStore() {
		super("t_book_to_book_store", org.jooq.test.sqlserver.generatedclasses.Dbo.DBO);
	}

	/**
	 * Create an aliased <code>dbo.t_book_to_book_store</code> table reference
	 */
	public TBookToBookStore(java.lang.String alias) {
		super(alias, org.jooq.test.sqlserver.generatedclasses.Dbo.DBO, org.jooq.test.sqlserver.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TBookToBookStoreRecord> getPrimaryKey() {
		return org.jooq.test.sqlserver.generatedclasses.Keys.PK_B2BS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TBookToBookStoreRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TBookToBookStoreRecord>>asList(org.jooq.test.sqlserver.generatedclasses.Keys.PK_B2BS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TBookToBookStoreRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TBookToBookStoreRecord, ?>>asList(org.jooq.test.sqlserver.generatedclasses.Keys.FK_B2BS_BS_NAME, org.jooq.test.sqlserver.generatedclasses.Keys.FK_B2BS_B_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.sqlserver.generatedclasses.tables.TBookToBookStore as(java.lang.String alias) {
		return new org.jooq.test.sqlserver.generatedclasses.tables.TBookToBookStore(alias);
	}
}
