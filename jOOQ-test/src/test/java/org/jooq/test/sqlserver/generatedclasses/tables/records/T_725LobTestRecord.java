/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.tables.records;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.sqlserver.generatedclasses.tables.T_725LobTest;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "t_725_lob_test", schema = "dbo")
public class T_725LobTestRecord extends UpdatableRecordImpl<T_725LobTestRecord> implements Record2<Integer, byte[]> {

	private static final long serialVersionUID = 800673872;

	/**
	 * Setter for <code>dbo.t_725_lob_test.ID</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dbo.t_725_lob_test.ID</code>.
	 */
	@Id
	@Column(name = "ID", unique = true, nullable = false, precision = 10)
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>dbo.t_725_lob_test.LOB</code>.
	 */
	public void setLob(byte[] value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dbo.t_725_lob_test.LOB</code>.
	 */
	@Column(name = "LOB")
	public byte[] getLob() {
		return (byte[]) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Integer, byte[]> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Integer, byte[]> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return T_725LobTest.T_725_LOB_TEST.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<byte[]> field2() {
		return T_725LobTest.T_725_LOB_TEST.LOB;
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
	public byte[] value2() {
		return getLob();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_725LobTestRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_725LobTestRecord value2(byte[] value) {
		setLob(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_725LobTestRecord values(Integer value1, byte[] value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_725LobTestRecord
	 */
	public T_725LobTestRecord() {
		super(T_725LobTest.T_725_LOB_TEST);
	}

	/**
	 * Create a detached, initialised T_725LobTestRecord
	 */
	public T_725LobTestRecord(Integer id, byte[] lob) {
		super(T_725LobTest.T_725_LOB_TEST);

		setValue(0, id);
		setValue(1, lob);
	}
}
