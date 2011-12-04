/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class Public extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = 581905723;

	/**
	 * The singleton instance of PUBLIC
	 */
	public static final Public PUBLIC = new Public();

	/**
	 * No further instances allowed
	 */
	private Public() {
		super("PUBLIC");
	}

	@Override
	public final java.util.List<org.jooq.Sequence<?>> getSequences() {
		return java.util.Arrays.<org.jooq.Sequence<?>>asList(
			org.jooq.test.h2.generatedclasses.Sequences.S_AUTHOR_ID,
			org.jooq.test.h2.generatedclasses.Sequences.S_TRIGGERS_SEQUENCE);
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			org.jooq.test.h2.generatedclasses.tables.TBooleans.T_BOOLEANS,
			org.jooq.test.h2.generatedclasses.tables.TTriggers.T_TRIGGERS,
			org.jooq.test.h2.generatedclasses.tables.T_658Ref.T_658_REF,
			org.jooq.test.h2.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST,
			org.jooq.test.h2.generatedclasses.tables.T_785.T_785,
			org.jooq.test.h2.generatedclasses.tables.T_877.T_877,
			org.jooq.test.h2.generatedclasses.tables.TAuthor.T_AUTHOR,
			org.jooq.test.h2.generatedclasses.tables.TBook.T_BOOK,
			org.jooq.test.h2.generatedclasses.tables.TBookStore.T_BOOK_STORE,
			org.jooq.test.h2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE,
			org.jooq.test.h2.generatedclasses.tables.TArrays.T_ARRAYS,
			org.jooq.test.h2.generatedclasses.tables.XUnused.X_UNUSED,
			org.jooq.test.h2.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE,
			org.jooq.test.h2.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69,
			org.jooq.test.h2.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71,
			org.jooq.test.h2.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85,
			org.jooq.test.h2.generatedclasses.tables.VLibrary.V_LIBRARY,
			org.jooq.test.h2.generatedclasses.tables.VAuthor.V_AUTHOR,
			org.jooq.test.h2.generatedclasses.tables.VBook.V_BOOK);
	}
}
