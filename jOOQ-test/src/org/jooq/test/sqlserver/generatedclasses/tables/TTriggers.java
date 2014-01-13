/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TTriggers extends org.jooq.impl.TableImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.TTriggersRecord> {

	private static final long serialVersionUID = -1061309462;

	/**
	 * The singleton instance of <code>dbo.t_triggers</code>
	 */
	public static final org.jooq.test.sqlserver.generatedclasses.tables.TTriggers T_TRIGGERS = new org.jooq.test.sqlserver.generatedclasses.tables.TTriggers();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlserver.generatedclasses.tables.records.TTriggersRecord> getRecordType() {
		return org.jooq.test.sqlserver.generatedclasses.tables.records.TTriggersRecord.class;
	}

	/**
	 * The column <code>dbo.t_triggers.id_generated</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer> ID_GENERATED = createField("id_generated", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>dbo.t_triggers.id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>dbo.t_triggers.counter</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer> COUNTER = createField("counter", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>dbo.t_triggers</code> table reference
	 */
	public TTriggers() {
		super("t_triggers", org.jooq.test.sqlserver.generatedclasses.Dbo.DBO);
	}

	/**
	 * Create an aliased <code>dbo.t_triggers</code> table reference
	 */
	public TTriggers(java.lang.String alias) {
		super(alias, org.jooq.test.sqlserver.generatedclasses.Dbo.DBO, org.jooq.test.sqlserver.generatedclasses.tables.TTriggers.T_TRIGGERS);
	}

	private TTriggers(java.lang.String alias, org.jooq.Table<org.jooq.test.sqlserver.generatedclasses.tables.records.TTriggersRecord> aliased) {
		super(alias, org.jooq.test.sqlserver.generatedclasses.Dbo.DBO, aliased);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.jooq.test.sqlserver.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer> getIdentity() {
		return org.jooq.test.sqlserver.generatedclasses.Keys.IDENTITY_T_TRIGGERS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TTriggersRecord> getPrimaryKey() {
		return org.jooq.test.sqlserver.generatedclasses.Keys.PK_T_TRIGGERS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TTriggersRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TTriggersRecord>>asList(org.jooq.test.sqlserver.generatedclasses.Keys.PK_T_TRIGGERS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.sqlserver.generatedclasses.tables.TTriggers as(java.lang.String alias) {
		return new org.jooq.test.sqlserver.generatedclasses.tables.TTriggers(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.sqlserver.generatedclasses.tables.TTriggers rename(java.lang.String name) {
		return new org.jooq.test.sqlserver.generatedclasses.tables.TTriggers(name, null);
	}
}
