/**
 * This class is generated by jOOQ
 */
package org.jooq.util.oracle.sys.udt.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "3.0.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class OraMiningNumberNtRecord extends org.jooq.impl.ArrayRecordImpl<java.math.BigDecimal> {

	private static final long serialVersionUID = -2024475079;

	/**
	 * Create a new <code>SYS.ORA_MINING_NUMBER_NT</code> record
	 */
	public OraMiningNumberNtRecord(org.jooq.Configuration configuration) {
		super(org.jooq.util.oracle.sys.Sys.SYS, "ORA_MINING_NUMBER_NT", org.jooq.impl.SQLDataType.NUMERIC, configuration);
	}

	/**
	 * Create a new <code>SYS.ORA_MINING_NUMBER_NT</code> record
	 */
	public OraMiningNumberNtRecord(org.jooq.Configuration configuration, java.math.BigDecimal... array) {
		this(configuration);
		set(array);
	}

	/**
	 * Create a new <code>SYS.ORA_MINING_NUMBER_NT</code> record
	 */
	public OraMiningNumberNtRecord(org.jooq.Configuration configuration, java.util.List<? extends java.math.BigDecimal> list) {
		this(configuration);
		setList(list);
	}
}
