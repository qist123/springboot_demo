
package org.qist.webservice.cxfclient.generated.cxf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.qist.webservice.cxfclient.generated.cxf package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetHumanInfoByNameResponse_QNAME = new QName("http://www.qist.org/webservice", "getHumanInfoByNameResponse");
    private final static QName _GetHumanListResponse_QNAME = new QName("http://www.qist.org/webservice", "getHumanListResponse");
    private final static QName _GetHumanList_QNAME = new QName("http://www.qist.org/webservice", "getHumanList");
    private final static QName _GetHumanString_QNAME = new QName("http://www.qist.org/webservice", "getHumanString");
    private final static QName _GetHumanStringResponse_QNAME = new QName("http://www.qist.org/webservice", "getHumanStringResponse");
    private final static QName _GetHumanInfoByName_QNAME = new QName("http://www.qist.org/webservice", "getHumanInfoByName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.qist.webservice.cxfclient.generated.cxf
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetHumanString }
     * 
     */
    public GetHumanString createGetHumanString() {
        return new GetHumanString();
    }

    /**
     * Create an instance of {@link GetHumanStringResponse }
     * 
     */
    public GetHumanStringResponse createGetHumanStringResponse() {
        return new GetHumanStringResponse();
    }

    /**
     * Create an instance of {@link GetHumanInfoByName }
     * 
     */
    public GetHumanInfoByName createGetHumanInfoByName() {
        return new GetHumanInfoByName();
    }

    /**
     * Create an instance of {@link GetHumanList }
     * 
     */
    public GetHumanList createGetHumanList() {
        return new GetHumanList();
    }

    /**
     * Create an instance of {@link GetHumanInfoByNameResponse }
     * 
     */
    public GetHumanInfoByNameResponse createGetHumanInfoByNameResponse() {
        return new GetHumanInfoByNameResponse();
    }

    /**
     * Create an instance of {@link GetHumanListResponse }
     * 
     */
    public GetHumanListResponse createGetHumanListResponse() {
        return new GetHumanListResponse();
    }

    /**
     * Create an instance of {@link HumanDto }
     * 
     */
    public HumanDto createHumanDto() {
        return new HumanDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHumanInfoByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.qist.org/webservice", name = "getHumanInfoByNameResponse")
    public JAXBElement<GetHumanInfoByNameResponse> createGetHumanInfoByNameResponse(GetHumanInfoByNameResponse value) {
        return new JAXBElement<GetHumanInfoByNameResponse>(_GetHumanInfoByNameResponse_QNAME, GetHumanInfoByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHumanListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.qist.org/webservice", name = "getHumanListResponse")
    public JAXBElement<GetHumanListResponse> createGetHumanListResponse(GetHumanListResponse value) {
        return new JAXBElement<GetHumanListResponse>(_GetHumanListResponse_QNAME, GetHumanListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHumanList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.qist.org/webservice", name = "getHumanList")
    public JAXBElement<GetHumanList> createGetHumanList(GetHumanList value) {
        return new JAXBElement<GetHumanList>(_GetHumanList_QNAME, GetHumanList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHumanString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.qist.org/webservice", name = "getHumanString")
    public JAXBElement<GetHumanString> createGetHumanString(GetHumanString value) {
        return new JAXBElement<GetHumanString>(_GetHumanString_QNAME, GetHumanString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHumanStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.qist.org/webservice", name = "getHumanStringResponse")
    public JAXBElement<GetHumanStringResponse> createGetHumanStringResponse(GetHumanStringResponse value) {
        return new JAXBElement<GetHumanStringResponse>(_GetHumanStringResponse_QNAME, GetHumanStringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHumanInfoByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.qist.org/webservice", name = "getHumanInfoByName")
    public JAXBElement<GetHumanInfoByName> createGetHumanInfoByName(GetHumanInfoByName value) {
        return new JAXBElement<GetHumanInfoByName>(_GetHumanInfoByName_QNAME, GetHumanInfoByName.class, null, value);
    }

}
