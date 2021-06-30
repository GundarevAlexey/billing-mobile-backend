
package com.apus.st;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="ContactSite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactSiteTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactFacebook" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactInstagram" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactTelegram" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CopyRight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Term" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupportPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupportTelegram" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupportFacebook" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupportChat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupportEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AppStore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GooglePlay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CopyRights" type="{http://st.apus.com/}LName" minOccurs="0"/>
 *         &lt;element name="CompanyAddresses" type="{http://st.apus.com/}LName" minOccurs="0"/>
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
 *         &lt;element name="UpayFaqs" type="{http://st.apus.com/}UpayFaqsRoot" minOccurs="0"/>
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
    "contactSite",
    "contactSiteTitle",
    "contactFacebook",
    "contactInstagram",
    "contactTelegram",
    "copyRight",
    "term",
    "supportPhone",
    "supportTelegram",
    "supportFacebook",
    "supportChat",
    "supportEmail",
    "companyAddress",
    "qa",
    "appStore",
    "googlePlay",
    "copyRights",
    "companyAddresses",
    "result",
    "upayFaqs"
})
@XmlRootElement(name = "BaseUpayHelpsResponse")
public class BaseUpayHelpsResponse {

    @XmlElement(name = "ContactSite")
    protected String contactSite;
    @XmlElement(name = "ContactSiteTitle")
    protected String contactSiteTitle;
    @XmlElement(name = "ContactFacebook")
    protected String contactFacebook;
    @XmlElement(name = "ContactInstagram")
    protected String contactInstagram;
    @XmlElement(name = "ContactTelegram")
    protected String contactTelegram;
    @XmlElement(name = "CopyRight")
    protected String copyRight;
    @XmlElement(name = "Term")
    protected String term;
    @XmlElement(name = "SupportPhone")
    protected String supportPhone;
    @XmlElement(name = "SupportTelegram")
    protected String supportTelegram;
    @XmlElement(name = "SupportFacebook")
    protected String supportFacebook;
    @XmlElement(name = "SupportChat")
    protected String supportChat;
    @XmlElement(name = "SupportEmail")
    protected String supportEmail;
    @XmlElement(name = "CompanyAddress")
    protected String companyAddress;
    @XmlElement(name = "QA")
    protected String qa;
    @XmlElement(name = "AppStore")
    protected String appStore;
    @XmlElement(name = "GooglePlay")
    protected String googlePlay;
    @XmlElement(name = "CopyRights")
    protected LName copyRights;
    @XmlElement(name = "CompanyAddresses")
    protected LName companyAddresses;
    @XmlElement(name = "Result")
    protected BaseUpayHelpsResponse.Result result;
    @XmlElement(name = "UpayFaqs")
    protected UpayFaqsRoot upayFaqs;

    /**
     * Gets the value of the contactSite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactSite() {
        return contactSite;
    }

    /**
     * Sets the value of the contactSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactSite(String value) {
        this.contactSite = value;
    }

    /**
     * Gets the value of the contactSiteTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactSiteTitle() {
        return contactSiteTitle;
    }

    /**
     * Sets the value of the contactSiteTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactSiteTitle(String value) {
        this.contactSiteTitle = value;
    }

    /**
     * Gets the value of the contactFacebook property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactFacebook() {
        return contactFacebook;
    }

    /**
     * Sets the value of the contactFacebook property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactFacebook(String value) {
        this.contactFacebook = value;
    }

    /**
     * Gets the value of the contactInstagram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactInstagram() {
        return contactInstagram;
    }

    /**
     * Sets the value of the contactInstagram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactInstagram(String value) {
        this.contactInstagram = value;
    }

    /**
     * Gets the value of the contactTelegram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactTelegram() {
        return contactTelegram;
    }

    /**
     * Sets the value of the contactTelegram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactTelegram(String value) {
        this.contactTelegram = value;
    }

    /**
     * Gets the value of the copyRight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyRight() {
        return copyRight;
    }

    /**
     * Sets the value of the copyRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyRight(String value) {
        this.copyRight = value;
    }

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerm(String value) {
        this.term = value;
    }

    /**
     * Gets the value of the supportPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportPhone() {
        return supportPhone;
    }

    /**
     * Sets the value of the supportPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportPhone(String value) {
        this.supportPhone = value;
    }

    /**
     * Gets the value of the supportTelegram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportTelegram() {
        return supportTelegram;
    }

    /**
     * Sets the value of the supportTelegram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportTelegram(String value) {
        this.supportTelegram = value;
    }

    /**
     * Gets the value of the supportFacebook property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportFacebook() {
        return supportFacebook;
    }

    /**
     * Sets the value of the supportFacebook property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportFacebook(String value) {
        this.supportFacebook = value;
    }

    /**
     * Gets the value of the supportChat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportChat() {
        return supportChat;
    }

    /**
     * Sets the value of the supportChat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportChat(String value) {
        this.supportChat = value;
    }

    /**
     * Gets the value of the supportEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportEmail() {
        return supportEmail;
    }

    /**
     * Sets the value of the supportEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportEmail(String value) {
        this.supportEmail = value;
    }

    /**
     * Gets the value of the companyAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyAddress() {
        return companyAddress;
    }

    /**
     * Sets the value of the companyAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyAddress(String value) {
        this.companyAddress = value;
    }

    /**
     * Gets the value of the qa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQA() {
        return qa;
    }

    /**
     * Sets the value of the qa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQA(String value) {
        this.qa = value;
    }

    /**
     * Gets the value of the appStore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppStore() {
        return appStore;
    }

    /**
     * Sets the value of the appStore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppStore(String value) {
        this.appStore = value;
    }

    /**
     * Gets the value of the googlePlay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGooglePlay() {
        return googlePlay;
    }

    /**
     * Sets the value of the googlePlay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGooglePlay(String value) {
        this.googlePlay = value;
    }

    /**
     * Gets the value of the copyRights property.
     * 
     * @return
     *     possible object is
     *     {@link LName }
     *     
     */
    public LName getCopyRights() {
        return copyRights;
    }

    /**
     * Sets the value of the copyRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link LName }
     *     
     */
    public void setCopyRights(LName value) {
        this.copyRights = value;
    }

    /**
     * Gets the value of the companyAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link LName }
     *     
     */
    public LName getCompanyAddresses() {
        return companyAddresses;
    }

    /**
     * Sets the value of the companyAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link LName }
     *     
     */
    public void setCompanyAddresses(LName value) {
        this.companyAddresses = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link BaseUpayHelpsResponse.Result }
     *     
     */
    public BaseUpayHelpsResponse.Result getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseUpayHelpsResponse.Result }
     *     
     */
    public void setResult(BaseUpayHelpsResponse.Result value) {
        this.result = value;
    }

    /**
     * Gets the value of the upayFaqs property.
     * 
     * @return
     *     possible object is
     *     {@link UpayFaqsRoot }
     *     
     */
    public UpayFaqsRoot getUpayFaqs() {
        return upayFaqs;
    }

    /**
     * Sets the value of the upayFaqs property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpayFaqsRoot }
     *     
     */
    public void setUpayFaqs(UpayFaqsRoot value) {
        this.upayFaqs = value;
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
