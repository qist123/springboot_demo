
package org.qist.webservice.cxfclient.generated.cxf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>sex的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="sex">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MALE"/>
 *     &lt;enumeration value="FEMALE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "sex")
@XmlEnum
public enum Sex {

    MALE,
    FEMALE;

    public String value() {
        return name();
    }

    public static Sex fromValue(String v) {
        return valueOf(v);
    }

}
