/**
 * This class is generated by jOOQ
 */
package org.jooq.util.oracle.sys.tables;

/**
 * This class is generated by jOOQ.
 *
 * Description of attributes of types accessible to the user
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class AllTypeAttrs extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -825035176;

	/**
	 * The singleton instance of SYS.ALL_TYPE_ATTRS
	 */
	public static final org.jooq.util.oracle.sys.tables.AllTypeAttrs ALL_TYPE_ATTRS = new org.jooq.util.oracle.sys.tables.AllTypeAttrs();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * Owner of the type
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> OWNER = createField("OWNER", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Name of the type
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TYPE_NAME = createField("TYPE_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Name of the attribute
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> ATTR_NAME = createField("ATTR_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Type modifier of the attribute
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> ATTR_TYPE_MOD = createField("ATTR_TYPE_MOD", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Owner of the type of the attribute
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> ATTR_TYPE_OWNER = createField("ATTR_TYPE_OWNER", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Name of the type of the attribute
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> ATTR_TYPE_NAME = createField("ATTR_TYPE_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Length of the CHAR attribute or maximum length of the VARCHAR
or VARCHAR2 attribute
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> LENGTH = createField("LENGTH", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * Decimal precision of the NUMBER or DECIMAL attribute or
binary precision of the FLOAT attribute
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> PRECISION = createField("PRECISION", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * Scale of the NUMBER or DECIMAL attribute
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> SCALE = createField("SCALE", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * Character set name of the attribute
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CHARACTER_SET_NAME = createField("CHARACTER_SET_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Syntactical order number or position of the attribute as specified in the
type specification or CREATE TYPE statement (not to be used as ID number)
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> ATTR_NO = createField("ATTR_NO", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * Is the attribute inherited from the supertype ?
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> INHERITED = createField("INHERITED", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * C if the width was specified in characters, B if in bytes
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CHAR_USED = createField("CHAR_USED", org.jooq.impl.SQLDataType.VARCHAR, this);

	public AllTypeAttrs() {
		super("ALL_TYPE_ATTRS", org.jooq.util.oracle.sys.Sys.SYS);
	}

	public AllTypeAttrs(java.lang.String alias) {
		super(alias, org.jooq.util.oracle.sys.Sys.SYS, org.jooq.util.oracle.sys.tables.AllTypeAttrs.ALL_TYPE_ATTRS);
	}

	@Override
	public org.jooq.util.oracle.sys.tables.AllTypeAttrs as(java.lang.String alias) {
		return new org.jooq.util.oracle.sys.tables.AllTypeAttrs(alias);
	}
}
