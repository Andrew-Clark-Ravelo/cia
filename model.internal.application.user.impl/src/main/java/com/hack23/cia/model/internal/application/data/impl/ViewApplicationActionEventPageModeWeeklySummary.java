//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.25 at 12:05:09 AM CET 
//


package com.hack23.cia.model.internal.application.data.impl;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
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
 * <p>Java class for ViewApplicationActionEventPageModeWeeklySummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewApplicationActionEventPageModeWeeklySummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="embeddedId" type="{http://data.application.internal.model.cia.hack23.com/impl}ApplicationActionEventPageModePeriodSummaryEmbeddedId"/&gt;
 *         &lt;element name="hits" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="rank" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="rank_percentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewApplicationActionEventPageModeWeeklySummary", propOrder = {
    "embeddedId",
    "hits",
    "rank",
    "rankPercentage"
})
@Entity(name = "ViewApplicationActionEventPageModeWeeklySummary")
@Table(name = "view_application_action_event_page_modes_weekly_summary")
@Inheritance(strategy = InheritanceType.JOINED)
public class ViewApplicationActionEventPageModeWeeklySummary
    implements Serializable, ModelObject, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected ApplicationActionEventPageModePeriodSummaryEmbeddedId embeddedId;
    protected long hits;
    protected long rank;
    @XmlElement(name = "rank_percentage", required = true)
    protected BigDecimal rankPercentage;

    /**
     * Gets the value of the embeddedId property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationActionEventPageModePeriodSummaryEmbeddedId }
     *     
     */
    @EmbeddedId
    @AttributeOverrides({
        @AttributeOverride(name = "createdDate", column = @Column(name = "EMBEDDED_ID_CREATED_DATE")),
        @AttributeOverride(name = "page", column = @Column(name = "EMBEDDED_ID_PAGE", length = 255)),
        @AttributeOverride(name = "pageMode", column = @Column(name = "EMBEDDED_ID_PAGE_MODE", length = 255))
    })
    public ApplicationActionEventPageModePeriodSummaryEmbeddedId getEmbeddedId() {
        return embeddedId;
    }

    /**
     * Sets the value of the embeddedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationActionEventPageModePeriodSummaryEmbeddedId }
     *     
     */
    public void setEmbeddedId(ApplicationActionEventPageModePeriodSummaryEmbeddedId value) {
        this.embeddedId = value;
    }

    /**
     * Gets the value of the hits property.
     * 
     */
    @Basic
    @Column(name = "HITS", precision = 20, scale = 0)
    public long getHits() {
        return hits;
    }

    /**
     * Sets the value of the hits property.
     * 
     */
    public void setHits(long value) {
        this.hits = value;
    }

    /**
     * Gets the value of the rank property.
     * 
     */
    @Basic
    @Column(name = "RANK", precision = 20, scale = 0)
    public long getRank() {
        return rank;
    }

    /**
     * Sets the value of the rank property.
     * 
     */
    public void setRank(long value) {
        this.rank = value;
    }

    /**
     * Gets the value of the rankPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "RANK_PERCENTAGE", precision = 20, scale = 10)
    public BigDecimal getRankPercentage() {
        return rankPercentage;
    }

    /**
     * Sets the value of the rankPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRankPercentage(BigDecimal value) {
        this.rankPercentage = value;
    }

    public ViewApplicationActionEventPageModeWeeklySummary withEmbeddedId(ApplicationActionEventPageModePeriodSummaryEmbeddedId value) {
        setEmbeddedId(value);
        return this;
    }

    public ViewApplicationActionEventPageModeWeeklySummary withHits(long value) {
        setHits(value);
        return this;
    }

    public ViewApplicationActionEventPageModeWeeklySummary withRank(long value) {
        setRank(value);
        return this;
    }

    public ViewApplicationActionEventPageModeWeeklySummary withRankPercentage(BigDecimal value) {
        setRankPercentage(value);
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
            ApplicationActionEventPageModePeriodSummaryEmbeddedId theEmbeddedId;
            theEmbeddedId = this.getEmbeddedId();
            strategy.appendField(locator, this, "embeddedId", buffer, theEmbeddedId);
        }
        {
            long theHits;
            theHits = this.getHits();
            strategy.appendField(locator, this, "hits", buffer, theHits);
        }
        {
            long theRank;
            theRank = this.getRank();
            strategy.appendField(locator, this, "rank", buffer, theRank);
        }
        {
            BigDecimal theRankPercentage;
            theRankPercentage = this.getRankPercentage();
            strategy.appendField(locator, this, "rankPercentage", buffer, theRankPercentage);
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
        final ViewApplicationActionEventPageModeWeeklySummary that = ((ViewApplicationActionEventPageModeWeeklySummary) object);
        {
            ApplicationActionEventPageModePeriodSummaryEmbeddedId lhsEmbeddedId;
            lhsEmbeddedId = this.getEmbeddedId();
            ApplicationActionEventPageModePeriodSummaryEmbeddedId rhsEmbeddedId;
            rhsEmbeddedId = that.getEmbeddedId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "embeddedId", lhsEmbeddedId), LocatorUtils.property(thatLocator, "embeddedId", rhsEmbeddedId), lhsEmbeddedId, rhsEmbeddedId)) {
                return false;
            }
        }
        {
            long lhsHits;
            lhsHits = this.getHits();
            long rhsHits;
            rhsHits = that.getHits();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hits", lhsHits), LocatorUtils.property(thatLocator, "hits", rhsHits), lhsHits, rhsHits)) {
                return false;
            }
        }
        {
            long lhsRank;
            lhsRank = this.getRank();
            long rhsRank;
            rhsRank = that.getRank();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rank", lhsRank), LocatorUtils.property(thatLocator, "rank", rhsRank), lhsRank, rhsRank)) {
                return false;
            }
        }
        {
            BigDecimal lhsRankPercentage;
            lhsRankPercentage = this.getRankPercentage();
            BigDecimal rhsRankPercentage;
            rhsRankPercentage = that.getRankPercentage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rankPercentage", lhsRankPercentage), LocatorUtils.property(thatLocator, "rankPercentage", rhsRankPercentage), lhsRankPercentage, rhsRankPercentage)) {
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
            ApplicationActionEventPageModePeriodSummaryEmbeddedId theEmbeddedId;
            theEmbeddedId = this.getEmbeddedId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "embeddedId", theEmbeddedId), currentHashCode, theEmbeddedId);
        }
        {
            long theHits;
            theHits = this.getHits();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hits", theHits), currentHashCode, theHits);
        }
        {
            long theRank;
            theRank = this.getRank();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rank", theRank), currentHashCode, theRank);
        }
        {
            BigDecimal theRankPercentage;
            theRankPercentage = this.getRankPercentage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rankPercentage", theRankPercentage), currentHashCode, theRankPercentage);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
