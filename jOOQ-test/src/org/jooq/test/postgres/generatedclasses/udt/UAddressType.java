/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.udt;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class UAddressType extends org.jooq.impl.UDTImpl<org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord> {

	private static final long serialVersionUID = 1174800253;

	/**
	 * The singleton instance of <code>public.u_address_type</code>
	 */
	public static final org.jooq.test.postgres.generatedclasses.udt.UAddressType U_ADDRESS_TYPE = new org.jooq.test.postgres.generatedclasses.udt.UAddressType();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord> getRecordType() {
		return org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord.class;
	}

	/**
	 * The attribute <code>public.u_address_type.street</code>. 
	 */
	public static final org.jooq.UDTField<org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord, org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord> STREET = createField("street", org.jooq.test.postgres.generatedclasses.udt.UStreetType.U_STREET_TYPE.getDataType(), U_ADDRESS_TYPE);

	/**
	 * The attribute <code>public.u_address_type.zip</code>. 
	 */
	public static final org.jooq.UDTField<org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord, java.lang.String> ZIP = createField("zip", org.jooq.impl.SQLDataType.VARCHAR.length(50), U_ADDRESS_TYPE);

	/**
	 * The attribute <code>public.u_address_type.city</code>. 
	 */
	public static final org.jooq.UDTField<org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord, java.lang.String> CITY = createField("city", org.jooq.impl.SQLDataType.VARCHAR.length(50), U_ADDRESS_TYPE);

	/**
	 * The attribute <code>public.u_address_type.country</code>. 
	 */
	public static final org.jooq.UDTField<org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord, org.jooq.test.postgres.generatedclasses.enums.UCountry> COUNTRY = createField("country", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(org.jooq.test.postgres.generatedclasses.enums.UCountry.class), U_ADDRESS_TYPE);

	/**
	 * The attribute <code>public.u_address_type.since</code>. 
	 */
	public static final org.jooq.UDTField<org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord, java.sql.Date> SINCE = createField("since", org.jooq.impl.SQLDataType.DATE, U_ADDRESS_TYPE);

	/**
	 * The attribute <code>public.u_address_type.code</code>. 
	 */
	public static final org.jooq.UDTField<org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord, java.lang.Integer> CODE = createField("code", org.jooq.impl.SQLDataType.INTEGER, U_ADDRESS_TYPE);

	/**
	 * The attribute <code>public.u_address_type.f_1323</code>. 
	 */
	public static final org.jooq.UDTField<org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord, byte[]> F_1323 = createField("f_1323", org.jooq.impl.SQLDataType.BLOB, U_ADDRESS_TYPE);

	/**
	 * No further instances allowed
	 */
	private UAddressType() {
		super("u_address_type", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);

		// Initialise data type
		getDataType();
	}
}
