/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.udt.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class UStringTableRecord extends org.jooq.impl.ArrayRecordImpl<java.lang.String> {

	private static final long serialVersionUID = 1017924340;

	/**
	 * Create a new <code>TEST.U_STRING_TABLE</code> record
	 */
	public UStringTableRecord(org.jooq.Configuration configuration) {
		super(org.jooq.test.oracle.generatedclasses.test.Test.TEST, "U_STRING_TABLE", org.jooq.impl.SQLDataType.VARCHAR, configuration);
	}

	/**
	 * Create a new <code>TEST.U_STRING_TABLE</code> record
	 */
	public UStringTableRecord(org.jooq.Configuration configuration, java.lang.String... array) {
		this(configuration);
		set(array);
	}

	/**
	 * Create a new <code>TEST.U_STRING_TABLE</code> record
	 */
	public UStringTableRecord(org.jooq.Configuration configuration, java.util.List<? extends java.lang.String> list) {
		this(configuration);
		setList(list);
	}
}
