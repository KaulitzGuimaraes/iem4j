
package com.bigfix.schemas.bes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GroupRelevance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupRelevance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="SearchComponentRelevance" type="{}SearchComponentRelevance"/>
 *         &lt;element name="SearchComponentPropertyReference" type="{}SearchComponentPropertyReference"/>
 *         &lt;element name="SearchComponentGroupReference" type="{}SearchComponentGroupReference"/>
 *       &lt;/choice>
 *       &lt;attribute name="JoinByIntersection" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupRelevance", propOrder = {
    "searchComponent"
})
public class GroupRelevance {

    @XmlElements({
        @XmlElement(name = "SearchComponentRelevance", type = SearchComponentRelevance.class),
        @XmlElement(name = "SearchComponentPropertyReference", type = SearchComponentPropertyReference.class),
        @XmlElement(name = "SearchComponentGroupReference", type = SearchComponentGroupReference.class)
    })
    protected List<SearchComponent> searchComponent;
    @XmlAttribute(name = "JoinByIntersection")
    protected Boolean joinByIntersection;

    /**
     * Gets the value of the searchComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchComponentRelevance }
     * {@link SearchComponentPropertyReference }
     * {@link SearchComponentGroupReference }
     * 
     * 
     */
    public List<SearchComponent> getSearchComponent() {
        if (searchComponent == null) {
            searchComponent = new ArrayList<SearchComponent>();
        }
        return this.searchComponent;
    }

    /**
     * Gets the value of the joinByIntersection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isJoinByIntersection() {
        return joinByIntersection;
    }

    /**
     * Sets the value of the joinByIntersection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJoinByIntersection(Boolean value) {
        this.joinByIntersection = value;
    }

}
