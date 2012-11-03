/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class XTestCase_85Dao extends org.jooq.impl.DAOImpl<org.jooq.test.h2.generatedclasses.tables.records.XTestCase_85Record, org.jooq.test.h2.generatedclasses.tables.pojos.XTestCase_85, java.lang.Integer> {

	/**
	 * Create a new XTestCase_85Dao without any factory
	 */
	public XTestCase_85Dao() {
		super(org.jooq.test.h2.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85, org.jooq.test.h2.generatedclasses.tables.pojos.XTestCase_85.class);
	}

	/**
	 * Create a new XTestCase_85Dao with an attached factory
	 */
	public XTestCase_85Dao(org.jooq.impl.Executor factory) {
		super(org.jooq.test.h2.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85, org.jooq.test.h2.generatedclasses.tables.pojos.XTestCase_85.class, factory);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(org.jooq.test.h2.generatedclasses.tables.pojos.XTestCase_85 object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.XTestCase_85> fetchById(java.lang.Integer... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.XTestCase_85.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>ID = value</code>
	 */
	public org.jooq.test.h2.generatedclasses.tables.pojos.XTestCase_85 fetchOneById(java.lang.Integer value) {
		return fetchOne(org.jooq.test.h2.generatedclasses.tables.XTestCase_85.ID, value);
	}

	/**
	 * Fetch records that have <code>X_UNUSED_ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.XTestCase_85> fetchByXUnusedId(java.lang.Integer... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.XTestCase_85.X_UNUSED_ID, values);
	}

	/**
	 * Fetch records that have <code>X_UNUSED_NAME IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.XTestCase_85> fetchByXUnusedName(java.lang.String... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.XTestCase_85.X_UNUSED_NAME, values);
	}
}
