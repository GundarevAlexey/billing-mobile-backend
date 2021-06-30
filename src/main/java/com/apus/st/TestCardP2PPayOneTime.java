
package com.apus.st;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for testCardP2PPayOneTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="testCardP2PPayOneTime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestTestCardP2PPayOneTime" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StPimsApiPartnerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AccessToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PayerCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PayerCardExDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ReceiverCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Summa" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="AmountInTiyin" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
@XmlType(name = "testCardP2PPayOneTime", propOrder = {
    "requestTestCardP2PPayOneTime"
})
public class TestCardP2PPayOneTime {

    protected TestCardP2PPayOneTime.RequestTestCardP2PPayOneTime requestTestCardP2PPayOneTime;

    /**
     * Gets the value of the requestTestCardP2PPayOneTime property.
     * 
     * @return
     *     possible object is
     *     {@link TestCardP2PPayOneTime.RequestTestCardP2PPayOneTime }
     *     
     */
    public TestCardP2PPayOneTime.RequestTestCardP2PPayOneTime getRequestTestCardP2PPayOneTime() {
        return requestTestCardP2PPayOneTime;
    }

    /**
     * Sets the value of the requestTestCardP2PPayOneTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestCardP2PPayOneTime.RequestTestCardP2PPayOneTime }
     *     
     */
    public void setRequestTestCardP2PPayOneTime(TestCardP2PPayOneTime.RequestTestCardP2PPayOneTime value) {
        this.requestTestCardP2PPayOneTime = value;
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
     *         &lt;element name="PayerCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PayerCardExDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ReceiverCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Summa" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="AmountInTiyin" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
        "payerCardNumber",
        "payerCardExDate",
        "receiverCardNumber",
        "summa",
        "amountInTiyin",
        "lang"
    })
    public static class RequestTestCardP2PPayOneTime {

        @XmlElement(name = "StPimsApiPartnerKey")
        protected String stPimsApiPartnerKey;
        @XmlElement(name = "AccessToken")
        protected String accessToken;
        @XmlElement(name = "PayerCardNumber")
        protected String payerCardNumber;
        @XmlElement(name = "PayerCardExDate")
        protected String payerCardExDate;
        @XmlElement(name = "ReceiverCardNumber")
        protected String receiverCardNumber;
        @XmlElement(name = "Summa")
        protected Integer summa;
        @XmlElement(name = "AmountInTiyin")
        protected Long amountInTiyin;
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
         * Gets the value of the payerCardNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPayerCardNumber() {
            return payerCardNumber;
        }

        /**
         * Sets the value of the payerCardNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPayerCardNumber(String value) {
            this.payerCardNumber = value;
        }

        /**
         * Gets the value of the payerCardExDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPayerCardExDate() {
            return payerCardExDate;
        }

        /**
         * Sets the value of the payerCardExDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPayerCardExDate(String value) {
            this.payerCardExDate = value;
        }

        /**
         * Gets the value of the receiverCardNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReceiverCardNumber() {
            return receiverCardNumber;
        }

        /**
         * Sets the value of the receiverCardNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReceiverCardNumber(String value) {
            this.receiverCardNumber = value;
        }

        /**
         * Gets the value of the summa property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSumma() {
            return summa;
        }

        /**
         * Sets the value of the summa property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSumma(Integer value) {
            this.summa = value;
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
