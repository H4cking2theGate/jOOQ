/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FArrays3 extends org.jooq.impl.AbstractRoutine<java.lang.String[]> {

	private static final long serialVersionUID = 1161493209;

	/**
	 * The parameter <code>PUBLIC.F_ARRAYS3.RETURN_VALUE</code>.
	 */
	public static final org.jooq.Parameter<java.lang.String[]> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType());

	/**
	 * The parameter <code>PUBLIC.F_ARRAYS3.IN_ARRAY</code>.
	 */
	public static final org.jooq.Parameter<java.lang.String[]> IN_ARRAY = createParameter("IN_ARRAY", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType());

	/**
	 * Create a new routine call instance
	 */
	public FArrays3() {
		super("F_ARRAYS3", org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC, org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType());

		setReturnParameter(RETURN_VALUE);
		addInParameter(IN_ARRAY);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter IN value to the routine
	 */
	public void setInArray(java.lang.String[] value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.routines.FArrays3.IN_ARRAY, value);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setInArray(org.jooq.Field<java.lang.String[]> field) {
		setField(IN_ARRAY, field);
	}
}
