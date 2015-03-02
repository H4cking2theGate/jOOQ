/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle5.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.0"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class F2155 extends org.jooq.impl.AbstractRoutine<java.time.LocalDate> {

	private static final long serialVersionUID = 2128368867;

	/**
	 * The parameter <code>TEST.F2155.RETURN_VALUE</code>.
	 */
	public static final org.jooq.Parameter<java.time.LocalDate> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.DATE, false, new org.jooq.test.all.converters.LocalDateConverter());

	/**
	 * The parameter <code>TEST.F2155.P1</code>.
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> P1 = createParameter("P1", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>TEST.F2155.P2</code>.
	 */
	public static final org.jooq.Parameter<java.time.LocalDate> P2 = createParameter("P2", org.jooq.impl.SQLDataType.DATE, false, new org.jooq.test.all.converters.LocalDateConverter());

	/**
	 * The parameter <code>TEST.F2155.P3</code>.
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> P3 = createParameter("P3", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>TEST.F2155.P4</code>.
	 */
	public static final org.jooq.Parameter<java.time.LocalDate> P4 = createParameter("P4", org.jooq.impl.SQLDataType.DATE, false, new org.jooq.test.all.converters.LocalDateConverter());

	/**
	 * Create a new routine call instance
	 */
	public F2155() {
		super("F2155", org.jooq.test.oracle5.generatedclasses.Test.TEST, org.jooq.impl.SQLDataType.DATE, new org.jooq.test.all.converters.LocalDateConverter());

		setReturnParameter(RETURN_VALUE);
		addInParameter(P1);
		addInParameter(P2);
		addInParameter(P3);
		addInParameter(P4);
	}

	/**
	 * Set the <code>P1</code> parameter IN value to the routine
	 */
	public void setP1(java.math.BigDecimal value) {
		setValue(org.jooq.test.oracle5.generatedclasses.routines.F2155.P1, value);
	}

	/**
	 * Set the <code>P1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setP1(org.jooq.Field<java.math.BigDecimal> field) {
		setField(P1, field);
	}

	/**
	 * Set the <code>P2</code> parameter IN value to the routine
	 */
	public void setP2(java.time.LocalDate value) {
		setValue(org.jooq.test.oracle5.generatedclasses.routines.F2155.P2, value);
	}

	/**
	 * Set the <code>P2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setP2(org.jooq.Field<java.time.LocalDate> field) {
		setField(P2, field);
	}

	/**
	 * Set the <code>P3</code> parameter IN value to the routine
	 */
	public void setP3(java.math.BigDecimal value) {
		setValue(org.jooq.test.oracle5.generatedclasses.routines.F2155.P3, value);
	}

	/**
	 * Set the <code>P3</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setP3(org.jooq.Field<java.math.BigDecimal> field) {
		setField(P3, field);
	}

	/**
	 * Set the <code>P4</code> parameter IN value to the routine
	 */
	public void setP4(java.time.LocalDate value) {
		setValue(org.jooq.test.oracle5.generatedclasses.routines.F2155.P4, value);
	}

	/**
	 * Set the <code>P4</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setP4(org.jooq.Field<java.time.LocalDate> field) {
		setField(P4, field);
	}
}
