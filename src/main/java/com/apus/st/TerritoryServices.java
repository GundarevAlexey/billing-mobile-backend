
package com.apus.st;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerritoryServices complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerritoryServices">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ServiceName" type="{http://st.apus.com/}LName" minOccurs="0"/>
 *         &lt;element name="RegionTitle" type="{http://st.apus.com/}LName" minOccurs="0"/>
 *         &lt;element name="SubRegionTitle" type="{http://st.apus.com/}LName" minOccurs="0"/>
 *         &lt;element name="TerritoryAreas" type="{http://st.apus.com/}AreasRoot" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerritoryServices", propOrder = {
    "serviceId",
    "serviceName",
    "regionTitle",
    "subRegionTitle",
    "territoryAreas"
})
public class TerritoryServices {

    @XmlElement(name = "ServiceId")
    protected Integer serviceId;
    @XmlElement(name = "ServiceName")
    protected LName serviceName;
    @XmlElement(name = "RegionTitle")
    protected LName regionTitle;
    @XmlElement(name = "SubRegionTitle")
    protected LName subRegionTitle;
    @XmlElement(name = "TerritoryAreas")
    protected AreasRoot territoryAreas;

    /**
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServiceId(Integer value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link LName }
     *     
     */
    public LName getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link LName }
     *     
     */
    public void setServiceName(LName value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the regionTitle property.
     * 
     * @return
     *     possible object is
     *     {@link LName }
     *     
     */
    public LName getRegionTitle() {
        return regionTitle;
    }

    /**
     * Sets the value of the regionTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link LName }
     *     
     */
    public void setRegionTitle(LName value) {
        this.regionTitle = value;
    }

    /**
     * Gets the value of the subRegionTitle property.
     * 
     * @return
     *     possible object is
     *     {@link LName }
     *     
     */
    public LName getSubRegionTitle() {
        return subRegionTitle;
    }

    /**
     * Sets the value of the subRegionTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link LName }
     *     
     */
    public void setSubRegionTitle(LName value) {
        this.subRegionTitle = value;
    }

    /**
     * Gets the value of the territoryAreas property.
     * 
     * @return
     *     possible object is
     *     {@link AreasRoot }
     *     
     */
    public AreasRoot getTerritoryAreas() {
        return territoryAreas;
    }

    /**
     * Sets the value of the territoryAreas property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreasRoot }
     *     
     */
    public void setTerritoryAreas(AreasRoot value) {
        this.territoryAreas = value;
    }

}
