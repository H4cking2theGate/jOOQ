/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oraclescala.generatedclasses.test.tables.records


import java.lang.String

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Row1
import org.jooq.impl.UpdatableRecordImpl
import org.jooq.test.oraclescala.generatedclasses.test.tables.TBookStore


/**
 * A book store
 */
@Entity
@Table(name = "T_BOOK_STORE", schema = "TEST")
class TBookStoreRecord extends UpdatableRecordImpl[TBookStoreRecord](TBookStore.T_BOOK_STORE) with Record1[String] {

	/**
	 * Setter for <code>TEST.T_BOOK_STORE.NAME</code>. The books store name
	 */
	def setName(value : String) : Unit = {
		setValue(0, value)
	}

	/**
	 * Getter for <code>TEST.T_BOOK_STORE.NAME</code>. The books store name
	 */
	@Id
	@Column(name = "NAME", unique = true, nullable = false, length = 400)
	@NotNull
	@Size(max = 400)
	def getName : String = {
		val r = getValue(0)
		if (r == null) null else r.asInstanceOf[String]
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------
	override def key() : Record1[String] = {
		return super.key.asInstanceOf[ Record1[String] ]
	}

	// -------------------------------------------------------------------------
	// Record1 type implementation
	// -------------------------------------------------------------------------

	override def fieldsRow : Row1[String] = {
		super.fieldsRow.asInstanceOf[ Row1[String] ]
	}

	override def valuesRow : Row1[String] = {
		super.valuesRow.asInstanceOf[ Row1[String] ]
	}
	override def field1 : Field[String] = TBookStore.T_BOOK_STORE.NAME
	override def value1 : String = getName

	override def value1(value : String) : TBookStoreRecord = {
		setName(value)
		this
	}

	override def values(value1 : String) : TBookStoreRecord = {
		this.value1(value1)
		this
	}

	/**
	 * Create a detached, initialised TBookStoreRecord
	 */
	def this(name : String) = {
		this()

		setValue(0, name)
	}
}
