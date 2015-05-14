/**
 * This class is generated by jOOQ
 */
package org.jooq.util.vertica.v_catalog.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.util.vertica.v_catalog.VCatalog;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences extends TableImpl<Record> {

	private static final long serialVersionUID = -1477472370;

	/**
	 * The reference instance of <code>v_catalog.sequences</code>
	 */
	public static final Sequences SEQUENCES = new Sequences();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<Record> getRecordType() {
		return Record.class;
	}

	/**
	 * The column <code>v_catalog.sequences.sequence_schema</code>.
	 */
	public final TableField<Record, String> SEQUENCE_SCHEMA = createField("sequence_schema", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>v_catalog.sequences.sequence_name</code>.
	 */
	public final TableField<Record, String> SEQUENCE_NAME = createField("sequence_name", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>v_catalog.sequences.owner_name</code>.
	 */
	public final TableField<Record, String> OWNER_NAME = createField("owner_name", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>v_catalog.sequences.identity_table_name</code>.
	 */
	public final TableField<Record, String> IDENTITY_TABLE_NAME = createField("identity_table_name", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>v_catalog.sequences.session_cache_count</code>.
	 */
	public final TableField<Record, Integer> SESSION_CACHE_COUNT = createField("session_cache_count", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>v_catalog.sequences.allow_cycle</code>.
	 */
	public final TableField<Record, Boolean> ALLOW_CYCLE = createField("allow_cycle", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>v_catalog.sequences.output_ordered</code>.
	 */
	public final TableField<Record, Boolean> OUTPUT_ORDERED = createField("output_ordered", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>v_catalog.sequences.increment_by</code>.
	 */
	public final TableField<Record, Integer> INCREMENT_BY = createField("increment_by", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>v_catalog.sequences.minimum</code>.
	 */
	public final TableField<Record, Integer> MINIMUM = createField("minimum", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>v_catalog.sequences.maximum</code>.
	 */
	public final TableField<Record, Integer> MAXIMUM = createField("maximum", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>v_catalog.sequences.current_value</code>.
	 */
	public final TableField<Record, Integer> CURRENT_VALUE = createField("current_value", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>v_catalog.sequences.sequence_schema_id</code>.
	 */
	public final TableField<Record, Integer> SEQUENCE_SCHEMA_ID = createField("sequence_schema_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>v_catalog.sequences.sequence_id</code>.
	 */
	public final TableField<Record, Integer> SEQUENCE_ID = createField("sequence_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>v_catalog.sequences.owner_id</code>.
	 */
	public final TableField<Record, Integer> OWNER_ID = createField("owner_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>v_catalog.sequences.identity_table_id</code>.
	 */
	public final TableField<Record, Integer> IDENTITY_TABLE_ID = createField("identity_table_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>v_catalog.sequences</code> table reference
	 */
	public Sequences() {
		this("sequences", null);
	}

	/**
	 * Create an aliased <code>v_catalog.sequences</code> table reference
	 */
	public Sequences(String alias) {
		this(alias, SEQUENCES);
	}

	private Sequences(String alias, Table<Record> aliased) {
		this(alias, aliased, null);
	}

	private Sequences(String alias, Table<Record> aliased, Field<?>[] parameters) {
		super(alias, VCatalog.V_CATALOG, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Sequences as(String alias) {
		return new Sequences(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Sequences rename(String name) {
		return new Sequences(name, null);
	}
}
