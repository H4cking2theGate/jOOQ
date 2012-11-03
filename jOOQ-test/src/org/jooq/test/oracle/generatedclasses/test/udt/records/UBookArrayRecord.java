/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.udt.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class UBookArrayRecord extends org.jooq.impl.ArrayRecordImpl<org.jooq.test.oracle.generatedclasses.test.udt.records.UBookTypeRecord> {

	private static final long serialVersionUID = -2117232071;

	/**
	 * Create a new <code>TEST.U_BOOK_ARRAY</code> record
	 */
	public UBookArrayRecord(org.jooq.Configuration configuration) {
		super(org.jooq.test.oracle.generatedclasses.test.Test.TEST, "U_BOOK_ARRAY", org.jooq.test.oracle.generatedclasses.test.udt.UBookType.U_BOOK_TYPE.getDataType(), configuration);
	}

	/**
	 * Create a new <code>TEST.U_BOOK_ARRAY</code> record
	 */
	public UBookArrayRecord(org.jooq.Configuration configuration, org.jooq.test.oracle.generatedclasses.test.udt.records.UBookTypeRecord... array) {
		this(configuration);
		set(array);
	}

	/**
	 * Create a new <code>TEST.U_BOOK_ARRAY</code> record
	 */
	public UBookArrayRecord(org.jooq.Configuration configuration, java.util.List<? extends org.jooq.test.oracle.generatedclasses.test.udt.records.UBookTypeRecord> list) {
		this(configuration);
		setList(list);
	}
}
