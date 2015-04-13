//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.12 at 04:20:59 PM CDT 
//


package com.bigfix.schemas.bes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrueFalseComparison.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrueFalseComparison">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="IsTrue"/>
 *     &lt;enumeration value="IsFalse"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrueFalseComparison")
@XmlEnum
public enum TrueFalseComparison {

    @XmlEnumValue("IsTrue")
    IS_TRUE("IsTrue"),
    @XmlEnumValue("IsFalse")
    IS_FALSE("IsFalse");
    private final String value;

    TrueFalseComparison(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrueFalseComparison fromValue(String v) {
        for (TrueFalseComparison c: TrueFalseComparison.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
