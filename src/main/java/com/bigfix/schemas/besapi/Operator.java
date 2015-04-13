
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
 * <p>Java class for Operator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Operator">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{}ObjectName" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="LastLoginTime" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="LDAPServerID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="LDAPDN" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
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
 *         &lt;element name="CanLock" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CanSendMultipleRefresh" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LoginPermission" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *               &lt;enumeration value="Unrestricted"/>
 *               &lt;enumeration value="RoleRestricted"/>
 *               &lt;enumeration value="Disabled"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UnmanagedAssetPrivilege" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *               &lt;enumeration value="ShowNone"/>
 *               &lt;enumeration value="ScanPoint"/>
 *               &lt;enumeration value="ShowAll"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ApproverRoleID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
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
@XmlType(name = "Operator", propOrder = {
    "name",
    "id",
    "lastLoginTime",
    "password",
    "ldapServerID",
    "ldapdn",
    "masterOperator",
    "customContent",
    "showOtherActions",
    "canCreateActions",
    "postActionBehaviorPrivilege",
    "actionScriptCommandsPrivilege",
    "canLock",
    "canSendMultipleRefresh",
    "loginPermission",
    "unmanagedAssetPrivilege",
    "approverRoleID"
})
public class Operator {

    @XmlElement(name = "Name")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String name;
    @XmlElement(name = "ID")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger id;
    @XmlElement(name = "LastLoginTime")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String lastLoginTime;
    @XmlElement(name = "Password")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String password;
    @XmlElement(name = "LDAPServerID")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger ldapServerID;
    @XmlElement(name = "LDAPDN")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String ldapdn;
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
    @XmlElement(name = "CanLock")
    protected Boolean canLock;
    @XmlElement(name = "CanSendMultipleRefresh")
    protected Boolean canSendMultipleRefresh;
    @XmlElement(name = "LoginPermission")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String loginPermission;
    @XmlElement(name = "UnmanagedAssetPrivilege")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String unmanagedAssetPrivilege;
    @XmlElement(name = "ApproverRoleID")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger approverRoleID;
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
     * Gets the value of the lastLoginTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * Sets the value of the lastLoginTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastLoginTime(String value) {
        this.lastLoginTime = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the ldapServerID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLDAPServerID() {
        return ldapServerID;
    }

    /**
     * Sets the value of the ldapServerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLDAPServerID(BigInteger value) {
        this.ldapServerID = value;
    }

    /**
     * Gets the value of the ldapdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLDAPDN() {
        return ldapdn;
    }

    /**
     * Sets the value of the ldapdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLDAPDN(String value) {
        this.ldapdn = value;
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
     * Gets the value of the loginPermission property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginPermission() {
        return loginPermission;
    }

    /**
     * Sets the value of the loginPermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginPermission(String value) {
        this.loginPermission = value;
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
     * Gets the value of the approverRoleID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApproverRoleID() {
        return approverRoleID;
    }

    /**
     * Sets the value of the approverRoleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApproverRoleID(BigInteger value) {
        this.approverRoleID = value;
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
