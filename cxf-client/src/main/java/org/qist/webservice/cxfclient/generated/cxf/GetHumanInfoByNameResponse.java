
package org.qist.webservice.cxfclient.generated.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getHumanInfoByNameResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getHumanInfoByNameResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://www.qist.org/webservice}humanDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getHumanInfoByNameResponse", propOrder = {
    "_return"
})
public class GetHumanInfoByNameResponse {

    @XmlElement(name = "return")
    protected HumanDto _return;

    /**
     * 获取return属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HumanDto }
     *     
     */
    public HumanDto getReturn() {
        return _return;
    }

    /**
     * 设置return属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HumanDto }
     *     
     */
    public void setReturn(HumanDto value) {
        this._return = value;
    }

}
