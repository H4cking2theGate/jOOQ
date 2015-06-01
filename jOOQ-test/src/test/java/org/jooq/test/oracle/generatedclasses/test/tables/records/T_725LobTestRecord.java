/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.records;


import java.sql.Blob;
import java.sql.Clob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.oracle.generatedclasses.test.tables.T_725LobTest;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "T_725_LOB_TEST", schema = "TEST")
public class T_725LobTestRecord extends UpdatableRecordImpl<T_725LobTestRecord> implements Record6<Integer, byte[], Clob, Blob, String, byte[]> {

	private static final long serialVersionUID = 548259953;

	/**
	 * Setter for <code>TEST.T_725_LOB_TEST.ID</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.T_725_LOB_TEST.ID</code>.
	 */
	@Id
	@Column(name = "ID", unique = true, nullable = false, precision = 7)
	@NotNull
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>TEST.T_725_LOB_TEST.LOB</code>.
	 */
	public void setLob(byte[] value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.T_725_LOB_TEST.LOB</code>.
	 */
	@Column(name = "LOB")
	public byte[] getLob() {
		return (byte[]) getValue(1);
	}

	/**
	 * Setter for <code>TEST.T_725_LOB_TEST.USER_JAVA_SQL_CLOB</code>.
	 */
	public void setUserJavaSqlClob(Clob value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>TEST.T_725_LOB_TEST.USER_JAVA_SQL_CLOB</code>.
	 */
	@Column(name = "USER_JAVA_SQL_CLOB")
	public Clob getUserJavaSqlClob() {
		return (Clob) getValue(2);
	}

	/**
	 * Setter for <code>TEST.T_725_LOB_TEST.USER_JAVA_SQL_BLOB</code>.
	 */
	public void setUserJavaSqlBlob(Blob value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>TEST.T_725_LOB_TEST.USER_JAVA_SQL_BLOB</code>.
	 */
	@Column(name = "USER_JAVA_SQL_BLOB")
	public Blob getUserJavaSqlBlob() {
		return (Blob) getValue(3);
	}

	/**
	 * Setter for <code>TEST.T_725_LOB_TEST.JOOQ_JAVA_SQL_CLOB</code>.
	 */
	public void setJooqJavaSqlClob(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>TEST.T_725_LOB_TEST.JOOQ_JAVA_SQL_CLOB</code>.
	 */
	@Column(name = "JOOQ_JAVA_SQL_CLOB")
	public String getJooqJavaSqlClob() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>TEST.T_725_LOB_TEST.JOOQ_JAVA_SQL_BLOB</code>.
	 */
	public void setJooqJavaSqlBlob(byte[] value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>TEST.T_725_LOB_TEST.JOOQ_JAVA_SQL_BLOB</code>.
	 */
	@Column(name = "JOOQ_JAVA_SQL_BLOB")
	public byte[] getJooqJavaSqlBlob() {
		return (byte[]) getValue(5);
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
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, byte[], Clob, Blob, String, byte[]> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, byte[], Clob, Blob, String, byte[]> valuesRow() {
		return (Row6) super.valuesRow();
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
	public Field<Clob> field3() {
		return T_725LobTest.T_725_LOB_TEST.USER_JAVA_SQL_CLOB;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Blob> field4() {
		return T_725LobTest.T_725_LOB_TEST.USER_JAVA_SQL_BLOB;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return T_725LobTest.T_725_LOB_TEST.JOOQ_JAVA_SQL_CLOB;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<byte[]> field6() {
		return T_725LobTest.T_725_LOB_TEST.JOOQ_JAVA_SQL_BLOB;
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
	public Clob value3() {
		return getUserJavaSqlClob();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Blob value4() {
		return getUserJavaSqlBlob();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getJooqJavaSqlClob();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value6() {
		return getJooqJavaSqlBlob();
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
	public T_725LobTestRecord value3(Clob value) {
		setUserJavaSqlClob(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_725LobTestRecord value4(Blob value) {
		setUserJavaSqlBlob(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_725LobTestRecord value5(String value) {
		setJooqJavaSqlClob(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_725LobTestRecord value6(byte[] value) {
		setJooqJavaSqlBlob(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_725LobTestRecord values(Integer value1, byte[] value2, Clob value3, Blob value4, String value5, byte[] value6) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
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
	public T_725LobTestRecord(Integer id, byte[] lob, Clob userJavaSqlClob, Blob userJavaSqlBlob, String jooqJavaSqlClob, byte[] jooqJavaSqlBlob) {
		super(T_725LobTest.T_725_LOB_TEST);

		setValue(0, id);
		setValue(1, lob);
		setValue(2, userJavaSqlClob);
		setValue(3, userJavaSqlBlob);
		setValue(4, jooqJavaSqlClob);
		setValue(5, jooqJavaSqlBlob);
	}
}
