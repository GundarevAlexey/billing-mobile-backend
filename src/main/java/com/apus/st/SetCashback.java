
package com.apus.st;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setCashback complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setCashback">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestSetCashback" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StPimsApiPartnerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AccessToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="UzcardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EopsTransId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PartnerTransId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="TradePointId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="PayAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="CashbackAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="CashbackPercent" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
@XmlType(name = "setCashback", propOrder = {
    "requestSetCashback"
})
public class SetCashback {

    protected SetCashback.RequestSetCashback requestSetCashback;

    /**
     * Gets the value of the requestSetCashback property.
     * 
     * @return
     *     possible object is
     *     {@link SetCashback.RequestSetCashback }
     *     
     */
    public SetCashback.RequestSetCashback getRequestSetCashback() {
        return requestSetCashback;
    }

    /**
     * Sets the value of the requestSetCashback property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetCashback.RequestSetCashback }
     *     
     */
    public void setRequestSetCashback(SetCashback.RequestSetCashback value) {
        this.requestSetCashback = value;
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
     *         &lt;element name="UzcardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EopsTransId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PartnerTransId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="TradePointId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="PayAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="CashbackAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="CashbackPercent" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
        "uzcardId",
        "eopsTransId",
        "partnerTransId",
        "tradePointId",
        "payAmount",
        "cashbackAmount",
        "cashbackPercent",
        "paymentDate",
        "lang"
    })
    public static class RequestSetCashback {

        @XmlElement(name = "StPimsApiPartnerKey")
        protected String stPimsApiPartnerKey;
        @XmlElement(name = "AccessToken")
        protected String accessToken;
        @XmlElement(name = "UzcardId")
        protected String uzcardId;
        @XmlElement(name = "EopsTransId")
        protected String eopsTransId;
        @XmlElement(name = "PartnerTransId")
        protected Long partnerTransId;
        @XmlElement(name = "TradePointId")
        protected Long tradePointId;
        @XmlElement(name = "PayAmount")
        protected Long payAmount;
        @XmlElement(name = "CashbackAmount")
        protected Long cashbackAmount;
        @XmlElement(name = "CashbackPercent")
        protected Long cashbackPercent;
        @XmlElement(name = "PaymentDate")
        protected Long paymentDate;
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
         * Gets the value of the uzcardId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUzcardId() {
            return uzcardId;
        }

        /**
         * Sets the value of the uzcardId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUzcardId(String value) {
            this.uzcardId = value;
        }

        /**
         * Gets the value of the eopsTransId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEopsTransId() {
            return eopsTransId;
        }

        /**
         * Sets the value of the eopsTransId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEopsTransId(String value) {
            this.eopsTransId = value;
        }

        /**
         * Gets the value of the partnerTransId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getPartnerTransId() {
            return partnerTransId;
        }

        /**
         * Sets the value of the partnerTransId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setPartnerTransId(Long value) {
            this.partnerTransId = value;
        }

        /**
         * Gets the value of the tradePointId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getTradePointId() {
            return tradePointId;
        }

        /**
         * Sets the value of the tradePointId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setTradePointId(Long value) {
            this.tradePointId = value;
        }

        /**
         * Gets the value of the payAmount property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getPayAmount() {
            return payAmount;
        }

        /**
         * Sets the value of the payAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setPayAmount(Long value) {
            this.payAmount = value;
        }

        /**
         * Gets the value of the cashbackAmount property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getCashbackAmount() {
            return cashbackAmount;
        }

        /**
         * Sets the value of the cashbackAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setCashbackAmount(Long value) {
            this.cashbackAmount = value;
        }

        /**
         * Gets the value of the cashbackPercent property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getCashbackPercent() {
            return cashbackPercent;
        }

        /**
         * Sets the value of the cashbackPercent property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setCashbackPercent(Long value) {
            this.cashbackPercent = value;
        }

        /**
         * Gets the value of the paymentDate property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getPaymentDate() {
            return paymentDate;
        }

        /**
         * Sets the value of the paymentDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setPaymentDate(Long value) {
            this.paymentDate = value;
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
