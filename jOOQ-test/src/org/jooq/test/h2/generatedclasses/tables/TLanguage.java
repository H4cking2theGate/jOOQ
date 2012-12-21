/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding language master data
 */
@java.lang.SuppressWarnings("all")
public class TLanguage extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.h2.generatedclasses.tables.records.TLanguageRecord> {

	private static final long serialVersionUID = 271895928;

	/**
	 * The singleton instance of <code>PUBLIC.T_LANGUAGE</code>
	 */
	public static final org.jooq.test.h2.generatedclasses.tables.TLanguage T_LANGUAGE = new org.jooq.test.h2.generatedclasses.tables.TLanguage();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.h2.generatedclasses.tables.records.TLanguageRecord> getRecordType() {
		return org.jooq.test.h2.generatedclasses.tables.records.TLanguageRecord.class;
	}

	/**
	 * The column <code>PUBLIC.T_LANGUAGE.CD</code>. The language ISO code
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TLanguageRecord, java.lang.String> CD = createField("CD", org.jooq.impl.SQLDataType.CHAR.length(2), T_LANGUAGE);

	/**
	 * The column <code>PUBLIC.T_LANGUAGE.DESCRIPTION</code>. The language description
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TLanguageRecord, java.lang.String> DESCRIPTION = createField("DESCRIPTION", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_LANGUAGE);

	/**
	 * The column <code>PUBLIC.T_LANGUAGE.DESCRIPTION_ENGLISH</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TLanguageRecord, java.lang.String> DESCRIPTION_ENGLISH = createField("DESCRIPTION_ENGLISH", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_LANGUAGE);

	/**
	 * The column <code>PUBLIC.T_LANGUAGE.ID</code>. The language ID
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TLanguageRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, T_LANGUAGE);

	/**
	 * No further instances allowed
	 */
	private TLanguage() {
		super("T_LANGUAGE", org.jooq.test.h2.generatedclasses.Public.PUBLIC);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.h2.generatedclasses.tables.records.TLanguageRecord> getMainKey() {
		return org.jooq.test.h2.generatedclasses.Keys.PK_T_LANGUAGE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.h2.generatedclasses.tables.records.TLanguageRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.h2.generatedclasses.tables.records.TLanguageRecord>>asList(org.jooq.test.h2.generatedclasses.Keys.PK_T_LANGUAGE);
	}
}
