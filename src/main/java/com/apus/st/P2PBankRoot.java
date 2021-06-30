
package com.apus.st;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for P2PBankRoot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="P2PBankRoot">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="P2PBank" type="{http://st.apus.com/}P2PBank" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "P2PBankRoot", propOrder = {
    "p2PBank"
})
public class P2PBankRoot {

    @XmlElement(name = "P2PBank")
    protected List<P2PBank> p2PBank;

    /**
     * Gets the value of the p2PBank property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the p2PBank property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getP2PBank().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link P2PBank }
     * 
     * 
     */
    public List<P2PBank> getP2PBank() {
        if (p2PBank == null) {
            p2PBank = new ArrayList<P2PBank>();
        }
        return this.p2PBank;
    }

}
