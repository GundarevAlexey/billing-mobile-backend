
package com.apus.st;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for testCardP2PInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="testCardP2PInfoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="LimitAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BankLogo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Interbank" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="Offerta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CommissionMinSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="CommissionMaxSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="CommissionProcent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="CardMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CardType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="CommissionPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
 *                   &lt;element ref="{http://st.apus.com/}Errors" minOccurs="0"/>
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
@XmlType(name = "testCardP2PInfoResponse", propOrder = {
    "_return"
})
public class TestCardP2PInfoResponse {

    @XmlElement(name = "return")
    protected TestCardP2PInfoResponse.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link TestCardP2PInfoResponse.Return }
     *     
     */
    public TestCardP2PInfoResponse.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestCardP2PInfoResponse.Return }
     *     
     */
    public void setReturn(TestCardP2PInfoResponse.Return value) {
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
     *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="LimitAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BankLogo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Interbank" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="Offerta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CommissionMinSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="CommissionMaxSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="CommissionProcent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="CardMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CardType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="CommissionPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
     *         &lt;element ref="{http://st.apus.com/}Errors" minOccurs="0"/>
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
        "count",
        "amount",
        "limitAmount",
        "owner",
        "bankName",
        "bankLogo",
        "interbank",
        "offerta",
        "commissionMinSum",
        "commissionMaxSum",
        "commissionProcent",
        "cardMask",
        "cardType",
        "commissionPercent",
        "result",
        "errors"
    })
    public static class Return {

        @XmlElement(name = "Count")
        protected Integer count;
        @XmlElement(name = "Amount")
        protected Integer amount;
        @XmlElement(name = "LimitAmount")
        protected Long limitAmount;
        @XmlElement(name = "Owner")
        protected String owner;
        @XmlElement(name = "BankName")
        protected String bankName;
        @XmlElement(name = "BankLogo")
        protected String bankLogo;
        @XmlElement(name = "Interbank")
        protected Boolean interbank;
        @XmlElement(name = "Offerta")
        protected String offerta;
        @XmlElement(name = "CommissionMinSum")
        protected Integer commissionMinSum;
        @XmlElement(name = "CommissionMaxSum")
        protected Integer commissionMaxSum;
        @XmlElement(name = "CommissionProcent")
        protected Integer commissionProcent;
        @XmlElement(name = "CardMask")
        protected String cardMask;
        @XmlElement(name = "CardType")
        protected Integer cardType;
        @XmlElement(name = "CommissionPercent")
        protected BigDecimal commissionPercent;
        @XmlElement(name = "Result")
        protected TestCardP2PInfoResponse.Return.Result result;
        @XmlElement(name = "Errors", namespace = "http://st.apus.com/")
        protected Errors errors;

        /**
         * Gets the value of the count property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCount() {
            return count;
        }

        /**
         * Sets the value of the count property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCount(Integer value) {
            this.count = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setAmount(Integer value) {
            this.amount = value;
        }

        /**
         * Gets the value of the limitAmount property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getLimitAmount() {
            return limitAmount;
        }

        /**
         * Sets the value of the limitAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setLimitAmount(Long value) {
            this.limitAmount = value;
        }

        /**
         * Gets the value of the owner property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOwner() {
            return owner;
        }

        /**
         * Sets the value of the owner property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOwner(String value) {
            this.owner = value;
        }

        /**
         * Gets the value of the bankName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBankName() {
            return bankName;
        }

        /**
         * Sets the value of the bankName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBankName(String value) {
            this.bankName = value;
        }

        /**
         * Gets the value of the bankLogo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBankLogo() {
            return bankLogo;
        }

        /**
         * Sets the value of the bankLogo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBankLogo(String value) {
            this.bankLogo = value;
        }

        /**
         * Gets the value of the interbank property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isInterbank() {
            return interbank;
        }

        /**
         * Sets the value of the interbank property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setInterbank(Boolean value) {
            this.interbank = value;
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
         * Gets the value of the commissionMinSum property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCommissionMinSum() {
            return commissionMinSum;
        }

        /**
         * Sets the value of the commissionMinSum property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCommissionMinSum(Integer value) {
            this.commissionMinSum = value;
        }

        /**
         * Gets the value of the commissionMaxSum property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCommissionMaxSum() {
            return commissionMaxSum;
        }

        /**
         * Sets the value of the commissionMaxSum property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCommissionMaxSum(Integer value) {
            this.commissionMaxSum = value;
        }

        /**
         * Gets the value of the commissionProcent property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCommissionProcent() {
            return commissionProcent;
        }

        /**
         * Sets the value of the commissionProcent property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCommissionProcent(Integer value) {
            this.commissionProcent = value;
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
         * Gets the value of the commissionPercent property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCommissionPercent() {
            return commissionPercent;
        }

        /**
         * Sets the value of the commissionPercent property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCommissionPercent(BigDecimal value) {
            this.commissionPercent = value;
        }

        /**
         * Gets the value of the result property.
         * 
         * @return
         *     possible object is
         *     {@link TestCardP2PInfoResponse.Return.Result }
         *     
         */
        public TestCardP2PInfoResponse.Return.Result getResult() {
            return result;
        }

        /**
         * Sets the value of the result property.
         * 
         * @param value
         *     allowed object is
         *     {@link TestCardP2PInfoResponse.Return.Result }
         *     
         */
        public void setResult(TestCardP2PInfoResponse.Return.Result value) {
            this.result = value;
        }

        /**
         * Gets the value of the errors property.
         * 
         * @return
         *     possible object is
         *     {@link Errors }
         *     
         */
        public Errors getErrors() {
            return errors;
        }

        /**
         * Sets the value of the errors property.
         * 
         * @param value
         *     allowed object is
         *     {@link Errors }
         *     
         */
        public void setErrors(Errors value) {
            this.errors = value;
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
