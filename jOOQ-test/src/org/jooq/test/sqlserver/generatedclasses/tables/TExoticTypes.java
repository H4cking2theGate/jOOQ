/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TExoticTypes extends org.jooq.impl.TableImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.TExoticTypesRecord> {

	private static final long serialVersionUID = 1117015835;

	/**
	 * The singleton instance of <code>dbo.t_exotic_types</code>
	 */
	public static final org.jooq.test.sqlserver.generatedclasses.tables.TExoticTypes T_EXOTIC_TYPES = new org.jooq.test.sqlserver.generatedclasses.tables.TExoticTypes();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlserver.generatedclasses.tables.records.TExoticTypesRecord> getRecordType() {
		return org.jooq.test.sqlserver.generatedclasses.tables.records.TExoticTypesRecord.class;
	}

	/**
	 * The column <code>dbo.t_exotic_types.ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TExoticTypesRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>dbo.t_exotic_types.UU</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TExoticTypesRecord, java.util.UUID> UU = createField("UU", org.jooq.impl.SQLDataType.UUID, this);

	/**
	 * Create a <code>dbo.t_exotic_types</code> table reference
	 */
	public TExoticTypes() {
		super("t_exotic_types", org.jooq.test.sqlserver.generatedclasses.Dbo.DBO);
	}

	/**
	 * Create an aliased <code>dbo.t_exotic_types</code> table reference
	 */
	public TExoticTypes(java.lang.String alias) {
		super(alias, org.jooq.test.sqlserver.generatedclasses.Dbo.DBO, org.jooq.test.sqlserver.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES);
	}

	private TExoticTypes(java.lang.String alias, org.jooq.Table<org.jooq.test.sqlserver.generatedclasses.tables.records.TExoticTypesRecord> aliased) {
		super(alias, org.jooq.test.sqlserver.generatedclasses.Dbo.DBO, aliased);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TExoticTypesRecord> getPrimaryKey() {
		return org.jooq.test.sqlserver.generatedclasses.Keys.PK_T_EXOTIC_TYPES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TExoticTypesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TExoticTypesRecord>>asList(org.jooq.test.sqlserver.generatedclasses.Keys.PK_T_EXOTIC_TYPES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.sqlserver.generatedclasses.tables.TExoticTypes as(java.lang.String alias) {
		return new org.jooq.test.sqlserver.generatedclasses.tables.TExoticTypes(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.sqlserver.generatedclasses.tables.TExoticTypes rename(java.lang.String name) {
		return new org.jooq.test.sqlserver.generatedclasses.tables.TExoticTypes(name, null);
	}
}
