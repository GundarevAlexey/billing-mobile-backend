
package com.apus.st;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpayFaqsRoot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpayFaqsRoot">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UpayFaq" type="{http://st.apus.com/}UpayFaqs" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpayFaqsRoot", propOrder = {
    "upayFaq"
})
public class UpayFaqsRoot {

    @XmlElement(name = "UpayFaq")
    protected List<UpayFaqs> upayFaq;

    /**
     * Gets the value of the upayFaq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the upayFaq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpayFaq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpayFaqs }
     * 
     * 
     */
    public List<UpayFaqs> getUpayFaq() {
        if (upayFaq == null) {
            upayFaq = new ArrayList<UpayFaqs>();
        }
        return this.upayFaq;
    }

}
