/**
 * This class is generated by jOOQ
 */
package org.jooq.test.vertica.generatedclasses.tables;


import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.test.vertica.generatedclasses.Keys;
import org.jooq.test.vertica.generatedclasses.Public;
import org.jooq.test.vertica.generatedclasses.tables.records.TExoticTypesRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TExoticTypes extends TableImpl<TExoticTypesRecord> {

	private static final long serialVersionUID = 1953015034;

	/**
	 * The reference instance of <code>public.t_exotic_types</code>
	 */
	public static final TExoticTypes T_EXOTIC_TYPES = new TExoticTypes();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TExoticTypesRecord> getRecordType() {
		return TExoticTypesRecord.class;
	}

	/**
	 * The column <code>public.t_exotic_types.ID</code>.
	 */
	public final TableField<TExoticTypesRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.t_exotic_types.UU</code>.
	 */
	public final TableField<TExoticTypesRecord, UUID> UU = createField("UU", org.jooq.impl.SQLDataType.UUID.defaulted(true), this, "");

	/**
	 * Create a <code>public.t_exotic_types</code> table reference
	 */
	public TExoticTypes() {
		this("t_exotic_types", null);
	}

	/**
	 * Create an aliased <code>public.t_exotic_types</code> table reference
	 */
	public TExoticTypes(String alias) {
		this(alias, T_EXOTIC_TYPES);
	}

	private TExoticTypes(String alias, Table<TExoticTypesRecord> aliased) {
		this(alias, aliased, null);
	}

	private TExoticTypes(String alias, Table<TExoticTypesRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<TExoticTypesRecord> getPrimaryKey() {
		return Keys.PK_T_EXOTIC_TYPES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<TExoticTypesRecord>> getKeys() {
		return Arrays.<UniqueKey<TExoticTypesRecord>>asList(Keys.PK_T_EXOTIC_TYPES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TExoticTypes as(String alias) {
		return new TExoticTypes(alias, this);
	}

	/**
	 * Rename this table
	 */
	public TExoticTypes rename(String name) {
		return new TExoticTypes(name, null);
	}
}
