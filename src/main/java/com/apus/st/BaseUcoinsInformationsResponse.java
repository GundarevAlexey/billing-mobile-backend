
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
 *         &lt;element name="UcoinsLevels" type="{http://st.apus.com/}UcoinsLevelsRoot" minOccurs="0"/>
 *         &lt;element name="UcoinsAchievements" type="{http://st.apus.com/}UcoinsAchievementsRoot" minOccurs="0"/>
 *         &lt;element name="UcoinsFaqs" type="{http://st.apus.com/}UcoinsFaqsRoot" minOccurs="0"/>
 *         &lt;element name="UcoinsPercents" type="{http://st.apus.com/}UcoinsPercentsRoot" minOccurs="0"/>
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
    "ucoinsLevels",
    "ucoinsAchievements",
    "ucoinsFaqs",
    "ucoinsPercents"
})
@XmlRootElement(name = "BaseUcoinsInformationsResponse")
public class BaseUcoinsInformationsResponse {

    @XmlElement(name = "Result")
    protected BaseUcoinsInformationsResponse.Result result;
    @XmlElement(name = "UcoinsLevels")
    protected UcoinsLevelsRoot ucoinsLevels;
    @XmlElement(name = "UcoinsAchievements")
    protected UcoinsAchievementsRoot ucoinsAchievements;
    @XmlElement(name = "UcoinsFaqs")
    protected UcoinsFaqsRoot ucoinsFaqs;
    @XmlElement(name = "UcoinsPercents")
    protected UcoinsPercentsRoot ucoinsPercents;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link BaseUcoinsInformationsResponse.Result }
     *     
     */
    public BaseUcoinsInformationsResponse.Result getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseUcoinsInformationsResponse.Result }
     *     
     */
    public void setResult(BaseUcoinsInformationsResponse.Result value) {
        this.result = value;
    }

    /**
     * Gets the value of the ucoinsLevels property.
     * 
     * @return
     *     possible object is
     *     {@link UcoinsLevelsRoot }
     *     
     */
    public UcoinsLevelsRoot getUcoinsLevels() {
        return ucoinsLevels;
    }

    /**
     * Sets the value of the ucoinsLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link UcoinsLevelsRoot }
     *     
     */
    public void setUcoinsLevels(UcoinsLevelsRoot value) {
        this.ucoinsLevels = value;
    }

    /**
     * Gets the value of the ucoinsAchievements property.
     * 
     * @return
     *     possible object is
     *     {@link UcoinsAchievementsRoot }
     *     
     */
    public UcoinsAchievementsRoot getUcoinsAchievements() {
        return ucoinsAchievements;
    }

    /**
     * Sets the value of the ucoinsAchievements property.
     * 
     * @param value
     *     allowed object is
     *     {@link UcoinsAchievementsRoot }
     *     
     */
    public void setUcoinsAchievements(UcoinsAchievementsRoot value) {
        this.ucoinsAchievements = value;
    }

    /**
     * Gets the value of the ucoinsFaqs property.
     * 
     * @return
     *     possible object is
     *     {@link UcoinsFaqsRoot }
     *     
     */
    public UcoinsFaqsRoot getUcoinsFaqs() {
        return ucoinsFaqs;
    }

    /**
     * Sets the value of the ucoinsFaqs property.
     * 
     * @param value
     *     allowed object is
     *     {@link UcoinsFaqsRoot }
     *     
     */
    public void setUcoinsFaqs(UcoinsFaqsRoot value) {
        this.ucoinsFaqs = value;
    }

    /**
     * Gets the value of the ucoinsPercents property.
     * 
     * @return
     *     possible object is
     *     {@link UcoinsPercentsRoot }
     *     
     */
    public UcoinsPercentsRoot getUcoinsPercents() {
        return ucoinsPercents;
    }

    /**
     * Sets the value of the ucoinsPercents property.
     * 
     * @param value
     *     allowed object is
     *     {@link UcoinsPercentsRoot }
     *     
     */
    public void setUcoinsPercents(UcoinsPercentsRoot value) {
        this.ucoinsPercents = value;
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
