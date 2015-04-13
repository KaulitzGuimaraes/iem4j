
package com.bigfix.schemas.besapi;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ReplicationLinkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReplicationLinkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SourceServerID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="DestinationServerID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="IsConnected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastReplication" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="LastError" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplicationLinkType", propOrder = {
    "sourceServerID",
    "destinationServerID",
    "weight",
    "isConnected",
    "lastReplication",
    "lastError"
})
public class ReplicationLinkType {

    @XmlElement(name = "SourceServerID", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sourceServerID;
    @XmlElement(name = "DestinationServerID", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger destinationServerID;
    @XmlElement(name = "Weight", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger weight;
    @XmlElement(name = "IsConnected")
    protected Boolean isConnected;
    @XmlElement(name = "LastReplication")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String lastReplication;
    @XmlElement(name = "LastError")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String lastError;
    @XmlAttribute(name = "Resource")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String resource;

    /**
     * Gets the value of the sourceServerID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSourceServerID() {
        return sourceServerID;
    }

    /**
     * Sets the value of the sourceServerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSourceServerID(BigInteger value) {
        this.sourceServerID = value;
    }

    /**
     * Gets the value of the destinationServerID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDestinationServerID() {
        return destinationServerID;
    }

    /**
     * Sets the value of the destinationServerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDestinationServerID(BigInteger value) {
        this.destinationServerID = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWeight(BigInteger value) {
        this.weight = value;
    }

    /**
     * Gets the value of the isConnected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsConnected() {
        return isConnected;
    }

    /**
     * Sets the value of the isConnected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsConnected(Boolean value) {
        this.isConnected = value;
    }

    /**
     * Gets the value of the lastReplication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastReplication() {
        return lastReplication;
    }

    /**
     * Sets the value of the lastReplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastReplication(String value) {
        this.lastReplication = value;
    }

    /**
     * Gets the value of the lastError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastError() {
        return lastError;
    }

    /**
     * Sets the value of the lastError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastError(String value) {
        this.lastError = value;
    }

    /**
     * Gets the value of the resource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResource() {
        return resource;
    }

    /**
     * Sets the value of the resource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResource(String value) {
        this.resource = value;
    }

}
