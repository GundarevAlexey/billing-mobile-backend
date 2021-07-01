
package com.apus.st;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for setUserInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setUserInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="setUserInformationRequest" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StPimsApiPartnerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="UserCredentials" type="{http://st.apus.com/}UserCredentials" minOccurs="0"/>
 *                   &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="UserLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="HideBalance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="Theme" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="ThemeCover" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="CategoryAlign" type="{http://st.apus.com/}categoryAlign" minOccurs="0"/>
 *                   &lt;element name="QuickPaymentByContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="PushUcoins" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="DashboardPaymentType" type="{http://st.apus.com/}dashboardPaymentType" minOccurs="0"/>
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
@XmlType(name = "setUserInformation", propOrder = {
    "setUserInformationRequest"
})
public class SetUserInformation {

    protected SetUserInformation.SetUserInformationRequest setUserInformationRequest;

    /**
     * Gets the value of the setUserInformationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SetUserInformation.SetUserInformationRequest }
     *     
     */
    public SetUserInformation.SetUserInformationRequest getSetUserInformationRequest() {
        return setUserInformationRequest;
    }

    /**
     * Sets the value of the setUserInformationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetUserInformation.SetUserInformationRequest }
     *     
     */
    public void setSetUserInformationRequest(SetUserInformation.SetUserInformationRequest value) {
        this.setUserInformationRequest = value;
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
     *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="UserLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="HideBalance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="Theme" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="ThemeCover" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="CategoryAlign" type="{http://st.apus.com/}categoryAlign" minOccurs="0"/>
     *         &lt;element name="QuickPaymentByContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="PushUcoins" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="DashboardPaymentType" type="{http://st.apus.com/}dashboardPaymentType" minOccurs="0"/>
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
        "firstName",
        "lastName",
        "birthday",
        "gender",
        "userLang",
        "email",
        "hideBalance",
        "theme",
        "themeCover",
        "categoryAlign",
        "quickPaymentByContact",
        "pushUcoins",
        "dashboardPaymentType",
        "version",
        "lang"
    })
    public static class SetUserInformationRequest {

        @XmlElement(name = "StPimsApiPartnerKey")
        protected String stPimsApiPartnerKey;
        @XmlElement(name = "UserCredentials")
        protected UserCredentials userCredentials;
        @XmlElement(name = "Action")
        protected String action;
        @XmlElement(name = "FirstName")
        protected String firstName;
        @XmlElement(name = "LastName")
        protected String lastName;
        @XmlElement(name = "Birthday")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar birthday;
        @XmlElement(name = "Gender")
        protected Boolean gender;
        @XmlElement(name = "UserLang")
        protected String userLang;
        @XmlElement(name = "Email")
        protected String email;
        @XmlElement(name = "HideBalance")
        protected Boolean hideBalance;
        @XmlElement(name = "Theme")
        protected Integer theme;
        @XmlElement(name = "ThemeCover")
        protected Integer themeCover;
        @XmlElement(name = "CategoryAlign")
        protected CategoryAlign categoryAlign;
        @XmlElement(name = "QuickPaymentByContact")
        protected Boolean quickPaymentByContact;
        @XmlElement(name = "PushUcoins")
        protected Boolean pushUcoins;
        @XmlElement(name = "DashboardPaymentType")
        protected DashboardPaymentType dashboardPaymentType;
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
         * Gets the value of the firstName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirstName() {
            return firstName;
        }

        /**
         * Sets the value of the firstName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirstName(String value) {
            this.firstName = value;
        }

        /**
         * Gets the value of the lastName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastName() {
            return lastName;
        }

        /**
         * Sets the value of the lastName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastName(String value) {
            this.lastName = value;
        }

        /**
         * Gets the value of the birthday property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBirthday() {
            return birthday;
        }

        /**
         * Sets the value of the birthday property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setBirthday(XMLGregorianCalendar value) {
            this.birthday = value;
        }

        /**
         * Gets the value of the gender property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isGender() {
            return gender;
        }

        /**
         * Sets the value of the gender property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setGender(Boolean value) {
            this.gender = value;
        }

        /**
         * Gets the value of the userLang property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserLang() {
            return userLang;
        }

        /**
         * Sets the value of the userLang property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserLang(String value) {
            this.userLang = value;
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
         * Gets the value of the theme property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTheme() {
            return theme;
        }

        /**
         * Sets the value of the theme property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTheme(Integer value) {
            this.theme = value;
        }

        /**
         * Gets the value of the themeCover property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getThemeCover() {
            return themeCover;
        }

        /**
         * Sets the value of the themeCover property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setThemeCover(Integer value) {
            this.themeCover = value;
        }

        /**
         * Gets the value of the categoryAlign property.
         * 
         * @return
         *     possible object is
         *     {@link CategoryAlign }
         *     
         */
        public CategoryAlign getCategoryAlign() {
            return categoryAlign;
        }

        /**
         * Sets the value of the categoryAlign property.
         * 
         * @param value
         *     allowed object is
         *     {@link CategoryAlign }
         *     
         */
        public void setCategoryAlign(CategoryAlign value) {
            this.categoryAlign = value;
        }

        /**
         * Gets the value of the quickPaymentByContact property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isQuickPaymentByContact() {
            return quickPaymentByContact;
        }

        /**
         * Sets the value of the quickPaymentByContact property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setQuickPaymentByContact(Boolean value) {
            this.quickPaymentByContact = value;
        }

        /**
         * Gets the value of the pushUcoins property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPushUcoins() {
            return pushUcoins;
        }

        /**
         * Sets the value of the pushUcoins property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPushUcoins(Boolean value) {
            this.pushUcoins = value;
        }

        /**
         * Gets the value of the dashboardPaymentType property.
         * 
         * @return
         *     possible object is
         *     {@link DashboardPaymentType }
         *     
         */
        public DashboardPaymentType getDashboardPaymentType() {
            return dashboardPaymentType;
        }

        /**
         * Sets the value of the dashboardPaymentType property.
         * 
         * @param value
         *     allowed object is
         *     {@link DashboardPaymentType }
         *     
         */
        public void setDashboardPaymentType(DashboardPaymentType value) {
            this.dashboardPaymentType = value;
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
