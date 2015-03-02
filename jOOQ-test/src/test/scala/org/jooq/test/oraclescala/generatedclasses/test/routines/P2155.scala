/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oraclescala.generatedclasses.test.routines


import java.lang.Number
import java.math.BigDecimal
import java.time.LocalDate

import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.test.all.converters.LocalDateConverter
import org.jooq.test.oraclescala.generatedclasses.test.Test


object P2155 {

	/**
	 * The parameter <code>TEST.P2155.P1</code>.
	 */
	val P1 : Parameter[BigDecimal] = AbstractRoutine.createParameter("P1", org.jooq.impl.SQLDataType.NUMERIC, false)

	/**
	 * The parameter <code>TEST.P2155.P2</code>.
	 */
	val P2 : Parameter[LocalDate] = AbstractRoutine.createParameter("P2", org.jooq.impl.SQLDataType.DATE, false, new LocalDateConverter)

	/**
	 * The parameter <code>TEST.P2155.P3</code>.
	 */
	val P3 : Parameter[BigDecimal] = AbstractRoutine.createParameter("P3", org.jooq.impl.SQLDataType.NUMERIC, false)

	/**
	 * The parameter <code>TEST.P2155.P4</code>.
	 */
	val P4 : Parameter[LocalDate] = AbstractRoutine.createParameter("P4", org.jooq.impl.SQLDataType.DATE, false, new LocalDateConverter)

	/**
	 * The parameter <code>TEST.P2155.P5</code>.
	 */
	val P5 : Parameter[LocalDate] = AbstractRoutine.createParameter("P5", org.jooq.impl.SQLDataType.DATE, false, new LocalDateConverter)
}

/**
 * This class is generated by jOOQ.
 */
class P2155 extends AbstractRoutine[java.lang.Void]("P2155", Test.TEST) {
	{
		addInParameter(P2155.P1)
		addInParameter(P2155.P2)
		addOutParameter(P2155.P3)
		addOutParameter(P2155.P4)
		addOutParameter(P2155.P5)
	}

	/**
	 * Set the <code>P1</code> parameter IN value to the routine
	 */
	def setP1(value : Number) : Unit = {
		setNumber(P2155.P1, value)
	}

	/**
	 * Set the <code>P2</code> parameter IN value to the routine
	 */
	def setP2(value : LocalDate) : Unit = {
		setValue(P2155.P2, value)
	}

	/**
	 * Get the <code>P3</code> parameter OUT value from the routine
	 */
	def getP3 : BigDecimal = {
		getValue(P2155.P3)
	}

	/**
	 * Get the <code>P4</code> parameter OUT value from the routine
	 */
	def getP4 : LocalDate = {
		getValue(P2155.P4)
	}

	/**
	 * Get the <code>P5</code> parameter OUT value from the routine
	 */
	def getP5 : LocalDate = {
		getValue(P2155.P5)
	}
}
