
package com.apus.st;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ServiceId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Purse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EopsTransId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubRegionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Terminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="P2PReceiverFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="P2PReceiverBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="P2PCommissionAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="P2PReceiverBankId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CommissionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CardMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ServiceIcon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceName" type="{http://st.apus.com/}LName" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionList", propOrder = {
    "transId",
    "serviceId",
    "purse",
    "amount",
    "date",
    "status",
    "eopsTransId",
    "regionId",
    "subRegionId",
    "type",
    "terminal",
    "cardId",
    "p2PReceiverFullName",
    "p2PReceiverBankName",
    "p2PCommissionAmount",
    "p2PReceiverBankId",
    "commissionAmount",
    "percent",
    "cardMask",
    "cardType",
    "serviceIcon",
    "serviceName"
})
public class TransactionList {

    @XmlElement(name = "TransId")
    protected Integer transId;
    @XmlElement(name = "ServiceId")
    protected Integer serviceId;
    @XmlElement(name = "Purse")
    protected String purse;
    @XmlElement(name = "Amount")
    protected String amount;
    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "Status")
    protected Integer status;
    @XmlElement(name = "EopsTransId")
    protected String eopsTransId;
    @XmlElement(name = "RegionId")
    protected String regionId;
    @XmlElement(name = "SubRegionId")
    protected String subRegionId;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "Terminal")
    protected String terminal;
    @XmlElement(name = "CardId")
    protected Integer cardId;
    @XmlElement(name = "P2PReceiverFullName")
    protected String p2PReceiverFullName;
    @XmlElement(name = "P2PReceiverBankName")
    protected String p2PReceiverBankName;
    @XmlElement(name = "P2PCommissionAmount")
    protected String p2PCommissionAmount;
    @XmlElement(name = "P2PReceiverBankId")
    protected Integer p2PReceiverBankId;
    @XmlElement(name = "CommissionAmount")
    protected BigDecimal commissionAmount;
    @XmlElement(name = "Percent")
    protected BigDecimal percent;
    @XmlElement(name = "CardMask")
    protected String cardMask;
    @XmlElement(name = "CardType")
    protected Integer cardType;
    @XmlElement(name = "ServiceIcon")
    protected String serviceIcon;
    @XmlElement(name = "ServiceName")
    protected LName serviceName;

    /**
     * Gets the value of the transId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransId() {
        return transId;
    }

    /**
     * Sets the value of the transId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransId(Integer value) {
        this.transId = value;
    }

    /**
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServiceId(Integer value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the purse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurse() {
        return purse;
    }

    /**
     * Sets the value of the purse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurse(String value) {
        this.purse = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatus(Integer value) {
        this.status = value;
    }

    /**
     * Gets the value of the eopsTransId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEopsTransId() {
        return eopsTransId;
    }

    /**
     * Sets the value of the eopsTransId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEopsTransId(String value) {
        this.eopsTransId = value;
    }

    /**
     * Gets the value of the regionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * Sets the value of the regionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionId(String value) {
        this.regionId = value;
    }

    /**
     * Gets the value of the subRegionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubRegionId() {
        return subRegionId;
    }

    /**
     * Sets the value of the subRegionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubRegionId(String value) {
        this.subRegionId = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the terminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminal() {
        return terminal;
    }

    /**
     * Sets the value of the terminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminal(String value) {
        this.terminal = value;
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
     * Gets the value of the p2PReceiverFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getP2PReceiverFullName() {
        return p2PReceiverFullName;
    }

    /**
     * Sets the value of the p2PReceiverFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setP2PReceiverFullName(String value) {
        this.p2PReceiverFullName = value;
    }

    /**
     * Gets the value of the p2PReceiverBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getP2PReceiverBankName() {
        return p2PReceiverBankName;
    }

    /**
     * Sets the value of the p2PReceiverBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setP2PReceiverBankName(String value) {
        this.p2PReceiverBankName = value;
    }

    /**
     * Gets the value of the p2PCommissionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getP2PCommissionAmount() {
        return p2PCommissionAmount;
    }

    /**
     * Sets the value of the p2PCommissionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setP2PCommissionAmount(String value) {
        this.p2PCommissionAmount = value;
    }

    /**
     * Gets the value of the p2PReceiverBankId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getP2PReceiverBankId() {
        return p2PReceiverBankId;
    }

    /**
     * Sets the value of the p2PReceiverBankId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setP2PReceiverBankId(Integer value) {
        this.p2PReceiverBankId = value;
    }

    /**
     * Gets the value of the commissionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCommissionAmount() {
        return commissionAmount;
    }

    /**
     * Sets the value of the commissionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCommissionAmount(BigDecimal value) {
        this.commissionAmount = value;
    }

    /**
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercent(BigDecimal value) {
        this.percent = value;
    }

    /**
     * Gets the value of the cardMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardMask() {
        return cardMask;
    }

    /**
     * Sets the value of the cardMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardMask(String value) {
        this.cardMask = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCardType(Integer value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the serviceIcon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceIcon() {
        return serviceIcon;
    }

    /**
     * Sets the value of the serviceIcon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceIcon(String value) {
        this.serviceIcon = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link LName }
     *     
     */
    public LName getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link LName }
     *     
     */
    public void setServiceName(LName value) {
        this.serviceName = value;
    }

}
