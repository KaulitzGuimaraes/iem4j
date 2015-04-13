
package com.bigfix.schemas.besapi;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Role complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Role">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{}ObjectName" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MasterOperator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CustomContent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShowOtherActions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CanCreateActions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PostActionBehaviorPrivilege" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *               &lt;enumeration value="AllowRestartAndShutdown"/>
 *               &lt;enumeration value="AllowRestartOnly"/>
 *               &lt;enumeration value="None"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ActionScriptCommandsPrivilege" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *               &lt;enumeration value="AllowRestartAndShutdown"/>
 *               &lt;enumeration value="AllowRestartOnly"/>
 *               &lt;enumeration value="None"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CanSendMultipleRefresh" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CanLock" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UnmanagedAssetPrivilege" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *               &lt;enumeration value="ShowNone"/>
 *               &lt;enumeration value="ScanPoint"/>
 *               &lt;enumeration value="ShowAll"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Operators" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded">
 *                   &lt;element name="Explicit" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                   &lt;element name="Inherited" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LDAPGroups" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Group" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                             &lt;element name="DN" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                             &lt;element name="ServerID" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Sites" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded">
 *                   &lt;element name="CustomSite">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                             &lt;element name="Permission" type="{}SitePermissionString"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ExternalSite">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                             &lt;element name="Permission" type="{}SitePermissionString"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "Role", propOrder = {
    "name",
    "id",
    "description",
    "masterOperator",
    "customContent",
    "showOtherActions",
    "canCreateActions",
    "postActionBehaviorPrivilege",
    "actionScriptCommandsPrivilege",
    "canSendMultipleRefresh",
    "canLock",
    "unmanagedAssetPrivilege",
    "operators",
    "ldapGroups",
    "sites"
})
public class Role {

    @XmlElement(name = "Name")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String name;
    @XmlElement(name = "ID")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger id;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "MasterOperator")
    protected Boolean masterOperator;
    @XmlElement(name = "CustomContent")
    protected Boolean customContent;
    @XmlElement(name = "ShowOtherActions")
    protected Boolean showOtherActions;
    @XmlElement(name = "CanCreateActions")
    protected Boolean canCreateActions;
    @XmlElement(name = "PostActionBehaviorPrivilege")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String postActionBehaviorPrivilege;
    @XmlElement(name = "ActionScriptCommandsPrivilege")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String actionScriptCommandsPrivilege;
    @XmlElement(name = "CanSendMultipleRefresh")
    protected Boolean canSendMultipleRefresh;
    @XmlElement(name = "CanLock")
    protected Boolean canLock;
    @XmlElement(name = "UnmanagedAssetPrivilege")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String unmanagedAssetPrivilege;
    @XmlElement(name = "Operators")
    protected Role.Operators operators;
    @XmlElement(name = "LDAPGroups")
    protected Role.LDAPGroups ldapGroups;
    @XmlElement(name = "Sites")
    protected Role.Sites sites;
    @XmlAttribute(name = "Resource")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String resource;

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

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the masterOperator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMasterOperator() {
        return masterOperator;
    }

    /**
     * Sets the value of the masterOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMasterOperator(Boolean value) {
        this.masterOperator = value;
    }

    /**
     * Gets the value of the customContent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomContent() {
        return customContent;
    }

    /**
     * Sets the value of the customContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomContent(Boolean value) {
        this.customContent = value;
    }

    /**
     * Gets the value of the showOtherActions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowOtherActions() {
        return showOtherActions;
    }

    /**
     * Sets the value of the showOtherActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowOtherActions(Boolean value) {
        this.showOtherActions = value;
    }

    /**
     * Gets the value of the canCreateActions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanCreateActions() {
        return canCreateActions;
    }

    /**
     * Sets the value of the canCreateActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanCreateActions(Boolean value) {
        this.canCreateActions = value;
    }

    /**
     * Gets the value of the postActionBehaviorPrivilege property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostActionBehaviorPrivilege() {
        return postActionBehaviorPrivilege;
    }

    /**
     * Sets the value of the postActionBehaviorPrivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostActionBehaviorPrivilege(String value) {
        this.postActionBehaviorPrivilege = value;
    }

    /**
     * Gets the value of the actionScriptCommandsPrivilege property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionScriptCommandsPrivilege() {
        return actionScriptCommandsPrivilege;
    }

    /**
     * Sets the value of the actionScriptCommandsPrivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionScriptCommandsPrivilege(String value) {
        this.actionScriptCommandsPrivilege = value;
    }

    /**
     * Gets the value of the canSendMultipleRefresh property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanSendMultipleRefresh() {
        return canSendMultipleRefresh;
    }

    /**
     * Sets the value of the canSendMultipleRefresh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanSendMultipleRefresh(Boolean value) {
        this.canSendMultipleRefresh = value;
    }

    /**
     * Gets the value of the canLock property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanLock() {
        return canLock;
    }

    /**
     * Sets the value of the canLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanLock(Boolean value) {
        this.canLock = value;
    }

    /**
     * Gets the value of the unmanagedAssetPrivilege property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnmanagedAssetPrivilege() {
        return unmanagedAssetPrivilege;
    }

    /**
     * Sets the value of the unmanagedAssetPrivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnmanagedAssetPrivilege(String value) {
        this.unmanagedAssetPrivilege = value;
    }

    /**
     * Gets the value of the operators property.
     * 
     * @return
     *     possible object is
     *     {@link Role.Operators }
     *     
     */
    public Role.Operators getOperators() {
        return operators;
    }

    /**
     * Sets the value of the operators property.
     * 
     * @param value
     *     allowed object is
     *     {@link Role.Operators }
     *     
     */
    public void setOperators(Role.Operators value) {
        this.operators = value;
    }

    /**
     * Gets the value of the ldapGroups property.
     * 
     * @return
     *     possible object is
     *     {@link Role.LDAPGroups }
     *     
     */
    public Role.LDAPGroups getLDAPGroups() {
        return ldapGroups;
    }

    /**
     * Sets the value of the ldapGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link Role.LDAPGroups }
     *     
     */
    public void setLDAPGroups(Role.LDAPGroups value) {
        this.ldapGroups = value;
    }

    /**
     * Gets the value of the sites property.
     * 
     * @return
     *     possible object is
     *     {@link Role.Sites }
     *     
     */
    public Role.Sites getSites() {
        return sites;
    }

    /**
     * Sets the value of the sites property.
     * 
     * @param value
     *     allowed object is
     *     {@link Role.Sites }
     *     
     */
    public void setSites(Role.Sites value) {
        this.sites = value;
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
     *         &lt;element name="Group" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
     *                   &lt;element name="DN" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
     *                   &lt;element name="ServerID" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "group"
    })
    public static class LDAPGroups {

        @XmlElement(name = "Group", required = true)
        protected List<Role.LDAPGroups.Group> group;

        /**
         * Gets the value of the group property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the group property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Role.LDAPGroups.Group }
         * 
         * 
         */
        public List<Role.LDAPGroups.Group> getGroup() {
            if (group == null) {
                group = new ArrayList<Role.LDAPGroups.Group>();
            }
            return this.group;
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
         *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
         *         &lt;element name="DN" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
         *         &lt;element name="ServerID" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
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
            "name",
            "dn",
            "serverID"
        })
        public static class Group {

            @XmlElement(name = "Name", required = true)
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String name;
            @XmlElement(name = "DN", required = true)
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String dn;
            @XmlElement(name = "ServerID", required = true)
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String serverID;

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
             * Gets the value of the dn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDN() {
                return dn;
            }

            /**
             * Sets the value of the dn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDN(String value) {
                this.dn = value;
            }

            /**
             * Gets the value of the serverID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServerID() {
                return serverID;
            }

            /**
             * Sets the value of the serverID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServerID(String value) {
                this.serverID = value;
            }

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
     *       &lt;choice maxOccurs="unbounded">
     *         &lt;element name="Explicit" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
     *         &lt;element name="Inherited" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "explicitOrInherited"
    })
    public static class Operators {

        @XmlElementRefs({
            @XmlElementRef(name = "Explicit", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "Inherited", type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<String>> explicitOrInherited;

        /**
         * Gets the value of the explicitOrInherited property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the explicitOrInherited property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExplicitOrInherited().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * 
         * 
         */
        public List<JAXBElement<String>> getExplicitOrInherited() {
            if (explicitOrInherited == null) {
                explicitOrInherited = new ArrayList<JAXBElement<String>>();
            }
            return this.explicitOrInherited;
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
     *       &lt;choice maxOccurs="unbounded">
     *         &lt;element name="CustomSite">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
     *                   &lt;element name="Permission" type="{}SitePermissionString"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ExternalSite">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
     *                   &lt;element name="Permission" type="{}SitePermissionString"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "customSiteOrExternalSite"
    })
    public static class Sites {

        @XmlElements({
            @XmlElement(name = "CustomSite", type = Role.Sites.CustomSite.class),
            @XmlElement(name = "ExternalSite", type = Role.Sites.ExternalSite.class)
        })
        protected List<Object> customSiteOrExternalSite;

        /**
         * Gets the value of the customSiteOrExternalSite property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the customSiteOrExternalSite property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCustomSiteOrExternalSite().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Role.Sites.CustomSite }
         * {@link Role.Sites.ExternalSite }
         * 
         * 
         */
        public List<Object> getCustomSiteOrExternalSite() {
            if (customSiteOrExternalSite == null) {
                customSiteOrExternalSite = new ArrayList<Object>();
            }
            return this.customSiteOrExternalSite;
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
         *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
         *         &lt;element name="Permission" type="{}SitePermissionString"/>
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
            "name",
            "permission"
        })
        public static class CustomSite {

            @XmlElement(name = "Name", required = true)
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String name;
            @XmlElement(name = "Permission", required = true)
            @XmlSchemaType(name = "normalizedString")
            protected SitePermissionString permission;

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
             * Gets the value of the permission property.
             * 
             * @return
             *     possible object is
             *     {@link SitePermissionString }
             *     
             */
            public SitePermissionString getPermission() {
                return permission;
            }

            /**
             * Sets the value of the permission property.
             * 
             * @param value
             *     allowed object is
             *     {@link SitePermissionString }
             *     
             */
            public void setPermission(SitePermissionString value) {
                this.permission = value;
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
         *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
         *         &lt;element name="Permission" type="{}SitePermissionString"/>
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
            "name",
            "permission"
        })
        public static class ExternalSite {

            @XmlElement(name = "Name", required = true)
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String name;
            @XmlElement(name = "Permission", required = true)
            @XmlSchemaType(name = "normalizedString")
            protected SitePermissionString permission;

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
             * Gets the value of the permission property.
             * 
             * @return
             *     possible object is
             *     {@link SitePermissionString }
             *     
             */
            public SitePermissionString getPermission() {
                return permission;
            }

            /**
             * Sets the value of the permission property.
             * 
             * @param value
             *     allowed object is
             *     {@link SitePermissionString }
             *     
             */
            public void setPermission(SitePermissionString value) {
                this.permission = value;
            }

        }

    }

}
