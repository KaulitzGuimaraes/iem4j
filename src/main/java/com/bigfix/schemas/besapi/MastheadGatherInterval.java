
package com.bigfix.schemas.besapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MastheadGatherInterval.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MastheadGatherInterval">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="Fifteen Minutes"/>
 *     &lt;enumeration value="Half Hour"/>
 *     &lt;enumeration value="Hour"/>
 *     &lt;enumeration value="Eight Hours"/>
 *     &lt;enumeration value="Half Day"/>
 *     &lt;enumeration value="Day"/>
 *     &lt;enumeration value="Two Days"/>
 *     &lt;enumeration value="Week"/>
 *     &lt;enumeration value="Two Weeks"/>
 *     &lt;enumeration value="Month"/>
 *     &lt;enumeration value="Two Months"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MastheadGatherInterval")
@XmlEnum
public enum MastheadGatherInterval {

    @XmlEnumValue("Fifteen Minutes")
    FIFTEEN_MINUTES("Fifteen Minutes"),
    @XmlEnumValue("Half Hour")
    HALF_HOUR("Half Hour"),
    @XmlEnumValue("Hour")
    HOUR("Hour"),
    @XmlEnumValue("Eight Hours")
    EIGHT_HOURS("Eight Hours"),
    @XmlEnumValue("Half Day")
    HALF_DAY("Half Day"),
    @XmlEnumValue("Day")
    DAY("Day"),
    @XmlEnumValue("Two Days")
    TWO_DAYS("Two Days"),
    @XmlEnumValue("Week")
    WEEK("Week"),
    @XmlEnumValue("Two Weeks")
    TWO_WEEKS("Two Weeks"),
    @XmlEnumValue("Month")
    MONTH("Month"),
    @XmlEnumValue("Two Months")
    TWO_MONTHS("Two Months");
    private final String value;

    MastheadGatherInterval(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MastheadGatherInterval fromValue(String v) {
        for (MastheadGatherInterval c: MastheadGatherInterval.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
