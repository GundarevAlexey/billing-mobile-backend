
package com.apus.st;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThemeCoversRoot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThemeCoversRoot">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ThemeCover" type="{http://st.apus.com/}ThemeCovers" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThemeCoversRoot", propOrder = {
    "themeCover"
})
public class ThemeCoversRoot {

    @XmlElement(name = "ThemeCover")
    protected List<ThemeCovers> themeCover;

    /**
     * Gets the value of the themeCover property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the themeCover property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThemeCover().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThemeCovers }
     * 
     * 
     */
    public List<ThemeCovers> getThemeCover() {
        if (themeCover == null) {
            themeCover = new ArrayList<ThemeCovers>();
        }
        return this.themeCover;
    }

}
