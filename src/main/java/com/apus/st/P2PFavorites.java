
package com.apus.st;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for P2PFavorites complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="P2PFavorites">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FavId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Fio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CardDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankLogo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CardType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CardThemes" type="{http://st.apus.com/}CardTheme" minOccurs="0"/>
 *         &lt;element name="BankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "P2PFavorites", propOrder = {
    "favId",
    "userId",
    "fio",
    "bankId",
    "cardDesc",
    "bankLogo",
    "active",
    "cardType",
    "cardThemes",
    "bankName"
})
public class P2PFavorites {

    @XmlElement(name = "FavId")
    protected Integer favId;
    @XmlElement(name = "UserId")
    protected Integer userId;
    @XmlElement(name = "Fio")
    protected String fio;
    @XmlElement(name = "BankId")
    protected Integer bankId;
    @XmlElement(name = "CardDesc")
    protected String cardDesc;
    @XmlElement(name = "BankLogo")
    protected String bankLogo;
    @XmlElement(name = "Active")
    protected Boolean active;
    @XmlElement(name = "CardType")
    protected Integer cardType;
    @XmlElement(name = "CardThemes")
    protected CardTheme cardThemes;
    @XmlElement(name = "BankName")
    protected String bankName;

    /**
     * Gets the value of the favId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFavId() {
        return favId;
    }

    /**
     * Sets the value of the favId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFavId(Integer value) {
        this.favId = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserId(Integer value) {
        this.userId = value;
    }

    /**
     * Gets the value of the fio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFio() {
        return fio;
    }

    /**
     * Sets the value of the fio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFio(String value) {
        this.fio = value;
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
     * Gets the value of the cardDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardDesc() {
        return cardDesc;
    }

    /**
     * Sets the value of the cardDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardDesc(String value) {
        this.cardDesc = value;
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
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
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

}
