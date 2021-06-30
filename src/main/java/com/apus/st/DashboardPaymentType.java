
package com.apus.st;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dashboardPaymentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dashboardPaymentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LastPayment"/>
 *     &lt;enumeration value="FavoritePayment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dashboardPaymentType")
@XmlEnum
public enum DashboardPaymentType {

    @XmlEnumValue("LastPayment")
    LAST_PAYMENT("LastPayment"),
    @XmlEnumValue("FavoritePayment")
    FAVORITE_PAYMENT("FavoritePayment");
    private final String value;

    DashboardPaymentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DashboardPaymentType fromValue(String v) {
        for (DashboardPaymentType c: DashboardPaymentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
