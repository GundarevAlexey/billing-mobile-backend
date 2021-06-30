
package com.apus.st;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UcoinsPercentsRoot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UcoinsPercentsRoot">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UcoinsPercent" type="{http://st.apus.com/}UcoinsPercent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UcoinsPercentsRoot", propOrder = {
    "ucoinsPercent"
})
public class UcoinsPercentsRoot {

    @XmlElement(name = "UcoinsPercent")
    protected List<UcoinsPercent> ucoinsPercent;

    /**
     * Gets the value of the ucoinsPercent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ucoinsPercent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUcoinsPercent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UcoinsPercent }
     * 
     * 
     */
    public List<UcoinsPercent> getUcoinsPercent() {
        if (ucoinsPercent == null) {
            ucoinsPercent = new ArrayList<UcoinsPercent>();
        }
        return this.ucoinsPercent;
    }

}
