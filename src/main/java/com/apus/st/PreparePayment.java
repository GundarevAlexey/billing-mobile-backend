
package com.apus.st;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for preparePayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="preparePayment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://st.apus.com/}PreparePaymentRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "preparePayment", propOrder = {
    "preparePaymentRequest"
})
public class PreparePayment {

    @XmlElement(name = "PreparePaymentRequest", namespace = "http://st.apus.com/", nillable = true)
    protected Object preparePaymentRequest;

    /**
     * Gets the value of the preparePaymentRequest property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPreparePaymentRequest() {
        return preparePaymentRequest;
    }

    /**
     * Sets the value of the preparePaymentRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPreparePaymentRequest(Object value) {
        this.preparePaymentRequest = value;
    }

}
