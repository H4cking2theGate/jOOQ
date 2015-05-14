/**
 * This class is generated by jOOQ
 */
package org.jooq.test.vertica.generatedclasses.tables.records;


import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;
import org.jooq.test.vertica.generatedclasses.tables.TIdentity;
import org.jooq.test.vertica.generatedclasses.tables.interfaces.ITIdentity;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TIdentityRecord extends TableRecordImpl<TIdentityRecord> implements Record2<Integer, Integer>, ITIdentity {

	private static final long serialVersionUID = 913904638;

	/**
	 * Setter for <code>public.t_identity.id</code>.
	 */
	@Override
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.t_identity.id</code>.
	 */
	@Override
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.t_identity.val</code>.
	 */
	@Override
	public void setVal(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.t_identity.val</code>.
	 */
	@Override
	public Integer getVal() {
		return (Integer) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Integer, Integer> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Integer, Integer> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return TIdentity.T_IDENTITY.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return TIdentity.T_IDENTITY.VAL;
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
	public Integer value2() {
		return getVal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TIdentityRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TIdentityRecord value2(Integer value) {
		setVal(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TIdentityRecord values(Integer value1, Integer value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(ITIdentity from) {
		setId(from.getId());
		setVal(from.getVal());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends ITIdentity> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TIdentityRecord
	 */
	public TIdentityRecord() {
		super(TIdentity.T_IDENTITY);
	}

	/**
	 * Create a detached, initialised TIdentityRecord
	 */
	public TIdentityRecord(Integer id, Integer val) {
		super(TIdentity.T_IDENTITY);

		setValue(0, id);
		setValue(1, val);
	}
}
