
package com.apus.st;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for P2PBank complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="P2PBank">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BankId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InterBank" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Offerta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IconName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Percent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestMaxSum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransferMaxSum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Params" type="{http://st.apus.com/}NamedParam" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CardThemes" type="{http://st.apus.com/}CardTheme" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "P2PBank", propOrder = {
    "id",
    "bankId",
    "bankCode",
    "name",
    "interBank",
    "offerta",
    "logo",
    "status",
    "iconName",
    "percent",
    "requestMaxSum",
    "transferMaxSum",
    "params",
    "cardThemes"
})
public class P2PBank {

    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElement(name = "BankId")
    protected Integer bankId;
    @XmlElement(name = "BankCode")
    protected String bankCode;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "InterBank")
    protected Boolean interBank;
    @XmlElement(name = "Offerta")
    protected String offerta;
    @XmlElement(name = "Logo")
    protected String logo;
    @XmlElement(name = "Status")
    protected Boolean status;
    @XmlElement(name = "IconName")
    protected String iconName;
    @XmlElement(name = "Percent")
    protected String percent;
    @XmlElement(name = "RequestMaxSum")
    protected String requestMaxSum;
    @XmlElement(name = "TransferMaxSum")
    protected String transferMaxSum;
    @XmlElement(name = "Params")
    protected List<NamedParam> params;
    @XmlElement(name = "CardThemes")
    protected CardTheme cardThemes;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the bankId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBankId() {
        return bankId;
    }

    /**
     * Sets the value of the bankId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBankId(Integer value) {
        this.bankId = value;
    }

    /**
     * Gets the value of the bankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Sets the value of the bankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCode(String value) {
        this.bankCode = value;
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
     * Gets the value of the interBank property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInterBank() {
        return interBank;
    }

    /**
     * Sets the value of the interBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInterBank(Boolean value) {
        this.interBank = value;
    }

    /**
     * Gets the value of the offerta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferta() {
        return offerta;
    }

    /**
     * Sets the value of the offerta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferta(String value) {
        this.offerta = value;
    }

    /**
     * Gets the value of the logo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogo() {
        return logo;
    }

    /**
     * Sets the value of the logo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogo(String value) {
        this.logo = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatus(Boolean value) {
        this.status = value;
    }

    /**
     * Gets the value of the iconName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIconName() {
        return iconName;
    }

    /**
     * Sets the value of the iconName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIconName(String value) {
        this.iconName = value;
    }

    /**
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercent(String value) {
        this.percent = value;
    }

    /**
     * Gets the value of the requestMaxSum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestMaxSum() {
        return requestMaxSum;
    }

    /**
     * Sets the value of the requestMaxSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestMaxSum(String value) {
        this.requestMaxSum = value;
    }

    /**
     * Gets the value of the transferMaxSum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferMaxSum() {
        return transferMaxSum;
    }

    /**
     * Sets the value of the transferMaxSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferMaxSum(String value) {
        this.transferMaxSum = value;
    }

    /**
     * Gets the value of the params property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the params property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NamedParam }
     * 
     * 
     */
    public List<NamedParam> getParams() {
        if (params == null) {
            params = new ArrayList<NamedParam>();
        }
        return this.params;
    }

    /**
     * Gets the value of the cardThemes property.
     * 
     * @return
     *     possible object is
     *     {@link CardTheme }
     *     
     */
    public CardTheme getCardThemes() {
        return cardThemes;
    }

    /**
     * Sets the value of the cardThemes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardTheme }
     *     
     */
    public void setCardThemes(CardTheme value) {
        this.cardThemes = value;
    }

}
