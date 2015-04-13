
package com.bigfix.schemas.besapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelevanceValueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RelevanceValueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="boolean"/>
 *     &lt;enumeration value="integer"/>
 *     &lt;enumeration value="string"/>
 *     &lt;enumeration value="utf8 string"/>
 *     &lt;enumeration value="time"/>
 *     &lt;enumeration value="floating point"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RelevanceValueType")
@XmlEnum
public enum RelevanceValueType {

    @XmlEnumValue("boolean")
    BOOLEAN("boolean"),
    @XmlEnumValue("integer")
    INTEGER("integer"),
    @XmlEnumValue("string")
    STRING("string"),
    @XmlEnumValue("utf8 string")
    UTF_8_STRING("utf8 string"),
    @XmlEnumValue("time")
    TIME("time"),
    @XmlEnumValue("floating point")
    FLOATING_POINT("floating point");
    private final String value;

    RelevanceValueType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelevanceValueType fromValue(String v) {
        for (RelevanceValueType c: RelevanceValueType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
