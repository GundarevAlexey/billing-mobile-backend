
package com.apus.st;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxAccounts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxAccounts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="objCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nalCodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="origObjAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sumNed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxAccounts", propOrder = {
    "objCode",
    "chet",
    "dcode",
    "mfo",
    "nalCode",
    "nalCodeName",
    "objAddress",
    "origObjAddress",
    "sumNed",
    "chetName"
})
public class TaxAccounts {

    protected String objCode;
    protected String chet;
    protected String dcode;
    protected String mfo;
    protected String nalCode;
    protected String nalCodeName;
    protected String objAddress;
    protected String origObjAddress;
    protected String sumNed;
    protected String chetName;

    /**
     * Gets the value of the objCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjCode() {
        return objCode;
    }

    /**
     * Sets the value of the objCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjCode(String value) {
        this.objCode = value;
    }

    /**
     * Gets the value of the chet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChet() {
        return chet;
    }

    /**
     * Sets the value of the chet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChet(String value) {
        this.chet = value;
    }

    /**
     * Gets the value of the dcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcode() {
        return dcode;
    }

    /**
     * Sets the value of the dcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcode(String value) {
        this.dcode = value;
    }

    /**
     * Gets the value of the mfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMfo() {
        return mfo;
    }

    /**
     * Sets the value of the mfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMfo(String value) {
        this.mfo = value;
    }

    /**
     * Gets the value of the nalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNalCode() {
        return nalCode;
    }

    /**
     * Sets the value of the nalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNalCode(String value) {
        this.nalCode = value;
    }

    /**
     * Gets the value of the nalCodeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNalCodeName() {
        return nalCodeName;
    }

    /**
     * Sets the value of the nalCodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNalCodeName(String value) {
        this.nalCodeName = value;
    }

    /**
     * Gets the value of the objAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjAddress() {
        return objAddress;
    }

    /**
     * Sets the value of the objAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjAddress(String value) {
        this.objAddress = value;
    }

    /**
     * Gets the value of the origObjAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigObjAddress() {
        return origObjAddress;
    }

    /**
     * Sets the value of the origObjAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigObjAddress(String value) {
        this.origObjAddress = value;
    }

    /**
     * Gets the value of the sumNed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSumNed() {
        return sumNed;
    }

    /**
     * Sets the value of the sumNed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSumNed(String value) {
        this.sumNed = value;
    }

    /**
     * Gets the value of the chetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChetName() {
        return chetName;
    }

    /**
     * Sets the value of the chetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChetName(String value) {
        this.chetName = value;
    }

}
