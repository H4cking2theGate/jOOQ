/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TUnsigned extends org.jooq.impl.TableImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.TUnsignedRecord> {

	private static final long serialVersionUID = 1955193941;

	/**
	 * The singleton instance of <code>dbo.t_unsigned</code>
	 */
	public static final org.jooq.test.sqlserver.generatedclasses.tables.TUnsigned T_UNSIGNED = new org.jooq.test.sqlserver.generatedclasses.tables.TUnsigned();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlserver.generatedclasses.tables.records.TUnsignedRecord> getRecordType() {
		return org.jooq.test.sqlserver.generatedclasses.tables.records.TUnsignedRecord.class;
	}

	/**
	 * The column <code>dbo.t_unsigned.u_byte</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TUnsignedRecord, org.jooq.types.UByte> U_BYTE = createField("u_byte", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this);

	/**
	 * The column <code>dbo.t_unsigned.u_short</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TUnsignedRecord, org.jooq.types.UShort> U_SHORT = createField("u_short", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED, this);

	/**
	 * The column <code>dbo.t_unsigned.u_int</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TUnsignedRecord, org.jooq.types.UInteger> U_INT = createField("u_int", org.jooq.impl.SQLDataType.INTEGERUNSIGNED, this);

	/**
	 * The column <code>dbo.t_unsigned.u_long</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TUnsignedRecord, org.jooq.types.ULong> U_LONG = createField("u_long", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this);

	/**
	 * Create a <code>dbo.t_unsigned</code> table reference
	 */
	public TUnsigned() {
		super("t_unsigned", org.jooq.test.sqlserver.generatedclasses.Dbo.DBO);
	}

	/**
	 * Create an aliased <code>dbo.t_unsigned</code> table reference
	 */
	public TUnsigned(java.lang.String alias) {
		super(alias, org.jooq.test.sqlserver.generatedclasses.Dbo.DBO, org.jooq.test.sqlserver.generatedclasses.tables.TUnsigned.T_UNSIGNED);
	}

	private TUnsigned(java.lang.String alias, org.jooq.Table<org.jooq.test.sqlserver.generatedclasses.tables.records.TUnsignedRecord> aliased) {
		super(alias, org.jooq.test.sqlserver.generatedclasses.Dbo.DBO, aliased);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.sqlserver.generatedclasses.tables.TUnsigned as(java.lang.String alias) {
		return new org.jooq.test.sqlserver.generatedclasses.tables.TUnsigned(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.sqlserver.generatedclasses.tables.TUnsigned rename(java.lang.String name) {
		return new org.jooq.test.sqlserver.generatedclasses.tables.TUnsigned(name, null);
	}
}
