/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class TBooleans extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.postgres.generatedclasses.tables.records.TBooleansRecord> {

	private static final long serialVersionUID = -582636471;

	/**
	 * The singleton instance of t_booleans
	 */
	public static final org.jooq.test.postgres.generatedclasses.tables.TBooleans T_BOOLEANS = new org.jooq.test.postgres.generatedclasses.tables.TBooleans();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.TBooleansRecord> __RECORD_TYPE = org.jooq.test.postgres.generatedclasses.tables.records.TBooleansRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.TBooleansRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TBooleansRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TBooleansRecord, org.jooq.test.postgres.generatedclasses.enums.Boolean_10> ONE_ZERO = createField("one_zero", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(org.jooq.test.postgres.generatedclasses.enums.Boolean_10.class), this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TBooleansRecord, org.jooq.test.postgres.generatedclasses.enums.BooleanTrueFalseLc> TRUE_FALSE_LC = createField("true_false_lc", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(org.jooq.test.postgres.generatedclasses.enums.BooleanTrueFalseLc.class), this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TBooleansRecord, org.jooq.test.postgres.generatedclasses.enums.BooleanTrueFalseUc> TRUE_FALSE_UC = createField("true_false_uc", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(org.jooq.test.postgres.generatedclasses.enums.BooleanTrueFalseUc.class), this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TBooleansRecord, org.jooq.test.postgres.generatedclasses.enums.BooleanYesNoLc> YES_NO_LC = createField("yes_no_lc", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(org.jooq.test.postgres.generatedclasses.enums.BooleanYesNoLc.class), this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TBooleansRecord, org.jooq.test.postgres.generatedclasses.enums.BooleanYesNoUc> YES_NO_UC = createField("yes_no_uc", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(org.jooq.test.postgres.generatedclasses.enums.BooleanYesNoUc.class), this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TBooleansRecord, org.jooq.test.postgres.generatedclasses.enums.BooleanYnLc> Y_N_LC = createField("y_n_lc", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(org.jooq.test.postgres.generatedclasses.enums.BooleanYnLc.class), this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TBooleansRecord, org.jooq.test.postgres.generatedclasses.enums.BooleanYnUc> Y_N_UC = createField("y_n_uc", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(org.jooq.test.postgres.generatedclasses.enums.BooleanYnUc.class), this);

	/**
	 * No further instances allowed
	 */
	private TBooleans() {
		super("t_booleans", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);
	}

	/**
	 * No further instances allowed
	 */
	private TBooleans(java.lang.String alias) {
		super(alias, org.jooq.test.postgres.generatedclasses.Public.PUBLIC, org.jooq.test.postgres.generatedclasses.tables.TBooleans.T_BOOLEANS);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TBooleansRecord> getMainKey() {
		return org.jooq.test.postgres.generatedclasses.Keys.pk_t_booleans;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TBooleansRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TBooleansRecord>>asList(org.jooq.test.postgres.generatedclasses.Keys.pk_t_booleans);
	}

	@Override
	public org.jooq.test.postgres.generatedclasses.tables.TBooleans as(java.lang.String alias) {
		return new org.jooq.test.postgres.generatedclasses.tables.TBooleans(alias);
	}
}
