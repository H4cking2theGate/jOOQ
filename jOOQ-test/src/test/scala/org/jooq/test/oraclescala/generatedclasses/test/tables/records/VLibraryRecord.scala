/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oraclescala.generatedclasses.test.tables.records


import java.lang.String

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

import org.jooq.Field
import org.jooq.Record2
import org.jooq.Row2
import org.jooq.impl.TableRecordImpl
import org.jooq.test.oraclescala.generatedclasses.test.tables.VLibrary


/**
 * This class is generated by jOOQ.
 */
@Entity
@Table(name = "V_LIBRARY", schema = "TEST")
class VLibraryRecord extends TableRecordImpl[VLibraryRecord](VLibrary.V_LIBRARY) with Record2[String, String] {

	/**
	 * Setter for <code>TEST.V_LIBRARY.AUTHOR</code>.
	 */
	def setAuthor(value : String) : Unit = {
		setValue(0, value)
	}

	/**
	 * Getter for <code>TEST.V_LIBRARY.AUTHOR</code>.
	 */
	@Column(name = "AUTHOR", length = 101)
	@Size(max = 101)
	def getAuthor : String = {
		val r = getValue(0)
		if (r == null) null else r.asInstanceOf[String]
	}

	/**
	 * Setter for <code>TEST.V_LIBRARY.TITLE</code>.
	 */
	def setTitle(value : String) : Unit = {
		setValue(1, value)
	}

	/**
	 * Getter for <code>TEST.V_LIBRARY.TITLE</code>.
	 */
	@Column(name = "TITLE", nullable = false, length = 400)
	@NotNull
	@Size(max = 400)
	def getTitle : String = {
		val r = getValue(1)
		if (r == null) null else r.asInstanceOf[String]
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	override def fieldsRow : Row2[String, String] = {
		super.fieldsRow.asInstanceOf[ Row2[String, String] ]
	}

	override def valuesRow : Row2[String, String] = {
		super.valuesRow.asInstanceOf[ Row2[String, String] ]
	}
	override def field1 : Field[String] = VLibrary.V_LIBRARY.AUTHOR
	override def field2 : Field[String] = VLibrary.V_LIBRARY.TITLE
	override def value1 : String = getAuthor
	override def value2 : String = getTitle

	override def value1(value : String) : VLibraryRecord = {
		setAuthor(value)
		this
	}

	override def value2(value : String) : VLibraryRecord = {
		setTitle(value)
		this
	}

	override def values(value1 : String, value2 : String) : VLibraryRecord = {
		this.value1(value1)
		this.value2(value2)
		this
	}

	/**
	 * Create a detached, initialised VLibraryRecord
	 */
	def this(author : String, title : String) = {
		this()

		setValue(0, author)
		setValue(1, title)
	}
}
