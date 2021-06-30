
package com.apus.st;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UcoinsAchievementsRoot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UcoinsAchievementsRoot">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IconUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UcoinsAchievement" type="{http://st.apus.com/}UcoinsAchievements" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UcoinsAchievementsRoot", propOrder = {
    "iconUrl",
    "ucoinsAchievement"
})
public class UcoinsAchievementsRoot {

    @XmlElement(name = "IconUrl")
    protected String iconUrl;
    @XmlElement(name = "UcoinsAchievement")
    protected List<UcoinsAchievements> ucoinsAchievement;

    /**
     * Gets the value of the iconUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * Sets the value of the iconUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIconUrl(String value) {
        this.iconUrl = value;
    }

    /**
     * Gets the value of the ucoinsAchievement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ucoinsAchievement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUcoinsAchievement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UcoinsAchievements }
     * 
     * 
     */
    public List<UcoinsAchievements> getUcoinsAchievement() {
        if (ucoinsAchievement == null) {
            ucoinsAchievement = new ArrayList<UcoinsAchievements>();
        }
        return this.ucoinsAchievement;
    }

}
