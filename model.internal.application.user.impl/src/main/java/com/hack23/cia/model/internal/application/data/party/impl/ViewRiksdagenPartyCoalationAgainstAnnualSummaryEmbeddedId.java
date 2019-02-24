//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.25 at 12:05:09 AM CET 
//


package com.hack23.cia.model.internal.application.data.party.impl;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.hack23.cia.model.common.api.ModelObject;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for ViewRiksdagenPartyCoalationAgainstAnnualSummaryEmbeddedId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewRiksdagenPartyCoalationAgainstAnnualSummaryEmbeddedId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="group_against" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewRiksdagenPartyCoalationAgainstAnnualSummaryEmbeddedId", propOrder = {
    "year",
    "groupAgainst"
})
@Embeddable
public class ViewRiksdagenPartyCoalationAgainstAnnualSummaryEmbeddedId
    implements Serializable, ModelObject, Equals, HashCode, ToString
{

    protected int year;
    @XmlElement(name = "group_against", required = true)
    protected String groupAgainst;

    /**
     * Gets the value of the year property.
     * 
     */
    @Basic
    @Column(name = "YEAR_", precision = 10, scale = 0)
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

    /**
     * Gets the value of the groupAgainst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "GROUP_AGAINST", length = 255)
    public String getGroupAgainst() {
        return groupAgainst;
    }

    /**
     * Sets the value of the groupAgainst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupAgainst(String value) {
        this.groupAgainst = value;
    }

    public ViewRiksdagenPartyCoalationAgainstAnnualSummaryEmbeddedId withYear(int value) {
        setYear(value);
        return this;
    }

    public ViewRiksdagenPartyCoalationAgainstAnnualSummaryEmbeddedId withGroupAgainst(String value) {
        setGroupAgainst(value);
        return this;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            int theYear;
            theYear = this.getYear();
            strategy.appendField(locator, this, "year", buffer, theYear);
        }
        {
            String theGroupAgainst;
            theGroupAgainst = this.getGroupAgainst();
            strategy.appendField(locator, this, "groupAgainst", buffer, theGroupAgainst);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ViewRiksdagenPartyCoalationAgainstAnnualSummaryEmbeddedId that = ((ViewRiksdagenPartyCoalationAgainstAnnualSummaryEmbeddedId) object);
        {
            int lhsYear;
            lhsYear = this.getYear();
            int rhsYear;
            rhsYear = that.getYear();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "year", lhsYear), LocatorUtils.property(thatLocator, "year", rhsYear), lhsYear, rhsYear)) {
                return false;
            }
        }
        {
            String lhsGroupAgainst;
            lhsGroupAgainst = this.getGroupAgainst();
            String rhsGroupAgainst;
            rhsGroupAgainst = that.getGroupAgainst();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "groupAgainst", lhsGroupAgainst), LocatorUtils.property(thatLocator, "groupAgainst", rhsGroupAgainst), lhsGroupAgainst, rhsGroupAgainst)) {
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
            int theYear;
            theYear = this.getYear();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "year", theYear), currentHashCode, theYear);
        }
        {
            String theGroupAgainst;
            theGroupAgainst = this.getGroupAgainst();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "groupAgainst", theGroupAgainst), currentHashCode, theGroupAgainst);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
