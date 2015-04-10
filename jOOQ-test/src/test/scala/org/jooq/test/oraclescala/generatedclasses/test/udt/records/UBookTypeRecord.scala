/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oraclescala.generatedclasses.test.udt.records


import java.lang.Integer
import java.lang.String

import javax.validation.constraints.Size

import org.jooq.Field
import org.jooq.Record2
import org.jooq.Row2
import org.jooq.impl.UDTRecordImpl
import org.jooq.test.oraclescala.generatedclasses.test.udt.UBookType


/**
 * This class is generated by jOOQ.
 */
class UBookTypeRecord extends UDTRecordImpl[UBookTypeRecord](UBookType.U_BOOK_TYPE) with Record2[Integer, String] {

	/**
	 * Setter for <code>TEST.U_BOOK_TYPE.ID</code>.
	 */
	def setId(value : Integer) : Unit = {
		setValue(0, value)
	}

	/**
	 * Getter for <code>TEST.U_BOOK_TYPE.ID</code>.
	 */
	def getId : Integer = {
		val r = getValue(0)
		if (r == null) null else r.asInstanceOf[Integer]
	}

	/**
	 * Setter for <code>TEST.U_BOOK_TYPE.TITLE</code>.
	 */
	def setTitle(value : String) : Unit = {
		setValue(1, value)
	}

	/**
	 * Getter for <code>TEST.U_BOOK_TYPE.TITLE</code>.
	 */
	@Size(max = 400)
	def getTitle : String = {
		val r = getValue(1)
		if (r == null) null else r.asInstanceOf[String]
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	override def fieldsRow : Row2[Integer, String] = {
		super.fieldsRow.asInstanceOf[ Row2[Integer, String] ]
	}

	override def valuesRow : Row2[Integer, String] = {
		super.valuesRow.asInstanceOf[ Row2[Integer, String] ]
	}
	override def field1 : Field[Integer] = UBookType.ID
	override def field2 : Field[String] = UBookType.TITLE
	override def value1 : Integer = getId
	override def value2 : String = getTitle

	override def value1(value : Integer) : UBookTypeRecord = {
		setId(value)
		this
	}

	override def value2(value : String) : UBookTypeRecord = {
		setTitle(value)
		this
	}

	override def values(value1 : Integer, value2 : String) : UBookTypeRecord = {
		this.value1(value1)
		this.value2(value2)
		this
	}

	/**
	 * Create a detached, initialised UBookTypeRecord
	 */
	def this(id : Integer, title : String) = {
		this()

		setValue(0, id)
		setValue(1, title)
	}
}
