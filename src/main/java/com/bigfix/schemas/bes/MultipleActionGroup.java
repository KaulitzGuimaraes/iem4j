
package com.bigfix.schemas.bes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for MultipleActionGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultipleActionGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Title" type="{}ObjectName" minOccurs="0"/>
 *         &lt;element name="Relevance" type="{}RelevanceString" minOccurs="0"/>
 *         &lt;element name="PreGroupActionScript" type="{}ActionScript" minOccurs="0"/>
 *         &lt;element name="MemberAction" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{}Action">
 *                 &lt;sequence>
 *                   &lt;element name="IncludeInGroupRelevance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PostGroupActionScript" type="{}ActionScript" minOccurs="0"/>
 *         &lt;element name="Settings" type="{}ActionSettings" minOccurs="0"/>
 *         &lt;element name="SettingsLocks" type="{}ActionSettingsLocks" minOccurs="0"/>
 *         &lt;element name="Domain" type="{}Domain" minOccurs="0"/>
 *         &lt;element name="Target" type="{}BESActionTarget" minOccurs="0"/>
 *         &lt;element name="SourceFixletID" type="{}BESActionSourceFixlet" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SkipUI" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultipleActionGroup", propOrder = {
    "title",
    "relevance",
    "preGroupActionScript",
    "memberAction",
    "postGroupActionScript",
    "settings",
    "settingsLocks",
    "domain",
    "target",
    "sourceFixletID"
})
public class MultipleActionGroup {

    @XmlElement(name = "Title")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String title;
    @XmlElement(name = "Relevance")
    protected RelevanceString relevance;
    @XmlElement(name = "PreGroupActionScript")
    protected ActionScript preGroupActionScript;
    @XmlElement(name = "MemberAction")
    protected List<MultipleActionGroup.MemberAction> memberAction;
    @XmlElement(name = "PostGroupActionScript")
    protected ActionScript postGroupActionScript;
    @XmlElement(name = "Settings")
    protected ActionSettings settings;
    @XmlElement(name = "SettingsLocks")
    protected ActionSettingsLocks settingsLocks;
    @XmlElement(name = "Domain")
    protected String domain;
    @XmlElement(name = "Target")
    protected BESActionTarget target;
    @XmlElement(name = "SourceFixletID")
    protected BESActionSourceFixlet sourceFixletID;
    @XmlAttribute(name = "SkipUI")
    protected Boolean skipUI;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the relevance property.
     * 
     * @return
     *     possible object is
     *     {@link RelevanceString }
     *     
     */
    public RelevanceString getRelevance() {
        return relevance;
    }

    /**
     * Sets the value of the relevance property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelevanceString }
     *     
     */
    public void setRelevance(RelevanceString value) {
        this.relevance = value;
    }

    /**
     * Gets the value of the preGroupActionScript property.
     * 
     * @return
     *     possible object is
     *     {@link ActionScript }
     *     
     */
    public ActionScript getPreGroupActionScript() {
        return preGroupActionScript;
    }

    /**
     * Sets the value of the preGroupActionScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionScript }
     *     
     */
    public void setPreGroupActionScript(ActionScript value) {
        this.preGroupActionScript = value;
    }

    /**
     * Gets the value of the memberAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memberAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemberAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultipleActionGroup.MemberAction }
     * 
     * 
     */
    public List<MultipleActionGroup.MemberAction> getMemberAction() {
        if (memberAction == null) {
            memberAction = new ArrayList<MultipleActionGroup.MemberAction>();
        }
        return this.memberAction;
    }

    /**
     * Gets the value of the postGroupActionScript property.
     * 
     * @return
     *     possible object is
     *     {@link ActionScript }
     *     
     */
    public ActionScript getPostGroupActionScript() {
        return postGroupActionScript;
    }

    /**
     * Sets the value of the postGroupActionScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionScript }
     *     
     */
    public void setPostGroupActionScript(ActionScript value) {
        this.postGroupActionScript = value;
    }

    /**
     * Gets the value of the settings property.
     * 
     * @return
     *     possible object is
     *     {@link ActionSettings }
     *     
     */
    public ActionSettings getSettings() {
        return settings;
    }

    /**
     * Sets the value of the settings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionSettings }
     *     
     */
    public void setSettings(ActionSettings value) {
        this.settings = value;
    }

    /**
     * Gets the value of the settingsLocks property.
     * 
     * @return
     *     possible object is
     *     {@link ActionSettingsLocks }
     *     
     */
    public ActionSettingsLocks getSettingsLocks() {
        return settingsLocks;
    }

    /**
     * Sets the value of the settingsLocks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionSettingsLocks }
     *     
     */
    public void setSettingsLocks(ActionSettingsLocks value) {
        this.settingsLocks = value;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link BESActionTarget }
     *     
     */
    public BESActionTarget getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link BESActionTarget }
     *     
     */
    public void setTarget(BESActionTarget value) {
        this.target = value;
    }

    /**
     * Gets the value of the sourceFixletID property.
     * 
     * @return
     *     possible object is
     *     {@link BESActionSourceFixlet }
     *     
     */
    public BESActionSourceFixlet getSourceFixletID() {
        return sourceFixletID;
    }

    /**
     * Sets the value of the sourceFixletID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BESActionSourceFixlet }
     *     
     */
    public void setSourceFixletID(BESActionSourceFixlet value) {
        this.sourceFixletID = value;
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
     *     &lt;extension base="{}Action">
     *       &lt;sequence>
     *         &lt;element name="IncludeInGroupRelevance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "includeInGroupRelevance"
    })
    public static class MemberAction
        extends Action
    {

        @XmlElement(name = "IncludeInGroupRelevance")
        protected Boolean includeInGroupRelevance;

        /**
         * Gets the value of the includeInGroupRelevance property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIncludeInGroupRelevance() {
            return includeInGroupRelevance;
        }

        /**
         * Sets the value of the includeInGroupRelevance property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIncludeInGroupRelevance(Boolean value) {
            this.includeInGroupRelevance = value;
        }

    }

}
