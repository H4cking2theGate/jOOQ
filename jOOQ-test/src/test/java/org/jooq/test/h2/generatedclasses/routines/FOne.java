/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.routines;


import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.test.h2.generatedclasses.Public;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FOne extends AbstractRoutine<Integer> {

	private static final long serialVersionUID = 759661075;

	/**
	 * The parameter <code>PUBLIC.F_ONE.RETURN_VALUE</code>.
	 */
	public static final Parameter<Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER, false);

	/**
	 * The parameter <code>PUBLIC.F_ONE.P0</code>.
	 */
	public static final Parameter<Integer> P0 = createParameter("P0", org.jooq.impl.SQLDataType.INTEGER.nullable(false), false);

	/**
	 * Create a new routine call instance
	 */
	public FOne() {
		super("F_ONE", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER);

		setReturnParameter(RETURN_VALUE);
		addInParameter(P0);
	}

	/**
	 * Set the <code>P0</code> parameter IN value to the routine
	 */
	public void setP0(Integer value) {
		setValue(P0, value);
	}

	/**
	 * Set the <code>P0</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public FOne setP0(Field<Integer> field) {
		setField(P0, field);
		return this;
	}
}
