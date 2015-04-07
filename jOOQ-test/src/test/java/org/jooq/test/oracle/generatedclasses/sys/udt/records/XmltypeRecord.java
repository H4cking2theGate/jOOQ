/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.sys.udt.records;


import java.math.BigDecimal;

import org.jooq.Configuration;
import org.jooq.Result;
import org.jooq.impl.UDTRecordImpl;
import org.jooq.test.oracle.generatedclasses.sys.udt.Xmltype;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Appendchildxml;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Createnonschemabasedxml;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Createschemabasedxml;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Createxml1;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Createxml2;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Createxml3;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Createxml4;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Createxml5;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Createxml6;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Createxml7;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Createxml8;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Createxml9;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Createxmlfrombinary;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Deletexml;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Existsnode1;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Existsnode2;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Extract1;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Extract2;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Getblobval1;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Getblobval2;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Getclobval1;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Getclobval2;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Getnamespace;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Getnumberval;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Getrootelement;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Getschemaid;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Getschemaurl;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Getstringval1;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Getstringval2;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Insertxmlbefore;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Isfragment;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Isschemabased;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Isschemavalid;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Isschemavalidated;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Schemavalidate;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Setschemavalidated;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Toobject;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Transform;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Xmltype1;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Xmltype2;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Xmltype3;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Xmltype4;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Xmltype5;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Xmltype6;
import org.jooq.test.oracle.generatedclasses.sys.udt.xmltype.Xmltype7;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XmltypeRecord extends UDTRecordImpl<XmltypeRecord> {

	private static final long serialVersionUID = 411460833;

	/**
	 * Call <code>SYS.XMLTYPE.APPENDCHILDXML</code>
	 */
	public org.jooq.test.oracle.generatedclasses.sys.udt.records.XmltypeRecord appendchildxml(String xpath, org.jooq.test.oracle.generatedclasses.sys.udt.records.XmltypeRecord valueExpr, String namespace) {
		Appendchildxml f = new Appendchildxml();
		f.setSelf(this);
		f.setXpath(xpath);
		f.setValueExpr(valueExpr);
		f.setNamespace(namespace);

		f.execute(configuration());
		return f.getReturnValue();
	}

	/**
	 * Call <code>SYS.XMLTYPE.CREATENONSCHEMABASEDXML</code>
	 */
	public org.jooq.test.oracle.generatedclasses.sys.udt.records.XmltypeRecord createnonschemabasedxml() {
		Createnonschemabasedxml f = new Createnonschemabasedxml();
		f.setSelf(this);

		f.execute(configuration());
		return f.getReturnValue();
	}

	/**
	 * Call <code>SYS.XMLTYPE.CREATESCHEMABASEDXML</code>
	 */
	public org.jooq.test.oracle.generatedclasses.sys.udt.records.XmltypeRecord createschemabasedxml(String schema) {
		Createschemabasedxml f = new Createschemabasedxml();
		f.setSelf(this);
		f.setSchema_(schema);

		f.execute(configuration());
		return f.getReturnValue();
	}

	/**
	 * Call <code>SYS.XMLTYPE.CREATEXML</code>
	 */
	public static org.jooq.test.oracle.generatedclasses.sys.udt.records.XmltypeRecord createxml1(Configuration configuration, String xmldata) {
		Createxml1 f = new Createxml1();
		f.setXmldata(xmldata);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Call <code>SYS.XMLTYPE.CREATEXML</code>
	 */
	public static org.jooq.test.oracle.generatedclasses.sys.udt.records.XmltypeRecord createxml2(Configuration configuration, String xmldata) {
		Createxml2 f = new Createxml2();
		f.setXmldata(xmldata);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Call <code>SYS.XMLTYPE.CREATEXML</code>
	 */
	public static org.jooq.test.oracle.generatedclasses.sys.udt.records.XmltypeRecord createxml3(Configuration configuration, String xmldata, String schema, Number validated, Number wellformed) {
		Createxml3 f = new Createxml3();
		f.setXmldata(xmldata);
		f.setSchema_(schema);
		f.setValidated(validated);
		f.setWellformed(wellformed);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Call <code>SYS.XMLTYPE.CREATEXML</code>
	 */
	public static org.jooq.test.oracle.generatedclasses.sys.udt.records.XmltypeRecord createxml4(Configuration configuration, byte[] xmldata, Number csid, String schema, Number validated, Number wellformed) {
		Createxml4 f = new Createxml4();
		f.setXmldata(xmldata);
		f.setCsid(csid);
		f.setSchema_(schema);
		f.setValidated(validated);
		f.setWellformed(wellformed);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Call <code>SYS.XMLTYPE.CREATEXML</code>
	 */
	public static org.jooq.test.oracle.generatedclasses.sys.udt.records.XmltypeRecord createxml5(Configuration configuration, byte[] xmldata, Number csid, String schema, Number validated, Number wellformed) {
		Createxml5 f = new Createxml5();
		f.setXmldata(xmldata);
		f.setCsid(csid);
		f.setSchema_(schema);
		f.setValidated(validated);
		f.setWellformed(wellformed);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Call <code>SYS.XMLTYPE.CREATEXML</code>
	 */
	public static org.jooq.test.oracle.generatedclasses.sys.udt.records.XmltypeRecord createxml6(Configuration configuration, String xmldata, String schema, Number validated, Number wellformed) {
		Createxml6 f = new Createxml6();
		f.setXmldata(xmldata);
		f.setSchema_(schema);
		f.setValidated(validated);
		f.setWellformed(wellformed);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Call <code>SYS.XMLTYPE.CREATEXML</code>
	 */
	public static org.jooq.test.oracle.generatedclasses.sys.udt.records.XmltypeRecord createxml7(Configuration configuration, Object xmldata, String schema, String element, Number validated) {
		Createxml7 f = new Createxml7();
		f.setXmldata(xmldata);
		f.setSchema_(schema);
		f.setElement(element);
		f.setValidated(validated);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Call <code>SYS.XMLTYPE.CREATEXML</code>
	 */
	public static org.jooq.test.oracle.generatedclasses.sys.udt.records.XmltypeRecord createxml8(Configuration configuration, Result<org.jooq.Record> xmldata, String schema, String element, Number validated) {
		Createxml8 f = new Createxml8();
		f.setXmldata(xmldata);
		f.setSchema_(schema);
		f.setElement(element);
		f.setValidated(validated);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Call <code>SYS.XMLTYPE.CREATEXML</code>
	 */
	public static org.jooq.test.oracle.generatedclasses.sys.udt.records.XmltypeRecord createxml9(Configuration configuration, Object xmldata, String schema, String element, Number validated) {
		Createxml9 f = new Createxml9();
		f.setXmldata(xmldata);
		f.setSchema_(schema);
		f.setElement(element);
		f.setValidated(validated);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Call <code>SYS.XMLTYPE.CREATEXMLFROMBINARY</code>
	 */
	public static org.jooq.test.oracle.generatedclasses.sys.udt.records.XmltypeRecord createxmlfrombinary(Configuration configuration, byte[] xmldata) {
		Createxmlfrombinary f = new Createxmlfrombinary();
		f.setXmldata(xmldata);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Call <code>SYS.XMLTYPE.DELETEXML</code>
	 */
	public org.jooq.test.oracle.generatedclasses.sys.udt.records.XmltypeRecord deletexml(String xpath, String namespace) {
		Deletexml f = new Deletexml();
		f.setSelf(this);
		f.setXpath(xpath);
		f.setNamespace(namespace);

		f.execute(configuration());
		return f.getReturnValue();
	}

	/**
	 * Call <code>SYS.XMLTYPE.EXISTSNODE</code>
	 */
	public BigDecimal existsnode1(String xpath) {
		Existsnode1 f = new Existsnode1();
		f.setSelf(this);
		f.setXpath(xpath);

		f.execute(configuration());
		return f.getReturnValue();
	}

	/**
	 * Call <code>SYS.XMLTYPE.EXISTSNODE</code>
	 */
	public BigDecimal existsnode2(String xpath, String nsmap) {
		Existsnode2 f = new Existsnode2();
		f.setSelf(this);
		f.setXpath(xpath);
		f.setNsmap(nsmap);

		f.execute(configuration());
		return f.getReturnValue();
	}

	/**
	 * Call <code>SYS.XMLTYPE.EXTRACT</code>
	 */
	public org.jooq.test.oracle.generatedclasses.sys.udt.records.XmltypeRecord extract1(String xpath) {
		Extract1 f = new Extract1();
		f.setSelf(this);
		f.setXpath(xpath);

		f.execute(configuration());
		return f.getReturnValue();
	}

	/**
	 * Call <code>SYS.XMLTYPE.EXTRACT</code>
	 */
	public org.jooq.test.oracle.generatedclasses.sys.udt.records.XmltypeRecord extract2(String xpath, String nsmap) {
		Extract2 f = new Extract2();
		f.setSelf(this);
		f.setXpath(xpath);
		f.setNsmap(nsmap);

		f.execute(configuration());
		return f.getReturnValue();
	}

	/**
	 * Call <code>SYS.XMLTYPE.GETBLOBVAL</code>
	 */
	public byte[] getblobval1(Number csid) {
		Getblobval1 f = new Getblobval1();
		f.setSelf(this);
		f.setCsid(csid);

		f.execute(configuration());
		return f.getReturnValue();
	}

	/**
	 * Call <code>SYS.XMLTYPE.GETBLOBVAL</code>
	 */
	public byte[] getblobval2(Number csid, Number pflag, Number indent) {
		Getblobval2 f = new Getblobval2();
		f.setSelf(this);
		f.setCsid(csid);
		f.setPflag(pflag);
		f.setIndent(indent);

		f.execute(configuration());
		return f.getReturnValue();
	}

	/**
	 * Call <code>SYS.XMLTYPE.GETCLOBVAL</code>
	 */
	public String getclobval1() {
		Getclobval1 f = new Getclobval1();
		f.setSelf(this);

		f.execute(configuration());
		return f.getReturnValue();
	}

	/**
	 * Call <code>SYS.XMLTYPE.GETCLOBVAL</code>
	 */
	public String getclobval2(Number pflag, Number indent) {
		Getclobval2 f = new Getclobval2();
		f.setSelf(this);
		f.setPflag(pflag);
		f.setIndent(indent);

		f.execute(configuration());
		return f.getReturnValue();
	}

	/**
	 * Call <code>SYS.XMLTYPE.GETNAMESPACE</code>
	 */
	public String getnamespace() {
		Getnamespace f = new Getnamespace();
		f.setSelf(this);

		f.execute(configuration());
		return f.getReturnValue();
	}

	/**
	 * Call <code>SYS.XMLTYPE.GETNUMBERVAL</code>
	 */
	public BigDecimal getnumberval() {
		Getnumberval f = new Getnumberval();
		f.setSelf(this);

		f.execute(configuration());
		return f.getReturnValue();
	}

	/**
	 * Call <code>SYS.XMLTYPE.GETROOTELEMENT</code>
	 */
	public String getrootelement() {
		Getrootelement f = new Getrootelement();
		f.setSelf(this);

		f.execute(configuration());
		return f.getReturnValue();
	}

	/**
	 * Call <code>SYS.XMLTYPE.GETSCHEMAID</code>
	 */
	public byte[] getschemaid() {
		Getschemaid f = new Getschemaid();
		f.setSelf(this);

		f.execute(configuration());
		return f.getReturnValue();
	}

	/**
	 * Call <code>SYS.XMLTYPE.GETSCHEMAURL</code>
	 */
	public String getschemaurl() {
		Getschemaurl f = new Getschemaurl();
		f.setSelf(this);

		f.execute(configuration());
		return f.getReturnValue();
	}

	/**
	 * Call <code>SYS.XMLTYPE.GETSTRINGVAL</code>
	 */
	public String getstringval1() {
		Getstringval1 f = new Getstringval1();
		f.setSelf(this);

		f.execute(configuration());
		return f.getReturnValue();
	}

	/**
	 * Call <code>SYS.XMLTYPE.GETSTRINGVAL</code>
	 */
	public String getstringval2(Number pflag, Number indent) {
		Getstringval2 f = new Getstringval2();
		f.setSelf(this);
		f.setPflag(pflag);
		f.setIndent(indent);

		f.execute(configuration());
		return f.getReturnValue();
	}

	/**
	 * Call <code>SYS.XMLTYPE.INSERTXMLBEFORE</code>
	 */
	public org.jooq.test.oracle.generatedclasses.sys.udt.records.XmltypeRecord insertxmlbefore(String xpath, org.jooq.test.oracle.generatedclasses.sys.udt.records.XmltypeRecord valueExpr, String namespace) {
		Insertxmlbefore f = new Insertxmlbefore();
		f.setSelf(this);
		f.setXpath(xpath);
		f.setValueExpr(valueExpr);
		f.setNamespace(namespace);

		f.execute(configuration());
		return f.getReturnValue();
	}

	/**
	 * Call <code>SYS.XMLTYPE.ISFRAGMENT</code>
	 */
	public BigDecimal isfragment() {
		Isfragment f = new Isfragment();
		f.setSelf(this);

		f.execute(configuration());
		return f.getReturnValue();
	}

	/**
	 * Call <code>SYS.XMLTYPE.ISSCHEMABASED</code>
	 */
	public BigDecimal isschemabased() {
		Isschemabased f = new Isschemabased();
		f.setSelf(this);

		f.execute(configuration());
		return f.getReturnValue();
	}

	/**
	 * Call <code>SYS.XMLTYPE.ISSCHEMAVALID</code>
	 */
	public BigDecimal isschemavalid(String schurl, String elem) {
		Isschemavalid f = new Isschemavalid();
		f.setSelf(this);
		f.setSchurl(schurl);
		f.setElem(elem);

		f.execute(configuration());
		return f.getReturnValue();
	}

	/**
	 * Call <code>SYS.XMLTYPE.ISSCHEMAVALIDATED</code>
	 */
	public BigDecimal isschemavalidated() {
		Isschemavalidated f = new Isschemavalidated();
		f.setSelf(this);

		f.execute(configuration());
		return f.getReturnValue();
	}

	/**
	 * Call <code>SYS.XMLTYPE.SCHEMAVALIDATE</code>
	 */
	public org.jooq.test.oracle.generatedclasses.sys.udt.records.XmltypeRecord schemavalidate() {
		Schemavalidate p = new Schemavalidate();
		p.setSelf(this);

		p.execute(configuration());
		from(p.getSelf());
		return p.getSelf();
	}

	/**
	 * Call <code>SYS.XMLTYPE.SETSCHEMAVALIDATED</code>
	 */
	public org.jooq.test.oracle.generatedclasses.sys.udt.records.XmltypeRecord setschemavalidated(Integer flag) {
		Setschemavalidated p = new Setschemavalidated();
		p.setSelf(this);
		p.setFlag(flag);

		p.execute(configuration());
		from(p.getSelf());
		return p.getSelf();
	}

	/**
	 * Call <code>SYS.XMLTYPE.TOOBJECT</code>
	 */
	public Object toobject(String schema, String element) {
		Toobject p = new Toobject();
		p.setSelf(this);
		p.setSchema_(schema);
		p.setElement(element);

		p.execute(configuration());
		from(p.getObject());
		return p.getObject();
	}

	/**
	 * Call <code>SYS.XMLTYPE.TRANSFORM</code>
	 */
	public org.jooq.test.oracle.generatedclasses.sys.udt.records.XmltypeRecord transform(org.jooq.test.oracle.generatedclasses.sys.udt.records.XmltypeRecord xsl, String parammap) {
		Transform f = new Transform();
		f.setSelf(this);
		f.setXsl(xsl);
		f.setParammap(parammap);

		f.execute(configuration());
		return f.getReturnValue();
	}

	/**
	 * Call <code>SYS.XMLTYPE.XMLTYPE</code>
	 */
	public Xmltype1 xmltype1(String xmldata, String schema, Number validated, Number wellformed) {
		Xmltype1 p = new Xmltype1();
		p.setSelf(this);
		p.setXmldata(xmldata);
		p.setSchema_(schema);
		p.setValidated(validated);
		p.setWellformed(wellformed);

		p.execute(configuration());
		from(p.getReturnValue());
		return p;
	}

	/**
	 * Call <code>SYS.XMLTYPE.XMLTYPE</code>
	 */
	public Xmltype2 xmltype2(byte[] xmldata, Number csid, String schema, Number validated, Number wellformed) {
		Xmltype2 p = new Xmltype2();
		p.setSelf(this);
		p.setXmldata(xmldata);
		p.setCsid(csid);
		p.setSchema_(schema);
		p.setValidated(validated);
		p.setWellformed(wellformed);

		p.execute(configuration());
		from(p.getReturnValue());
		return p;
	}

	/**
	 * Call <code>SYS.XMLTYPE.XMLTYPE</code>
	 */
	public Xmltype3 xmltype3(byte[] xmldata, Number csid, String schema, Number validated, Number wellformed) {
		Xmltype3 p = new Xmltype3();
		p.setSelf(this);
		p.setXmldata(xmldata);
		p.setCsid(csid);
		p.setSchema_(schema);
		p.setValidated(validated);
		p.setWellformed(wellformed);

		p.execute(configuration());
		from(p.getReturnValue());
		return p;
	}

	/**
	 * Call <code>SYS.XMLTYPE.XMLTYPE</code>
	 */
	public Xmltype4 xmltype4(String xmldata, String schema, Number validated, Number wellformed) {
		Xmltype4 p = new Xmltype4();
		p.setSelf(this);
		p.setXmldata(xmldata);
		p.setSchema_(schema);
		p.setValidated(validated);
		p.setWellformed(wellformed);

		p.execute(configuration());
		from(p.getReturnValue());
		return p;
	}

	/**
	 * Call <code>SYS.XMLTYPE.XMLTYPE</code>
	 */
	public Xmltype5 xmltype5(Object xmldata, String schema, String element, Number validated) {
		Xmltype5 p = new Xmltype5();
		p.setSelf(this);
		p.setXmldata(xmldata);
		p.setSchema_(schema);
		p.setElement(element);
		p.setValidated(validated);

		p.execute(configuration());
		from(p.getReturnValue());
		return p;
	}

	/**
	 * Call <code>SYS.XMLTYPE.XMLTYPE</code>
	 */
	public Xmltype6 xmltype6(Object xmldata, String schema, String element, Number validated) {
		Xmltype6 p = new Xmltype6();
		p.setSelf(this);
		p.setXmldata(xmldata);
		p.setSchema_(schema);
		p.setElement(element);
		p.setValidated(validated);

		p.execute(configuration());
		from(p.getReturnValue());
		return p;
	}

	/**
	 * Call <code>SYS.XMLTYPE.XMLTYPE</code>
	 */
	public Xmltype7 xmltype7(Result<org.jooq.Record> xmldata, String schema, String element, Number validated) {
		Xmltype7 p = new Xmltype7();
		p.setSelf(this);
		p.setXmldata(xmldata);
		p.setSchema_(schema);
		p.setElement(element);
		p.setValidated(validated);

		p.execute(configuration());
		from(p.getReturnValue());
		return p;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached XmltypeRecord
	 */
	public XmltypeRecord() {
		super(Xmltype.XMLTYPE);
	}
}
