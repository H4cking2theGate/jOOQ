/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables.records;


import java.math.BigDecimal;
import java.math.BigInteger;

import org.jooq.Field;
import org.jooq.Record14;
import org.jooq.Record2;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.mysql.generatedclasses.tables.XUnused;


/**
 * An unused table in the same schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XUnusedRecord extends UpdatableRecordImpl<XUnusedRecord> implements Record14<Integer, String, BigInteger, Integer, String, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, BigDecimal> {

	private static final long serialVersionUID = -1544825720;

	/**
	 * Setter for <code>test.x_unused.ID</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>test.x_unused.ID</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>test.x_unused.NAME</code>.
	 */
	public void setName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>test.x_unused.NAME</code>.
	 */
	public String getName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>test.x_unused.BIG_INTEGER</code>.
	 */
	public void setBigInteger(BigInteger value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>test.x_unused.BIG_INTEGER</code>.
	 */
	public BigInteger getBigInteger() {
		return (BigInteger) getValue(2);
	}

	/**
	 * Setter for <code>test.x_unused.ID_REF</code>.
	 */
	public void setIdRef(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>test.x_unused.ID_REF</code>.
	 */
	public Integer getIdRef() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>test.x_unused.NAME_REF</code>.
	 */
	public void setNameRef(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>test.x_unused.NAME_REF</code>.
	 */
	public String getNameRef() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>test.x_unused.CLASS</code>.
	 */
	public void setClass_(Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>test.x_unused.CLASS</code>.
	 */
	public Integer getClass_() {
		return (Integer) getValue(5);
	}

	/**
	 * Setter for <code>test.x_unused.FIELDS</code>.
	 */
	public void setFields(Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>test.x_unused.FIELDS</code>.
	 */
	public Integer getFields() {
		return (Integer) getValue(6);
	}

	/**
	 * Setter for <code>test.x_unused.CONFIGURATION</code>.
	 */
	public void setConfiguration(Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>test.x_unused.CONFIGURATION</code>.
	 */
	public Integer getConfiguration() {
		return (Integer) getValue(7);
	}

	/**
	 * Setter for <code>test.x_unused.U_D_T</code>.
	 */
	public void setUDT(Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>test.x_unused.U_D_T</code>.
	 */
	public Integer getUDT() {
		return (Integer) getValue(8);
	}

	/**
	 * Setter for <code>test.x_unused.META_DATA</code>.
	 */
	public void setMetaData(Integer value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>test.x_unused.META_DATA</code>.
	 */
	public Integer getMetaData() {
		return (Integer) getValue(9);
	}

	/**
	 * Setter for <code>test.x_unused.TYPE0</code>.
	 */
	public void setType0(Integer value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>test.x_unused.TYPE0</code>.
	 */
	public Integer getType0() {
		return (Integer) getValue(10);
	}

	/**
	 * Setter for <code>test.x_unused.PRIMARY_KEY</code>.
	 */
	public void setPrimaryKey_(Integer value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>test.x_unused.PRIMARY_KEY</code>.
	 */
	public Integer getPrimaryKey_() {
		return (Integer) getValue(11);
	}

	/**
	 * Setter for <code>test.x_unused.PRIMARYKEY</code>.
	 */
	public void setPrimarykey(Integer value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>test.x_unused.PRIMARYKEY</code>.
	 */
	public Integer getPrimarykey() {
		return (Integer) getValue(12);
	}

	/**
	 * Setter for <code>test.x_unused.FIELD 737</code>.
	 */
	public void setField_737(BigDecimal value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>test.x_unused.FIELD 737</code>.
	 */
	public BigDecimal getField_737() {
		return (BigDecimal) getValue(13);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record2<Integer, String> key() {
		return (Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record14 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row14<Integer, String, BigInteger, Integer, String, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, BigDecimal> fieldsRow() {
		return (Row14) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row14<Integer, String, BigInteger, Integer, String, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, BigDecimal> valuesRow() {
		return (Row14) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return XUnused.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return XUnused.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigInteger> field3() {
		return XUnused.BIG_INTEGER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return XUnused.ID_REF;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return XUnused.NAME_REF;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return XUnused.CLASS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field7() {
		return XUnused.FIELDS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field8() {
		return XUnused.CONFIGURATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field9() {
		return XUnused.U_D_T;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field10() {
		return XUnused.META_DATA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field11() {
		return XUnused.TYPE0;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field12() {
		return XUnused.PRIMARY_KEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field13() {
		return XUnused.PRIMARYKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field14() {
		return XUnused.FIELD_737;
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
	public String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigInteger value3() {
		return getBigInteger();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getIdRef();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getNameRef();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getClass_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value7() {
		return getFields();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value8() {
		return getConfiguration();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value9() {
		return getUDT();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value10() {
		return getMetaData();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value11() {
		return getType0();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value12() {
		return getPrimaryKey_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value13() {
		return getPrimarykey();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value14() {
		return getField_737();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XUnusedRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XUnusedRecord value2(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XUnusedRecord value3(BigInteger value) {
		setBigInteger(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XUnusedRecord value4(Integer value) {
		setIdRef(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XUnusedRecord value5(String value) {
		setNameRef(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XUnusedRecord value6(Integer value) {
		setClass_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XUnusedRecord value7(Integer value) {
		setFields(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XUnusedRecord value8(Integer value) {
		setConfiguration(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XUnusedRecord value9(Integer value) {
		setUDT(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XUnusedRecord value10(Integer value) {
		setMetaData(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XUnusedRecord value11(Integer value) {
		setType0(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XUnusedRecord value12(Integer value) {
		setPrimaryKey_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XUnusedRecord value13(Integer value) {
		setPrimarykey(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XUnusedRecord value14(BigDecimal value) {
		setField_737(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XUnusedRecord values(Integer value1, String value2, BigInteger value3, Integer value4, String value5, Integer value6, Integer value7, Integer value8, Integer value9, Integer value10, Integer value11, Integer value12, Integer value13, BigDecimal value14) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		value11(value11);
		value12(value12);
		value13(value13);
		value14(value14);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached XUnusedRecord
	 */
	public XUnusedRecord() {
		super(XUnused.X_UNUSED);
	}

	/**
	 * Create a detached, initialised XUnusedRecord
	 */
	public XUnusedRecord(Integer id, String name, BigInteger bigInteger, Integer idRef, String nameRef, Integer class_, Integer fields, Integer configuration, Integer uDT, Integer metaData, Integer type0, Integer primaryKey, Integer primarykey, BigDecimal field_737) {
		super(XUnused.X_UNUSED);

		setValue(0, id);
		setValue(1, name);
		setValue(2, bigInteger);
		setValue(3, idRef);
		setValue(4, nameRef);
		setValue(5, class_);
		setValue(6, fields);
		setValue(7, configuration);
		setValue(8, uDT);
		setValue(9, metaData);
		setValue(10, type0);
		setValue(11, primaryKey);
		setValue(12, primarykey);
		setValue(13, field_737);
	}
}
