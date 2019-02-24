//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.24 at 11:39:45 PM CET 
//


package com.hack23.cia.model.external.worldbank.topic.impl;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
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
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for TopicElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TopicElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sourceNote" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopicElement", propOrder = {
    "sourceNote",
    "topicValue"
})
@Entity(name = "TopicElement")
@Table(name = "TOPIC_ELEMENT")
@Inheritance(strategy = InheritanceType.JOINED)
public class TopicElement
    implements Serializable, ModelObject, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String sourceNote;
    @XmlElement(name = "value", required = true)
    protected String topicValue;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the sourceNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "SOURCE_NOTE", length = 65536)
    public String getSourceNote() {
        return sourceNote;
    }

    /**
     * Sets the value of the sourceNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceNote(String value) {
        this.sourceNote = value;
    }

    /**
     * Gets the value of the topicValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "TOPIC_VALUE", length = 65536)
    public String getTopicValue() {
        return topicValue;
    }

    /**
     * Sets the value of the topicValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopicValue(String value) {
        this.topicValue = value;
    }

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

    public TopicElement withSourceNote(String value) {
        setSourceNote(value);
        return this;
    }

    public TopicElement withTopicValue(String value) {
        setTopicValue(value);
        return this;
    }

    public TopicElement withId(String value) {
        setId(value);
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
            String theSourceNote;
            theSourceNote = this.getSourceNote();
            strategy.appendField(locator, this, "sourceNote", buffer, theSourceNote);
        }
        {
            String theTopicValue;
            theTopicValue = this.getTopicValue();
            strategy.appendField(locator, this, "topicValue", buffer, theTopicValue);
        }
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        return buffer;
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
        final TopicElement that = ((TopicElement) object);
        {
            String lhsSourceNote;
            lhsSourceNote = this.getSourceNote();
            String rhsSourceNote;
            rhsSourceNote = that.getSourceNote();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sourceNote", lhsSourceNote), LocatorUtils.property(thatLocator, "sourceNote", rhsSourceNote), lhsSourceNote, rhsSourceNote)) {
                return false;
            }
        }
        {
            String lhsTopicValue;
            lhsTopicValue = this.getTopicValue();
            String rhsTopicValue;
            rhsTopicValue = that.getTopicValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "topicValue", lhsTopicValue), LocatorUtils.property(thatLocator, "topicValue", rhsTopicValue), lhsTopicValue, rhsTopicValue)) {
                return false;
            }
        }
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
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
            String theSourceNote;
            theSourceNote = this.getSourceNote();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sourceNote", theSourceNote), currentHashCode, theSourceNote);
        }
        {
            String theTopicValue;
            theTopicValue = this.getTopicValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "topicValue", theTopicValue), currentHashCode, theTopicValue);
        }
        {
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
