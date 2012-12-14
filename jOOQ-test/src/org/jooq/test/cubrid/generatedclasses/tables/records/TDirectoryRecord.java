/**
 * This class is generated by jOOQ
 */
package org.jooq.test.cubrid.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TDirectoryRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.cubrid.generatedclasses.tables.records.TDirectoryRecord> implements org.jooq.Record4<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String> {

	private static final long serialVersionUID = 1734457909;

	/**
	 * Setter for <code>DBA.t_directory.id</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.TDirectory.ID, value);
	}

	/**
	 * Getter for <code>DBA.t_directory.id</code>. 
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.TDirectory.ID);
	}

	/**
	 * Setter for <code>DBA.t_directory.parent_id</code>. 
	 */
	public void setParentId(java.lang.Integer value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.TDirectory.PARENT_ID, value);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.cubrid.generatedclasses.tables.records.TDirectoryRecord}
	 */
	public void setParentId(org.jooq.test.cubrid.generatedclasses.tables.records.TDirectoryRecord value) {
		if (value == null) {
			setValue(org.jooq.test.cubrid.generatedclasses.tables.TDirectory.PARENT_ID, null);
		}
		else {
			setValue(org.jooq.test.cubrid.generatedclasses.tables.TDirectory.PARENT_ID, value.getValue(org.jooq.test.cubrid.generatedclasses.tables.TDirectory.ID));
		}
	}

	/**
	 * Getter for <code>DBA.t_directory.parent_id</code>. 
	 */
	public java.lang.Integer getParentId() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.TDirectory.PARENT_ID);
	}

	/**
	 * Setter for <code>DBA.t_directory.is_directory</code>. 
	 */
	public void setIsDirectory(java.lang.Integer value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.TDirectory.IS_DIRECTORY, value);
	}

	/**
	 * Getter for <code>DBA.t_directory.is_directory</code>. 
	 */
	public java.lang.Integer getIsDirectory() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.TDirectory.IS_DIRECTORY);
	}

	/**
	 * Setter for <code>DBA.t_directory.name</code>. 
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.TDirectory.NAME, value);
	}

	/**
	 * Getter for <code>DBA.t_directory.name</code>. 
	 */
	public java.lang.String getName() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.TDirectory.NAME);
	}

	// -------------------------------------------------------------------------
	// Foreign key navigation methods
	// -------------------------------------------------------------------------

	/**
	 * Fetch a list of <code>DBA.t_directory</code> referencing this <code>DBA.t_directory</code>
	 */
	public org.jooq.Result<org.jooq.test.cubrid.generatedclasses.tables.records.TDirectoryRecord> fetchTDirectoryList() {
		return create()
			.selectFrom(org.jooq.test.cubrid.generatedclasses.tables.TDirectory.T_DIRECTORY)
			.where(org.jooq.test.cubrid.generatedclasses.tables.TDirectory.PARENT_ID.equal(getValue(org.jooq.test.cubrid.generatedclasses.tables.TDirectory.ID)))
			.fetch();
	}

	/**
	 * Fetch a <code>DBA.t_directory</code> referenced by this <code>DBA.t_directory</code>
	 */
	public org.jooq.test.cubrid.generatedclasses.tables.records.TDirectoryRecord fetchTDirectory() {
		return create()
			.selectFrom(org.jooq.test.cubrid.generatedclasses.tables.TDirectory.T_DIRECTORY)
			.where(org.jooq.test.cubrid.generatedclasses.tables.TDirectory.ID.equal(getValue(org.jooq.test.cubrid.generatedclasses.tables.TDirectory.PARENT_ID)))
			.fetchOne();
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3(), field4());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3(), value4());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.cubrid.generatedclasses.tables.TDirectory.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.cubrid.generatedclasses.tables.TDirectory.PARENT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.jooq.test.cubrid.generatedclasses.tables.TDirectory.IS_DIRECTORY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.jooq.test.cubrid.generatedclasses.tables.TDirectory.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getParentId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getIsDirectory();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getName();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TDirectoryRecord
	 */
	public TDirectoryRecord() {
		super(org.jooq.test.cubrid.generatedclasses.tables.TDirectory.T_DIRECTORY);
	}
}
