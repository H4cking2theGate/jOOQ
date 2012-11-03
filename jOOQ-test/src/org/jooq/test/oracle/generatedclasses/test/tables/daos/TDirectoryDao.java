/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TDirectoryDao extends org.jooq.impl.DAOImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.TDirectoryRecord, org.jooq.test.oracle.generatedclasses.test.tables.pojos.TDirectory, java.lang.Integer> {

	/**
	 * Create a new TDirectoryDao without any factory
	 */
	public TDirectoryDao() {
		super(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY, org.jooq.test.oracle.generatedclasses.test.tables.pojos.TDirectory.class);
	}

	/**
	 * Create a new TDirectoryDao with an attached factory
	 */
	public TDirectoryDao(org.jooq.impl.Executor factory) {
		super(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY, org.jooq.test.oracle.generatedclasses.test.tables.pojos.TDirectory.class, factory);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(org.jooq.test.oracle.generatedclasses.test.tables.pojos.TDirectory object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.test.tables.pojos.TDirectory> fetchById(java.lang.Integer... values) {
		return fetch(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>ID = value</code>
	 */
	public org.jooq.test.oracle.generatedclasses.test.tables.pojos.TDirectory fetchOneById(java.lang.Integer value) {
		return fetchOne(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY.ID, value);
	}

	/**
	 * Fetch records that have <code>PARENT_ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.test.tables.pojos.TDirectory> fetchByParentId(java.lang.Integer... values) {
		return fetch(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY.PARENT_ID, values);
	}

	/**
	 * Fetch records that have <code>IS_DIRECTORY IN (values)</code>
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.test.tables.pojos.TDirectory> fetchByIsDirectory(java.lang.Integer... values) {
		return fetch(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY.IS_DIRECTORY, values);
	}

	/**
	 * Fetch records that have <code>name IN (values)</code>
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.test.tables.pojos.TDirectory> fetchByName(java.lang.String... values) {
		return fetch(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY.NAME, values);
	}
}
