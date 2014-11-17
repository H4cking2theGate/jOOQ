/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle2.generatedclasses;

/**
 * Convenience access to all stored procedures and functions in TEST
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Routines {

	/**
	 * Call <code>TEST.F_976</code>
	 */
	public static java.sql.Timestamp f_976(org.jooq.Configuration configuration, java.sql.Timestamp dateAsTimestampi) {
		org.jooq.test.oracle2.generatedclasses.routines.DateAsTimestampF_976 f = new org.jooq.test.oracle2.generatedclasses.routines.DateAsTimestampF_976();
		f.setI(dateAsTimestampi);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>TEST.F_976</code> as a field
	 */
	public static org.jooq.Field<java.sql.Timestamp> f_976(java.sql.Timestamp dateAsTimestampi) {
		org.jooq.test.oracle2.generatedclasses.routines.DateAsTimestampF_976 f = new org.jooq.test.oracle2.generatedclasses.routines.DateAsTimestampF_976();
		f.setI(dateAsTimestampi);

		return f.asField();
	}

	/**
	 * Get <code>TEST.F_976</code> as a field
	 */
	public static org.jooq.Field<java.sql.Timestamp> f_976(org.jooq.Field<java.sql.Timestamp> dateAsTimestampi) {
		org.jooq.test.oracle2.generatedclasses.routines.DateAsTimestampF_976 f = new org.jooq.test.oracle2.generatedclasses.routines.DateAsTimestampF_976();
		f.setI(dateAsTimestampi);

		return f.asField();
	}

	/**
	 * Call <code>TEST.P_976</code>
	 */
	public static java.sql.Timestamp p_976(org.jooq.Configuration configuration, java.sql.Timestamp dateAsTimestampi) {
		org.jooq.test.oracle2.generatedclasses.routines.DateAsTimestampP_976 p = new org.jooq.test.oracle2.generatedclasses.routines.DateAsTimestampP_976();
		p.setI(dateAsTimestampi);

		p.execute(configuration);
		return p.getO();
	}
}
