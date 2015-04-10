/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.records;


import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;
import org.jooq.test.h2.generatedclasses.tables.T_2926;
import org.jooq.test.h2.generatedclasses.tables.interfaces.IT_2926;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_2926Record extends TableRecordImpl<T_2926Record> implements Record4<String, String, String, String>, IT_2926 {

	private static final long serialVersionUID = -1164495477;

	/**
	 * Setter for <code>PUBLIC.T_2926.T1</code>.
	 */
	@Override
	public T_2926Record setT1(String value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_2926.T1</code>.
	 */
	@Override
	public String getT1() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>PUBLIC.T_2926.T2</code>.
	 */
	@Override
	public T_2926Record setT2(String value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_2926.T2</code>.
	 */
	@Override
	public String getT2() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>PUBLIC.T_2926.T3</code>.
	 */
	@Override
	public T_2926Record setT3(String value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_2926.T3</code>.
	 */
	@Override
	public String getT3() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>PUBLIC.T_2926.T4</code>.
	 */
	@Override
	public T_2926Record setT4(String value) {
		setValue(3, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_2926.T4</code>.
	 */
	@Override
	public String getT4() {
		return (String) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<String, String, String, String> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<String, String, String, String> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return T_2926.T_2926.T1;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return T_2926.T_2926.T2;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return T_2926.T_2926.T3;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return T_2926.T_2926.T4;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getT1();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getT2();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getT3();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getT4();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_2926Record value1(String value) {
		setT1(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_2926Record value2(String value) {
		setT2(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_2926Record value3(String value) {
		setT3(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_2926Record value4(String value) {
		setT4(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_2926Record values(String value1, String value2, String value3, String value4) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(IT_2926 from) {
		setT1(from.getT1());
		setT2(from.getT2());
		setT3(from.getT3());
		setT4(from.getT4());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IT_2926> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_2926Record
	 */
	public T_2926Record() {
		super(T_2926.T_2926);
	}

	/**
	 * Create a detached, initialised T_2926Record
	 */
	public T_2926Record(String t1, String t2, String t3, String t4) {
		super(T_2926.T_2926);

		setValue(0, t1);
		setValue(1, t2);
		setValue(2, t3);
		setValue(3, t4);
	}
}
