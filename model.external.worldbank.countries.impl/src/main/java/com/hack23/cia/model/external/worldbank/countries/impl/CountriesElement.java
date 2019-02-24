//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.24 at 11:26:40 PM CET 
//


package com.hack23.cia.model.external.worldbank.countries.impl;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.Basic;
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
import javax.xml.bind.annotation.XmlRootElement;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://countries.worldbank.external.model.cia.hack23.com/impl}country" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="page" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="pages" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="per_page" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="total" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "country"
})
@XmlRootElement(name = "countries")
@Entity(name = "CountriesElement")
@Table(name = "COUNTRIES_ELEMENT")
@Inheritance(strategy = InheritanceType.JOINED)
public class CountriesElement
    implements Serializable, ModelObject, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected List<CountryElement> country;
    @XmlAttribute(name = "page", required = true)
    protected BigInteger page;
    @XmlAttribute(name = "pages", required = true)
    protected BigInteger pages;
    @XmlAttribute(name = "per_page", required = true)
    protected BigInteger perPage;
    @XmlAttribute(name = "total", required = true)
    protected BigInteger total;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the country property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the country property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryElement }
     * 
     * 
     */
    @OneToMany(targetEntity = CountryElement.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "COUNTRY_COUNTRIES_ELEMENT_HJ_0")
    public List<CountryElement> getCountry() {
        if (country == null) {
            country = new ArrayList<CountryElement>();
        }
        return this.country;
    }

    /**
     * 
     * 
     */
    public void setCountry(List<CountryElement> country) {
        this.country = country;
    }

    /**
     * Gets the value of the page property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Basic
    @Column(name = "PAGE", precision = 20, scale = 0)
    public BigInteger getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPage(BigInteger value) {
        this.page = value;
    }

    /**
     * Gets the value of the pages property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Basic
    @Column(name = "PAGES", precision = 20, scale = 0)
    public BigInteger getPages() {
        return pages;
    }

    /**
     * Sets the value of the pages property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPages(BigInteger value) {
        this.pages = value;
    }

    /**
     * Gets the value of the perPage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Basic
    @Column(name = "PER_PAGE", precision = 20, scale = 0)
    public BigInteger getPerPage() {
        return perPage;
    }

    /**
     * Sets the value of the perPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPerPage(BigInteger value) {
        this.perPage = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Basic
    @Column(name = "TOTAL", precision = 20, scale = 0)
    public BigInteger getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotal(BigInteger value) {
        this.total = value;
    }

    public CountriesElement withCountry(CountryElement... values) {
        if (values!= null) {
            for (CountryElement value: values) {
                getCountry().add(value);
            }
        }
        return this;
    }

    public CountriesElement withCountry(Collection<CountryElement> values) {
        if (values!= null) {
            getCountry().addAll(values);
        }
        return this;
    }

    public CountriesElement withCountry(List<CountryElement> country) {
        setCountry(country);
        return this;
    }

    public CountriesElement withPage(BigInteger value) {
        setPage(value);
        return this;
    }

    public CountriesElement withPages(BigInteger value) {
        setPages(value);
        return this;
    }

    public CountriesElement withPerPage(BigInteger value) {
        setPerPage(value);
        return this;
    }

    public CountriesElement withTotal(BigInteger value) {
        setTotal(value);
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
            List<CountryElement> theCountry;
            theCountry = (((this.country!= null)&&(!this.country.isEmpty()))?this.getCountry():null);
            strategy.appendField(locator, this, "country", buffer, theCountry);
        }
        {
            BigInteger thePage;
            thePage = this.getPage();
            strategy.appendField(locator, this, "page", buffer, thePage);
        }
        {
            BigInteger thePages;
            thePages = this.getPages();
            strategy.appendField(locator, this, "pages", buffer, thePages);
        }
        {
            BigInteger thePerPage;
            thePerPage = this.getPerPage();
            strategy.appendField(locator, this, "perPage", buffer, thePerPage);
        }
        {
            BigInteger theTotal;
            theTotal = this.getTotal();
            strategy.appendField(locator, this, "total", buffer, theTotal);
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
        final CountriesElement that = ((CountriesElement) object);
        {
            List<CountryElement> lhsCountry;
            lhsCountry = (((this.country!= null)&&(!this.country.isEmpty()))?this.getCountry():null);
            List<CountryElement> rhsCountry;
            rhsCountry = (((that.country!= null)&&(!that.country.isEmpty()))?that.getCountry():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "country", lhsCountry), LocatorUtils.property(thatLocator, "country", rhsCountry), lhsCountry, rhsCountry)) {
                return false;
            }
        }
        {
            BigInteger lhsPage;
            lhsPage = this.getPage();
            BigInteger rhsPage;
            rhsPage = that.getPage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "page", lhsPage), LocatorUtils.property(thatLocator, "page", rhsPage), lhsPage, rhsPage)) {
                return false;
            }
        }
        {
            BigInteger lhsPages;
            lhsPages = this.getPages();
            BigInteger rhsPages;
            rhsPages = that.getPages();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pages", lhsPages), LocatorUtils.property(thatLocator, "pages", rhsPages), lhsPages, rhsPages)) {
                return false;
            }
        }
        {
            BigInteger lhsPerPage;
            lhsPerPage = this.getPerPage();
            BigInteger rhsPerPage;
            rhsPerPage = that.getPerPage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "perPage", lhsPerPage), LocatorUtils.property(thatLocator, "perPage", rhsPerPage), lhsPerPage, rhsPerPage)) {
                return false;
            }
        }
        {
            BigInteger lhsTotal;
            lhsTotal = this.getTotal();
            BigInteger rhsTotal;
            rhsTotal = that.getTotal();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "total", lhsTotal), LocatorUtils.property(thatLocator, "total", rhsTotal), lhsTotal, rhsTotal)) {
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
            List<CountryElement> theCountry;
            theCountry = (((this.country!= null)&&(!this.country.isEmpty()))?this.getCountry():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "country", theCountry), currentHashCode, theCountry);
        }
        {
            BigInteger thePage;
            thePage = this.getPage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "page", thePage), currentHashCode, thePage);
        }
        {
            BigInteger thePages;
            thePages = this.getPages();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pages", thePages), currentHashCode, thePages);
        }
        {
            BigInteger thePerPage;
            thePerPage = this.getPerPage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "perPage", thePerPage), currentHashCode, thePerPage);
        }
        {
            BigInteger theTotal;
            theTotal = this.getTotal();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "total", theTotal), currentHashCode, theTotal);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
