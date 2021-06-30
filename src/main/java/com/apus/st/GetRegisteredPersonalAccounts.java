
package com.apus.st;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRegisteredPersonalAccounts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRegisteredPersonalAccounts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://st.apus.com/}RegisteredPersonalAccountRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRegisteredPersonalAccounts", propOrder = {
    "registeredPersonalAccountRequest"
})
public class GetRegisteredPersonalAccounts {

    @XmlElement(name = "RegisteredPersonalAccountRequest", namespace = "http://st.apus.com/")
    protected RegisteredPersonalAccountRequest registeredPersonalAccountRequest;

    /**
     * Gets the value of the registeredPersonalAccountRequest property.
     * 
     * @return
     *     possible object is
     *     {@link RegisteredPersonalAccountRequest }
     *     
     */
    public RegisteredPersonalAccountRequest getRegisteredPersonalAccountRequest() {
        return registeredPersonalAccountRequest;
    }

    /**
     * Sets the value of the registeredPersonalAccountRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisteredPersonalAccountRequest }
     *     
     */
    public void setRegisteredPersonalAccountRequest(RegisteredPersonalAccountRequest value) {
        this.registeredPersonalAccountRequest = value;
    }

}
