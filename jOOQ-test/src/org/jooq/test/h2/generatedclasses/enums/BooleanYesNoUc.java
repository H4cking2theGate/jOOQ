/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.enums;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public enum BooleanYesNoUc implements org.jooq.EnumType {
	YES("YES"),

	NO("NO"),

	;

	private final java.lang.String literal;

	private BooleanYesNoUc(java.lang.String literal) {
		this.literal = literal;
	}

	@Override
	public java.lang.String getName() {
		return "BOOLEAN_YES_NO_UC";
	}

	@Override
	public java.lang.String getLiteral() {
		return literal;
	}
}
