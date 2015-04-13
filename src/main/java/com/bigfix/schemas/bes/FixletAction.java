
package com.bigfix.schemas.bes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for FixletAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FixletAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PreLink" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Link" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PostLink" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ActionScript" type="{}ActionScript"/>
 *         &lt;element name="SuccessCriteria" type="{}ActionSuccessCriteria" minOccurs="0"/>
 *         &lt;element name="SuccessCriteriaLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Settings" type="{}ActionSettings" minOccurs="0"/>
 *         &lt;element name="SettingsLocks" type="{}ActionSettingsLocks" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *             &lt;minLength value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FixletAction", propOrder = {
    "description",
    "actionScript",
    "successCriteria",
    "successCriteriaLocked",
    "settings",
    "settingsLocks"
})
public class FixletAction {

    @XmlElement(name = "Description")
    protected FixletAction.Description description;
    @XmlElement(name = "ActionScript", required = true)
    protected ActionScript actionScript;
    @XmlElement(name = "SuccessCriteria")
    protected ActionSuccessCriteria successCriteria;
    @XmlElement(name = "SuccessCriteriaLocked")
    protected Boolean successCriteriaLocked;
    @XmlElement(name = "Settings")
    protected ActionSettings settings;
    @XmlElement(name = "SettingsLocks")
    protected ActionSettingsLocks settingsLocks;
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String id;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link FixletAction.Description }
     *     
     */
    public FixletAction.Description getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link FixletAction.Description }
     *     
     */
    public void setDescription(FixletAction.Description value) {
        this.description = value;
    }

    /**
     * Gets the value of the actionScript property.
     * 
     * @return
     *     possible object is
     *     {@link ActionScript }
     *     
     */
    public ActionScript getActionScript() {
        return actionScript;
    }

    /**
     * Sets the value of the actionScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionScript }
     *     
     */
    public void setActionScript(ActionScript value) {
        this.actionScript = value;
    }

    /**
     * Gets the value of the successCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ActionSuccessCriteria }
     *     
     */
    public ActionSuccessCriteria getSuccessCriteria() {
        return successCriteria;
    }

    /**
     * Sets the value of the successCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionSuccessCriteria }
     *     
     */
    public void setSuccessCriteria(ActionSuccessCriteria value) {
        this.successCriteria = value;
    }

    /**
     * Gets the value of the successCriteriaLocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuccessCriteriaLocked() {
        return successCriteriaLocked;
    }

    /**
     * Sets the value of the successCriteriaLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuccessCriteriaLocked(Boolean value) {
        this.successCriteriaLocked = value;
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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
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
     *         &lt;element name="PreLink" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Link" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PostLink" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "preLink",
        "link",
        "postLink"
    })
    public static class Description {

        @XmlElement(name = "PreLink", required = true)
        protected String preLink;
        @XmlElement(name = "Link", required = true)
        protected String link;
        @XmlElement(name = "PostLink", required = true)
        protected String postLink;

        /**
         * Gets the value of the preLink property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreLink() {
            return preLink;
        }

        /**
         * Sets the value of the preLink property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreLink(String value) {
            this.preLink = value;
        }

        /**
         * Gets the value of the link property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLink() {
            return link;
        }

        /**
         * Sets the value of the link property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLink(String value) {
            this.link = value;
        }

        /**
         * Gets the value of the postLink property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPostLink() {
            return postLink;
        }

        /**
         * Sets the value of the postLink property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPostLink(String value) {
            this.postLink = value;
        }

    }

}
