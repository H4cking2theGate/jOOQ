/**
 * This class is generated by jOOQ
 */
package org.jooq.test.firebird.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "T_BOOLEANS")
public interface ITBooleans extends java.io.Serializable {

	/**
	 * Setter for <code>T_BOOLEANS.ID</code>. 
	 */
	public void setId(java.lang.Integer value);

	/**
	 * Getter for <code>T_BOOLEANS.ID</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, length = 4)
	@javax.validation.constraints.NotNull
	public java.lang.Integer getId();

	/**
	 * Setter for <code>T_BOOLEANS.ONE_ZERO</code>. 
	 */
	public void setOneZero(org.jooq.test._.converters.Boolean_10 value);

	/**
	 * Getter for <code>T_BOOLEANS.ONE_ZERO</code>. 
	 */
	@javax.persistence.Column(name = "ONE_ZERO", length = 4)
	public org.jooq.test._.converters.Boolean_10 getOneZero();

	/**
	 * Setter for <code>T_BOOLEANS.TRUE_FALSE_LC</code>. 
	 */
	public void setTrueFalseLc(org.jooq.test._.converters.Boolean_TF_LC value);

	/**
	 * Getter for <code>T_BOOLEANS.TRUE_FALSE_LC</code>. 
	 */
	@javax.persistence.Column(name = "TRUE_FALSE_LC", length = 5)
	public org.jooq.test._.converters.Boolean_TF_LC getTrueFalseLc();

	/**
	 * Setter for <code>T_BOOLEANS.TRUE_FALSE_UC</code>. 
	 */
	public void setTrueFalseUc(org.jooq.test._.converters.Boolean_TF_UC value);

	/**
	 * Getter for <code>T_BOOLEANS.TRUE_FALSE_UC</code>. 
	 */
	@javax.persistence.Column(name = "TRUE_FALSE_UC", length = 5)
	public org.jooq.test._.converters.Boolean_TF_UC getTrueFalseUc();

	/**
	 * Setter for <code>T_BOOLEANS.YES_NO_LC</code>. 
	 */
	public void setYesNoLc(org.jooq.test._.converters.Boolean_YES_NO_LC value);

	/**
	 * Getter for <code>T_BOOLEANS.YES_NO_LC</code>. 
	 */
	@javax.persistence.Column(name = "YES_NO_LC", length = 3)
	public org.jooq.test._.converters.Boolean_YES_NO_LC getYesNoLc();

	/**
	 * Setter for <code>T_BOOLEANS.YES_NO_UC</code>. 
	 */
	public void setYesNoUc(org.jooq.test._.converters.Boolean_YES_NO_UC value);

	/**
	 * Getter for <code>T_BOOLEANS.YES_NO_UC</code>. 
	 */
	@javax.persistence.Column(name = "YES_NO_UC", length = 3)
	public org.jooq.test._.converters.Boolean_YES_NO_UC getYesNoUc();

	/**
	 * Setter for <code>T_BOOLEANS.Y_N_LC</code>. 
	 */
	public void setYNLc(org.jooq.test._.converters.Boolean_YN_LC value);

	/**
	 * Getter for <code>T_BOOLEANS.Y_N_LC</code>. 
	 */
	@javax.persistence.Column(name = "Y_N_LC", length = 1)
	public org.jooq.test._.converters.Boolean_YN_LC getYNLc();

	/**
	 * Setter for <code>T_BOOLEANS.Y_N_UC</code>. 
	 */
	public void setYNUc(org.jooq.test._.converters.Boolean_YN_UC value);

	/**
	 * Getter for <code>T_BOOLEANS.Y_N_UC</code>. 
	 */
	@javax.persistence.Column(name = "Y_N_UC", length = 1)
	public org.jooq.test._.converters.Boolean_YN_UC getYNUc();

	/**
	 * Setter for <code>T_BOOLEANS.VC_BOOLEAN</code>. 
	 */
	public void setVcBoolean(java.lang.Boolean value);

	/**
	 * Getter for <code>T_BOOLEANS.VC_BOOLEAN</code>. 
	 */
	@javax.persistence.Column(name = "VC_BOOLEAN", length = 1)
	public java.lang.Boolean getVcBoolean();

	/**
	 * Setter for <code>T_BOOLEANS.C_BOOLEAN</code>. 
	 */
	public void setCBoolean(java.lang.Boolean value);

	/**
	 * Getter for <code>T_BOOLEANS.C_BOOLEAN</code>. 
	 */
	@javax.persistence.Column(name = "C_BOOLEAN", length = 1)
	public java.lang.Boolean getCBoolean();

	/**
	 * Setter for <code>T_BOOLEANS.N_BOOLEAN</code>. 
	 */
	public void setNBoolean(java.lang.Boolean value);

	/**
	 * Getter for <code>T_BOOLEANS.N_BOOLEAN</code>. 
	 */
	@javax.persistence.Column(name = "N_BOOLEAN", length = 4)
	public java.lang.Boolean getNBoolean();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface ITBooleans
	 */
	public void from(org.jooq.test.firebird.generatedclasses.tables.interfaces.ITBooleans from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface ITBooleans
	 */
	public <E extends org.jooq.test.firebird.generatedclasses.tables.interfaces.ITBooleans> E into(E into);
}
