
package com.apus.st;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getKvitansiaParamsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getKvitansiaParamsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ServiceId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="EopsTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ServiceTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PersonalAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PaymentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ClientAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ClientFio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ClientCardDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ServiceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ServiceBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ServiceBankAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ServiceBankMfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ServiceBankInn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Tarif1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Tarif2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Tarif3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BudgetAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BudgetIncome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ContractDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NumberOfResidents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="GovPayerInn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="GovPayerAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PaymentFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PaymentTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PayerCounterTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PaymentTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PayerCounter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PayerCounterDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "getKvitansiaParamsResponse", propOrder = {
    "_return"
})
public class GetKvitansiaParamsResponse {

    @XmlElement(name = "return")
    protected GetKvitansiaParamsResponse.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetKvitansiaParamsResponse.Return }
     *     
     */
    public GetKvitansiaParamsResponse.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetKvitansiaParamsResponse.Return }
     *     
     */
    public void setReturn(GetKvitansiaParamsResponse.Return value) {
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
     *         &lt;element name="ServiceId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="EopsTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ServiceTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PersonalAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PaymentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ClientAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ClientFio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ClientCardDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ServiceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ServiceBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ServiceBankAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ServiceBankMfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ServiceBankInn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Tarif1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Tarif2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Tarif3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BudgetAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BudgetIncome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ContractDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NumberOfResidents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="GovPayerInn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="GovPayerAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PaymentFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PaymentTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PayerCounterTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PaymentTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PayerCounter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PayerCounterDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "serviceId",
        "transactionId",
        "eopsTransactionId",
        "serviceTransactionId",
        "personalAccount",
        "paymentDate",
        "paymentAmount",
        "clientAddress",
        "clientFio",
        "clientCardDesc",
        "serviceName",
        "serviceBankName",
        "serviceBankAccount",
        "serviceBankMfo",
        "serviceBankInn",
        "tarif1",
        "tarif2",
        "tarif3",
        "budgetAccount",
        "budgetIncome",
        "description",
        "contractDate",
        "area",
        "numberOfResidents",
        "govPayerInn",
        "govPayerAccount",
        "paymentType",
        "paymentFrom",
        "paymentTo",
        "payerCounterTerm",
        "paymentTypeName",
        "payerCounter",
        "payerCounterDate",
        "result"
    })
    public static class Return {

        @XmlElement(name = "ServiceId")
        protected Integer serviceId;
        @XmlElement(name = "TransactionId")
        protected Long transactionId;
        @XmlElement(name = "EopsTransactionId")
        protected String eopsTransactionId;
        @XmlElement(name = "ServiceTransactionId")
        protected String serviceTransactionId;
        @XmlElement(name = "PersonalAccount")
        protected String personalAccount;
        @XmlElement(name = "PaymentDate")
        protected String paymentDate;
        @XmlElement(name = "PaymentAmount")
        protected String paymentAmount;
        @XmlElement(name = "ClientAddress")
        protected String clientAddress;
        @XmlElement(name = "ClientFio")
        protected String clientFio;
        @XmlElement(name = "ClientCardDesc")
        protected String clientCardDesc;
        @XmlElement(name = "ServiceName")
        protected String serviceName;
        @XmlElement(name = "ServiceBankName")
        protected String serviceBankName;
        @XmlElement(name = "ServiceBankAccount")
        protected String serviceBankAccount;
        @XmlElement(name = "ServiceBankMfo")
        protected String serviceBankMfo;
        @XmlElement(name = "ServiceBankInn")
        protected String serviceBankInn;
        @XmlElement(name = "Tarif1")
        protected String tarif1;
        @XmlElement(name = "Tarif2")
        protected String tarif2;
        @XmlElement(name = "Tarif3")
        protected String tarif3;
        @XmlElement(name = "BudgetAccount")
        protected String budgetAccount;
        @XmlElement(name = "BudgetIncome")
        protected String budgetIncome;
        @XmlElement(name = "Description")
        protected String description;
        @XmlElement(name = "ContractDate")
        protected String contractDate;
        @XmlElement(name = "Area")
        protected String area;
        @XmlElement(name = "NumberOfResidents")
        protected String numberOfResidents;
        @XmlElement(name = "GovPayerInn")
        protected String govPayerInn;
        @XmlElement(name = "GovPayerAccount")
        protected String govPayerAccount;
        @XmlElement(name = "PaymentType")
        protected String paymentType;
        @XmlElement(name = "PaymentFrom")
        protected String paymentFrom;
        @XmlElement(name = "PaymentTo")
        protected String paymentTo;
        @XmlElement(name = "PayerCounterTerm")
        protected String payerCounterTerm;
        @XmlElement(name = "PaymentTypeName")
        protected String paymentTypeName;
        @XmlElement(name = "PayerCounter")
        protected String payerCounter;
        @XmlElement(name = "PayerCounterDate")
        protected String payerCounterDate;
        @XmlElement(name = "Result")
        protected GetKvitansiaParamsResponse.Return.Result result;

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
         * Gets the value of the transactionId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getTransactionId() {
            return transactionId;
        }

        /**
         * Sets the value of the transactionId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setTransactionId(Long value) {
            this.transactionId = value;
        }

        /**
         * Gets the value of the eopsTransactionId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEopsTransactionId() {
            return eopsTransactionId;
        }

        /**
         * Sets the value of the eopsTransactionId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEopsTransactionId(String value) {
            this.eopsTransactionId = value;
        }

        /**
         * Gets the value of the serviceTransactionId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceTransactionId() {
            return serviceTransactionId;
        }

        /**
         * Sets the value of the serviceTransactionId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceTransactionId(String value) {
            this.serviceTransactionId = value;
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
         * Gets the value of the paymentDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentDate() {
            return paymentDate;
        }

        /**
         * Sets the value of the paymentDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentDate(String value) {
            this.paymentDate = value;
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
         * Gets the value of the clientAddress property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClientAddress() {
            return clientAddress;
        }

        /**
         * Sets the value of the clientAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClientAddress(String value) {
            this.clientAddress = value;
        }

        /**
         * Gets the value of the clientFio property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClientFio() {
            return clientFio;
        }

        /**
         * Sets the value of the clientFio property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClientFio(String value) {
            this.clientFio = value;
        }

        /**
         * Gets the value of the clientCardDesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClientCardDesc() {
            return clientCardDesc;
        }

        /**
         * Sets the value of the clientCardDesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClientCardDesc(String value) {
            this.clientCardDesc = value;
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
         * Gets the value of the serviceBankName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceBankName() {
            return serviceBankName;
        }

        /**
         * Sets the value of the serviceBankName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceBankName(String value) {
            this.serviceBankName = value;
        }

        /**
         * Gets the value of the serviceBankAccount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceBankAccount() {
            return serviceBankAccount;
        }

        /**
         * Sets the value of the serviceBankAccount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceBankAccount(String value) {
            this.serviceBankAccount = value;
        }

        /**
         * Gets the value of the serviceBankMfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceBankMfo() {
            return serviceBankMfo;
        }

        /**
         * Sets the value of the serviceBankMfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceBankMfo(String value) {
            this.serviceBankMfo = value;
        }

        /**
         * Gets the value of the serviceBankInn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceBankInn() {
            return serviceBankInn;
        }

        /**
         * Sets the value of the serviceBankInn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceBankInn(String value) {
            this.serviceBankInn = value;
        }

        /**
         * Gets the value of the tarif1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTarif1() {
            return tarif1;
        }

        /**
         * Sets the value of the tarif1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTarif1(String value) {
            this.tarif1 = value;
        }

        /**
         * Gets the value of the tarif2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTarif2() {
            return tarif2;
        }

        /**
         * Sets the value of the tarif2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTarif2(String value) {
            this.tarif2 = value;
        }

        /**
         * Gets the value of the tarif3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTarif3() {
            return tarif3;
        }

        /**
         * Sets the value of the tarif3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTarif3(String value) {
            this.tarif3 = value;
        }

        /**
         * Gets the value of the budgetAccount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBudgetAccount() {
            return budgetAccount;
        }

        /**
         * Sets the value of the budgetAccount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBudgetAccount(String value) {
            this.budgetAccount = value;
        }

        /**
         * Gets the value of the budgetIncome property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBudgetIncome() {
            return budgetIncome;
        }

        /**
         * Sets the value of the budgetIncome property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBudgetIncome(String value) {
            this.budgetIncome = value;
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
         * Gets the value of the contractDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContractDate() {
            return contractDate;
        }

        /**
         * Sets the value of the contractDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContractDate(String value) {
            this.contractDate = value;
        }

        /**
         * Gets the value of the area property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getArea() {
            return area;
        }

        /**
         * Sets the value of the area property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setArea(String value) {
            this.area = value;
        }

        /**
         * Gets the value of the numberOfResidents property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumberOfResidents() {
            return numberOfResidents;
        }

        /**
         * Sets the value of the numberOfResidents property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumberOfResidents(String value) {
            this.numberOfResidents = value;
        }

        /**
         * Gets the value of the govPayerInn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGovPayerInn() {
            return govPayerInn;
        }

        /**
         * Sets the value of the govPayerInn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGovPayerInn(String value) {
            this.govPayerInn = value;
        }

        /**
         * Gets the value of the govPayerAccount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGovPayerAccount() {
            return govPayerAccount;
        }

        /**
         * Sets the value of the govPayerAccount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGovPayerAccount(String value) {
            this.govPayerAccount = value;
        }

        /**
         * Gets the value of the paymentType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentType() {
            return paymentType;
        }

        /**
         * Sets the value of the paymentType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentType(String value) {
            this.paymentType = value;
        }

        /**
         * Gets the value of the paymentFrom property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentFrom() {
            return paymentFrom;
        }

        /**
         * Sets the value of the paymentFrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentFrom(String value) {
            this.paymentFrom = value;
        }

        /**
         * Gets the value of the paymentTo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentTo() {
            return paymentTo;
        }

        /**
         * Sets the value of the paymentTo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentTo(String value) {
            this.paymentTo = value;
        }

        /**
         * Gets the value of the payerCounterTerm property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPayerCounterTerm() {
            return payerCounterTerm;
        }

        /**
         * Sets the value of the payerCounterTerm property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPayerCounterTerm(String value) {
            this.payerCounterTerm = value;
        }

        /**
         * Gets the value of the paymentTypeName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentTypeName() {
            return paymentTypeName;
        }

        /**
         * Sets the value of the paymentTypeName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentTypeName(String value) {
            this.paymentTypeName = value;
        }

        /**
         * Gets the value of the payerCounter property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPayerCounter() {
            return payerCounter;
        }

        /**
         * Sets the value of the payerCounter property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPayerCounter(String value) {
            this.payerCounter = value;
        }

        /**
         * Gets the value of the payerCounterDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPayerCounterDate() {
            return payerCounterDate;
        }

        /**
         * Sets the value of the payerCounterDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPayerCounterDate(String value) {
            this.payerCounterDate = value;
        }

        /**
         * Gets the value of the result property.
         * 
         * @return
         *     possible object is
         *     {@link GetKvitansiaParamsResponse.Return.Result }
         *     
         */
        public GetKvitansiaParamsResponse.Return.Result getResult() {
            return result;
        }

        /**
         * Sets the value of the result property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetKvitansiaParamsResponse.Return.Result }
         *     
         */
        public void setResult(GetKvitansiaParamsResponse.Return.Result value) {
            this.result = value;
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
