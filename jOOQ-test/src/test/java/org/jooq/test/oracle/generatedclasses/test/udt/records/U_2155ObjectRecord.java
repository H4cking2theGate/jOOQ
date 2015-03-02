/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.udt.records;


import java.time.LocalDate;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row;
import org.jooq.Row2;
import org.jooq.impl.UDTRecordImpl;
import org.jooq.test.oracle.generatedclasses.test.udt.U_2155Object;
import org.jooq.test.oracle.generatedclasses.test.udt.records.U_2155ArrayRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class U_2155ObjectRecord extends UDTRecordImpl<U_2155ObjectRecord> implements Record2<LocalDate, U_2155ArrayRecord> {

	private static final long serialVersionUID = -1906037083;

	/**
	 * Setter for <code>TEST.U_2155_OBJECT.D</code>.
	 */
	public void setD(LocalDate value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.U_2155_OBJECT.D</code>.
	 */
	public LocalDate getD() {
		return (LocalDate) getValue(0);
	}

	/**
	 * Setter for <code>TEST.U_2155_OBJECT.A</code>.
	 */
	public void setA(U_2155ArrayRecord value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.U_2155_OBJECT.A</code>.
	 */
	public U_2155ArrayRecord getA() {
		return (U_2155ArrayRecord) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<LocalDate, U_2155ArrayRecord> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<LocalDate, U_2155ArrayRecord> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<LocalDate> field1() {
		return U_2155Object.D;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<U_2155ArrayRecord> field2() {
		return U_2155Object.A;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LocalDate value1() {
		return getD();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_2155ArrayRecord value2() {
		return getA();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_2155ObjectRecord value1(LocalDate value) {
		setD(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_2155ObjectRecord value2(U_2155ArrayRecord value) {
		setA(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_2155ObjectRecord values(LocalDate value1, U_2155ArrayRecord value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached U_2155ObjectRecord
	 */
	public U_2155ObjectRecord() {
		super(U_2155Object.U_2155_OBJECT);
	}

	/**
	 * Create a detached, initialised U_2155ObjectRecord
	 */
	public U_2155ObjectRecord(LocalDate d, U_2155ArrayRecord a) {
		super(U_2155Object.U_2155_OBJECT);

		setValue(0, d);
		setValue(1, a);
	}
}
