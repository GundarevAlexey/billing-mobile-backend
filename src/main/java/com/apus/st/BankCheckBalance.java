
package com.apus.st;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bankCheckBalance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bankCheckBalance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bankCheckBalanceRequest" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StPimsApiPartnerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Lang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bankCheckBalance", propOrder = {
    "bankCheckBalanceRequest"
})
public class BankCheckBalance {

    protected BankCheckBalance.BankCheckBalanceRequest bankCheckBalanceRequest;

    /**
     * Gets the value of the bankCheckBalanceRequest property.
     * 
     * @return
     *     possible object is
     *     {@link BankCheckBalance.BankCheckBalanceRequest }
     *     
     */
    public BankCheckBalance.BankCheckBalanceRequest getBankCheckBalanceRequest() {
        return bankCheckBalanceRequest;
    }

    /**
     * Sets the value of the bankCheckBalanceRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankCheckBalance.BankCheckBalanceRequest }
     *     
     */
    public void setBankCheckBalanceRequest(BankCheckBalance.BankCheckBalanceRequest value) {
        this.bankCheckBalanceRequest = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="StPimsApiPartnerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Lang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "stPimsApiPartnerKey",
        "username",
        "password",
        "lang"
    })
    public static class BankCheckBalanceRequest {

        @XmlElement(name = "StPimsApiPartnerKey")
        protected String stPimsApiPartnerKey;
        @XmlElement(name = "Username")
        protected String username;
        @XmlElement(name = "Password")
        protected String password;
        @XmlElement(name = "Lang")
        protected String lang;

        /**
         * Gets the value of the stPimsApiPartnerKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStPimsApiPartnerKey() {
            return stPimsApiPartnerKey;
        }

        /**
         * Sets the value of the stPimsApiPartnerKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStPimsApiPartnerKey(String value) {
            this.stPimsApiPartnerKey = value;
        }

        /**
         * Gets the value of the username property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsername() {
            return username;
        }

        /**
         * Sets the value of the username property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsername(String value) {
            this.username = value;
        }

        /**
         * Gets the value of the password property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPassword() {
            return password;
        }

        /**
         * Sets the value of the password property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPassword(String value) {
            this.password = value;
        }

        /**
         * Gets the value of the lang property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLang() {
            return lang;
        }

        /**
         * Sets the value of the lang property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLang(String value) {
            this.lang = value;
        }

    }

}
