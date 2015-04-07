/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.sys.udt.records;


import java.util.Collection;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.ArrayRecordImpl;
import org.jooq.test.oracle.generatedclasses.sys.Sys;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XmltypepiRecord extends ArrayRecordImpl<byte[]> {

	private static final long serialVersionUID = -1208289640;

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #XmltypepiRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public XmltypepiRecord(Configuration configuration) {
		super(Sys.SYS, "XMLTYPEPI", org.jooq.impl.SQLDataType.BLOB, configuration);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #XmltypepiRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public XmltypepiRecord(Configuration configuration, byte[]... array) {
		this(configuration);
		set(array);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #XmltypepiRecord()} constructor instead
	 */
	@java.lang.Deprecated
	public XmltypepiRecord(Configuration configuration, List<? extends byte[]> list) {
		this(configuration);
		setList(list);
	}

	/**
	 * Create a new <code>SYS.XMLTYPEPI</code> record
	 */
	public XmltypepiRecord() {
		super(Sys.SYS, "XMLTYPEPI", org.jooq.impl.SQLDataType.BLOB);
	}

	/**
	 * Create a new <code>SYS.XMLTYPEPI</code> record
	 */
	public XmltypepiRecord(byte[]... array) {
		this();
		set(array);
	}

	/**
	 * Create a new <code>SYS.XMLTYPEPI</code> record
	 */
	public XmltypepiRecord(Collection<? extends byte[]> collection) {
		this();
		set(collection);
	}
}
