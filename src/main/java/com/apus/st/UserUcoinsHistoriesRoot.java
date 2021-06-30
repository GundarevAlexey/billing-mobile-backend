
package com.apus.st;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserUcoinsHistoriesRoot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserUcoinsHistoriesRoot">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserUcoinsHistory" type="{http://st.apus.com/}UserUcoinsHistories" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserUcoinsHistoriesRoot", propOrder = {
    "userUcoinsHistory"
})
public class UserUcoinsHistoriesRoot {

    @XmlElement(name = "UserUcoinsHistory")
    protected List<UserUcoinsHistories> userUcoinsHistory;

    /**
     * Gets the value of the userUcoinsHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userUcoinsHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserUcoinsHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserUcoinsHistories }
     * 
     * 
     */
    public List<UserUcoinsHistories> getUserUcoinsHistory() {
        if (userUcoinsHistory == null) {
            userUcoinsHistory = new ArrayList<UserUcoinsHistories>();
        }
        return this.userUcoinsHistory;
    }

}
