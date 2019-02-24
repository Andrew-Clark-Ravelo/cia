//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.25 at 12:05:09 AM CET 
//


package com.hack23.cia.model.internal.application.system.impl;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
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
 * <p>Java class for DomainPortal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DomainPortal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://system.application.internal.model.cia.hack23.com/impl}Portal"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DomainPortal", propOrder = {
    "domainName"
})
@Entity(name = "DomainPortal")
@Table(name = "DOMAIN_PORTAL")
public class DomainPortal
    extends Portal
    implements Serializable, Equals, HashCode, ToString
{

    protected String domainName;

    /**
     * Gets the value of the domainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "DOMAIN_NAME", length = 255)
    public String getDomainName() {
        return domainName;
    }

    /**
     * Sets the value of the domainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

    public DomainPortal withDomainName(String value) {
        setDomainName(value);
        return this;
    }

    @Override
    public DomainPortal withModelObjectId(Integer value) {
        setModelObjectId(value);
        return this;
    }

    @Override
    public DomainPortal withModelObjectVersion(int value) {
        setModelObjectVersion(value);
        return this;
    }

    @Override
    public DomainPortal withPortalName(String value) {
        setPortalName(value);
        return this;
    }

    @Override
    public DomainPortal withPortalType(PortalType value) {
        setPortalType(value);
        return this;
    }

    @Override
    public DomainPortal withDescription(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public DomainPortal withGoogleMapApiKey(String value) {
        setGoogleMapApiKey(value);
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
        super.appendFields(locator, buffer, strategy);
        {
            String theDomainName;
            theDomainName = this.getDomainName();
            strategy.appendField(locator, this, "domainName", buffer, theDomainName);
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
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final DomainPortal that = ((DomainPortal) object);
        {
            String lhsDomainName;
            lhsDomainName = this.getDomainName();
            String rhsDomainName;
            rhsDomainName = that.getDomainName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "domainName", lhsDomainName), LocatorUtils.property(thatLocator, "domainName", rhsDomainName), lhsDomainName, rhsDomainName)) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            String theDomainName;
            theDomainName = this.getDomainName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "domainName", theDomainName), currentHashCode, theDomainName);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
