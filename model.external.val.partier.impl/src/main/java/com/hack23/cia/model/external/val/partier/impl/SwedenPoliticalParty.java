//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.24 at 11:39:47 PM CET 
//


package com.hack23.cia.model.external.val.partier.impl;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for SwedenPoliticalParty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SwedenPoliticalParty"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="partibeteckning" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="forkortning" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="id_parti" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="co_adress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="telefon" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="gatuadress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="telefax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="postnummer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="postort" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="epost" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="webbplats" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="registreringsdatum" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwedenPoliticalParty", propOrder = {
    "partyName",
    "shortCode",
    "partyId",
    "coAddress",
    "phoneNumber",
    "address",
    "faxNumber",
    "postCode",
    "city",
    "email",
    "website",
    "registeredDate"
})
@Entity(name = "SwedenPoliticalParty")
@Table(name = "SWEDEN_POLITICAL_PARTY")
@Inheritance(strategy = InheritanceType.JOINED)
public class SwedenPoliticalParty
    implements Serializable, ModelObject, Equals, HashCode
{

    @XmlElement(name = "partibeteckning", required = true)
    protected String partyName;
    @XmlElement(name = "forkortning", required = true)
    protected String shortCode;
    @XmlElement(name = "id_parti", required = true)
    protected String partyId;
    @XmlElement(name = "co_adress", required = true)
    protected String coAddress;
    @XmlElement(name = "telefon", required = true)
    protected String phoneNumber;
    @XmlElement(name = "gatuadress", required = true)
    protected String address;
    @XmlElement(name = "telefax", required = true)
    protected String faxNumber;
    @XmlElement(name = "postnummer", required = true)
    protected String postCode;
    @XmlElement(name = "postort", required = true)
    protected String city;
    @XmlElement(name = "epost", required = true)
    protected String email;
    @XmlElement(name = "webbplats", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String website;
    @XmlElement(name = "registreringsdatum", required = true, type = String.class)
    @XmlJavaTypeAdapter(XmlDateTypeAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date registeredDate;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

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
     * Gets the value of the shortCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "SHORT_CODE", length = 255)
    public String getShortCode() {
        return shortCode;
    }

    /**
     * Sets the value of the shortCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortCode(String value) {
        this.shortCode = value;
    }

    /**
     * Gets the value of the partyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PARTY_ID", length = 255)
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
     * Gets the value of the coAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CO_ADDRESS", length = 255)
    public String getCoAddress() {
        return coAddress;
    }

    /**
     * Sets the value of the coAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoAddress(String value) {
        this.coAddress = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PHONE_NUMBER", length = 255)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ADDRESS", length = 255)
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the faxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "FAX_NUMBER", length = 255)
    public String getFaxNumber() {
        return faxNumber;
    }

    /**
     * Sets the value of the faxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNumber(String value) {
        this.faxNumber = value;
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "POST_CODE", length = 255)
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CITY", length = 255)
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "EMAIL", length = 255)
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
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
    @Column(name = "WEBSITE")
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
        final SwedenPoliticalParty that = ((SwedenPoliticalParty) object);
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
            String lhsShortCode;
            lhsShortCode = this.getShortCode();
            String rhsShortCode;
            rhsShortCode = that.getShortCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shortCode", lhsShortCode), LocatorUtils.property(thatLocator, "shortCode", rhsShortCode), lhsShortCode, rhsShortCode)) {
                return false;
            }
        }
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
            String lhsCoAddress;
            lhsCoAddress = this.getCoAddress();
            String rhsCoAddress;
            rhsCoAddress = that.getCoAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "coAddress", lhsCoAddress), LocatorUtils.property(thatLocator, "coAddress", rhsCoAddress), lhsCoAddress, rhsCoAddress)) {
                return false;
            }
        }
        {
            String lhsPhoneNumber;
            lhsPhoneNumber = this.getPhoneNumber();
            String rhsPhoneNumber;
            rhsPhoneNumber = that.getPhoneNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "phoneNumber", lhsPhoneNumber), LocatorUtils.property(thatLocator, "phoneNumber", rhsPhoneNumber), lhsPhoneNumber, rhsPhoneNumber)) {
                return false;
            }
        }
        {
            String lhsAddress;
            lhsAddress = this.getAddress();
            String rhsAddress;
            rhsAddress = that.getAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "address", lhsAddress), LocatorUtils.property(thatLocator, "address", rhsAddress), lhsAddress, rhsAddress)) {
                return false;
            }
        }
        {
            String lhsFaxNumber;
            lhsFaxNumber = this.getFaxNumber();
            String rhsFaxNumber;
            rhsFaxNumber = that.getFaxNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "faxNumber", lhsFaxNumber), LocatorUtils.property(thatLocator, "faxNumber", rhsFaxNumber), lhsFaxNumber, rhsFaxNumber)) {
                return false;
            }
        }
        {
            String lhsPostCode;
            lhsPostCode = this.getPostCode();
            String rhsPostCode;
            rhsPostCode = that.getPostCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postCode", lhsPostCode), LocatorUtils.property(thatLocator, "postCode", rhsPostCode), lhsPostCode, rhsPostCode)) {
                return false;
            }
        }
        {
            String lhsCity;
            lhsCity = this.getCity();
            String rhsCity;
            rhsCity = that.getCity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "city", lhsCity), LocatorUtils.property(thatLocator, "city", rhsCity), lhsCity, rhsCity)) {
                return false;
            }
        }
        {
            String lhsEmail;
            lhsEmail = this.getEmail();
            String rhsEmail;
            rhsEmail = that.getEmail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "email", lhsEmail), LocatorUtils.property(thatLocator, "email", rhsEmail), lhsEmail, rhsEmail)) {
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
            String thePartyName;
            thePartyName = this.getPartyName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partyName", thePartyName), currentHashCode, thePartyName);
        }
        {
            String theShortCode;
            theShortCode = this.getShortCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shortCode", theShortCode), currentHashCode, theShortCode);
        }
        {
            String thePartyId;
            thePartyId = this.getPartyId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partyId", thePartyId), currentHashCode, thePartyId);
        }
        {
            String theCoAddress;
            theCoAddress = this.getCoAddress();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "coAddress", theCoAddress), currentHashCode, theCoAddress);
        }
        {
            String thePhoneNumber;
            thePhoneNumber = this.getPhoneNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "phoneNumber", thePhoneNumber), currentHashCode, thePhoneNumber);
        }
        {
            String theAddress;
            theAddress = this.getAddress();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "address", theAddress), currentHashCode, theAddress);
        }
        {
            String theFaxNumber;
            theFaxNumber = this.getFaxNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "faxNumber", theFaxNumber), currentHashCode, theFaxNumber);
        }
        {
            String thePostCode;
            thePostCode = this.getPostCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "postCode", thePostCode), currentHashCode, thePostCode);
        }
        {
            String theCity;
            theCity = this.getCity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "city", theCity), currentHashCode, theCity);
        }
        {
            String theEmail;
            theEmail = this.getEmail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "email", theEmail), currentHashCode, theEmail);
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
