//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.25 at 12:05:09 AM CET 
//


package com.hack23.cia.model.internal.application.data.document.impl;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
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
 * <p>Java class for RiksdagenDocumentPartySummaryEmbeddedId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RiksdagenDocumentPartySummaryEmbeddedId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="public_date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="party_short_code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="document_type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RiksdagenDocumentPartySummaryEmbeddedId", propOrder = {
    "publicDate",
    "partyShortCode",
    "documentType"
})
@Embeddable
public class RiksdagenDocumentPartySummaryEmbeddedId
    implements Serializable, ModelObject, Equals, HashCode, ToString
{

    @XmlElement(name = "public_date", required = true, type = String.class)
    @XmlJavaTypeAdapter(XmlDateTypeAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date publicDate;
    @XmlElement(name = "party_short_code", required = true)
    protected String partyShortCode;
    @XmlElement(name = "document_type", required = true)
    protected String documentType;

    /**
     * Gets the value of the publicDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PUBLIC_DATE")
    @Temporal(TemporalType.DATE)
    public Date getPublicDate() {
        return publicDate;
    }

    /**
     * Sets the value of the publicDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicDate(Date value) {
        this.publicDate = value;
    }

    /**
     * Gets the value of the partyShortCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PARTY_SHORT_CODE", length = 255)
    public String getPartyShortCode() {
        return partyShortCode;
    }

    /**
     * Sets the value of the partyShortCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyShortCode(String value) {
        this.partyShortCode = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "DOCUMENT_TYPE", length = 255)
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    public RiksdagenDocumentPartySummaryEmbeddedId withPublicDate(Date value) {
        setPublicDate(value);
        return this;
    }

    public RiksdagenDocumentPartySummaryEmbeddedId withPartyShortCode(String value) {
        setPartyShortCode(value);
        return this;
    }

    public RiksdagenDocumentPartySummaryEmbeddedId withDocumentType(String value) {
        setDocumentType(value);
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
            Date thePublicDate;
            thePublicDate = this.getPublicDate();
            strategy.appendField(locator, this, "publicDate", buffer, thePublicDate);
        }
        {
            String thePartyShortCode;
            thePartyShortCode = this.getPartyShortCode();
            strategy.appendField(locator, this, "partyShortCode", buffer, thePartyShortCode);
        }
        {
            String theDocumentType;
            theDocumentType = this.getDocumentType();
            strategy.appendField(locator, this, "documentType", buffer, theDocumentType);
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
        final RiksdagenDocumentPartySummaryEmbeddedId that = ((RiksdagenDocumentPartySummaryEmbeddedId) object);
        {
            Date lhsPublicDate;
            lhsPublicDate = this.getPublicDate();
            Date rhsPublicDate;
            rhsPublicDate = that.getPublicDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "publicDate", lhsPublicDate), LocatorUtils.property(thatLocator, "publicDate", rhsPublicDate), lhsPublicDate, rhsPublicDate)) {
                return false;
            }
        }
        {
            String lhsPartyShortCode;
            lhsPartyShortCode = this.getPartyShortCode();
            String rhsPartyShortCode;
            rhsPartyShortCode = that.getPartyShortCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partyShortCode", lhsPartyShortCode), LocatorUtils.property(thatLocator, "partyShortCode", rhsPartyShortCode), lhsPartyShortCode, rhsPartyShortCode)) {
                return false;
            }
        }
        {
            String lhsDocumentType;
            lhsDocumentType = this.getDocumentType();
            String rhsDocumentType;
            rhsDocumentType = that.getDocumentType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentType", lhsDocumentType), LocatorUtils.property(thatLocator, "documentType", rhsDocumentType), lhsDocumentType, rhsDocumentType)) {
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
            Date thePublicDate;
            thePublicDate = this.getPublicDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "publicDate", thePublicDate), currentHashCode, thePublicDate);
        }
        {
            String thePartyShortCode;
            thePartyShortCode = this.getPartyShortCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partyShortCode", thePartyShortCode), currentHashCode, thePartyShortCode);
        }
        {
            String theDocumentType;
            theDocumentType = this.getDocumentType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentType", theDocumentType), currentHashCode, theDocumentType);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
