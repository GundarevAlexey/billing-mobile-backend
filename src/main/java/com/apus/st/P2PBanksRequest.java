
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
 *         &lt;element name="StPimsApiPartnerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Update_at" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
    "updateAt",
    "lang"
})
@XmlRootElement(name = "P2PBanksRequest")
public class P2PBanksRequest {

    @XmlElement(name = "StPimsApiPartnerKey")
    protected String stPimsApiPartnerKey;
    @XmlElement(name = "Update_at")
    protected Long updateAt;
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
     * Gets the value of the updateAt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUpdateAt() {
        return updateAt;
    }

    /**
     * Sets the value of the updateAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUpdateAt(Long value) {
        this.updateAt = value;
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