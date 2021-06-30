
package com.apus.st;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for testConfirmRegistration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="testConfirmRegistration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="testConfirmRegistrationRequest" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StPimsApiPartnerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RegistrationOtp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RegisterTransactionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="UserPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ColorId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "testConfirmRegistration", propOrder = {
    "testConfirmRegistrationRequest"
})
public class TestConfirmRegistration {

    protected TestConfirmRegistration.TestConfirmRegistrationRequest testConfirmRegistrationRequest;

    /**
     * Gets the value of the testConfirmRegistrationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link TestConfirmRegistration.TestConfirmRegistrationRequest }
     *     
     */
    public TestConfirmRegistration.TestConfirmRegistrationRequest getTestConfirmRegistrationRequest() {
        return testConfirmRegistrationRequest;
    }

    /**
     * Sets the value of the testConfirmRegistrationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestConfirmRegistration.TestConfirmRegistrationRequest }
     *     
     */
    public void setTestConfirmRegistrationRequest(TestConfirmRegistration.TestConfirmRegistrationRequest value) {
        this.testConfirmRegistrationRequest = value;
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
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RegistrationOtp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RegisterTransactionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="UserPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ColorId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        "name",
        "sureName",
        "middleName",
        "email",
        "registrationOtp",
        "registerTransactionId",
        "userPassword",
        "cardName",
        "colorId",
        "lang"
    })
    public static class TestConfirmRegistrationRequest {

        @XmlElement(name = "StPimsApiPartnerKey")
        protected String stPimsApiPartnerKey;
        @XmlElement(name = "Name")
        protected String name;
        @XmlElement(name = "SureName")
        protected String sureName;
        @XmlElement(name = "MiddleName")
        protected String middleName;
        @XmlElement(name = "Email")
        protected String email;
        @XmlElement(name = "RegistrationOtp")
        protected String registrationOtp;
        @XmlElement(name = "RegisterTransactionId")
        protected Long registerTransactionId;
        @XmlElement(name = "UserPassword")
        protected String userPassword;
        @XmlElement(name = "CardName")
        protected String cardName;
        @XmlElement(name = "ColorId")
        protected Integer colorId;
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
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the sureName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSureName() {
            return sureName;
        }

        /**
         * Sets the value of the sureName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSureName(String value) {
            this.sureName = value;
        }

        /**
         * Gets the value of the middleName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMiddleName() {
            return middleName;
        }

        /**
         * Sets the value of the middleName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMiddleName(String value) {
            this.middleName = value;
        }

        /**
         * Gets the value of the email property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmail() {
            return email;
        }

        /**
         * Sets the value of the email property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmail(String value) {
            this.email = value;
        }

        /**
         * Gets the value of the registrationOtp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegistrationOtp() {
            return registrationOtp;
        }

        /**
         * Sets the value of the registrationOtp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegistrationOtp(String value) {
            this.registrationOtp = value;
        }

        /**
         * Gets the value of the registerTransactionId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getRegisterTransactionId() {
            return registerTransactionId;
        }

        /**
         * Sets the value of the registerTransactionId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setRegisterTransactionId(Long value) {
            this.registerTransactionId = value;
        }

        /**
         * Gets the value of the userPassword property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserPassword() {
            return userPassword;
        }

        /**
         * Sets the value of the userPassword property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserPassword(String value) {
            this.userPassword = value;
        }

        /**
         * Gets the value of the cardName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardName() {
            return cardName;
        }

        /**
         * Sets the value of the cardName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardName(String value) {
            this.cardName = value;
        }

        /**
         * Gets the value of the colorId property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getColorId() {
            return colorId;
        }

        /**
         * Sets the value of the colorId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setColorId(Integer value) {
            this.colorId = value;
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
