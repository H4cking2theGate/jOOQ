/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.procedures;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "1.6.8"},
                            comments = "This class is generated by jOOQ")
public class PArrays3 extends org.jooq.impl.StoredProcedureImpl {

	private static final long serialVersionUID = -913552716;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String[]> IN_ARRAY = new org.jooq.impl.ParameterImpl<java.lang.String[]>("IN_ARRAY", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType());

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String[]> OUT_ARRAY = new org.jooq.impl.ParameterImpl<java.lang.String[]>("OUT_ARRAY", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType());

	/**
	 * Create a new procedure call instance
	 */
	public PArrays3() {
		super(org.jooq.SQLDialect.HSQLDB, "P_ARRAYS3", org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC);

		addInParameter(IN_ARRAY);
		addOutParameter(OUT_ARRAY);
	}

	public void setInArray(java.lang.String[] value) {
		setValue(IN_ARRAY, value);
	}

	public java.lang.String[] getOutArray() {
		return getValue(OUT_ARRAY);
	}
}
