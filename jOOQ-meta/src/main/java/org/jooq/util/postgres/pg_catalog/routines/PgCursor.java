/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.pg_catalog.routines;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "3.0.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class PgCursor extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 845005988;

	/**
	 * The parameter <code>pg_catalog.pg_cursor.name</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.String> NAME = createParameter("name", org.jooq.impl.SQLDataType.CLOB);

	/**
	 * The parameter <code>pg_catalog.pg_cursor.statement</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.String> STATEMENT = createParameter("statement", org.jooq.impl.SQLDataType.CLOB);

	/**
	 * The parameter <code>pg_catalog.pg_cursor.is_holdable</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Boolean> IS_HOLDABLE = createParameter("is_holdable", org.jooq.impl.SQLDataType.BOOLEAN);

	/**
	 * The parameter <code>pg_catalog.pg_cursor.is_binary</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Boolean> IS_BINARY = createParameter("is_binary", org.jooq.impl.SQLDataType.BOOLEAN);

	/**
	 * The parameter <code>pg_catalog.pg_cursor.is_scrollable</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Boolean> IS_SCROLLABLE = createParameter("is_scrollable", org.jooq.impl.SQLDataType.BOOLEAN);

	/**
	 * The parameter <code>pg_catalog.pg_cursor.creation_time</code>. 
	 */
	public static final org.jooq.Parameter<java.sql.Timestamp> CREATION_TIME = createParameter("creation_time", org.jooq.impl.SQLDataType.TIMESTAMP);

	/**
	 * Create a new routine call instance
	 */
	public PgCursor() {
		super("pg_cursor", org.jooq.util.postgres.pg_catalog.PgCatalog.PG_CATALOG);

		addOutParameter(NAME);
		addOutParameter(STATEMENT);
		addOutParameter(IS_HOLDABLE);
		addOutParameter(IS_BINARY);
		addOutParameter(IS_SCROLLABLE);
		addOutParameter(CREATION_TIME);
	}

	/**
	 * Get the <code>name</code> parameter OUT value from the routine
	 */
	public java.lang.String getName_() {
		return getValue(NAME);
	}

	/**
	 * Get the <code>statement</code> parameter OUT value from the routine
	 */
	public java.lang.String getStatement() {
		return getValue(STATEMENT);
	}

	/**
	 * Get the <code>is_holdable</code> parameter OUT value from the routine
	 */
	public java.lang.Boolean getIsHoldable() {
		return getValue(IS_HOLDABLE);
	}

	/**
	 * Get the <code>is_binary</code> parameter OUT value from the routine
	 */
	public java.lang.Boolean getIsBinary() {
		return getValue(IS_BINARY);
	}

	/**
	 * Get the <code>is_scrollable</code> parameter OUT value from the routine
	 */
	public java.lang.Boolean getIsScrollable() {
		return getValue(IS_SCROLLABLE);
	}

	/**
	 * Get the <code>creation_time</code> parameter OUT value from the routine
	 */
	public java.sql.Timestamp getCreationTime() {
		return getValue(CREATION_TIME);
	}
}
