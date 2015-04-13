//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.12 at 04:20:59 PM CDT 
//


package com.bigfix.schemas.bes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="Fixlet" type="{}FixletWithActions"/>
 *         &lt;element name="Task" type="{}Task"/>
 *         &lt;element name="Analysis" type="{}Analysis"/>
 *         &lt;element name="SingleAction" type="{}SingleAction"/>
 *         &lt;element name="SourcedFixletAction" type="{}SourcedFixletAction"/>
 *         &lt;element name="MultipleActionGroup" type="{}MultipleActionGroup"/>
 *         &lt;element name="Baseline" type="{}Baseline"/>
 *         &lt;element name="ComputerGroup" type="{}ComputerGroup"/>
 *         &lt;element name="CustomSite">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{}Site">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ActionSite">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{}Site">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ExternalSite">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{}Site">
 *                 &lt;sequence>
 *                   &lt;element name="Masthead" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OperatorSite">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{}ObjectName"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Property">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;>Property">
 *                 &lt;attribute name="SkipUI" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *       &lt;attribute name="SkipUI" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fixletOrTaskOrAnalysis"
})
@XmlRootElement(name = "BES")
public class BES {

    @XmlElements({
        @XmlElement(name = "Fixlet", type = FixletWithActions.class),
        @XmlElement(name = "Task", type = Task.class),
        @XmlElement(name = "Analysis", type = Analysis.class),
        @XmlElement(name = "SingleAction", type = SingleAction.class),
        @XmlElement(name = "SourcedFixletAction", type = SourcedFixletAction.class),
        @XmlElement(name = "MultipleActionGroup", type = MultipleActionGroup.class),
        @XmlElement(name = "Baseline", type = Baseline.class),
        @XmlElement(name = "ComputerGroup", type = ComputerGroup.class),
        @XmlElement(name = "CustomSite", type = BES.CustomSite.class),
        @XmlElement(name = "ActionSite", type = BES.ActionSite.class),
        @XmlElement(name = "ExternalSite", type = BES.ExternalSite.class),
        @XmlElement(name = "OperatorSite", type = BES.OperatorSite.class),
        @XmlElement(name = "Property", type = BES.Property.class)
    })
    protected List<Object> fixletOrTaskOrAnalysis;
    @XmlAttribute(name = "SkipUI")
    protected Boolean skipUI;

    /**
     * Gets the value of the fixletOrTaskOrAnalysis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fixletOrTaskOrAnalysis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFixletOrTaskOrAnalysis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FixletWithActions }
     * {@link Task }
     * {@link Analysis }
     * {@link SingleAction }
     * {@link SourcedFixletAction }
     * {@link MultipleActionGroup }
     * {@link Baseline }
     * {@link ComputerGroup }
     * {@link BES.CustomSite }
     * {@link BES.ActionSite }
     * {@link BES.ExternalSite }
     * {@link BES.OperatorSite }
     * {@link BES.Property }
     * 
     * 
     */
    public List<Object> getFixletOrTaskOrAnalysis() {
        if (fixletOrTaskOrAnalysis == null) {
            fixletOrTaskOrAnalysis = new ArrayList<Object>();
        }
        return this.fixletOrTaskOrAnalysis;
    }

    /**
     * Gets the value of the skipUI property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkipUI() {
        return skipUI;
    }

    /**
     * Sets the value of the skipUI property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipUI(Boolean value) {
        this.skipUI = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{}Site">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ActionSite
        extends Site
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{}Site">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CustomSite
        extends Site
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{}Site">
     *       &lt;sequence>
     *         &lt;element name="Masthead" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "masthead"
    })
    public static class ExternalSite
        extends Site
    {

        @XmlElement(name = "Masthead")
        protected String masthead;

        /**
         * Gets the value of the masthead property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMasthead() {
            return masthead;
        }

        /**
         * Sets the value of the masthead property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMasthead(String value) {
            this.masthead = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Name" type="{}ObjectName"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name"
    })
    public static class OperatorSite {

        @XmlElement(name = "Name", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String name;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;>Property">
     *       &lt;attribute name="SkipUI" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Property
        extends com.bigfix.schemas.bes.Property
    {

        @XmlAttribute(name = "SkipUI")
        protected Boolean skipUI;

        /**
         * Gets the value of the skipUI property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSkipUI() {
            return skipUI;
        }

        /**
         * Sets the value of the skipUI property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSkipUI(Boolean value) {
            this.skipUI = value;
        }

    }

}
