
package com.apus.st;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for testCardP2PCreate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="testCardP2PCreate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="testCardP2PCreateRequest" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StPimsApiPartnerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="UserCredentials" type="{http://st.apus.com/}UserCredentials" minOccurs="0"/>
 *                   &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="P2pCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Summa" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "testCardP2PCreate", propOrder = {
    "testCardP2PCreateRequest"
})
public class TestCardP2PCreate {

    protected TestCardP2PCreate.TestCardP2PCreateRequest testCardP2PCreateRequest;

    /**
     * Gets the value of the testCardP2PCreateRequest property.
     * 
     * @return
     *     possible object is
     *     {@link TestCardP2PCreate.TestCardP2PCreateRequest }
     *     
     */
    public TestCardP2PCreate.TestCardP2PCreateRequest getTestCardP2PCreateRequest() {
        return testCardP2PCreateRequest;
    }

    /**
     * Sets the value of the testCardP2PCreateRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestCardP2PCreate.TestCardP2PCreateRequest }
     *     
     */
    public void setTestCardP2PCreateRequest(TestCardP2PCreate.TestCardP2PCreateRequest value) {
        this.testCardP2PCreateRequest = value;
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
     *         &lt;element name="UserCredentials" type="{http://st.apus.com/}UserCredentials" minOccurs="0"/>
     *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="P2pCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Summa" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        "userCredentials",
        "type",
        "p2PCardNumber",
        "summa",
        "lang"
    })
    public static class TestCardP2PCreateRequest {

        @XmlElement(name = "StPimsApiPartnerKey")
        protected String stPimsApiPartnerKey;
        @XmlElement(name = "UserCredentials")
        protected UserCredentials userCredentials;
        @XmlElement(name = "Type")
        protected Integer type;
        @XmlElement(name = "P2pCardNumber")
        protected String p2PCardNumber;
        @XmlElement(name = "Summa")
        protected Integer summa;
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
         * Gets the value of the userCredentials property.
         * 
         * @return
         *     possible object is
         *     {@link UserCredentials }
         *     
         */
        public UserCredentials getUserCredentials() {
            return userCredentials;
        }

        /**
         * Sets the value of the userCredentials property.
         * 
         * @param value
         *     allowed object is
         *     {@link UserCredentials }
         *     
         */
        public void setUserCredentials(UserCredentials value) {
            this.userCredentials = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setType(Integer value) {
            this.type = value;
        }

        /**
         * Gets the value of the p2PCardNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getP2PCardNumber() {
            return p2PCardNumber;
        }

        /**
         * Sets the value of the p2PCardNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setP2PCardNumber(String value) {
            this.p2PCardNumber = value;
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
