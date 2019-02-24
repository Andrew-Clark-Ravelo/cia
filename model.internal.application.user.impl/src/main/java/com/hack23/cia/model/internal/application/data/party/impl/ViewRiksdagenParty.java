//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.25 at 12:05:09 AM CET 
//


package com.hack23.cia.model.internal.application.data.party.impl;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.hack23.cia.model.common.api.ModelObject;
import com.hack23.cia.model.common.impl.xml.XmlDateTypeAdapter;
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
 * <p>Java class for ViewRiksdagenParty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewRiksdagenParty"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="partyId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="partyNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="partyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="headCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="website" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="registeredDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewRiksdagenParty", propOrder = {
    "partyId",
    "partyNumber",
    "partyName",
    "headCount",
    "website",
    "registeredDate"
})
@Entity(name = "ViewRiksdagenParty")
@Table(name = "VIEW_RIKSDAGEN_PARTY")
@Inheritance(strategy = InheritanceType.JOINED)
public class ViewRiksdagenParty
    implements Serializable, ModelObject, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String partyId;
    @XmlElement(required = true)
    protected String partyNumber;
    @XmlElement(required = true)
    protected String partyName;
    protected long headCount;
    @XmlElement(required = true)
    protected String website;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(XmlDateTypeAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date registeredDate;

    /**
     * Gets the value of the partyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Id
    @Column(name = "PARTY_ID")
    public String getPartyId() {
        return partyId;
    }

    /**
     * Sets the value of the partyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyId(String value) {
        this.partyId = value;
    }

    /**
     * Gets the value of the partyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PARTY_NUMBER", length = 255)
    public String getPartyNumber() {
        return partyNumber;
    }

    /**
     * Sets the value of the partyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyNumber(String value) {
        this.partyNumber = value;
    }

    /**
     * Gets the value of the partyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PARTY_NAME", length = 255)
    public String getPartyName() {
        return partyName;
    }

    /**
     * Sets the value of the partyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyName(String value) {
        this.partyName = value;
    }

    /**
     * Gets the value of the headCount property.
     * 
     */
    @Basic
    @Column(name = "HEAD_COUNT", precision = 20, scale = 0)
    public long getHeadCount() {
        return headCount;
    }

    /**
     * Sets the value of the headCount property.
     * 
     */
    public void setHeadCount(long value) {
        this.headCount = value;
    }

    /**
     * Gets the value of the website property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "WEBSITE", length = 255)
    public String getWebsite() {
        return website;
    }

    /**
     * Sets the value of the website property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebsite(String value) {
        this.website = value;
    }

    /**
     * Gets the value of the registeredDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "REGISTERED_DATE")
    @Temporal(TemporalType.DATE)
    public Date getRegisteredDate() {
        return registeredDate;
    }

    /**
     * Sets the value of the registeredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisteredDate(Date value) {
        this.registeredDate = value;
    }

    public ViewRiksdagenParty withPartyId(String value) {
        setPartyId(value);
        return this;
    }

    public ViewRiksdagenParty withPartyNumber(String value) {
        setPartyNumber(value);
        return this;
    }

    public ViewRiksdagenParty withPartyName(String value) {
        setPartyName(value);
        return this;
    }

    public ViewRiksdagenParty withHeadCount(long value) {
        setHeadCount(value);
        return this;
    }

    public ViewRiksdagenParty withWebsite(String value) {
        setWebsite(value);
        return this;
    }

    public ViewRiksdagenParty withRegisteredDate(Date value) {
        setRegisteredDate(value);
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
            String thePartyId;
            thePartyId = this.getPartyId();
            strategy.appendField(locator, this, "partyId", buffer, thePartyId);
        }
        {
            String thePartyNumber;
            thePartyNumber = this.getPartyNumber();
            strategy.appendField(locator, this, "partyNumber", buffer, thePartyNumber);
        }
        {
            String thePartyName;
            thePartyName = this.getPartyName();
            strategy.appendField(locator, this, "partyName", buffer, thePartyName);
        }
        {
            long theHeadCount;
            theHeadCount = this.getHeadCount();
            strategy.appendField(locator, this, "headCount", buffer, theHeadCount);
        }
        {
            String theWebsite;
            theWebsite = this.getWebsite();
            strategy.appendField(locator, this, "website", buffer, theWebsite);
        }
        {
            Date theRegisteredDate;
            theRegisteredDate = this.getRegisteredDate();
            strategy.appendField(locator, this, "registeredDate", buffer, theRegisteredDate);
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
        final ViewRiksdagenParty that = ((ViewRiksdagenParty) object);
        {
            String lhsPartyId;
            lhsPartyId = this.getPartyId();
            String rhsPartyId;
            rhsPartyId = that.getPartyId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partyId", lhsPartyId), LocatorUtils.property(thatLocator, "partyId", rhsPartyId), lhsPartyId, rhsPartyId)) {
                return false;
            }
        }
        {
            String lhsPartyNumber;
            lhsPartyNumber = this.getPartyNumber();
            String rhsPartyNumber;
            rhsPartyNumber = that.getPartyNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partyNumber", lhsPartyNumber), LocatorUtils.property(thatLocator, "partyNumber", rhsPartyNumber), lhsPartyNumber, rhsPartyNumber)) {
                return false;
            }
        }
        {
            String lhsPartyName;
            lhsPartyName = this.getPartyName();
            String rhsPartyName;
            rhsPartyName = that.getPartyName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partyName", lhsPartyName), LocatorUtils.property(thatLocator, "partyName", rhsPartyName), lhsPartyName, rhsPartyName)) {
                return false;
            }
        }
        {
            long lhsHeadCount;
            lhsHeadCount = this.getHeadCount();
            long rhsHeadCount;
            rhsHeadCount = that.getHeadCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "headCount", lhsHeadCount), LocatorUtils.property(thatLocator, "headCount", rhsHeadCount), lhsHeadCount, rhsHeadCount)) {
                return false;
            }
        }
        {
            String lhsWebsite;
            lhsWebsite = this.getWebsite();
            String rhsWebsite;
            rhsWebsite = that.getWebsite();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "website", lhsWebsite), LocatorUtils.property(thatLocator, "website", rhsWebsite), lhsWebsite, rhsWebsite)) {
                return false;
            }
        }
        {
            Date lhsRegisteredDate;
            lhsRegisteredDate = this.getRegisteredDate();
            Date rhsRegisteredDate;
            rhsRegisteredDate = that.getRegisteredDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "registeredDate", lhsRegisteredDate), LocatorUtils.property(thatLocator, "registeredDate", rhsRegisteredDate), lhsRegisteredDate, rhsRegisteredDate)) {
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
            String thePartyId;
            thePartyId = this.getPartyId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partyId", thePartyId), currentHashCode, thePartyId);
        }
        {
            String thePartyNumber;
            thePartyNumber = this.getPartyNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partyNumber", thePartyNumber), currentHashCode, thePartyNumber);
        }
        {
            String thePartyName;
            thePartyName = this.getPartyName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partyName", thePartyName), currentHashCode, thePartyName);
        }
        {
            long theHeadCount;
            theHeadCount = this.getHeadCount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "headCount", theHeadCount), currentHashCode, theHeadCount);
        }
        {
            String theWebsite;
            theWebsite = this.getWebsite();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "website", theWebsite), currentHashCode, theWebsite);
        }
        {
            Date theRegisteredDate;
            theRegisteredDate = this.getRegisteredDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "registeredDate", theRegisteredDate), currentHashCode, theRegisteredDate);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
