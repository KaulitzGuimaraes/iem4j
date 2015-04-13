
package com.bigfix.schemas.bes;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Analysis complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Analysis">
 *   &lt;complexContent>
 *     &lt;extension base="{}Fixlet">
 *       &lt;sequence>
 *         &lt;element name="Property" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;>Property">
 *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="AutoActivate" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Analysis", propOrder = {
    "property"
})
public class Analysis
    extends Fixlet
{

    @XmlElement(name = "Property")
    protected List<Analysis.Property> property;
    @XmlAttribute(name = "AutoActivate")
    protected Boolean autoActivate;

    /**
     * Gets the value of the property property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Analysis.Property }
     * 
     * 
     */
    public List<Analysis.Property> getProperty() {
        if (property == null) {
            property = new ArrayList<Analysis.Property>();
        }
        return this.property;
    }

    /**
     * Gets the value of the autoActivate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoActivate() {
        return autoActivate;
    }

    /**
     * Sets the value of the autoActivate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoActivate(Boolean value) {
        this.autoActivate = value;
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
     *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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

        @XmlAttribute(name = "ID", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger id;

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setID(BigInteger value) {
            this.id = value;
        }

    }

}
