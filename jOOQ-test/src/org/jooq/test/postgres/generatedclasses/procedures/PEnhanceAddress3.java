/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.procedures;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "1.6.8"},
                            comments = "This class is generated by jOOQ")
public class PEnhanceAddress3 extends org.jooq.util.postgres.PostgresSingleUDTOutParameterProcedure {

	private static final long serialVersionUID = -1579594554;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord> ADDRESS = new org.jooq.impl.ParameterImpl<org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord>("address", org.jooq.test.postgres.generatedclasses.udt.UAddressType.U_ADDRESS_TYPE.getDataType());

	/**
	 * Create a new procedure call instance
	 */
	public PEnhanceAddress3() {
		super(org.jooq.SQLDialect.POSTGRES, "p_enhance_address3", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);

		addInOutParameter(ADDRESS);
	}

	public void setAddress(org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord value) {
		setValue(ADDRESS, value);
	}

	public org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord getAddress() {
		return getValue(ADDRESS);
	}
}
