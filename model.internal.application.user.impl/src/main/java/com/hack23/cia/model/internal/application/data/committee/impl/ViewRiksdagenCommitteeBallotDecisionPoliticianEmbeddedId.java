//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.25 at 12:05:09 AM CET 
//


package com.hack23.cia.model.internal.application.data.committee.impl;

import java.io.Serializable;
import java.math.BigDecimal;
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
 * <p>Java class for ViewRiksdagenCommitteeBallotDecisionPoliticianEmbeddedId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewRiksdagenCommitteeBallotDecisionPoliticianEmbeddedId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="intressent_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="hangar_id" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="issue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="concern" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewRiksdagenCommitteeBallotDecisionPoliticianEmbeddedId", propOrder = {
    "id",
    "intressentId",
    "hangarId",
    "issue",
    "concern"
})
@Embeddable
public class ViewRiksdagenCommitteeBallotDecisionPoliticianEmbeddedId
    implements Serializable, ModelObject, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String id;
    @XmlElement(name = "intressent_id", required = true)
    protected String intressentId;
    @XmlElement(name = "hangar_id", required = true)
    protected BigDecimal hangarId;
    @XmlElement(required = true)
    protected String issue;
    @XmlElement(required = true)
    protected String concern;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ID", length = 255)
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the intressentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "INTRESSENT_ID", length = 255)
    public String getIntressentId() {
        return intressentId;
    }

    /**
     * Sets the value of the intressentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntressentId(String value) {
        this.intressentId = value;
    }

    /**
     * Gets the value of the hangarId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "HANGAR_ID", precision = 20, scale = 10)
    public BigDecimal getHangarId() {
        return hangarId;
    }

    /**
     * Sets the value of the hangarId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHangarId(BigDecimal value) {
        this.hangarId = value;
    }

    /**
     * Gets the value of the issue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ISSUE", length = 255)
    public String getIssue() {
        return issue;
    }

    /**
     * Sets the value of the issue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssue(String value) {
        this.issue = value;
    }

    /**
     * Gets the value of the concern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CONCERN", length = 255)
    public String getConcern() {
        return concern;
    }

    /**
     * Sets the value of the concern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConcern(String value) {
        this.concern = value;
    }

    public ViewRiksdagenCommitteeBallotDecisionPoliticianEmbeddedId withId(String value) {
        setId(value);
        return this;
    }

    public ViewRiksdagenCommitteeBallotDecisionPoliticianEmbeddedId withIntressentId(String value) {
        setIntressentId(value);
        return this;
    }

    public ViewRiksdagenCommitteeBallotDecisionPoliticianEmbeddedId withHangarId(BigDecimal value) {
        setHangarId(value);
        return this;
    }

    public ViewRiksdagenCommitteeBallotDecisionPoliticianEmbeddedId withIssue(String value) {
        setIssue(value);
        return this;
    }

    public ViewRiksdagenCommitteeBallotDecisionPoliticianEmbeddedId withConcern(String value) {
        setConcern(value);
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
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            String theIntressentId;
            theIntressentId = this.getIntressentId();
            strategy.appendField(locator, this, "intressentId", buffer, theIntressentId);
        }
        {
            BigDecimal theHangarId;
            theHangarId = this.getHangarId();
            strategy.appendField(locator, this, "hangarId", buffer, theHangarId);
        }
        {
            String theIssue;
            theIssue = this.getIssue();
            strategy.appendField(locator, this, "issue", buffer, theIssue);
        }
        {
            String theConcern;
            theConcern = this.getConcern();
            strategy.appendField(locator, this, "concern", buffer, theConcern);
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
        final ViewRiksdagenCommitteeBallotDecisionPoliticianEmbeddedId that = ((ViewRiksdagenCommitteeBallotDecisionPoliticianEmbeddedId) object);
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        {
            String lhsIntressentId;
            lhsIntressentId = this.getIntressentId();
            String rhsIntressentId;
            rhsIntressentId = that.getIntressentId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "intressentId", lhsIntressentId), LocatorUtils.property(thatLocator, "intressentId", rhsIntressentId), lhsIntressentId, rhsIntressentId)) {
                return false;
            }
        }
        {
            BigDecimal lhsHangarId;
            lhsHangarId = this.getHangarId();
            BigDecimal rhsHangarId;
            rhsHangarId = that.getHangarId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hangarId", lhsHangarId), LocatorUtils.property(thatLocator, "hangarId", rhsHangarId), lhsHangarId, rhsHangarId)) {
                return false;
            }
        }
        {
            String lhsIssue;
            lhsIssue = this.getIssue();
            String rhsIssue;
            rhsIssue = that.getIssue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "issue", lhsIssue), LocatorUtils.property(thatLocator, "issue", rhsIssue), lhsIssue, rhsIssue)) {
                return false;
            }
        }
        {
            String lhsConcern;
            lhsConcern = this.getConcern();
            String rhsConcern;
            rhsConcern = that.getConcern();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "concern", lhsConcern), LocatorUtils.property(thatLocator, "concern", rhsConcern), lhsConcern, rhsConcern)) {
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
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        {
            String theIntressentId;
            theIntressentId = this.getIntressentId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "intressentId", theIntressentId), currentHashCode, theIntressentId);
        }
        {
            BigDecimal theHangarId;
            theHangarId = this.getHangarId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hangarId", theHangarId), currentHashCode, theHangarId);
        }
        {
            String theIssue;
            theIssue = this.getIssue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "issue", theIssue), currentHashCode, theIssue);
        }
        {
            String theConcern;
            theConcern = this.getConcern();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "concern", theConcern), currentHashCode, theConcern);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
