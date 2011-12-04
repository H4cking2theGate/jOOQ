/**
 * This class is generated by jOOQ
 */
package org.jooq.test.derby.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class TBooleans extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.derby.generatedclasses.tables.records.TBooleansRecord> {

	private static final long serialVersionUID = 86001341;

	/**
	 * The singleton instance of T_BOOLEANS
	 */
	public static final org.jooq.test.derby.generatedclasses.tables.TBooleans T_BOOLEANS = new org.jooq.test.derby.generatedclasses.tables.TBooleans();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.derby.generatedclasses.tables.records.TBooleansRecord> __RECORD_TYPE = org.jooq.test.derby.generatedclasses.tables.records.TBooleansRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.derby.generatedclasses.tables.records.TBooleansRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.TBooleansRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, T_BOOLEANS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.TBooleansRecord, org.jooq.test.derby.generatedclasses.enums.Boolean_10> ONE_ZERO = createField("ONE_ZERO", org.jooq.util.derby.DerbyDataType.VARCHAR.asEnumDataType(org.jooq.test.derby.generatedclasses.enums.Boolean_10.class), T_BOOLEANS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.TBooleansRecord, org.jooq.test.derby.generatedclasses.enums.BooleanTrueFalseLc> TRUE_FALSE_LC = createField("TRUE_FALSE_LC", org.jooq.util.derby.DerbyDataType.VARCHAR.asEnumDataType(org.jooq.test.derby.generatedclasses.enums.BooleanTrueFalseLc.class), T_BOOLEANS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.TBooleansRecord, org.jooq.test.derby.generatedclasses.enums.BooleanTrueFalseUc> TRUE_FALSE_UC = createField("TRUE_FALSE_UC", org.jooq.util.derby.DerbyDataType.VARCHAR.asEnumDataType(org.jooq.test.derby.generatedclasses.enums.BooleanTrueFalseUc.class), T_BOOLEANS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.TBooleansRecord, org.jooq.test.derby.generatedclasses.enums.BooleanYesNoLc> YES_NO_LC = createField("YES_NO_LC", org.jooq.util.derby.DerbyDataType.VARCHAR.asEnumDataType(org.jooq.test.derby.generatedclasses.enums.BooleanYesNoLc.class), T_BOOLEANS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.TBooleansRecord, org.jooq.test.derby.generatedclasses.enums.BooleanYesNoUc> YES_NO_UC = createField("YES_NO_UC", org.jooq.util.derby.DerbyDataType.VARCHAR.asEnumDataType(org.jooq.test.derby.generatedclasses.enums.BooleanYesNoUc.class), T_BOOLEANS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.TBooleansRecord, org.jooq.test.derby.generatedclasses.enums.BooleanYnLc> Y_N_LC = createField("Y_N_LC", org.jooq.util.derby.DerbyDataType.VARCHAR.asEnumDataType(org.jooq.test.derby.generatedclasses.enums.BooleanYnLc.class), T_BOOLEANS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.TBooleansRecord, org.jooq.test.derby.generatedclasses.enums.BooleanYnUc> Y_N_UC = createField("Y_N_UC", org.jooq.util.derby.DerbyDataType.VARCHAR.asEnumDataType(org.jooq.test.derby.generatedclasses.enums.BooleanYnUc.class), T_BOOLEANS);

	/**
	 * No further instances allowed
	 */
	private TBooleans() {
		super("T_BOOLEANS", org.jooq.test.derby.generatedclasses.Test.TEST);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.derby.generatedclasses.tables.records.TBooleansRecord> getMainKey() {
		return org.jooq.test.derby.generatedclasses.Keys.PK_T_BOOLEANS;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.derby.generatedclasses.tables.records.TBooleansRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.derby.generatedclasses.tables.records.TBooleansRecord>>asList(org.jooq.test.derby.generatedclasses.Keys.PK_T_BOOLEANS);
	}
}
