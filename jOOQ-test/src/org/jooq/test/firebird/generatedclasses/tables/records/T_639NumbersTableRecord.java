/**
 * This class is generated by jOOQ
 */
package org.jooq.test.firebird.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "T_639_NUMBERS_TABLE")
public class T_639NumbersTableRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.firebird.generatedclasses.tables.records.T_639NumbersTableRecord> implements org.jooq.Record11<java.lang.Integer, java.lang.Short, java.lang.Integer, java.lang.Long, java.lang.Byte, java.lang.Short, java.lang.Integer, java.lang.Long, java.math.BigDecimal, java.lang.Float, java.lang.Double>, org.jooq.test.firebird.generatedclasses.tables.interfaces.IT_639NumbersTable {

	private static final long serialVersionUID = -152853928;

	/**
	 * Setter for <code>T_639_NUMBERS_TABLE.ID</code>. 
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>T_639_NUMBERS_TABLE.ID</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, length = 4)
	@javax.validation.constraints.NotNull
	@Override
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>T_639_NUMBERS_TABLE.SHORT</code>. 
	 */
	@Override
	public void setShort(java.lang.Short value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>T_639_NUMBERS_TABLE.SHORT</code>. 
	 */
	@javax.persistence.Column(name = "SHORT", length = 2)
	@Override
	public java.lang.Short getShort() {
		return (java.lang.Short) getValue(1);
	}

	/**
	 * Setter for <code>T_639_NUMBERS_TABLE.INTEGER</code>. 
	 */
	@Override
	public void setInteger(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>T_639_NUMBERS_TABLE.INTEGER</code>. 
	 */
	@javax.persistence.Column(name = "INTEGER", length = 4)
	@Override
	public java.lang.Integer getInteger() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>T_639_NUMBERS_TABLE.LONG</code>. 
	 */
	@Override
	public void setLong(java.lang.Long value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>T_639_NUMBERS_TABLE.LONG</code>. 
	 */
	@javax.persistence.Column(name = "LONG", length = 8)
	@Override
	public java.lang.Long getLong() {
		return (java.lang.Long) getValue(3);
	}

	/**
	 * Setter for <code>T_639_NUMBERS_TABLE.BYTE_DECIMAL</code>. 
	 */
	@Override
	public void setByteDecimal(java.lang.Byte value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>T_639_NUMBERS_TABLE.BYTE_DECIMAL</code>. 
	 */
	@javax.persistence.Column(name = "BYTE_DECIMAL", precision = 2)
	@Override
	public java.lang.Byte getByteDecimal() {
		return (java.lang.Byte) getValue(4);
	}

	/**
	 * Setter for <code>T_639_NUMBERS_TABLE.SHORT_DECIMAL</code>. 
	 */
	@Override
	public void setShortDecimal(java.lang.Short value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>T_639_NUMBERS_TABLE.SHORT_DECIMAL</code>. 
	 */
	@javax.persistence.Column(name = "SHORT_DECIMAL", precision = 4)
	@Override
	public java.lang.Short getShortDecimal() {
		return (java.lang.Short) getValue(5);
	}

	/**
	 * Setter for <code>T_639_NUMBERS_TABLE.INTEGER_DECIMAL</code>. 
	 */
	@Override
	public void setIntegerDecimal(java.lang.Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>T_639_NUMBERS_TABLE.INTEGER_DECIMAL</code>. 
	 */
	@javax.persistence.Column(name = "INTEGER_DECIMAL", precision = 9)
	@Override
	public java.lang.Integer getIntegerDecimal() {
		return (java.lang.Integer) getValue(6);
	}

	/**
	 * Setter for <code>T_639_NUMBERS_TABLE.LONG_DECIMAL</code>. 
	 */
	@Override
	public void setLongDecimal(java.lang.Long value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>T_639_NUMBERS_TABLE.LONG_DECIMAL</code>. 
	 */
	@javax.persistence.Column(name = "LONG_DECIMAL", precision = 18)
	@Override
	public java.lang.Long getLongDecimal() {
		return (java.lang.Long) getValue(7);
	}

	/**
	 * Setter for <code>T_639_NUMBERS_TABLE.BIG_DECIMAL</code>. 
	 */
	@Override
	public void setBigDecimal(java.math.BigDecimal value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>T_639_NUMBERS_TABLE.BIG_DECIMAL</code>. 
	 */
	@javax.persistence.Column(name = "BIG_DECIMAL", precision = 18, scale = 5)
	@Override
	public java.math.BigDecimal getBigDecimal() {
		return (java.math.BigDecimal) getValue(8);
	}

	/**
	 * Setter for <code>T_639_NUMBERS_TABLE.FLOAT</code>. 
	 */
	@Override
	public void setFloat(java.lang.Float value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>T_639_NUMBERS_TABLE.FLOAT</code>. 
	 */
	@javax.persistence.Column(name = "FLOAT", length = 4)
	@Override
	public java.lang.Float getFloat() {
		return (java.lang.Float) getValue(9);
	}

	/**
	 * Setter for <code>T_639_NUMBERS_TABLE.DOUBLE</code>. 
	 */
	@Override
	public void setDouble(java.lang.Double value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>T_639_NUMBERS_TABLE.DOUBLE</code>. 
	 */
	@javax.persistence.Column(name = "DOUBLE", length = 8)
	@Override
	public java.lang.Double getDouble() {
		return (java.lang.Double) getValue(10);
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
	// Record11 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<java.lang.Integer, java.lang.Short, java.lang.Integer, java.lang.Long, java.lang.Byte, java.lang.Short, java.lang.Integer, java.lang.Long, java.math.BigDecimal, java.lang.Float, java.lang.Double> fieldsRow() {
		return (org.jooq.Row11) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<java.lang.Integer, java.lang.Short, java.lang.Integer, java.lang.Long, java.lang.Byte, java.lang.Short, java.lang.Integer, java.lang.Long, java.math.BigDecimal, java.lang.Float, java.lang.Double> valuesRow() {
		return (org.jooq.Row11) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.firebird.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field2() {
		return org.jooq.test.firebird.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.SHORT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.jooq.test.firebird.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.INTEGER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field4() {
		return org.jooq.test.firebird.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.LONG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Byte> field5() {
		return org.jooq.test.firebird.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.BYTE_DECIMAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field6() {
		return org.jooq.test.firebird.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.SHORT_DECIMAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field7() {
		return org.jooq.test.firebird.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.INTEGER_DECIMAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field8() {
		return org.jooq.test.firebird.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.LONG_DECIMAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field9() {
		return org.jooq.test.firebird.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.BIG_DECIMAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Float> field10() {
		return org.jooq.test.firebird.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.FLOAT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field11() {
		return org.jooq.test.firebird.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.DOUBLE;
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
	public java.lang.Short value2() {
		return getShort();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getInteger();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value4() {
		return getLong();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Byte value5() {
		return getByteDecimal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value6() {
		return getShortDecimal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value7() {
		return getIntegerDecimal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value8() {
		return getLongDecimal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value9() {
		return getBigDecimal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Float value10() {
		return getFloat();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value11() {
		return getDouble();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.firebird.generatedclasses.tables.interfaces.IT_639NumbersTable from) {
		setId(from.getId());
		setShort(from.getShort());
		setInteger(from.getInteger());
		setLong(from.getLong());
		setByteDecimal(from.getByteDecimal());
		setShortDecimal(from.getShortDecimal());
		setIntegerDecimal(from.getIntegerDecimal());
		setLongDecimal(from.getLongDecimal());
		setBigDecimal(from.getBigDecimal());
		setFloat(from.getFloat());
		setDouble(from.getDouble());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.firebird.generatedclasses.tables.interfaces.IT_639NumbersTable> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_639NumbersTableRecord
	 */
	public T_639NumbersTableRecord() {
		super(org.jooq.test.firebird.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE);
	}
}
