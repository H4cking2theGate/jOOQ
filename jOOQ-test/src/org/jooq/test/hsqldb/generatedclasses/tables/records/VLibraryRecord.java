/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "1.6.8"},
                            comments = "This class is generated by jOOQ")
public class VLibraryRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.VLibraryRecord> {

	private static final long serialVersionUID = -2051840300;

	/**
	 * An uncommented item
	 */
	public void setAuthor(java.lang.String value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.VLibrary.AUTHOR, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getAuthor() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.VLibrary.AUTHOR);
	}

	/**
	 * An uncommented item
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.VLibrary.TITLE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getTitle() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.VLibrary.TITLE);
	}

	/**
	 * Create a detached VLibraryRecord
	 */
	public VLibraryRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.VLibrary.V_LIBRARY);
	}

	/**
	 * Create an attached VLibraryRecord
	 * @deprecated - 1.6.4 [#363, #789] - use the other constructor instead for unattached
	 * records, or {@link org.jooq.impl.Factory#newRecord(org.jooq.Table)} for attached ones
	 */
	@Deprecated
	public VLibraryRecord(org.jooq.Configuration configuration) {
		super(org.jooq.test.hsqldb.generatedclasses.tables.VLibrary.V_LIBRARY, configuration);
	}
}
