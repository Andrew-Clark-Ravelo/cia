//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.24 at 11:39:54 PM CET 
//


package com.hack23.cia.model.external.val.kommunvalkrets.impl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hack23.cia.model.external.val.kommunvalkrets.impl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Root_QNAME = new QName("http://kommunvalkrets.val.external.model.cia.hack23.com/impl", "root");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hack23.cia.model.external.val.kommunvalkrets.impl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SwedenCountyDataContainer }
     * 
     */
    public SwedenCountyDataContainer createSwedenCountyDataContainer() {
        return new SwedenCountyDataContainer();
    }

    /**
     * Create an instance of {@link SwedenCountyData }
     * 
     */
    public SwedenCountyData createSwedenCountyData() {
        return new SwedenCountyData();
    }

    /**
     * Create an instance of {@link SwedenMunicipalityData }
     * 
     */
    public SwedenMunicipalityData createSwedenMunicipalityData() {
        return new SwedenMunicipalityData();
    }

    /**
     * Create an instance of {@link SwedenMunicipalityElectionRegionData }
     * 
     */
    public SwedenMunicipalityElectionRegionData createSwedenMunicipalityElectionRegionData() {
        return new SwedenMunicipalityElectionRegionData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SwedenCountyDataContainer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kommunvalkrets.val.external.model.cia.hack23.com/impl", name = "root")
    public JAXBElement<SwedenCountyDataContainer> createRoot(SwedenCountyDataContainer value) {
        return new JAXBElement<SwedenCountyDataContainer>(_Root_QNAME, SwedenCountyDataContainer.class, null, value);
    }

}
