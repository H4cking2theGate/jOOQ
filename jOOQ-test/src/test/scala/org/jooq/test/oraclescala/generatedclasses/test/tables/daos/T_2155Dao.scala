/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oraclescala.generatedclasses.test.tables.daos


import java.lang.Integer
import java.time.LocalDate
import java.util.List

import org.jooq.Configuration
import org.jooq.impl.DAOImpl
import org.jooq.test.oraclescala.generatedclasses.test.tables.T_2155
import org.jooq.test.oraclescala.generatedclasses.test.tables.records.T_2155Record
import org.jooq.test.oraclescala.generatedclasses.test.udt.records.U_2155ArrayRecord
import org.jooq.test.oraclescala.generatedclasses.test.udt.records.U_2155ObjectRecord


/**
 * This class is generated by jOOQ.
 */
class T_2155Dao(configuration : Configuration) extends DAOImpl[T_2155Record, org.jooq.test.oraclescala.generatedclasses.test.tables.pojos.T_2155, Integer](T_2155.T_2155, classOf[org.jooq.test.oraclescala.generatedclasses.test.tables.pojos.T_2155], configuration) {

	/**
	 * Create a new T_2155Dao without any configuration
	 */
	def this() = {
		this(null)
	}

	override protected def getId(o : org.jooq.test.oraclescala.generatedclasses.test.tables.pojos.T_2155) : Integer = {
		o.getId
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	def fetchById(values : Integer*) : List[org.jooq.test.oraclescala.generatedclasses.test.tables.pojos.T_2155] = {
		fetch(T_2155.T_2155.ID, values:_*)
	}

	/**
	 * Fetch a unique record that has <code>ID = value</code>
	 */
	def fetchOneById(value : Integer) : org.jooq.test.oraclescala.generatedclasses.test.tables.pojos.T_2155 = {
		fetchOne(T_2155.T_2155.ID, value)
	}

	/**
	 * Fetch records that have <code>D1 IN (values)</code>
	 */
	def fetchByD1(values : LocalDate*) : List[org.jooq.test.oraclescala.generatedclasses.test.tables.pojos.T_2155] = {
		fetch(T_2155.T_2155.D1, values:_*)
	}

	/**
	 * Fetch records that have <code>D2 IN (values)</code>
	 */
	def fetchByD2(values : U_2155ObjectRecord*) : List[org.jooq.test.oraclescala.generatedclasses.test.tables.pojos.T_2155] = {
		fetch(T_2155.T_2155.D2, values:_*)
	}

	/**
	 * Fetch records that have <code>D3 IN (values)</code>
	 */
	def fetchByD3(values : U_2155ArrayRecord*) : List[org.jooq.test.oraclescala.generatedclasses.test.tables.pojos.T_2155] = {
		fetch(T_2155.T_2155.D3, values:_*)
	}
}
