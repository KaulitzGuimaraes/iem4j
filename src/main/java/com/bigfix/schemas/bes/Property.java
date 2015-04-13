
package com.bigfix.schemas.bes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for Property complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Property">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;>RelevanceString">
 *       &lt;attribute name="Name" use="required" type="{}ObjectName" />
 *       &lt;attribute name="EvaluationPeriod" type="{}NonNegativeTimeInterval" />
 *       &lt;attribute name="KeepStatistics" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Property")
@XmlSeeAlso({
    com.bigfix.schemas.bes.Analysis.Property.class,
    com.bigfix.schemas.bes.BES.Property.class
})
public class Property
    extends RelevanceString
{

    @XmlAttribute(name = "Name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "EvaluationPeriod")
    protected Duration evaluationPeriod;
    @XmlAttribute(name = "KeepStatistics")
    protected Boolean keepStatistics;

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

    /**
     * Gets the value of the evaluationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getEvaluationPeriod() {
        return evaluationPeriod;
    }

    /**
     * Sets the value of the evaluationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setEvaluationPeriod(Duration value) {
        this.evaluationPeriod = value;
    }

    /**
     * Gets the value of the keepStatistics property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeepStatistics() {
        return keepStatistics;
    }

    /**
     * Sets the value of the keepStatistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeepStatistics(Boolean value) {
        this.keepStatistics = value;
    }

}
