
package com.bigfix.schemas.bes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FixletWithActions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FixletWithActions">
 *   &lt;complexContent>
 *     &lt;extension base="{}Fixlet">
 *       &lt;sequence>
 *         &lt;element name="DefaultAction" type="{}FixletAction" minOccurs="0"/>
 *         &lt;element name="Action" type="{}FixletAction" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FixletWithActions", propOrder = {
    "defaultAction",
    "action"
})
@XmlSeeAlso({
    Task.class
})
public class FixletWithActions
    extends Fixlet
{

    @XmlElement(name = "DefaultAction")
    protected FixletAction defaultAction;
    @XmlElement(name = "Action")
    protected List<FixletAction> action;

    /**
     * Gets the value of the defaultAction property.
     * 
     * @return
     *     possible object is
     *     {@link FixletAction }
     *     
     */
    public FixletAction getDefaultAction() {
        return defaultAction;
    }

    /**
     * Sets the value of the defaultAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link FixletAction }
     *     
     */
    public void setDefaultAction(FixletAction value) {
        this.defaultAction = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the action property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FixletAction }
     * 
     * 
     */
    public List<FixletAction> getAction() {
        if (action == null) {
            action = new ArrayList<FixletAction>();
        }
        return this.action;
    }

}
