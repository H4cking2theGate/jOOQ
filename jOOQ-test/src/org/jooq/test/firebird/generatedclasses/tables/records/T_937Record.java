/**
 * This class is generated by jOOQ
 */
package org.jooq.test.firebird.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
@javax.persistence.Entity
@javax.persistence.Table(name = "T_937")
public class T_937Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.firebird.generatedclasses.tables.records.T_937Record> implements org.jooq.Record1<java.lang.Integer>, org.jooq.test.firebird.generatedclasses.tables.interfaces.IT_937 {

	private static final long serialVersionUID = -78394629;

	/**
	 * Setter for <code>T_937.T_937</code>. 
	 */
	@Override
	public void setT_937(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>T_937.T_937</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "T_937", unique = true, nullable = false, length = 4)
	@javax.validation.constraints.NotNull
	@Override
	public java.lang.Integer getT_937() {
		return (java.lang.Integer) getValue(0);
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
	// Record1 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.Integer> fieldsRow() {
		return (org.jooq.Row1) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.Integer> valuesRow() {
		return (org.jooq.Row1) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.firebird.generatedclasses.tables.T_937.T_937.T_937_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getT_937();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.firebird.generatedclasses.tables.interfaces.IT_937 from) {
		setT_937(from.getT_937());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.firebird.generatedclasses.tables.interfaces.IT_937> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_937Record
	 */
	public T_937Record() {
		super(org.jooq.test.firebird.generatedclasses.tables.T_937.T_937);
	}
}
