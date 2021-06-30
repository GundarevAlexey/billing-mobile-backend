
package com.apus.st;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paymentOneTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paymentOneTime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentOneTimeRequest" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StPimsApiPartnerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CardExpireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ServiceId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PaymentDateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PaymentDateTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RegionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SubRegionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PersonalAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PaymentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Uid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PartnerTransId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PartnerDate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="UzcardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CardType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "paymentOneTime", propOrder = {
    "paymentOneTimeRequest"
})
public class PaymentOneTime {

    @XmlElement(name = "PaymentOneTimeRequest")
    protected PaymentOneTime.PaymentOneTimeRequest paymentOneTimeRequest;

    /**
     * Gets the value of the paymentOneTimeRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentOneTime.PaymentOneTimeRequest }
     *     
     */
    public PaymentOneTime.PaymentOneTimeRequest getPaymentOneTimeRequest() {
        return paymentOneTimeRequest;
    }

    /**
     * Sets the value of the paymentOneTimeRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentOneTime.PaymentOneTimeRequest }
     *     
     */
    public void setPaymentOneTimeRequest(PaymentOneTime.PaymentOneTimeRequest value) {
        this.paymentOneTimeRequest = value;
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
     *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CardExpireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ServiceId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PaymentDateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PaymentDateTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RegionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SubRegionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PersonalAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PaymentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Uid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PartnerTransId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PartnerDate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="UzcardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CardType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        "phoneNumber",
        "cardNumber",
        "cardExpireDate",
        "serviceId",
        "serviceType",
        "paymentType",
        "paymentDateFrom",
        "paymentDateTo",
        "regionId",
        "subRegionId",
        "personalAccount",
        "paymentAmount",
        "uid",
        "partnerTransId",
        "partnerDate",
        "uzcardId",
        "cardType",
        "lang"
    })
    public static class PaymentOneTimeRequest {

        @XmlElement(name = "StPimsApiPartnerKey")
        protected String stPimsApiPartnerKey;
        @XmlElement(name = "PhoneNumber")
        protected String phoneNumber;
        @XmlElement(name = "CardNumber")
        protected String cardNumber;
        @XmlElement(name = "CardExpireDate")
        protected String cardExpireDate;
        @XmlElement(name = "ServiceId")
        protected Integer serviceId;
        @XmlElement(name = "ServiceType")
        protected Integer serviceType;
        @XmlElement(name = "PaymentType")
        protected String paymentType;
        @XmlElement(name = "PaymentDateFrom")
        protected String paymentDateFrom;
        @XmlElement(name = "PaymentDateTo")
        protected String paymentDateTo;
        @XmlElement(name = "RegionId")
        protected String regionId;
        @XmlElement(name = "SubRegionId")
        protected String subRegionId;
        @XmlElement(name = "PersonalAccount")
        protected String personalAccount;
        @XmlElement(name = "PaymentAmount")
        protected String paymentAmount;
        @XmlElement(name = "Uid")
        protected String uid;
        @XmlElement(name = "PartnerTransId")
        protected String partnerTransId;
        @XmlElement(name = "PartnerDate")
        protected Long partnerDate;
        @XmlElement(name = "UzcardId")
        protected String uzcardId;
        @XmlElement(name = "CardType")
        protected Integer cardType;
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
         * Gets the value of the phoneNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneNumber() {
            return phoneNumber;
        }

        /**
         * Sets the value of the phoneNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneNumber(String value) {
            this.phoneNumber = value;
        }

        /**
         * Gets the value of the cardNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardNumber() {
            return cardNumber;
        }

        /**
         * Sets the value of the cardNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardNumber(String value) {
            this.cardNumber = value;
        }

        /**
         * Gets the value of the cardExpireDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardExpireDate() {
            return cardExpireDate;
        }

        /**
         * Sets the value of the cardExpireDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardExpireDate(String value) {
            this.cardExpireDate = value;
        }

        /**
         * Gets the value of the serviceId property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getServiceId() {
            return serviceId;
        }

        /**
         * Sets the value of the serviceId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setServiceId(Integer value) {
            this.serviceId = value;
        }

        /**
         * Gets the value of the serviceType property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getServiceType() {
            return serviceType;
        }

        /**
         * Sets the value of the serviceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setServiceType(Integer value) {
            this.serviceType = value;
        }

        /**
         * Gets the value of the paymentType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentType() {
            return paymentType;
        }

        /**
         * Sets the value of the paymentType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentType(String value) {
            this.paymentType = value;
        }

        /**
         * Gets the value of the paymentDateFrom property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentDateFrom() {
            return paymentDateFrom;
        }

        /**
         * Sets the value of the paymentDateFrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentDateFrom(String value) {
            this.paymentDateFrom = value;
        }

        /**
         * Gets the value of the paymentDateTo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentDateTo() {
            return paymentDateTo;
        }

        /**
         * Sets the value of the paymentDateTo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentDateTo(String value) {
            this.paymentDateTo = value;
        }

        /**
         * Gets the value of the regionId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegionId() {
            return regionId;
        }

        /**
         * Sets the value of the regionId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegionId(String value) {
            this.regionId = value;
        }

        /**
         * Gets the value of the subRegionId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubRegionId() {
            return subRegionId;
        }

        /**
         * Sets the value of the subRegionId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubRegionId(String value) {
            this.subRegionId = value;
        }

        /**
         * Gets the value of the personalAccount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPersonalAccount() {
            return personalAccount;
        }

        /**
         * Sets the value of the personalAccount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPersonalAccount(String value) {
            this.personalAccount = value;
        }

        /**
         * Gets the value of the paymentAmount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentAmount() {
            return paymentAmount;
        }

        /**
         * Sets the value of the paymentAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentAmount(String value) {
            this.paymentAmount = value;
        }

        /**
         * Gets the value of the uid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUid() {
            return uid;
        }

        /**
         * Sets the value of the uid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUid(String value) {
            this.uid = value;
        }

        /**
         * Gets the value of the partnerTransId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPartnerTransId() {
            return partnerTransId;
        }

        /**
         * Sets the value of the partnerTransId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPartnerTransId(String value) {
            this.partnerTransId = value;
        }

        /**
         * Gets the value of the partnerDate property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getPartnerDate() {
            return partnerDate;
        }

        /**
         * Sets the value of the partnerDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setPartnerDate(Long value) {
            this.partnerDate = value;
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
         * Gets the value of the cardType property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCardType() {
            return cardType;
        }

        /**
         * Sets the value of the cardType property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCardType(Integer value) {
            this.cardType = value;
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