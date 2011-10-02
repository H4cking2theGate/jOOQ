/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses;

/**
 * This class is generated by jOOQ.
 *
 * Convenience access to all stored procedures in test
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "1.6.8"},
                            comments = "This class is generated by jOOQ")
public final class Procedures {

	/**
	 * Invoke P391
	 *
	 * @param i1 IN parameter
	 * @param io1 IN OUT parameter
	 * @param o1 OUT parameter
	 * @param o2 OUT parameter
	 * @param io2 IN OUT parameter
	 * @param i2 IN parameter
	 */
	public static org.jooq.test.mysql.generatedclasses.procedures.P391 p391(org.jooq.Configuration configuration, java.lang.Integer i1, java.lang.Integer io1, java.lang.Integer io2, java.lang.Integer i2) throws java.sql.SQLException {
		org.jooq.test.mysql.generatedclasses.procedures.P391 p = new org.jooq.test.mysql.generatedclasses.procedures.P391();
		p.setI1(i1);
		p.setIo1(io1);
		p.setIo2(io2);
		p.setI2(i2);

		p.execute(configuration);
		return p;
	}

	/**
	 * Invoke P_AUTHOR_EXISTS
	 *
	 * @param authorName IN parameter
	 * @param result OUT parameter
	 */
	public static java.lang.Integer pAuthorExists(org.jooq.Configuration configuration, java.lang.String authorName) throws java.sql.SQLException {
		org.jooq.test.mysql.generatedclasses.procedures.PAuthorExists p = new org.jooq.test.mysql.generatedclasses.procedures.PAuthorExists();
		p.setAuthorName(authorName);

		p.execute(configuration);
		return p.getResult();
	}

	/**
	 * Invoke P_CREATE_AUTHOR
	 *
	 */
	public static void pCreateAuthor(org.jooq.Configuration configuration) throws java.sql.SQLException {
		org.jooq.test.mysql.generatedclasses.procedures.PCreateAuthor p = new org.jooq.test.mysql.generatedclasses.procedures.PCreateAuthor();

		p.execute(configuration);
	}

	/**
	 * Invoke P_CREATE_AUTHOR_BY_NAME
	 *
	 * @param firstName IN parameter
	 * @param lastName IN parameter
	 */
	public static void pCreateAuthorByName(org.jooq.Configuration configuration, java.lang.String firstName, java.lang.String lastName) throws java.sql.SQLException {
		org.jooq.test.mysql.generatedclasses.procedures.PCreateAuthorByName p = new org.jooq.test.mysql.generatedclasses.procedures.PCreateAuthorByName();
		p.setFirstName(firstName);
		p.setLastName(lastName);

		p.execute(configuration);
	}

	/**
	 * Invoke P_UNUSED
	 *
	 * @param in1 IN parameter
	 * @param out1 OUT parameter
	 * @param out2 IN OUT parameter
	 */
	public static org.jooq.test.mysql.generatedclasses.procedures.PUnused pUnused(org.jooq.Configuration configuration, java.lang.String in1, java.lang.Boolean out2) throws java.sql.SQLException {
		org.jooq.test.mysql.generatedclasses.procedures.PUnused p = new org.jooq.test.mysql.generatedclasses.procedures.PUnused();
		p.setIn1(in1);
		p.setOut2(out2);

		p.execute(configuration);
		return p;
	}

	/**
	 * No instances
	 */
	private Procedures() {}
}
