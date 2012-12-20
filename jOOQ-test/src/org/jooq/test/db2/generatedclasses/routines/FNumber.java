/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class FNumber extends org.jooq.impl.AbstractRoutine<java.lang.Integer> {

	private static final long serialVersionUID = 1527681810;

	/**
	 * The parameter <code>LUKAS.F_NUMBER.RETURN_VALUE</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The parameter <code>LUKAS.F_NUMBER.N</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Integer> N = createParameter("N", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public FNumber() {
		super("F_NUMBER", org.jooq.test.db2.generatedclasses.Lukas.LUKAS, org.jooq.impl.SQLDataType.INTEGER);

		setReturnParameter(RETURN_VALUE);
		addInParameter(N);
	}

	/**
	 * Set the <code>N</code> parameter IN value to the routine
	 */
	public void setN(java.lang.Integer value) {
		setValue(org.jooq.test.db2.generatedclasses.routines.FNumber.N, value);
	}

	/**
	 * Set the <code>N</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setN(org.jooq.Field<java.lang.Integer> field) {
		setField(N, field);
	}
}
