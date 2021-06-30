
package com.apus.st;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardTheme complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardTheme">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="white" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardTheme", propOrder = {
    "color",
    "white",
    "dark"
})
public class CardTheme {

    protected String color;
    protected String white;
    protected String dark;

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the white property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhite() {
        return white;
    }

    /**
     * Sets the value of the white property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhite(String value) {
        this.white = value;
    }

    /**
     * Gets the value of the dark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDark() {
        return dark;
    }

    /**
     * Sets the value of the dark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDark(String value) {
        this.dark = value;
    }

}
