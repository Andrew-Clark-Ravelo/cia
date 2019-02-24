//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.24 at 11:39:52 PM CET 
//


package com.hack23.cia.model.external.val.landstingvalkrets.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.hack23.cia.model.common.api.ModelObject;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for SwedenCountyElectoralRegionContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SwedenCountyElectoralRegionContainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="landsting" type="{http://landstingvalkrets.val.external.model.cia.hack23.com/impl}SwedenCountyElectoralRegion" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwedenCountyElectoralRegionContainer", propOrder = {
    "countyElectoralRegions"
})
@Entity(name = "SwedenCountyElectoralRegionContainer")
@Table(name = "SWEDEN_COUNTY_ELECTORAL_REGI_0")
@Inheritance(strategy = InheritanceType.JOINED)
public class SwedenCountyElectoralRegionContainer
    implements Serializable, ModelObject, Equals, HashCode
{

    @XmlElement(name = "landsting", required = true)
    protected List<SwedenCountyElectoralRegion> countyElectoralRegions;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the countyElectoralRegions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countyElectoralRegions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountyElectoralRegions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwedenCountyElectoralRegion }
     * 
     * 
     */
    @OneToMany(targetEntity = SwedenCountyElectoralRegion.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "COUNTY_ELECTORAL_REGIONS_SWE_0")
    public List<SwedenCountyElectoralRegion> getCountyElectoralRegions() {
        if (countyElectoralRegions == null) {
            countyElectoralRegions = new ArrayList<SwedenCountyElectoralRegion>();
        }
        return this.countyElectoralRegions;
    }

    /**
     * 
     * 
     */
    public void setCountyElectoralRegions(List<SwedenCountyElectoralRegion> countyElectoralRegions) {
        this.countyElectoralRegions = countyElectoralRegions;
    }

    /**
     * Gets the value of the hjid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getHjid() {
        return hjid;
    }

    /**
     * Sets the value of the hjid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHjid(Long value) {
        this.hjid = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SwedenCountyElectoralRegionContainer that = ((SwedenCountyElectoralRegionContainer) object);
        {
            List<SwedenCountyElectoralRegion> lhsCountyElectoralRegions;
            lhsCountyElectoralRegions = (((this.countyElectoralRegions!= null)&&(!this.countyElectoralRegions.isEmpty()))?this.getCountyElectoralRegions():null);
            List<SwedenCountyElectoralRegion> rhsCountyElectoralRegions;
            rhsCountyElectoralRegions = (((that.countyElectoralRegions!= null)&&(!that.countyElectoralRegions.isEmpty()))?that.getCountyElectoralRegions():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "countyElectoralRegions", lhsCountyElectoralRegions), LocatorUtils.property(thatLocator, "countyElectoralRegions", rhsCountyElectoralRegions), lhsCountyElectoralRegions, rhsCountyElectoralRegions)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            List<SwedenCountyElectoralRegion> theCountyElectoralRegions;
            theCountyElectoralRegions = (((this.countyElectoralRegions!= null)&&(!this.countyElectoralRegions.isEmpty()))?this.getCountyElectoralRegions():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "countyElectoralRegions", theCountyElectoralRegions), currentHashCode, theCountyElectoralRegions);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
