/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle5.generatedclasses.udt.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.0"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class U_2155ObjectRecord extends org.jooq.impl.UDTRecordImpl<org.jooq.test.oracle5.generatedclasses.udt.records.U_2155ObjectRecord> implements org.jooq.Record2<java.time.LocalDate, org.jooq.test.oracle5.generatedclasses.udt.records.U_2155ArrayRecord> {

	private static final long serialVersionUID = -102585786;

	/**
	 * Setter for <code>TEST.U_2155_OBJECT.D</code>.
	 */
	public void setD(java.time.LocalDate value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.U_2155_OBJECT.D</code>.
	 */
	public java.time.LocalDate getD() {
		return (java.time.LocalDate) getValue(0);
	}

	/**
	 * Setter for <code>TEST.U_2155_OBJECT.A</code>.
	 */
	public void setA(org.jooq.test.oracle5.generatedclasses.udt.records.U_2155ArrayRecord value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.U_2155_OBJECT.A</code>.
	 */
	public org.jooq.test.oracle5.generatedclasses.udt.records.U_2155ArrayRecord getA() {
		return (org.jooq.test.oracle5.generatedclasses.udt.records.U_2155ArrayRecord) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.time.LocalDate, org.jooq.test.oracle5.generatedclasses.udt.records.U_2155ArrayRecord> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.time.LocalDate, org.jooq.test.oracle5.generatedclasses.udt.records.U_2155ArrayRecord> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.time.LocalDate> field1() {
		return org.jooq.test.oracle5.generatedclasses.udt.U_2155Object.D;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.test.oracle5.generatedclasses.udt.records.U_2155ArrayRecord> field2() {
		return org.jooq.test.oracle5.generatedclasses.udt.U_2155Object.A;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.time.LocalDate value1() {
		return getD();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle5.generatedclasses.udt.records.U_2155ArrayRecord value2() {
		return getA();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_2155ObjectRecord value1(java.time.LocalDate value) {
		setD(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_2155ObjectRecord value2(org.jooq.test.oracle5.generatedclasses.udt.records.U_2155ArrayRecord value) {
		setA(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_2155ObjectRecord values(java.time.LocalDate value1, org.jooq.test.oracle5.generatedclasses.udt.records.U_2155ArrayRecord value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached U_2155ObjectRecord
	 */
	public U_2155ObjectRecord() {
		super(org.jooq.test.oracle5.generatedclasses.udt.U_2155Object.U_2155_OBJECT);
	}

	/**
	 * Create a detached, initialised U_2155ObjectRecord
	 */
	public U_2155ObjectRecord(java.time.LocalDate d, org.jooq.test.oracle5.generatedclasses.udt.records.U_2155ArrayRecord a) {
		super(org.jooq.test.oracle5.generatedclasses.udt.U_2155Object.U_2155_OBJECT);

		setValue(0, d);
		setValue(1, a);
	}
}
