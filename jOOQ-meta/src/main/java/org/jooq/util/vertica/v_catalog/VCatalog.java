/**
 * This class is generated by jOOQ
 */
package org.jooq.util.vertica.v_catalog;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Table;
import org.jooq.impl.SchemaImpl;
import org.jooq.util.vertica.v_catalog.tables.AllTables;
import org.jooq.util.vertica.v_catalog.tables.Columns;
import org.jooq.util.vertica.v_catalog.tables.ConstraintColumns;
import org.jooq.util.vertica.v_catalog.tables.Schemata;
import org.jooq.util.vertica.v_catalog.tables.Sequences;
import org.jooq.util.vertica.v_catalog.tables.SystemColumns;
import org.jooq.util.vertica.v_catalog.tables.SystemTables;
import org.jooq.util.vertica.v_catalog.tables.TableConstraints;
import org.jooq.util.vertica.v_catalog.tables.Tables;
import org.jooq.util.vertica.v_catalog.tables.ViewColumns;
import org.jooq.util.vertica.v_catalog.tables.Views;


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
public class VCatalog extends SchemaImpl {

	private static final long serialVersionUID = 603052771;

	/**
	 * The reference instance of <code>v_catalog</code>
	 */
	public static final VCatalog V_CATALOG = new VCatalog();

	/**
	 * No further instances allowed
	 */
	private VCatalog() {
		super("v_catalog");
	}

	@Override
	public final List<Table<?>> getTables() {
		List result = new ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final List<Table<?>> getTables0() {
		return Arrays.<Table<?>>asList(
			AllTables.ALL_TABLES,
			Columns.COLUMNS,
			ConstraintColumns.CONSTRAINT_COLUMNS,
			Schemata.SCHEMATA,
			Sequences.SEQUENCES,
			SystemColumns.SYSTEM_COLUMNS,
			SystemTables.SYSTEM_TABLES,
			TableConstraints.TABLE_CONSTRAINTS,
			Tables.TABLES,
			ViewColumns.VIEW_COLUMNS,
			Views.VIEWS);
	}
}
