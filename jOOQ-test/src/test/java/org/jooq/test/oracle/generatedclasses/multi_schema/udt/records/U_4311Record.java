/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.multi_schema.udt.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.UDTRecordImpl;
import org.jooq.test.oracle.generatedclasses.multi_schema.udt.U_4311;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class U_4311Record extends UDTRecordImpl<U_4311Record> implements Record1<Integer> {

	private static final long serialVersionUID = 2065800754;

	/**
	 * Setter for <code>MULTI_SCHEMA.U_4311.ID</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.U_4311.ID</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	// -------------------------------------------------------------------------
	// Record1 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row1<Integer> fieldsRow() {
		return (Row1) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row1<Integer> valuesRow() {
		return (Row1) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return U_4311.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_4311Record value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_4311Record values(Integer value1) {
		value1(value1);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached U_4311Record
	 */
	public U_4311Record() {
		super(U_4311.U_4311);
	}

	/**
	 * Create a detached, initialised U_4311Record
	 */
	public U_4311Record(Integer id) {
		super(U_4311.U_4311);

		setValue(0, id);
	}
}
