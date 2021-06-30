
package com.apus.st;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CategoryId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ServiceId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImgFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Find" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Soato" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AccountTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Account" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="SiteUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Favorite" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tarif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Types" type="{http://st.apus.com/}TypeListRoot" minOccurs="0"/>
 *         &lt;element name="SubTypes" type="{http://st.apus.com/}SubTypeListRoot" minOccurs="0"/>
 *         &lt;element name="Percent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FindType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AmountLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AmountCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OnTradePoint" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TransTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UssdCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ucoins" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ShortName" type="{http://st.apus.com/}LName" minOccurs="0"/>
 *         &lt;element name="OnUssd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UcoinsPercent" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OffertaUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AccountMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Position" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Repayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Receipt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountHint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HasQR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WithTiyin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasUcoinsPay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ServiceName" type="{http://st.apus.com/}LName" minOccurs="0"/>
 *         &lt;element name="AccountTitles" type="{http://st.apus.com/}LName" minOccurs="0"/>
 *         &lt;element name="Messages" type="{http://st.apus.com/}LName" minOccurs="0"/>
 *         &lt;element name="AccountHints" type="{http://st.apus.com/}LName" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceList", propOrder = {
    "categoryId",
    "serviceId",
    "name",
    "imgFileName",
    "find",
    "soato",
    "accountTitle",
    "account",
    "status",
    "siteUrl",
    "favorite",
    "amount",
    "tarif",
    "types",
    "subTypes",
    "percent",
    "findType",
    "amountLimit",
    "amountCondition",
    "onTradePoint",
    "transTitle",
    "ussdCode",
    "ucoins",
    "shortName",
    "onUssd",
    "currencyCode",
    "ucoinsPercent",
    "message",
    "active",
    "offertaUrl",
    "countryId",
    "accountMask",
    "position",
    "repayment",
    "receipt",
    "prefix",
    "accountHint",
    "hasQR",
    "withTiyin",
    "hasUcoinsPay",
    "serviceName",
    "accountTitles",
    "messages",
    "accountHints",
    "date"
})
public class ServiceList {

    @XmlElement(name = "CategoryId")
    protected Integer categoryId;
    @XmlElement(name = "ServiceId")
    protected Integer serviceId;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ImgFileName")
    protected String imgFileName;
    @XmlElement(name = "Find")
    protected Boolean find;
    @XmlElement(name = "Soato")
    protected Integer soato;
    @XmlElement(name = "AccountTitle")
    protected String accountTitle;
    @XmlElement(name = "Account")
    protected String account;
    @XmlElement(name = "Status")
    protected Short status;
    @XmlElement(name = "SiteUrl")
    protected String siteUrl;
    @XmlElement(name = "Favorite")
    protected Integer favorite;
    @XmlElement(name = "Amount")
    protected String amount;
    @XmlElement(name = "Tarif")
    protected String tarif;
    @XmlElement(name = "Types")
    protected TypeListRoot types;
    @XmlElement(name = "SubTypes")
    protected SubTypeListRoot subTypes;
    @XmlElement(name = "Percent")
    protected String percent;
    @XmlElement(name = "FindType")
    protected Integer findType;
    @XmlElement(name = "AmountLimit")
    protected String amountLimit;
    @XmlElement(name = "AmountCondition")
    protected String amountCondition;
    @XmlElement(name = "OnTradePoint")
    protected Integer onTradePoint;
    @XmlElement(name = "TransTitle")
    protected String transTitle;
    @XmlElement(name = "UssdCode")
    protected String ussdCode;
    @XmlElement(name = "Ucoins")
    protected Integer ucoins;
    @XmlElement(name = "ShortName")
    protected LName shortName;
    @XmlElement(name = "OnUssd")
    protected Boolean onUssd;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "UcoinsPercent")
    protected Long ucoinsPercent;
    @XmlElement(name = "Message")
    protected String message;
    @XmlElement(name = "Active")
    protected Integer active;
    @XmlElement(name = "OffertaUrl")
    protected String offertaUrl;
    @XmlElement(name = "CountryId")
    protected Integer countryId;
    @XmlElement(name = "AccountMask")
    protected String accountMask;
    @XmlElement(name = "Position")
    protected Integer position;
    @XmlElement(name = "Repayment")
    protected Boolean repayment;
    @XmlElement(name = "Receipt")
    protected Boolean receipt;
    @XmlElement(name = "Prefix")
    protected String prefix;
    @XmlElement(name = "AccountHint")
    protected String accountHint;
    @XmlElement(name = "HasQR")
    protected Boolean hasQR;
    @XmlElement(name = "WithTiyin")
    protected Boolean withTiyin;
    @XmlElement(name = "HasUcoinsPay")
    protected Boolean hasUcoinsPay;
    @XmlElement(name = "ServiceName")
    protected LName serviceName;
    @XmlElement(name = "AccountTitles")
    protected LName accountTitles;
    @XmlElement(name = "Messages")
    protected LName messages;
    @XmlElement(name = "AccountHints")
    protected LName accountHints;
    @XmlElement(name = "Date")
    protected Long date;

    /**
     * Gets the value of the categoryId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * Sets the value of the categoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCategoryId(Integer value) {
        this.categoryId = value;
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
     * Gets the value of the imgFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgFileName() {
        return imgFileName;
    }

    /**
     * Sets the value of the imgFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImgFileName(String value) {
        this.imgFileName = value;
    }

    /**
     * Gets the value of the find property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFind() {
        return find;
    }

    /**
     * Sets the value of the find property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFind(Boolean value) {
        this.find = value;
    }

    /**
     * Gets the value of the soato property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSoato() {
        return soato;
    }

    /**
     * Sets the value of the soato property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSoato(Integer value) {
        this.soato = value;
    }

    /**
     * Gets the value of the accountTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountTitle() {
        return accountTitle;
    }

    /**
     * Sets the value of the accountTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountTitle(String value) {
        this.accountTitle = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setStatus(Short value) {
        this.status = value;
    }

    /**
     * Gets the value of the siteUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteUrl() {
        return siteUrl;
    }

    /**
     * Sets the value of the siteUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteUrl(String value) {
        this.siteUrl = value;
    }

    /**
     * Gets the value of the favorite property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFavorite() {
        return favorite;
    }

    /**
     * Sets the value of the favorite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFavorite(Integer value) {
        this.favorite = value;
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
     * Gets the value of the tarif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarif() {
        return tarif;
    }

    /**
     * Sets the value of the tarif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarif(String value) {
        this.tarif = value;
    }

    /**
     * Gets the value of the types property.
     * 
     * @return
     *     possible object is
     *     {@link TypeListRoot }
     *     
     */
    public TypeListRoot getTypes() {
        return types;
    }

    /**
     * Sets the value of the types property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeListRoot }
     *     
     */
    public void setTypes(TypeListRoot value) {
        this.types = value;
    }

    /**
     * Gets the value of the subTypes property.
     * 
     * @return
     *     possible object is
     *     {@link SubTypeListRoot }
     *     
     */
    public SubTypeListRoot getSubTypes() {
        return subTypes;
    }

    /**
     * Sets the value of the subTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubTypeListRoot }
     *     
     */
    public void setSubTypes(SubTypeListRoot value) {
        this.subTypes = value;
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
     * Gets the value of the findType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFindType() {
        return findType;
    }

    /**
     * Sets the value of the findType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFindType(Integer value) {
        this.findType = value;
    }

    /**
     * Gets the value of the amountLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountLimit() {
        return amountLimit;
    }

    /**
     * Sets the value of the amountLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountLimit(String value) {
        this.amountLimit = value;
    }

    /**
     * Gets the value of the amountCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountCondition() {
        return amountCondition;
    }

    /**
     * Sets the value of the amountCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountCondition(String value) {
        this.amountCondition = value;
    }

    /**
     * Gets the value of the onTradePoint property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOnTradePoint() {
        return onTradePoint;
    }

    /**
     * Sets the value of the onTradePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOnTradePoint(Integer value) {
        this.onTradePoint = value;
    }

    /**
     * Gets the value of the transTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransTitle() {
        return transTitle;
    }

    /**
     * Sets the value of the transTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransTitle(String value) {
        this.transTitle = value;
    }

    /**
     * Gets the value of the ussdCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUssdCode() {
        return ussdCode;
    }

    /**
     * Sets the value of the ussdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUssdCode(String value) {
        this.ussdCode = value;
    }

    /**
     * Gets the value of the ucoins property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUcoins() {
        return ucoins;
    }

    /**
     * Sets the value of the ucoins property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUcoins(Integer value) {
        this.ucoins = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link LName }
     *     
     */
    public LName getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link LName }
     *     
     */
    public void setShortName(LName value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the onUssd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnUssd() {
        return onUssd;
    }

    /**
     * Sets the value of the onUssd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnUssd(Boolean value) {
        this.onUssd = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the ucoinsPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUcoinsPercent() {
        return ucoinsPercent;
    }

    /**
     * Sets the value of the ucoinsPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUcoinsPercent(Long value) {
        this.ucoinsPercent = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActive(Integer value) {
        this.active = value;
    }

    /**
     * Gets the value of the offertaUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffertaUrl() {
        return offertaUrl;
    }

    /**
     * Sets the value of the offertaUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffertaUrl(String value) {
        this.offertaUrl = value;
    }

    /**
     * Gets the value of the countryId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     * Sets the value of the countryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCountryId(Integer value) {
        this.countryId = value;
    }

    /**
     * Gets the value of the accountMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountMask() {
        return accountMask;
    }

    /**
     * Sets the value of the accountMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountMask(String value) {
        this.accountMask = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPosition(Integer value) {
        this.position = value;
    }

    /**
     * Gets the value of the repayment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRepayment() {
        return repayment;
    }

    /**
     * Sets the value of the repayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRepayment(Boolean value) {
        this.repayment = value;
    }

    /**
     * Gets the value of the receipt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReceipt() {
        return receipt;
    }

    /**
     * Sets the value of the receipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReceipt(Boolean value) {
        this.receipt = value;
    }

    /**
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix(String value) {
        this.prefix = value;
    }

    /**
     * Gets the value of the accountHint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountHint() {
        return accountHint;
    }

    /**
     * Sets the value of the accountHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountHint(String value) {
        this.accountHint = value;
    }

    /**
     * Gets the value of the hasQR property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasQR() {
        return hasQR;
    }

    /**
     * Sets the value of the hasQR property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasQR(Boolean value) {
        this.hasQR = value;
    }

    /**
     * Gets the value of the withTiyin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithTiyin() {
        return withTiyin;
    }

    /**
     * Sets the value of the withTiyin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithTiyin(Boolean value) {
        this.withTiyin = value;
    }

    /**
     * Gets the value of the hasUcoinsPay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasUcoinsPay() {
        return hasUcoinsPay;
    }

    /**
     * Sets the value of the hasUcoinsPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasUcoinsPay(Boolean value) {
        this.hasUcoinsPay = value;
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

    /**
     * Gets the value of the accountTitles property.
     * 
     * @return
     *     possible object is
     *     {@link LName }
     *     
     */
    public LName getAccountTitles() {
        return accountTitles;
    }

    /**
     * Sets the value of the accountTitles property.
     * 
     * @param value
     *     allowed object is
     *     {@link LName }
     *     
     */
    public void setAccountTitles(LName value) {
        this.accountTitles = value;
    }

    /**
     * Gets the value of the messages property.
     * 
     * @return
     *     possible object is
     *     {@link LName }
     *     
     */
    public LName getMessages() {
        return messages;
    }

    /**
     * Sets the value of the messages property.
     * 
     * @param value
     *     allowed object is
     *     {@link LName }
     *     
     */
    public void setMessages(LName value) {
        this.messages = value;
    }

    /**
     * Gets the value of the accountHints property.
     * 
     * @return
     *     possible object is
     *     {@link LName }
     *     
     */
    public LName getAccountHints() {
        return accountHints;
    }

    /**
     * Sets the value of the accountHints property.
     * 
     * @param value
     *     allowed object is
     *     {@link LName }
     *     
     */
    public void setAccountHints(LName value) {
        this.accountHints = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDate(Long value) {
        this.date = value;
    }

}
