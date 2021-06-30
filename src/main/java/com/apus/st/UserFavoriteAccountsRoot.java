
package com.apus.st;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserFavoriteAccountsRoot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserFavoriteAccountsRoot">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Favorite" type="{http://st.apus.com/}UserFavoriteAccounts" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserFavoriteAccountsRoot", propOrder = {
    "favorite"
})
public class UserFavoriteAccountsRoot {

    @XmlElement(name = "Favorite")
    protected List<UserFavoriteAccounts> favorite;

    /**
     * Gets the value of the favorite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the favorite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFavorite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserFavoriteAccounts }
     * 
     * 
     */
    public List<UserFavoriteAccounts> getFavorite() {
        if (favorite == null) {
            favorite = new ArrayList<UserFavoriteAccounts>();
        }
        return this.favorite;
    }

}
