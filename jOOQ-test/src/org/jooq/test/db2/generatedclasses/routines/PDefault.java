/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
public class PDefault extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -763679678;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> P_IN_NUMBER = createParameter("P_IN_NUMBER", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> P_OUT_NUMBER = createParameter("P_OUT_NUMBER", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> P_IN_VARCHAR = createParameter("P_IN_VARCHAR", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> P_OUT_VARCHAR = createParameter("P_OUT_VARCHAR", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.sql.Date> P_IN_DATE = createParameter("P_IN_DATE", org.jooq.impl.SQLDataType.DATE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.sql.Date> P_OUT_DATE = createParameter("P_OUT_DATE", org.jooq.impl.SQLDataType.DATE);

	/**
	 * Create a new routine call instance
	 */
	public PDefault() {
		super("P_DEFAULT", org.jooq.test.db2.generatedclasses.Lukas.LUKAS);

		addInParameter(P_IN_NUMBER);
		addOutParameter(P_OUT_NUMBER);
		addInParameter(P_IN_VARCHAR);
		addOutParameter(P_OUT_VARCHAR);
		addInParameter(P_IN_DATE);
		addOutParameter(P_OUT_DATE);
	}

	/**
	 * Set the <code>P_IN_NUMBER</code> parameter to the routine
	 */
	public void setPInNumber(java.lang.Integer value) {
		setValue(org.jooq.test.db2.generatedclasses.routines.PDefault.P_IN_NUMBER, value);
	}

	/**
	 * Set the <code>P_IN_VARCHAR</code> parameter to the routine
	 */
	public void setPInVarchar(java.lang.String value) {
		setValue(org.jooq.test.db2.generatedclasses.routines.PDefault.P_IN_VARCHAR, value);
	}

	/**
	 * Set the <code>P_IN_DATE</code> parameter to the routine
	 */
	public void setPInDate(java.sql.Date value) {
		setValue(org.jooq.test.db2.generatedclasses.routines.PDefault.P_IN_DATE, value);
	}

	public java.lang.Integer getPOutNumber() {
		return getValue(P_OUT_NUMBER);
	}

	public java.lang.String getPOutVarchar() {
		return getValue(P_OUT_VARCHAR);
	}

	public java.sql.Date getPOutDate() {
		return getValue(P_OUT_DATE);
	}
}
