/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.6"},
                            comments = "This class is generated by jOOQ")
public class ConnectionRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.ConnectionRecord> {

	private static final long serialVersionUID = -77052274;

	/**
	 * An uncommented item
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.Connection.CONNECTION.ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.Connection.CONNECTION.ID);
	}

	/**
	 * Create a detached ConnectionRecord
	 */
	public ConnectionRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.Connection.CONNECTION);
	}
}
