/**
 * This class is generated by jOOQ
 */
package org.jooq.test.cubrid.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class TIdentity extends org.jooq.impl.TableImpl<org.jooq.test.cubrid.generatedclasses.tables.records.TIdentityRecord> {

	private static final long serialVersionUID = -1763717746;

	/**
	 * The singleton instance of DBA.t_identity
	 */
	public static final org.jooq.test.cubrid.generatedclasses.tables.TIdentity T_IDENTITY = new org.jooq.test.cubrid.generatedclasses.tables.TIdentity();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.cubrid.generatedclasses.tables.records.TIdentityRecord> __RECORD_TYPE = org.jooq.test.cubrid.generatedclasses.tables.records.TIdentityRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.cubrid.generatedclasses.tables.records.TIdentityRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.TIdentityRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, T_IDENTITY);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.TIdentityRecord, java.lang.Integer> VAL = createField("val", org.jooq.impl.SQLDataType.INTEGER, T_IDENTITY);

	/**
	 * No further instances allowed
	 */
	private TIdentity() {
		super("t_identity", org.jooq.test.cubrid.generatedclasses.Dba.DBA);
	}

	@Override
	public org.jooq.Identity<org.jooq.test.cubrid.generatedclasses.tables.records.TIdentityRecord, java.lang.Integer> getIdentity() {
		return org.jooq.test.cubrid.generatedclasses.Keys.IDENTITY_T_IDENTITY;
	}
}
