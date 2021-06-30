
package com.apus.st;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UcoinsFaqsRoot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UcoinsFaqsRoot">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UcoinsFaq" type="{http://st.apus.com/}UcoinsFaqs" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UcoinsFaqsRoot", propOrder = {
    "ucoinsFaq"
})
public class UcoinsFaqsRoot {

    @XmlElement(name = "UcoinsFaq")
    protected List<UcoinsFaqs> ucoinsFaq;

    /**
     * Gets the value of the ucoinsFaq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ucoinsFaq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUcoinsFaq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UcoinsFaqs }
     * 
     * 
     */
    public List<UcoinsFaqs> getUcoinsFaq() {
        if (ucoinsFaq == null) {
            ucoinsFaq = new ArrayList<UcoinsFaqs>();
        }
        return this.ucoinsFaq;
    }

}
