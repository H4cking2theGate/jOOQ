/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "1.6.8"},
                            comments = "This class is generated by jOOQ")
public class FArrays2 extends org.jooq.impl.AbstractRoutine<org.jooq.test.oracle.generatedclasses.udt.records.UNumberLongArrayRecord> {

	private static final long serialVersionUID = 304540396;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.udt.records.UNumberLongArrayRecord> RETURN_VALUE = new org.jooq.impl.ParameterImpl<org.jooq.test.oracle.generatedclasses.udt.records.UNumberLongArrayRecord>("RETURN_VALUE", org.jooq.impl.SQLDataType.BIGINT.asArrayDataType(org.jooq.test.oracle.generatedclasses.udt.records.UNumberLongArrayRecord.class));

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.udt.records.UNumberLongArrayRecord> IN_ARRAY = new org.jooq.impl.ParameterImpl<org.jooq.test.oracle.generatedclasses.udt.records.UNumberLongArrayRecord>("IN_ARRAY", org.jooq.impl.SQLDataType.BIGINT.asArrayDataType(org.jooq.test.oracle.generatedclasses.udt.records.UNumberLongArrayRecord.class));

	/**
	 * Create a new routine call instance
	 */
	public FArrays2() {
		super(org.jooq.SQLDialect.ORACLE, "F_ARRAYS2", org.jooq.test.oracle.generatedclasses.Test.TEST, org.jooq.impl.SQLDataType.BIGINT.asArrayDataType(org.jooq.test.oracle.generatedclasses.udt.records.UNumberLongArrayRecord.class));

		setReturnParameter(RETURN_VALUE);
		addInParameter(IN_ARRAY);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter to the routine
	 */
	public void setInArray(org.jooq.test.oracle.generatedclasses.udt.records.UNumberLongArrayRecord value) {
		setValue(IN_ARRAY, value);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setInArray(org.jooq.Field<org.jooq.test.oracle.generatedclasses.udt.records.UNumberLongArrayRecord> field) {
		setField(IN_ARRAY, field);
	}
}
