
package com.apus.st;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TitlesTagAndNameForServicesRoot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TitlesTagAndNameForServicesRoot">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TitlesTagAndNameForServices" type="{http://st.apus.com/}TitlesTagAndNameForServices" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TitlesTagAndNameForServicesRoot", propOrder = {
    "titlesTagAndNameForServices"
})
public class TitlesTagAndNameForServicesRoot {

    @XmlElement(name = "TitlesTagAndNameForServices")
    protected List<TitlesTagAndNameForServices> titlesTagAndNameForServices;

    /**
     * Gets the value of the titlesTagAndNameForServices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titlesTagAndNameForServices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitlesTagAndNameForServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TitlesTagAndNameForServices }
     * 
     * 
     */
    public List<TitlesTagAndNameForServices> getTitlesTagAndNameForServices() {
        if (titlesTagAndNameForServices == null) {
            titlesTagAndNameForServices = new ArrayList<TitlesTagAndNameForServices>();
        }
        return this.titlesTagAndNameForServices;
    }

}
