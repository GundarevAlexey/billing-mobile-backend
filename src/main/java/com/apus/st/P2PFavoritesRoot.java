
package com.apus.st;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for P2PFavoritesRoot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="P2PFavoritesRoot">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="P2PFavorite" type="{http://st.apus.com/}P2PFavorites" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "P2PFavoritesRoot", propOrder = {
    "p2PFavorite"
})
public class P2PFavoritesRoot {

    @XmlElement(name = "P2PFavorite")
    protected List<P2PFavorites> p2PFavorite;

    /**
     * Gets the value of the p2PFavorite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the p2PFavorite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getP2PFavorite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link P2PFavorites }
     * 
     * 
     */
    public List<P2PFavorites> getP2PFavorite() {
        if (p2PFavorite == null) {
            p2PFavorite = new ArrayList<P2PFavorites>();
        }
        return this.p2PFavorite;
    }

}
