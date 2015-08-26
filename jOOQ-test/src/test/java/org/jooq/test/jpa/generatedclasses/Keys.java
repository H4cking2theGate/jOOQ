/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jpa.generatedclasses;


import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Record;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;
import org.jooq.test.jpa.generatedclasses.tables.TAuthor;
import org.jooq.test.jpa.generatedclasses.tables.TBook;


/**
 * A class modelling foreign key relationships between tables of the <code>PUBLIC</code> 
 * schema
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final UniqueKey<Record> CONSTRAINT_2 = UniqueKeys0.CONSTRAINT_2;
	public static final UniqueKey<Record> CONSTRAINT_9 = UniqueKeys0.CONSTRAINT_9;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final ForeignKey<Record, Record> FKJCHBPLV6O6EQFU9KDWP302A8V = ForeignKeys0.FKJCHBPLV6O6EQFU9KDWP302A8V;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class UniqueKeys0 extends AbstractKeys {
		public static final UniqueKey<Record> CONSTRAINT_2 = createUniqueKey(TAuthor.T_AUTHOR, TAuthor.T_AUTHOR.ID);
		public static final UniqueKey<Record> CONSTRAINT_9 = createUniqueKey(TBook.T_BOOK, TBook.T_BOOK.ID);
	}

	private static class ForeignKeys0 extends AbstractKeys {
		public static final ForeignKey<Record, Record> FKJCHBPLV6O6EQFU9KDWP302A8V = createForeignKey(org.jooq.test.jpa.generatedclasses.Keys.CONSTRAINT_2, TBook.T_BOOK, TBook.T_BOOK.AUTHOR_ID);
	}
}
