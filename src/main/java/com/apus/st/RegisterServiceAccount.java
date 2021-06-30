
package com.apus.st;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for registerServiceAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registerServiceAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://st.apus.com/}RegisterServiceAccountRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registerServiceAccount", propOrder = {
    "registerServiceAccountRequest"
})
public class RegisterServiceAccount {

    @XmlElement(name = "RegisterServiceAccountRequest", namespace = "http://st.apus.com/")
    protected RegisterServiceAccountRequest registerServiceAccountRequest;

    /**
     * Gets the value of the registerServiceAccountRequest property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterServiceAccountRequest }
     *     
     */
    public RegisterServiceAccountRequest getRegisterServiceAccountRequest() {
        return registerServiceAccountRequest;
    }

    /**
     * Sets the value of the registerServiceAccountRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterServiceAccountRequest }
     *     
     */
    public void setRegisterServiceAccountRequest(RegisterServiceAccountRequest value) {
        this.registerServiceAccountRequest = value;
    }

}
