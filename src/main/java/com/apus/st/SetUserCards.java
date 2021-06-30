
package com.apus.st;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setUserCards complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setUserCards">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userCardsSetRequest" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StPimsApiPartnerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="UserCredentials" type="{http://st.apus.com/}UserCredentials" minOccurs="0"/>
 *                   &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CardId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="CardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ColorId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="IsMain" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="HideBalance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "setUserCards", propOrder = {
    "userCardsSetRequest"
})
public class SetUserCards {

    protected SetUserCards.UserCardsSetRequest userCardsSetRequest;

    /**
     * Gets the value of the userCardsSetRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SetUserCards.UserCardsSetRequest }
     *     
     */
    public SetUserCards.UserCardsSetRequest getUserCardsSetRequest() {
        return userCardsSetRequest;
    }

    /**
     * Sets the value of the userCardsSetRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetUserCards.UserCardsSetRequest }
     *     
     */
    public void setUserCardsSetRequest(SetUserCards.UserCardsSetRequest value) {
        this.userCardsSetRequest = value;
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
     *         &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CardId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="CardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ColorId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="IsMain" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="HideBalance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "userCredentials",
        "action",
        "cardId",
        "cardName",
        "colorId",
        "isMain",
        "hideBalance",
        "version",
        "lang"
    })
    public static class UserCardsSetRequest {

        @XmlElement(name = "StPimsApiPartnerKey")
        protected String stPimsApiPartnerKey;
        @XmlElement(name = "UserCredentials")
        protected UserCredentials userCredentials;
        @XmlElement(name = "Action")
        protected String action;
        @XmlElement(name = "CardId")
        protected Integer cardId;
        @XmlElement(name = "CardName")
        protected String cardName;
        @XmlElement(name = "ColorId")
        protected Integer colorId;
        @XmlElement(name = "IsMain")
        protected Boolean isMain;
        @XmlElement(name = "HideBalance")
        protected Boolean hideBalance;
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
         * Gets the value of the action property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAction() {
            return action;
        }

        /**
         * Sets the value of the action property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAction(String value) {
            this.action = value;
        }

        /**
         * Gets the value of the cardId property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCardId() {
            return cardId;
        }

        /**
         * Sets the value of the cardId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCardId(Integer value) {
            this.cardId = value;
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
         * Gets the value of the isMain property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsMain() {
            return isMain;
        }

        /**
         * Sets the value of the isMain property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsMain(Boolean value) {
            this.isMain = value;
        }

        /**
         * Gets the value of the hideBalance property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHideBalance() {
            return hideBalance;
        }

        /**
         * Sets the value of the hideBalance property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHideBalance(Boolean value) {
            this.hideBalance = value;
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
