
package com.bigfix.schemas.bes;

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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ActionSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HasMessage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Message" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;group ref="{}Message" minOccurs="0"/>
 *                   &lt;element name="ShowActionButton" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="ShowCancelButton" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="AllowPostponement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="MaxPostponementInterval" type="{}ActionMessageMaxPostponementInterval" minOccurs="0"/>
 *                   &lt;element name="PostponementDeadlineOffset" type="{}TimeInterval" minOccurs="0"/>
 *                   &lt;element name="HasTimeout" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="TimeoutInterval" type="{}ActionMessageTimeInterval" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ActionUITitle" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="PreActionShowUI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PreAction" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AskToSaveWork" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="ShowActionButton" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="ShowCancelButton" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="DeadlineBehavior" type="{}ActionDeadlineBehavior" minOccurs="0"/>
 *                   &lt;element name="DeadlineType" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="Interval"/>
 *                         &lt;enumeration value="Absolute"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DeadlineInterval" type="{}ActionMessageTimeInterval" minOccurs="0"/>
 *                   &lt;choice>
 *                     &lt;element name="DeadlineOffset" type="{}TimeInterval" minOccurs="0"/>
 *                     &lt;element name="DeadlineLocalOffset" type="{}TimeInterval" minOccurs="0"/>
 *                   &lt;/choice>
 *                   &lt;element name="ShowConfirmation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="Confirmation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HasRunningMessage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RunningMessage" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HasTimeRange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TimeRange" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *                   &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HasStartTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="StartDateTimeOffset" type="{}TimeInterval" minOccurs="0"/>
 *           &lt;element name="StartDateTimeLocalOffset" type="{}TimeInterval" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="HasEndTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="EndDateTimeOffset" type="{}TimeInterval" minOccurs="0"/>
 *           &lt;element name="EndDateTimeLocalOffset" type="{}TimeInterval" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="HasDayOfWeekConstraint" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DayOfWeekConstraint" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="Wed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="Thu" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="UseUTCTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ActiveUserRequirement" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="NoRequirement"/>
 *               &lt;enumeration value="RequireUser"/>
 *               &lt;enumeration value="RequireNoUser"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ActiveUserType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="AllUsers"/>
 *               &lt;enumeration value="LocalUsers"/>
 *               &lt;enumeration value="UsersOfGroups"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UIGroupConstraints" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded">
 *                   &lt;element name="Win9xGroup" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="WinNTGroup" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="LocalGroup" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DomainGroup" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Sid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HasWhose" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Whose" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Property" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Relation" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PreActionCacheDownload" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Reapply" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasReapplyLimit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReapplyLimit" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="HasReapplyInterval" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReapplyInterval" type="{}ActionReapplyInterval" minOccurs="0"/>
 *         &lt;element name="HasRetry" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RetryCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="RetryWait" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;>RetryWaitInterval">
 *                 &lt;attribute name="Behavior" default="WaitForInterval">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="WaitForReboot"/>
 *                       &lt;enumeration value="WaitForInterval"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HasTemporalDistribution" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TemporalDistribution" type="{}NonNegativeTimeInterval" minOccurs="0"/>
 *         &lt;element name="ContinueOnErrors" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PostActionBehavior" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AllowCancel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="AllowPostponement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="MaxPostponementInterval" type="{}ActionMessageMaxPostponementInterval" minOccurs="0"/>
 *                   &lt;element name="HasTimeout" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="TimeoutInterval" type="{}ActionMessageTimeInterval" minOccurs="0"/>
 *                   &lt;element name="PostActionDeadlineBehavior" type="{}ActionDeadlineBehavior" minOccurs="0"/>
 *                   &lt;element name="PostActionDeadlineInterval" type="{}ActionMessageTimeInterval" minOccurs="0"/>
 *                   &lt;group ref="{}Message"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Behavior" default="Nothing">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Nothing"/>
 *                       &lt;enumeration value="Restart"/>
 *                       &lt;enumeration value="Shutdown"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="IsOffer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AnnounceOffer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OfferCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OfferDescriptionHTML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionSettings", propOrder = {
    "hasMessage",
    "message",
    "actionUITitle",
    "preActionShowUI",
    "preAction",
    "hasRunningMessage",
    "runningMessage",
    "hasTimeRange",
    "timeRange",
    "hasStartTime",
    "startDateTimeOffset",
    "startDateTimeLocalOffset",
    "hasEndTime",
    "endDateTimeOffset",
    "endDateTimeLocalOffset",
    "hasDayOfWeekConstraint",
    "dayOfWeekConstraint",
    "useUTCTime",
    "activeUserRequirement",
    "activeUserType",
    "uiGroupConstraints",
    "hasWhose",
    "whose",
    "preActionCacheDownload",
    "reapply",
    "hasReapplyLimit",
    "reapplyLimit",
    "hasReapplyInterval",
    "reapplyInterval",
    "hasRetry",
    "retryCount",
    "retryWait",
    "hasTemporalDistribution",
    "temporalDistribution",
    "continueOnErrors",
    "postActionBehavior",
    "isOffer",
    "announceOffer",
    "offerCategory",
    "offerDescriptionHTML"
})
public class ActionSettings {

    @XmlElement(name = "HasMessage")
    protected Boolean hasMessage;
    @XmlElement(name = "Message")
    protected ActionSettings.Message message;
    @XmlElement(name = "ActionUITitle")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String actionUITitle;
    @XmlElement(name = "PreActionShowUI")
    protected Boolean preActionShowUI;
    @XmlElement(name = "PreAction")
    protected ActionSettings.PreAction preAction;
    @XmlElement(name = "HasRunningMessage")
    protected Boolean hasRunningMessage;
    @XmlElement(name = "RunningMessage")
    protected ActionSettings.RunningMessage runningMessage;
    @XmlElement(name = "HasTimeRange")
    protected Boolean hasTimeRange;
    @XmlElement(name = "TimeRange")
    protected ActionSettings.TimeRange timeRange;
    @XmlElement(name = "HasStartTime")
    protected Boolean hasStartTime;
    @XmlElement(name = "StartDateTimeOffset")
    protected Duration startDateTimeOffset;
    @XmlElement(name = "StartDateTimeLocalOffset")
    protected Duration startDateTimeLocalOffset;
    @XmlElement(name = "HasEndTime")
    protected Boolean hasEndTime;
    @XmlElement(name = "EndDateTimeOffset")
    protected Duration endDateTimeOffset;
    @XmlElement(name = "EndDateTimeLocalOffset")
    protected Duration endDateTimeLocalOffset;
    @XmlElement(name = "HasDayOfWeekConstraint")
    protected Boolean hasDayOfWeekConstraint;
    @XmlElement(name = "DayOfWeekConstraint")
    protected ActionSettings.DayOfWeekConstraint dayOfWeekConstraint;
    @XmlElement(name = "UseUTCTime")
    protected Boolean useUTCTime;
    @XmlElement(name = "ActiveUserRequirement")
    protected String activeUserRequirement;
    @XmlElement(name = "ActiveUserType")
    protected String activeUserType;
    @XmlElement(name = "UIGroupConstraints")
    protected ActionSettings.UIGroupConstraints uiGroupConstraints;
    @XmlElement(name = "HasWhose")
    protected Boolean hasWhose;
    @XmlElement(name = "Whose")
    protected ActionSettings.Whose whose;
    @XmlElement(name = "PreActionCacheDownload")
    protected Boolean preActionCacheDownload;
    @XmlElement(name = "Reapply")
    protected Boolean reapply;
    @XmlElement(name = "HasReapplyLimit")
    protected Boolean hasReapplyLimit;
    @XmlElement(name = "ReapplyLimit")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger reapplyLimit;
    @XmlElement(name = "HasReapplyInterval")
    protected Boolean hasReapplyInterval;
    @XmlElement(name = "ReapplyInterval")
    protected Duration reapplyInterval;
    @XmlElement(name = "HasRetry")
    protected Boolean hasRetry;
    @XmlElement(name = "RetryCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger retryCount;
    @XmlElement(name = "RetryWait")
    protected ActionSettings.RetryWait retryWait;
    @XmlElement(name = "HasTemporalDistribution")
    protected Boolean hasTemporalDistribution;
    @XmlElement(name = "TemporalDistribution")
    protected Duration temporalDistribution;
    @XmlElement(name = "ContinueOnErrors")
    protected Boolean continueOnErrors;
    @XmlElement(name = "PostActionBehavior")
    protected ActionSettings.PostActionBehavior postActionBehavior;
    @XmlElement(name = "IsOffer")
    protected Boolean isOffer;
    @XmlElement(name = "AnnounceOffer")
    protected Boolean announceOffer;
    @XmlElement(name = "OfferCategory")
    protected String offerCategory;
    @XmlElement(name = "OfferDescriptionHTML")
    protected String offerDescriptionHTML;

    /**
     * Gets the value of the hasMessage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasMessage() {
        return hasMessage;
    }

    /**
     * Sets the value of the hasMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasMessage(Boolean value) {
        this.hasMessage = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link ActionSettings.Message }
     *     
     */
    public ActionSettings.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionSettings.Message }
     *     
     */
    public void setMessage(ActionSettings.Message value) {
        this.message = value;
    }

    /**
     * Gets the value of the actionUITitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionUITitle() {
        return actionUITitle;
    }

    /**
     * Sets the value of the actionUITitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionUITitle(String value) {
        this.actionUITitle = value;
    }

    /**
     * Gets the value of the preActionShowUI property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreActionShowUI() {
        return preActionShowUI;
    }

    /**
     * Sets the value of the preActionShowUI property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreActionShowUI(Boolean value) {
        this.preActionShowUI = value;
    }

    /**
     * Gets the value of the preAction property.
     * 
     * @return
     *     possible object is
     *     {@link ActionSettings.PreAction }
     *     
     */
    public ActionSettings.PreAction getPreAction() {
        return preAction;
    }

    /**
     * Sets the value of the preAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionSettings.PreAction }
     *     
     */
    public void setPreAction(ActionSettings.PreAction value) {
        this.preAction = value;
    }

    /**
     * Gets the value of the hasRunningMessage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasRunningMessage() {
        return hasRunningMessage;
    }

    /**
     * Sets the value of the hasRunningMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasRunningMessage(Boolean value) {
        this.hasRunningMessage = value;
    }

    /**
     * Gets the value of the runningMessage property.
     * 
     * @return
     *     possible object is
     *     {@link ActionSettings.RunningMessage }
     *     
     */
    public ActionSettings.RunningMessage getRunningMessage() {
        return runningMessage;
    }

    /**
     * Sets the value of the runningMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionSettings.RunningMessage }
     *     
     */
    public void setRunningMessage(ActionSettings.RunningMessage value) {
        this.runningMessage = value;
    }

    /**
     * Gets the value of the hasTimeRange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasTimeRange() {
        return hasTimeRange;
    }

    /**
     * Sets the value of the hasTimeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasTimeRange(Boolean value) {
        this.hasTimeRange = value;
    }

    /**
     * Gets the value of the timeRange property.
     * 
     * @return
     *     possible object is
     *     {@link ActionSettings.TimeRange }
     *     
     */
    public ActionSettings.TimeRange getTimeRange() {
        return timeRange;
    }

    /**
     * Sets the value of the timeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionSettings.TimeRange }
     *     
     */
    public void setTimeRange(ActionSettings.TimeRange value) {
        this.timeRange = value;
    }

    /**
     * Gets the value of the hasStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasStartTime() {
        return hasStartTime;
    }

    /**
     * Sets the value of the hasStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasStartTime(Boolean value) {
        this.hasStartTime = value;
    }

    /**
     * Gets the value of the startDateTimeOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getStartDateTimeOffset() {
        return startDateTimeOffset;
    }

    /**
     * Sets the value of the startDateTimeOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setStartDateTimeOffset(Duration value) {
        this.startDateTimeOffset = value;
    }

    /**
     * Gets the value of the startDateTimeLocalOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getStartDateTimeLocalOffset() {
        return startDateTimeLocalOffset;
    }

    /**
     * Sets the value of the startDateTimeLocalOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setStartDateTimeLocalOffset(Duration value) {
        this.startDateTimeLocalOffset = value;
    }

    /**
     * Gets the value of the hasEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasEndTime() {
        return hasEndTime;
    }

    /**
     * Sets the value of the hasEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasEndTime(Boolean value) {
        this.hasEndTime = value;
    }

    /**
     * Gets the value of the endDateTimeOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getEndDateTimeOffset() {
        return endDateTimeOffset;
    }

    /**
     * Sets the value of the endDateTimeOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setEndDateTimeOffset(Duration value) {
        this.endDateTimeOffset = value;
    }

    /**
     * Gets the value of the endDateTimeLocalOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getEndDateTimeLocalOffset() {
        return endDateTimeLocalOffset;
    }

    /**
     * Sets the value of the endDateTimeLocalOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setEndDateTimeLocalOffset(Duration value) {
        this.endDateTimeLocalOffset = value;
    }

    /**
     * Gets the value of the hasDayOfWeekConstraint property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasDayOfWeekConstraint() {
        return hasDayOfWeekConstraint;
    }

    /**
     * Sets the value of the hasDayOfWeekConstraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasDayOfWeekConstraint(Boolean value) {
        this.hasDayOfWeekConstraint = value;
    }

    /**
     * Gets the value of the dayOfWeekConstraint property.
     * 
     * @return
     *     possible object is
     *     {@link ActionSettings.DayOfWeekConstraint }
     *     
     */
    public ActionSettings.DayOfWeekConstraint getDayOfWeekConstraint() {
        return dayOfWeekConstraint;
    }

    /**
     * Sets the value of the dayOfWeekConstraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionSettings.DayOfWeekConstraint }
     *     
     */
    public void setDayOfWeekConstraint(ActionSettings.DayOfWeekConstraint value) {
        this.dayOfWeekConstraint = value;
    }

    /**
     * Gets the value of the useUTCTime property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseUTCTime() {
        return useUTCTime;
    }

    /**
     * Sets the value of the useUTCTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseUTCTime(Boolean value) {
        this.useUTCTime = value;
    }

    /**
     * Gets the value of the activeUserRequirement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveUserRequirement() {
        return activeUserRequirement;
    }

    /**
     * Sets the value of the activeUserRequirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveUserRequirement(String value) {
        this.activeUserRequirement = value;
    }

    /**
     * Gets the value of the activeUserType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveUserType() {
        return activeUserType;
    }

    /**
     * Sets the value of the activeUserType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveUserType(String value) {
        this.activeUserType = value;
    }

    /**
     * Gets the value of the uiGroupConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link ActionSettings.UIGroupConstraints }
     *     
     */
    public ActionSettings.UIGroupConstraints getUIGroupConstraints() {
        return uiGroupConstraints;
    }

    /**
     * Sets the value of the uiGroupConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionSettings.UIGroupConstraints }
     *     
     */
    public void setUIGroupConstraints(ActionSettings.UIGroupConstraints value) {
        this.uiGroupConstraints = value;
    }

    /**
     * Gets the value of the hasWhose property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasWhose() {
        return hasWhose;
    }

    /**
     * Sets the value of the hasWhose property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasWhose(Boolean value) {
        this.hasWhose = value;
    }

    /**
     * Gets the value of the whose property.
     * 
     * @return
     *     possible object is
     *     {@link ActionSettings.Whose }
     *     
     */
    public ActionSettings.Whose getWhose() {
        return whose;
    }

    /**
     * Sets the value of the whose property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionSettings.Whose }
     *     
     */
    public void setWhose(ActionSettings.Whose value) {
        this.whose = value;
    }

    /**
     * Gets the value of the preActionCacheDownload property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreActionCacheDownload() {
        return preActionCacheDownload;
    }

    /**
     * Sets the value of the preActionCacheDownload property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreActionCacheDownload(Boolean value) {
        this.preActionCacheDownload = value;
    }

    /**
     * Gets the value of the reapply property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReapply() {
        return reapply;
    }

    /**
     * Sets the value of the reapply property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReapply(Boolean value) {
        this.reapply = value;
    }

    /**
     * Gets the value of the hasReapplyLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasReapplyLimit() {
        return hasReapplyLimit;
    }

    /**
     * Sets the value of the hasReapplyLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasReapplyLimit(Boolean value) {
        this.hasReapplyLimit = value;
    }

    /**
     * Gets the value of the reapplyLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReapplyLimit() {
        return reapplyLimit;
    }

    /**
     * Sets the value of the reapplyLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReapplyLimit(BigInteger value) {
        this.reapplyLimit = value;
    }

    /**
     * Gets the value of the hasReapplyInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasReapplyInterval() {
        return hasReapplyInterval;
    }

    /**
     * Sets the value of the hasReapplyInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasReapplyInterval(Boolean value) {
        this.hasReapplyInterval = value;
    }

    /**
     * Gets the value of the reapplyInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getReapplyInterval() {
        return reapplyInterval;
    }

    /**
     * Sets the value of the reapplyInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setReapplyInterval(Duration value) {
        this.reapplyInterval = value;
    }

    /**
     * Gets the value of the hasRetry property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasRetry() {
        return hasRetry;
    }

    /**
     * Sets the value of the hasRetry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasRetry(Boolean value) {
        this.hasRetry = value;
    }

    /**
     * Gets the value of the retryCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRetryCount() {
        return retryCount;
    }

    /**
     * Sets the value of the retryCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRetryCount(BigInteger value) {
        this.retryCount = value;
    }

    /**
     * Gets the value of the retryWait property.
     * 
     * @return
     *     possible object is
     *     {@link ActionSettings.RetryWait }
     *     
     */
    public ActionSettings.RetryWait getRetryWait() {
        return retryWait;
    }

    /**
     * Sets the value of the retryWait property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionSettings.RetryWait }
     *     
     */
    public void setRetryWait(ActionSettings.RetryWait value) {
        this.retryWait = value;
    }

    /**
     * Gets the value of the hasTemporalDistribution property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasTemporalDistribution() {
        return hasTemporalDistribution;
    }

    /**
     * Sets the value of the hasTemporalDistribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasTemporalDistribution(Boolean value) {
        this.hasTemporalDistribution = value;
    }

    /**
     * Gets the value of the temporalDistribution property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTemporalDistribution() {
        return temporalDistribution;
    }

    /**
     * Sets the value of the temporalDistribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTemporalDistribution(Duration value) {
        this.temporalDistribution = value;
    }

    /**
     * Gets the value of the continueOnErrors property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContinueOnErrors() {
        return continueOnErrors;
    }

    /**
     * Sets the value of the continueOnErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContinueOnErrors(Boolean value) {
        this.continueOnErrors = value;
    }

    /**
     * Gets the value of the postActionBehavior property.
     * 
     * @return
     *     possible object is
     *     {@link ActionSettings.PostActionBehavior }
     *     
     */
    public ActionSettings.PostActionBehavior getPostActionBehavior() {
        return postActionBehavior;
    }

    /**
     * Sets the value of the postActionBehavior property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionSettings.PostActionBehavior }
     *     
     */
    public void setPostActionBehavior(ActionSettings.PostActionBehavior value) {
        this.postActionBehavior = value;
    }

    /**
     * Gets the value of the isOffer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOffer() {
        return isOffer;
    }

    /**
     * Sets the value of the isOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOffer(Boolean value) {
        this.isOffer = value;
    }

    /**
     * Gets the value of the announceOffer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnnounceOffer() {
        return announceOffer;
    }

    /**
     * Sets the value of the announceOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnnounceOffer(Boolean value) {
        this.announceOffer = value;
    }

    /**
     * Gets the value of the offerCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferCategory() {
        return offerCategory;
    }

    /**
     * Sets the value of the offerCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferCategory(String value) {
        this.offerCategory = value;
    }

    /**
     * Gets the value of the offerDescriptionHTML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferDescriptionHTML() {
        return offerDescriptionHTML;
    }

    /**
     * Sets the value of the offerDescriptionHTML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferDescriptionHTML(String value) {
        this.offerDescriptionHTML = value;
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
     *         &lt;element name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="Wed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="Thu" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "sun",
        "mon",
        "tue",
        "wed",
        "thu",
        "fri",
        "sat"
    })
    public static class DayOfWeekConstraint {

        @XmlElement(name = "Sun")
        protected Boolean sun;
        @XmlElement(name = "Mon")
        protected Boolean mon;
        @XmlElement(name = "Tue")
        protected Boolean tue;
        @XmlElement(name = "Wed")
        protected Boolean wed;
        @XmlElement(name = "Thu")
        protected Boolean thu;
        @XmlElement(name = "Fri")
        protected Boolean fri;
        @XmlElement(name = "Sat")
        protected Boolean sat;

        /**
         * Gets the value of the sun property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSun() {
            return sun;
        }

        /**
         * Sets the value of the sun property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSun(Boolean value) {
            this.sun = value;
        }

        /**
         * Gets the value of the mon property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMon() {
            return mon;
        }

        /**
         * Sets the value of the mon property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMon(Boolean value) {
            this.mon = value;
        }

        /**
         * Gets the value of the tue property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isTue() {
            return tue;
        }

        /**
         * Sets the value of the tue property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setTue(Boolean value) {
            this.tue = value;
        }

        /**
         * Gets the value of the wed property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isWed() {
            return wed;
        }

        /**
         * Sets the value of the wed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setWed(Boolean value) {
            this.wed = value;
        }

        /**
         * Gets the value of the thu property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isThu() {
            return thu;
        }

        /**
         * Sets the value of the thu property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setThu(Boolean value) {
            this.thu = value;
        }

        /**
         * Gets the value of the fri property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFri() {
            return fri;
        }

        /**
         * Sets the value of the fri property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFri(Boolean value) {
            this.fri = value;
        }

        /**
         * Gets the value of the sat property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSat() {
            return sat;
        }

        /**
         * Sets the value of the sat property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSat(Boolean value) {
            this.sat = value;
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
     *         &lt;group ref="{}Message" minOccurs="0"/>
     *         &lt;element name="ShowActionButton" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="ShowCancelButton" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="AllowPostponement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="MaxPostponementInterval" type="{}ActionMessageMaxPostponementInterval" minOccurs="0"/>
     *         &lt;element name="PostponementDeadlineOffset" type="{}TimeInterval" minOccurs="0"/>
     *         &lt;element name="HasTimeout" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="TimeoutInterval" type="{}ActionMessageTimeInterval" minOccurs="0"/>
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
        "title",
        "text",
        "showActionButton",
        "showCancelButton",
        "allowPostponement",
        "maxPostponementInterval",
        "postponementDeadlineOffset",
        "hasTimeout",
        "timeoutInterval"
    })
    public static class Message {

        @XmlElement(name = "Title")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String title;
        @XmlElement(name = "Text")
        protected String text;
        @XmlElement(name = "ShowActionButton")
        protected Boolean showActionButton;
        @XmlElement(name = "ShowCancelButton")
        protected Boolean showCancelButton;
        @XmlElement(name = "AllowPostponement")
        protected Boolean allowPostponement;
        @XmlElement(name = "MaxPostponementInterval")
        protected Duration maxPostponementInterval;
        @XmlElement(name = "PostponementDeadlineOffset")
        protected Duration postponementDeadlineOffset;
        @XmlElement(name = "HasTimeout")
        protected Boolean hasTimeout;
        @XmlElement(name = "TimeoutInterval")
        protected Duration timeoutInterval;

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
         * Gets the value of the text property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getText() {
            return text;
        }

        /**
         * Sets the value of the text property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setText(String value) {
            this.text = value;
        }

        /**
         * Gets the value of the showActionButton property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isShowActionButton() {
            return showActionButton;
        }

        /**
         * Sets the value of the showActionButton property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setShowActionButton(Boolean value) {
            this.showActionButton = value;
        }

        /**
         * Gets the value of the showCancelButton property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isShowCancelButton() {
            return showCancelButton;
        }

        /**
         * Sets the value of the showCancelButton property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setShowCancelButton(Boolean value) {
            this.showCancelButton = value;
        }

        /**
         * Gets the value of the allowPostponement property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAllowPostponement() {
            return allowPostponement;
        }

        /**
         * Sets the value of the allowPostponement property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAllowPostponement(Boolean value) {
            this.allowPostponement = value;
        }

        /**
         * Gets the value of the maxPostponementInterval property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getMaxPostponementInterval() {
            return maxPostponementInterval;
        }

        /**
         * Sets the value of the maxPostponementInterval property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setMaxPostponementInterval(Duration value) {
            this.maxPostponementInterval = value;
        }

        /**
         * Gets the value of the postponementDeadlineOffset property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getPostponementDeadlineOffset() {
            return postponementDeadlineOffset;
        }

        /**
         * Sets the value of the postponementDeadlineOffset property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setPostponementDeadlineOffset(Duration value) {
            this.postponementDeadlineOffset = value;
        }

        /**
         * Gets the value of the hasTimeout property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHasTimeout() {
            return hasTimeout;
        }

        /**
         * Sets the value of the hasTimeout property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHasTimeout(Boolean value) {
            this.hasTimeout = value;
        }

        /**
         * Gets the value of the timeoutInterval property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getTimeoutInterval() {
            return timeoutInterval;
        }

        /**
         * Sets the value of the timeoutInterval property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setTimeoutInterval(Duration value) {
            this.timeoutInterval = value;
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
     *         &lt;element name="AllowCancel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="AllowPostponement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="MaxPostponementInterval" type="{}ActionMessageMaxPostponementInterval" minOccurs="0"/>
     *         &lt;element name="HasTimeout" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="TimeoutInterval" type="{}ActionMessageTimeInterval" minOccurs="0"/>
     *         &lt;element name="PostActionDeadlineBehavior" type="{}ActionDeadlineBehavior" minOccurs="0"/>
     *         &lt;element name="PostActionDeadlineInterval" type="{}ActionMessageTimeInterval" minOccurs="0"/>
     *         &lt;group ref="{}Message"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Behavior" default="Nothing">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Nothing"/>
     *             &lt;enumeration value="Restart"/>
     *             &lt;enumeration value="Shutdown"/>
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
    @XmlType(name = "", propOrder = {
        "allowCancel",
        "allowPostponement",
        "maxPostponementInterval",
        "hasTimeout",
        "timeoutInterval",
        "postActionDeadlineBehavior",
        "postActionDeadlineInterval",
        "title",
        "text"
    })
    public static class PostActionBehavior {

        @XmlElement(name = "AllowCancel")
        protected Boolean allowCancel;
        @XmlElement(name = "AllowPostponement")
        protected Boolean allowPostponement;
        @XmlElement(name = "MaxPostponementInterval")
        protected Duration maxPostponementInterval;
        @XmlElement(name = "HasTimeout")
        protected Boolean hasTimeout;
        @XmlElement(name = "TimeoutInterval")
        protected Duration timeoutInterval;
        @XmlElement(name = "PostActionDeadlineBehavior")
        @XmlSchemaType(name = "string")
        protected ActionDeadlineBehavior postActionDeadlineBehavior;
        @XmlElement(name = "PostActionDeadlineInterval")
        protected Duration postActionDeadlineInterval;
        @XmlElement(name = "Title")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String title;
        @XmlElement(name = "Text")
        protected String text;
        @XmlAttribute(name = "Behavior")
        protected String behavior;

        /**
         * Gets the value of the allowCancel property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAllowCancel() {
            return allowCancel;
        }

        /**
         * Sets the value of the allowCancel property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAllowCancel(Boolean value) {
            this.allowCancel = value;
        }

        /**
         * Gets the value of the allowPostponement property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAllowPostponement() {
            return allowPostponement;
        }

        /**
         * Sets the value of the allowPostponement property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAllowPostponement(Boolean value) {
            this.allowPostponement = value;
        }

        /**
         * Gets the value of the maxPostponementInterval property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getMaxPostponementInterval() {
            return maxPostponementInterval;
        }

        /**
         * Sets the value of the maxPostponementInterval property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setMaxPostponementInterval(Duration value) {
            this.maxPostponementInterval = value;
        }

        /**
         * Gets the value of the hasTimeout property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHasTimeout() {
            return hasTimeout;
        }

        /**
         * Sets the value of the hasTimeout property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHasTimeout(Boolean value) {
            this.hasTimeout = value;
        }

        /**
         * Gets the value of the timeoutInterval property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getTimeoutInterval() {
            return timeoutInterval;
        }

        /**
         * Sets the value of the timeoutInterval property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setTimeoutInterval(Duration value) {
            this.timeoutInterval = value;
        }

        /**
         * Gets the value of the postActionDeadlineBehavior property.
         * 
         * @return
         *     possible object is
         *     {@link ActionDeadlineBehavior }
         *     
         */
        public ActionDeadlineBehavior getPostActionDeadlineBehavior() {
            return postActionDeadlineBehavior;
        }

        /**
         * Sets the value of the postActionDeadlineBehavior property.
         * 
         * @param value
         *     allowed object is
         *     {@link ActionDeadlineBehavior }
         *     
         */
        public void setPostActionDeadlineBehavior(ActionDeadlineBehavior value) {
            this.postActionDeadlineBehavior = value;
        }

        /**
         * Gets the value of the postActionDeadlineInterval property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getPostActionDeadlineInterval() {
            return postActionDeadlineInterval;
        }

        /**
         * Sets the value of the postActionDeadlineInterval property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setPostActionDeadlineInterval(Duration value) {
            this.postActionDeadlineInterval = value;
        }

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
         * Gets the value of the text property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getText() {
            return text;
        }

        /**
         * Sets the value of the text property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setText(String value) {
            this.text = value;
        }

        /**
         * Gets the value of the behavior property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBehavior() {
            if (behavior == null) {
                return "Nothing";
            } else {
                return behavior;
            }
        }

        /**
         * Sets the value of the behavior property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBehavior(String value) {
            this.behavior = value;
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
     *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AskToSaveWork" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="ShowActionButton" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="ShowCancelButton" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="DeadlineBehavior" type="{}ActionDeadlineBehavior" minOccurs="0"/>
     *         &lt;element name="DeadlineType" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="Interval"/>
     *               &lt;enumeration value="Absolute"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DeadlineInterval" type="{}ActionMessageTimeInterval" minOccurs="0"/>
     *         &lt;choice>
     *           &lt;element name="DeadlineOffset" type="{}TimeInterval" minOccurs="0"/>
     *           &lt;element name="DeadlineLocalOffset" type="{}TimeInterval" minOccurs="0"/>
     *         &lt;/choice>
     *         &lt;element name="ShowConfirmation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="Confirmation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "text",
        "askToSaveWork",
        "showActionButton",
        "showCancelButton",
        "deadlineBehavior",
        "deadlineType",
        "deadlineInterval",
        "deadlineOffset",
        "deadlineLocalOffset",
        "showConfirmation",
        "confirmation"
    })
    public static class PreAction {

        @XmlElement(name = "Text")
        protected String text;
        @XmlElement(name = "AskToSaveWork")
        protected Boolean askToSaveWork;
        @XmlElement(name = "ShowActionButton")
        protected Boolean showActionButton;
        @XmlElement(name = "ShowCancelButton")
        protected Boolean showCancelButton;
        @XmlElement(name = "DeadlineBehavior")
        @XmlSchemaType(name = "string")
        protected ActionDeadlineBehavior deadlineBehavior;
        @XmlElement(name = "DeadlineType")
        protected String deadlineType;
        @XmlElement(name = "DeadlineInterval")
        protected Duration deadlineInterval;
        @XmlElement(name = "DeadlineOffset")
        protected Duration deadlineOffset;
        @XmlElement(name = "DeadlineLocalOffset")
        protected Duration deadlineLocalOffset;
        @XmlElement(name = "ShowConfirmation")
        protected Boolean showConfirmation;
        @XmlElement(name = "Confirmation")
        protected String confirmation;

        /**
         * Gets the value of the text property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getText() {
            return text;
        }

        /**
         * Sets the value of the text property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setText(String value) {
            this.text = value;
        }

        /**
         * Gets the value of the askToSaveWork property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAskToSaveWork() {
            return askToSaveWork;
        }

        /**
         * Sets the value of the askToSaveWork property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAskToSaveWork(Boolean value) {
            this.askToSaveWork = value;
        }

        /**
         * Gets the value of the showActionButton property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isShowActionButton() {
            return showActionButton;
        }

        /**
         * Sets the value of the showActionButton property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setShowActionButton(Boolean value) {
            this.showActionButton = value;
        }

        /**
         * Gets the value of the showCancelButton property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isShowCancelButton() {
            return showCancelButton;
        }

        /**
         * Sets the value of the showCancelButton property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setShowCancelButton(Boolean value) {
            this.showCancelButton = value;
        }

        /**
         * Gets the value of the deadlineBehavior property.
         * 
         * @return
         *     possible object is
         *     {@link ActionDeadlineBehavior }
         *     
         */
        public ActionDeadlineBehavior getDeadlineBehavior() {
            return deadlineBehavior;
        }

        /**
         * Sets the value of the deadlineBehavior property.
         * 
         * @param value
         *     allowed object is
         *     {@link ActionDeadlineBehavior }
         *     
         */
        public void setDeadlineBehavior(ActionDeadlineBehavior value) {
            this.deadlineBehavior = value;
        }

        /**
         * Gets the value of the deadlineType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeadlineType() {
            return deadlineType;
        }

        /**
         * Sets the value of the deadlineType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeadlineType(String value) {
            this.deadlineType = value;
        }

        /**
         * Gets the value of the deadlineInterval property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getDeadlineInterval() {
            return deadlineInterval;
        }

        /**
         * Sets the value of the deadlineInterval property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setDeadlineInterval(Duration value) {
            this.deadlineInterval = value;
        }

        /**
         * Gets the value of the deadlineOffset property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getDeadlineOffset() {
            return deadlineOffset;
        }

        /**
         * Sets the value of the deadlineOffset property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setDeadlineOffset(Duration value) {
            this.deadlineOffset = value;
        }

        /**
         * Gets the value of the deadlineLocalOffset property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getDeadlineLocalOffset() {
            return deadlineLocalOffset;
        }

        /**
         * Sets the value of the deadlineLocalOffset property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setDeadlineLocalOffset(Duration value) {
            this.deadlineLocalOffset = value;
        }

        /**
         * Gets the value of the showConfirmation property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isShowConfirmation() {
            return showConfirmation;
        }

        /**
         * Sets the value of the showConfirmation property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setShowConfirmation(Boolean value) {
            this.showConfirmation = value;
        }

        /**
         * Gets the value of the confirmation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConfirmation() {
            return confirmation;
        }

        /**
         * Sets the value of the confirmation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConfirmation(String value) {
            this.confirmation = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;>RetryWaitInterval">
     *       &lt;attribute name="Behavior" default="WaitForInterval">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="WaitForReboot"/>
     *             &lt;enumeration value="WaitForInterval"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class RetryWait {

        @XmlValue
        protected Duration value;
        @XmlAttribute(name = "Behavior")
        protected String behavior;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setValue(Duration value) {
            this.value = value;
        }

        /**
         * Gets the value of the behavior property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBehavior() {
            if (behavior == null) {
                return "WaitForInterval";
            } else {
                return behavior;
            }
        }

        /**
         * Sets the value of the behavior property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBehavior(String value) {
            this.behavior = value;
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
     *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "title",
        "text"
    })
    public static class RunningMessage {

        @XmlElement(name = "Title")
        protected String title;
        @XmlElement(name = "Text")
        protected String text;

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
         * Gets the value of the text property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getText() {
            return text;
        }

        /**
         * Sets the value of the text property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setText(String value) {
            this.text = value;
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
     *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
     *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
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
        "startTime",
        "endTime"
    })
    public static class TimeRange {

        @XmlElement(name = "StartTime")
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar startTime;
        @XmlElement(name = "EndTime")
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar endTime;

        /**
         * Gets the value of the startTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStartTime() {
            return startTime;
        }

        /**
         * Sets the value of the startTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStartTime(XMLGregorianCalendar value) {
            this.startTime = value;
        }

        /**
         * Gets the value of the endTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEndTime() {
            return endTime;
        }

        /**
         * Sets the value of the endTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEndTime(XMLGregorianCalendar value) {
            this.endTime = value;
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
     *         &lt;element name="Win9xGroup" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="WinNTGroup" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="LocalGroup" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DomainGroup" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Sid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "win9XGroupOrWinNTGroupOrLocalGroup"
    })
    public static class UIGroupConstraints {

        @XmlElementRefs({
            @XmlElementRef(name = "Win9xGroup", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "WinNTGroup", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "LocalGroup", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "DomainGroup", type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<?>> win9XGroupOrWinNTGroupOrLocalGroup;

        /**
         * Gets the value of the win9XGroupOrWinNTGroupOrLocalGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the win9XGroupOrWinNTGroupOrLocalGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWin9XGroupOrWinNTGroupOrLocalGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link Object }{@code >}
         * {@link JAXBElement }{@code <}{@link Object }{@code >}
         * {@link JAXBElement }{@code <}{@link ActionSettings.UIGroupConstraints.LocalGroup }{@code >}
         * {@link JAXBElement }{@code <}{@link ActionSettings.UIGroupConstraints.DomainGroup }{@code >}
         * 
         * 
         */
        public List<JAXBElement<?>> getWin9XGroupOrWinNTGroupOrLocalGroup() {
            if (win9XGroupOrWinNTGroupOrLocalGroup == null) {
                win9XGroupOrWinNTGroupOrLocalGroup = new ArrayList<JAXBElement<?>>();
            }
            return this.win9XGroupOrWinNTGroupOrLocalGroup;
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
         *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Sid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DomainGroup {

            @XmlAttribute(name = "Name", required = true)
            protected String name;
            @XmlAttribute(name = "Sid", required = true)
            protected String sid;

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
             * Gets the value of the sid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSid() {
                return sid;
            }

            /**
             * Sets the value of the sid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSid(String value) {
                this.sid = value;
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
         *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class LocalGroup {

            @XmlAttribute(name = "Name", required = true)
            protected String name;

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
     *         &lt;element name="Property" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Relation" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "property",
        "relation",
        "value"
    })
    public static class Whose {

        @XmlElement(name = "Property")
        protected String property;
        @XmlElement(name = "Relation")
        protected String relation;
        @XmlElement(name = "Value")
        protected String value;

        /**
         * Gets the value of the property property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProperty() {
            return property;
        }

        /**
         * Sets the value of the property property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProperty(String value) {
            this.property = value;
        }

        /**
         * Gets the value of the relation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRelation() {
            return relation;
        }

        /**
         * Sets the value of the relation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRelation(String value) {
            this.relation = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

    }

}
