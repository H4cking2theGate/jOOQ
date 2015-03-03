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
public class PResultsAndOutParameters extends AbstractRoutine<Integer> {

	private static final long serialVersionUID = 1517888004;

	/**
	 * The parameter <code>dbo.p_results_and_out_parameters.RETURN_VALUE</code>.
	 */
	public static final Parameter<Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER, false);

	/**
	 * The parameter <code>dbo.p_results_and_out_parameters.p_result_sets</code>.
	 */
	public static final Parameter<Integer> P_RESULT_SETS = createParameter("p_result_sets", org.jooq.impl.SQLDataType.INTEGER, false);

	/**
	 * The parameter <code>dbo.p_results_and_out_parameters.p_count</code>.
	 */
	public static final Parameter<Integer> P_COUNT = createParameter("p_count", org.jooq.impl.SQLDataType.INTEGER, false);

	/**
	 * Create a new routine call instance
	 */
	public PResultsAndOutParameters() {
		super("p_results_and_out_parameters", Dbo.DBO, org.jooq.impl.SQLDataType.INTEGER);

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_RESULT_SETS);
		addInOutParameter(P_COUNT);
	}

	/**
	 * Set the <code>p_result_sets</code> parameter IN value to the routine
	 */
	public void setPResultSets(Integer value) {
		setValue(P_RESULT_SETS, value);
	}

	/**
	 * Set the <code>p_count</code> parameter IN value to the routine
	 */
	public void setPCount(Integer value) {
		setValue(P_COUNT, value);
	}

	/**
	 * Get the <code>p_count</code> parameter OUT value from the routine
	 */
	public Integer getPCount() {
		return getValue(P_COUNT);
	}
}
