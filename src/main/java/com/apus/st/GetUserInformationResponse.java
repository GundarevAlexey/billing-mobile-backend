
package com.apus.st;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getUserInformationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUserInformationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Result" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ServerTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Birthday" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="UserLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="HideBalance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="Theme" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="ThemeCover" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="Photo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CategoryAlign" type="{http://st.apus.com/}categoryAlign" minOccurs="0"/>
 *                   &lt;element name="QuickPaymentByContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="PushUcoins" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="DashboardPaymentType" type="{http://st.apus.com/}dashboardPaymentType" minOccurs="0"/>
 *                   &lt;element name="HasNewVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="RegisteredDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Avatar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AvatarThumb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "getUserInformationResponse", propOrder = {
    "_return"
})
public class GetUserInformationResponse {

    @XmlElement(name = "return")
    protected GetUserInformationResponse.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetUserInformationResponse.Return }
     *     
     */
    public GetUserInformationResponse.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetUserInformationResponse.Return }
     *     
     */
    public void setReturn(GetUserInformationResponse.Return value) {
        this._return = value;
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
     *         &lt;element name="Result" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ServerTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Birthday" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="UserLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="HideBalance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="Theme" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="ThemeCover" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="Photo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CategoryAlign" type="{http://st.apus.com/}categoryAlign" minOccurs="0"/>
     *         &lt;element name="QuickPaymentByContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="PushUcoins" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="DashboardPaymentType" type="{http://st.apus.com/}dashboardPaymentType" minOccurs="0"/>
     *         &lt;element name="HasNewVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="RegisteredDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Avatar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AvatarThumb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "result",
        "firstName",
        "lastName",
        "birthday",
        "gender",
        "userLang",
        "email",
        "hideBalance",
        "theme",
        "themeCover",
        "photo",
        "categoryAlign",
        "quickPaymentByContact",
        "pushUcoins",
        "dashboardPaymentType",
        "hasNewVersion",
        "registeredDate",
        "avatar",
        "avatarThumb"
    })
    public static class Return {

        @XmlElement(name = "Result")
        protected GetUserInformationResponse.Return.Result result;
        @XmlElement(name = "FirstName")
        protected String firstName;
        @XmlElement(name = "LastName")
        protected String lastName;
        @XmlElement(name = "Birthday")
        protected String birthday;
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
        @XmlElement(name = "Photo")
        protected String photo;
        @XmlElement(name = "CategoryAlign")
        @XmlSchemaType(name = "string")
        protected CategoryAlign categoryAlign;
        @XmlElement(name = "QuickPaymentByContact")
        protected Boolean quickPaymentByContact;
        @XmlElement(name = "PushUcoins")
        protected Boolean pushUcoins;
        @XmlElement(name = "DashboardPaymentType")
        @XmlSchemaType(name = "string")
        protected DashboardPaymentType dashboardPaymentType;
        @XmlElement(name = "HasNewVersion")
        protected Boolean hasNewVersion;
        @XmlElement(name = "RegisteredDate")
        protected String registeredDate;
        @XmlElement(name = "Avatar")
        protected String avatar;
        @XmlElement(name = "AvatarThumb")
        protected String avatarThumb;

        /**
         * Gets the value of the result property.
         * 
         * @return
         *     possible object is
         *     {@link GetUserInformationResponse.Return.Result }
         *     
         */
        public GetUserInformationResponse.Return.Result getResult() {
            return result;
        }

        /**
         * Sets the value of the result property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetUserInformationResponse.Return.Result }
         *     
         */
        public void setResult(GetUserInformationResponse.Return.Result value) {
            this.result = value;
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
         *     {@link String }
         *     
         */
        public String getBirthday() {
            return birthday;
        }

        /**
         * Sets the value of the birthday property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBirthday(String value) {
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
         * Gets the value of the photo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoto() {
            return photo;
        }

        /**
         * Sets the value of the photo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoto(String value) {
            this.photo = value;
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
         * Gets the value of the hasNewVersion property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHasNewVersion() {
            return hasNewVersion;
        }

        /**
         * Sets the value of the hasNewVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHasNewVersion(Boolean value) {
            this.hasNewVersion = value;
        }

        /**
         * Gets the value of the registeredDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegisteredDate() {
            return registeredDate;
        }

        /**
         * Sets the value of the registeredDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegisteredDate(String value) {
            this.registeredDate = value;
        }

        /**
         * Gets the value of the avatar property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAvatar() {
            return avatar;
        }

        /**
         * Sets the value of the avatar property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAvatar(String value) {
            this.avatar = value;
        }

        /**
         * Gets the value of the avatarThumb property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAvatarThumb() {
            return avatarThumb;
        }

        /**
         * Sets the value of the avatarThumb property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAvatarThumb(String value) {
            this.avatarThumb = value;
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
         *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ServerTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
            "code",
            "description",
            "serverTime"
        })
        public static class Result {

            protected String code;
            @XmlElement(name = "Description")
            protected String description;
            @XmlElement(name = "ServerTime")
            protected Long serverTime;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
            }

            /**
             * Gets the value of the serverTime property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getServerTime() {
                return serverTime;
            }

            /**
             * Sets the value of the serverTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setServerTime(Long value) {
                this.serverTime = value;
            }

        }

    }

}
