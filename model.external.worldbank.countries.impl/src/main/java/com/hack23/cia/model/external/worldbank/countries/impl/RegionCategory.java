//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.24 at 11:26:40 PM CET 
//


package com.hack23.cia.model.external.worldbank.countries.impl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegionCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RegionCategory"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="East Asia &amp; Pacific (all income levels)"/&gt;
 *     &lt;enumeration value="Europe &amp; Central Asia (all income levels)"/&gt;
 *     &lt;enumeration value="Latin America &amp; Caribbean (all income levels)"/&gt;
 *     &lt;enumeration value="Middle East &amp; North Africa (all income levels)"/&gt;
 *     &lt;enumeration value="Aggregates"/&gt;
 *     &lt;enumeration value="North America"/&gt;
 *     &lt;enumeration value="Sub-Saharan Africa (all income levels)"/&gt;
 *     &lt;enumeration value="South Asia"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RegionCategory")
@XmlEnum
public enum RegionCategory {

    @XmlEnumValue("East Asia & Pacific (all income levels)")
    EAST_ASIA_PACIFIC_ALL_INCOME_LEVELS("East Asia & Pacific (all income levels)"),
    @XmlEnumValue("Europe & Central Asia (all income levels)")
    EUROPE_CENTRAL_ASIA_ALL_INCOME_LEVELS("Europe & Central Asia (all income levels)"),
    @XmlEnumValue("Latin America & Caribbean (all income levels)")
    LATIN_AMERICA_CARIBBEAN_ALL_INCOME_LEVELS("Latin America & Caribbean (all income levels)"),
    @XmlEnumValue("Middle East & North Africa (all income levels)")
    MIDDLE_EAST_NORTH_AFRICA_ALL_INCOME_LEVELS("Middle East & North Africa (all income levels)"),
    @XmlEnumValue("Aggregates")
    AGGREGATES("Aggregates"),
    @XmlEnumValue("North America")
    NORTH_AMERICA("North America"),
    @XmlEnumValue("Sub-Saharan Africa (all income levels)")
    SUB_SAHARAN_AFRICA_ALL_INCOME_LEVELS("Sub-Saharan Africa (all income levels)"),
    @XmlEnumValue("South Asia")
    SOUTH_ASIA("South Asia");
    private final String value;

    RegionCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegionCategory fromValue(String v) {
        for (RegionCategory c: RegionCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
