/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
public class PCreateAuthorByName extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -1818985692;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> FIRST_NAME = createParameter("first_name", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> LAST_NAME = createParameter("last_name", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * Create a new routine call instance
	 */
	public PCreateAuthorByName() {
		super("p_create_author_by_name", org.jooq.test.sqlserver.generatedclasses.Dbo.DBO);

		addInParameter(FIRST_NAME);
		addInParameter(LAST_NAME);
	}

	/**
	 * Set the <code>first_name</code> parameter to the routine
	 */
	public void setFirstName(java.lang.String value) {
		setValue(org.jooq.test.sqlserver.generatedclasses.routines.PCreateAuthorByName.FIRST_NAME, value);
	}

	/**
	 * Set the <code>last_name</code> parameter to the routine
	 */
	public void setLastName(java.lang.String value) {
		setValue(org.jooq.test.sqlserver.generatedclasses.routines.PCreateAuthorByName.LAST_NAME, value);
	}
}
