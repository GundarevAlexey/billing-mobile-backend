
package com.apus.st;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserUcoinsLevelsRoot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserUcoinsLevelsRoot">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserUcoinsLevel" type="{http://st.apus.com/}UserUcoinsLevel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserUcoinsLevelsRoot", propOrder = {
    "userUcoinsLevel"
})
public class UserUcoinsLevelsRoot {

    @XmlElement(name = "UserUcoinsLevel")
    protected List<UserUcoinsLevel> userUcoinsLevel;

    /**
     * Gets the value of the userUcoinsLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userUcoinsLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserUcoinsLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserUcoinsLevel }
     * 
     * 
     */
    public List<UserUcoinsLevel> getUserUcoinsLevel() {
        if (userUcoinsLevel == null) {
            userUcoinsLevel = new ArrayList<UserUcoinsLevel>();
        }
        return this.userUcoinsLevel;
    }

}
