/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.procedures;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "1.6.8"},
                            comments = "This class is generated by jOOQ")
public class PAuthorExists extends org.jooq.impl.StoredProcedureImpl {

	private static final long serialVersionUID = -1834341405;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> AUTHOR_NAME = new org.jooq.impl.ParameterImpl<java.lang.String>("AUTHOR_NAME", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> RESULT = new org.jooq.impl.ParameterImpl<java.lang.Integer>("RESULT", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new procedure call instance
	 */
	public PAuthorExists() {
		super(org.jooq.SQLDialect.HSQLDB, "P_AUTHOR_EXISTS", org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC);

		addInParameter(AUTHOR_NAME);
		addOutParameter(RESULT);
	}

	public void setAuthorName(java.lang.String value) {
		setValue(AUTHOR_NAME, value);
	}

	public java.lang.Integer getResult() {
		return getValue(RESULT);
	}
}
