
package com.apus.st;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paymentOneTimeVisa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paymentOneTimeVisa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paymentOneTimeVisaRequest" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StPimsApiPartnerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CardExpireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CardCVC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CardHolderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ServiceId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="RegionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SubRegionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PersonalAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PaymentAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PaymentDateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PaymentDateTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PartnerTrxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PartnerTrxDate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="NotifyUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "paymentOneTimeVisa", propOrder = {
    "paymentOneTimeVisaRequest"
})
public class PaymentOneTimeVisa {

    protected PaymentOneTimeVisa.PaymentOneTimeVisaRequest paymentOneTimeVisaRequest;

    /**
     * Gets the value of the paymentOneTimeVisaRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentOneTimeVisa.PaymentOneTimeVisaRequest }
     *     
     */
    public PaymentOneTimeVisa.PaymentOneTimeVisaRequest getPaymentOneTimeVisaRequest() {
        return paymentOneTimeVisaRequest;
    }

    /**
     * Sets the value of the paymentOneTimeVisaRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentOneTimeVisa.PaymentOneTimeVisaRequest }
     *     
     */
    public void setPaymentOneTimeVisaRequest(PaymentOneTimeVisa.PaymentOneTimeVisaRequest value) {
        this.paymentOneTimeVisaRequest = value;
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
     *         &lt;element name="CardCVC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CardHolderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ServiceId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="RegionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SubRegionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PersonalAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PaymentAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PaymentDateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PaymentDateTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PartnerTrxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PartnerTrxDate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="NotifyUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "cardCVC",
        "cardHolderName",
        "serviceId",
        "regionId",
        "subRegionId",
        "personalAccount",
        "paymentAmount",
        "paymentType",
        "paymentDateFrom",
        "paymentDateTo",
        "partnerTrxId",
        "partnerTrxDate",
        "notifyUrl",
        "lang"
    })
    public static class PaymentOneTimeVisaRequest {

        @XmlElement(name = "StPimsApiPartnerKey")
        protected String stPimsApiPartnerKey;
        @XmlElement(name = "PhoneNumber")
        protected String phoneNumber;
        @XmlElement(name = "CardNumber")
        protected String cardNumber;
        @XmlElement(name = "CardExpireDate")
        protected String cardExpireDate;
        @XmlElement(name = "CardCVC")
        protected String cardCVC;
        @XmlElement(name = "CardHolderName")
        protected String cardHolderName;
        @XmlElement(name = "ServiceId")
        protected Integer serviceId;
        @XmlElement(name = "RegionId")
        protected String regionId;
        @XmlElement(name = "SubRegionId")
        protected String subRegionId;
        @XmlElement(name = "PersonalAccount")
        protected String personalAccount;
        @XmlElement(name = "PaymentAmount")
        protected Long paymentAmount;
        @XmlElement(name = "PaymentType")
        protected String paymentType;
        @XmlElement(name = "PaymentDateFrom")
        protected String paymentDateFrom;
        @XmlElement(name = "PaymentDateTo")
        protected String paymentDateTo;
        @XmlElement(name = "PartnerTrxId")
        protected String partnerTrxId;
        @XmlElement(name = "PartnerTrxDate")
        protected Long partnerTrxDate;
        @XmlElement(name = "NotifyUrl")
        protected String notifyUrl;
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
         * Gets the value of the cardCVC property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardCVC() {
            return cardCVC;
        }

        /**
         * Sets the value of the cardCVC property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardCVC(String value) {
            this.cardCVC = value;
        }

        /**
         * Gets the value of the cardHolderName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardHolderName() {
            return cardHolderName;
        }

        /**
         * Sets the value of the cardHolderName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardHolderName(String value) {
            this.cardHolderName = value;
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
         *     {@link Long }
         *     
         */
        public Long getPaymentAmount() {
            return paymentAmount;
        }

        /**
         * Sets the value of the paymentAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setPaymentAmount(Long value) {
            this.paymentAmount = value;
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
         * Gets the value of the partnerTrxId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPartnerTrxId() {
            return partnerTrxId;
        }

        /**
         * Sets the value of the partnerTrxId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPartnerTrxId(String value) {
            this.partnerTrxId = value;
        }

        /**
         * Gets the value of the partnerTrxDate property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getPartnerTrxDate() {
            return partnerTrxDate;
        }

        /**
         * Sets the value of the partnerTrxDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setPartnerTrxDate(Long value) {
            this.partnerTrxDate = value;
        }

        /**
         * Gets the value of the notifyUrl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNotifyUrl() {
            return notifyUrl;
        }

        /**
         * Sets the value of the notifyUrl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNotifyUrl(String value) {
            this.notifyUrl = value;
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
