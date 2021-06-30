
package com.apus.st;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for registerUserConfirm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registerUserConfirm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="registerUserConfirmRequest" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StPimsApiPartnerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ConfirmId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="VerifyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "registerUserConfirm", propOrder = {
    "registerUserConfirmRequest"
})
public class RegisterUserConfirm {

    protected RegisterUserConfirm.RegisterUserConfirmRequest registerUserConfirmRequest;

    /**
     * Gets the value of the registerUserConfirmRequest property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterUserConfirm.RegisterUserConfirmRequest }
     *     
     */
    public RegisterUserConfirm.RegisterUserConfirmRequest getRegisterUserConfirmRequest() {
        return registerUserConfirmRequest;
    }

    /**
     * Sets the value of the registerUserConfirmRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterUserConfirm.RegisterUserConfirmRequest }
     *     
     */
    public void setRegisterUserConfirmRequest(RegisterUserConfirm.RegisterUserConfirmRequest value) {
        this.registerUserConfirmRequest = value;
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
     *         &lt;element name="ConfirmId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="VerifyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "confirmId",
        "verifyCode",
        "version",
        "lang"
    })
    public static class RegisterUserConfirmRequest {

        @XmlElement(name = "StPimsApiPartnerKey")
        protected String stPimsApiPartnerKey;
        @XmlElement(name = "ConfirmId")
        protected Long confirmId;
        @XmlElement(name = "VerifyCode")
        protected String verifyCode;
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
         * Gets the value of the confirmId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getConfirmId() {
            return confirmId;
        }

        /**
         * Sets the value of the confirmId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setConfirmId(Long value) {
            this.confirmId = value;
        }

        /**
         * Gets the value of the verifyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVerifyCode() {
            return verifyCode;
        }

        /**
         * Sets the value of the verifyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVerifyCode(String value) {
            this.verifyCode = value;
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
