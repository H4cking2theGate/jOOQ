/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.tables;


import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.test.sqlserver.generatedclasses.Dbo;
import org.jooq.test.sqlserver.generatedclasses.tables.records.FTables2Record;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FTables2 extends TableImpl<FTables2Record> {

	private static final long serialVersionUID = 1681685373;

	/**
	 * The reference instance of <code>dbo.f_tables2</code>
	 */
	public static final FTables2 F_TABLES2 = new FTables2();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<FTables2Record> getRecordType() {
		return FTables2Record.class;
	}

	/**
	 * The column <code>dbo.f_tables2.column_value</code>.
	 */
	public final TableField<FTables2Record, Long> COLUMN_VALUE = createField("column_value", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * Create a <code>dbo.f_tables2</code> table reference
	 */
	public FTables2() {
		this("f_tables2", null);
	}

	/**
	 * Create an aliased <code>dbo.f_tables2</code> table reference
	 */
	public FTables2(String alias) {
		this(alias, F_TABLES2);
	}

	private FTables2(String alias, Table<FTables2Record> aliased) {
		this(alias, aliased, new Field[0]);
	}

	private FTables2(String alias, Table<FTables2Record> aliased, Field<?>[] parameters) {
		super(alias, Dbo.DBO, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FTables2 as(String alias) {
		return new FTables2(alias, this, parameters);
	}

	/**
	 * Rename this table
	 */
	public FTables2 rename(String name) {
		return new FTables2(name, null, parameters);
	}

	/**
	 * Call this table-valued function
	 */
	public FTables2 call() {
		return new FTables2(getName(), null, new Field[] {  });
	}
}
