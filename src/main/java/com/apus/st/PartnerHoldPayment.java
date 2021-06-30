
package com.apus.st;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for partnerHoldPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="partnerHoldPayment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partnerHoldPaymentRequest" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StPimsApiPartnerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AccessToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="HoldId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="AmountInTiyin" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "partnerHoldPayment", propOrder = {
    "partnerHoldPaymentRequest"
})
public class PartnerHoldPayment {

    protected PartnerHoldPayment.PartnerHoldPaymentRequest partnerHoldPaymentRequest;

    /**
     * Gets the value of the partnerHoldPaymentRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerHoldPayment.PartnerHoldPaymentRequest }
     *     
     */
    public PartnerHoldPayment.PartnerHoldPaymentRequest getPartnerHoldPaymentRequest() {
        return partnerHoldPaymentRequest;
    }

    /**
     * Sets the value of the partnerHoldPaymentRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerHoldPayment.PartnerHoldPaymentRequest }
     *     
     */
    public void setPartnerHoldPaymentRequest(PartnerHoldPayment.PartnerHoldPaymentRequest value) {
        this.partnerHoldPaymentRequest = value;
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
     *         &lt;element name="AccessToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="HoldId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="AmountInTiyin" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "accessToken",
        "holdId",
        "amountInTiyin",
        "version",
        "lang"
    })
    public static class PartnerHoldPaymentRequest {

        @XmlElement(name = "StPimsApiPartnerKey")
        protected String stPimsApiPartnerKey;
        @XmlElement(name = "AccessToken")
        protected String accessToken;
        @XmlElement(name = "HoldId")
        protected Long holdId;
        @XmlElement(name = "AmountInTiyin")
        protected Long amountInTiyin;
        @XmlElement(name = "Version")
        protected String version;
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
         * Gets the value of the accessToken property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccessToken() {
            return accessToken;
        }

        /**
         * Sets the value of the accessToken property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccessToken(String value) {
            this.accessToken = value;
        }

        /**
         * Gets the value of the holdId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getHoldId() {
            return holdId;
        }

        /**
         * Sets the value of the holdId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setHoldId(Long value) {
            this.holdId = value;
        }

        /**
         * Gets the value of the amountInTiyin property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getAmountInTiyin() {
            return amountInTiyin;
        }

        /**
         * Sets the value of the amountInTiyin property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setAmountInTiyin(Long value) {
            this.amountInTiyin = value;
        }

        /**
         * Gets the value of the version property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVersion() {
            return version;
        }

        /**
         * Sets the value of the version property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVersion(String value) {
            this.version = value;
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
