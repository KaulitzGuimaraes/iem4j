
package com.bigfix.schemas.bes;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for BESActionTarget complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BESActionTarget">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ComputerName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" maxOccurs="unbounded"/>
 *         &lt;element name="ComputerID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" maxOccurs="unbounded"/>
 *         &lt;element name="CustomRelevance" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="AllComputers" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BESActionTarget", propOrder = {
    "computerName",
    "computerID",
    "customRelevance",
    "allComputers"
})
public class BESActionTarget {

    @XmlElement(name = "ComputerName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> computerName;
    @XmlElement(name = "ComputerID")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected List<BigInteger> computerID;
    @XmlElement(name = "CustomRelevance")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String customRelevance;
    @XmlElement(name = "AllComputers")
    protected Boolean allComputers;

    /**
     * Gets the value of the computerName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the computerName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComputerName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getComputerName() {
        if (computerName == null) {
            computerName = new ArrayList<String>();
        }
        return this.computerName;
    }

    /**
     * Gets the value of the computerID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the computerID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComputerID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getComputerID() {
        if (computerID == null) {
            computerID = new ArrayList<BigInteger>();
        }
        return this.computerID;
    }

    /**
     * Gets the value of the customRelevance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomRelevance() {
        return customRelevance;
    }

    /**
     * Sets the value of the customRelevance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomRelevance(String value) {
        this.customRelevance = value;
    }

    /**
     * Gets the value of the allComputers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllComputers() {
        return allComputers;
    }

    /**
     * Sets the value of the allComputers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllComputers(Boolean value) {
        this.allComputers = value;
    }

}
