
package com.apus.st;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceAccounts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceAccounts">
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
 *         &lt;element name="personalAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="debt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="saldo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="techPassport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="debit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="credit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accrued" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prepayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceAccounts", propOrder = {
    "objCode",
    "chet",
    "dcode",
    "mfo",
    "nalCode",
    "nalCodeName",
    "objAddress",
    "origObjAddress",
    "sumNed",
    "chetName",
    "personalAccount",
    "paymentAmount",
    "description",
    "fullName",
    "contract",
    "contractAmount",
    "debt",
    "saldo",
    "date",
    "location",
    "techPassport",
    "name",
    "balance",
    "paidAmount",
    "serviceName",
    "debit",
    "credit",
    "accrued",
    "prepayment"
})
public class ServiceAccounts {

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
    protected String personalAccount;
    protected String paymentAmount;
    protected String description;
    protected String fullName;
    protected String contract;
    protected String contractAmount;
    protected String debt;
    protected String saldo;
    protected String date;
    protected String location;
    protected String techPassport;
    protected String name;
    protected String balance;
    protected String paidAmount;
    protected String serviceName;
    protected String debit;
    protected String credit;
    protected String accrued;
    protected String prepayment;

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

    /**
     * Gets the value of the personalAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalAccount() {
        return personalAccount;
    }

    /**
     * Sets the value of the personalAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalAccount(String value) {
        this.personalAccount = value;
    }

    /**
     * Gets the value of the paymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * Sets the value of the paymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentAmount(String value) {
        this.paymentAmount = value;
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
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the contract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContract() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContract(String value) {
        this.contract = value;
    }

    /**
     * Gets the value of the contractAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractAmount() {
        return contractAmount;
    }

    /**
     * Sets the value of the contractAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractAmount(String value) {
        this.contractAmount = value;
    }

    /**
     * Gets the value of the debt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebt() {
        return debt;
    }

    /**
     * Sets the value of the debt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebt(String value) {
        this.debt = value;
    }

    /**
     * Gets the value of the saldo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaldo() {
        return saldo;
    }

    /**
     * Sets the value of the saldo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaldo(String value) {
        this.saldo = value;
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
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the techPassport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechPassport() {
        return techPassport;
    }

    /**
     * Sets the value of the techPassport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechPassport(String value) {
        this.techPassport = value;
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
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalance(String value) {
        this.balance = value;
    }

    /**
     * Gets the value of the paidAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaidAmount() {
        return paidAmount;
    }

    /**
     * Sets the value of the paidAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaidAmount(String value) {
        this.paidAmount = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the debit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebit() {
        return debit;
    }

    /**
     * Sets the value of the debit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebit(String value) {
        this.debit = value;
    }

    /**
     * Gets the value of the credit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredit() {
        return credit;
    }

    /**
     * Sets the value of the credit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredit(String value) {
        this.credit = value;
    }

    /**
     * Gets the value of the accrued property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccrued() {
        return accrued;
    }

    /**
     * Sets the value of the accrued property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccrued(String value) {
        this.accrued = value;
    }

    /**
     * Gets the value of the prepayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrepayment() {
        return prepayment;
    }

    /**
     * Sets the value of the prepayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrepayment(String value) {
        this.prepayment = value;
    }

}
