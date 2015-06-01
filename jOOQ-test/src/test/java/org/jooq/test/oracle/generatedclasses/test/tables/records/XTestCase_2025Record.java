/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.records;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;
import org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_2025;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "X_TEST_CASE_2025", schema = "TEST")
public class XTestCase_2025Record extends TableRecordImpl<XTestCase_2025Record> implements Record2<Integer, String> {

	private static final long serialVersionUID = -578780270;

	/**
	 * Setter for <code>TEST.X_TEST_CASE_2025.REF_ID</code>.
	 */
	public void setRefId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.X_TEST_CASE_2025.REF_ID</code>.
	 */
	@Column(name = "REF_ID", nullable = false, precision = 7)
	@NotNull
	public Integer getRefId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>TEST.X_TEST_CASE_2025.REF_NAME</code>.
	 */
	public void setRefName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.X_TEST_CASE_2025.REF_NAME</code>.
	 */
	@Column(name = "REF_NAME", nullable = false, length = 10)
	@NotNull
	@Size(max = 10)
	public String getRefName() {
		return (String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Integer, String> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Integer, String> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return XTestCase_2025.X_TEST_CASE_2025.REF_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return XTestCase_2025.X_TEST_CASE_2025.REF_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getRefId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getRefName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XTestCase_2025Record value1(Integer value) {
		setRefId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XTestCase_2025Record value2(String value) {
		setRefName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XTestCase_2025Record values(Integer value1, String value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached XTestCase_2025Record
	 */
	public XTestCase_2025Record() {
		super(XTestCase_2025.X_TEST_CASE_2025);
	}

	/**
	 * Create a detached, initialised XTestCase_2025Record
	 */
	public XTestCase_2025Record(Integer refId, String refName) {
		super(XTestCase_2025.X_TEST_CASE_2025);

		setValue(0, refId);
		setValue(1, refName);
	}
}
