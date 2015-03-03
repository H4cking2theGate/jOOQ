/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.routines;


import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.test.sqlserver.generatedclasses.Dbo;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PRaise extends AbstractRoutine<Integer> {

	private static final long serialVersionUID = 777394857;

	/**
	 * The parameter <code>dbo.p_raise.RETURN_VALUE</code>.
	 */
	public static final Parameter<Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER, false);

	/**
	 * The parameter <code>dbo.p_raise.mode</code>.
	 */
	public static final Parameter<Integer> MODE = createParameter("mode", org.jooq.impl.SQLDataType.INTEGER, false);

	/**
	 * Create a new routine call instance
	 */
	public PRaise() {
		super("p_raise", Dbo.DBO, org.jooq.impl.SQLDataType.INTEGER);

		setReturnParameter(RETURN_VALUE);
		addInParameter(MODE);
	}

	/**
	 * Set the <code>mode</code> parameter IN value to the routine
	 */
	public void setMode(Integer value) {
		setValue(MODE, value);
	}
}
