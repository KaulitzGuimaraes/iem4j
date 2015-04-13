
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="Fixlet">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *                 &lt;attribute name="LastModified" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ReplicationServer">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ServerID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                   &lt;element name="DNS" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                   &lt;element name="ReplicationIntervalSeconds" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="ReplicationLink" type="{}ReplicationLinkType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ReplicationLink" type="{}ReplicationLinkType"/>
 *         &lt;element name="Action">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *                 &lt;attribute name="LastModified" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FileUpload">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                   &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                   &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *                   &lt;element name="SHA1" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                   &lt;element name="SHA256" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ActionResults">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ActionID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                   &lt;element name="DateIssued" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                   &lt;element name="Computer" type="{}ComputerResultType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="MemberActionResult" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ActionID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *                             &lt;element name="Computer" type="{}ComputerResultType" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Analysis">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *                 &lt;attribute name="LastModified" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AnalysisActivation">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *                 &lt;attribute name="LastModified" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Task">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *                 &lt;attribute name="LastModified" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Property">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="IsReserved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *                 &lt;attribute name="LastModified" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SingleAction">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                 &lt;/choice>
 *                 &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *                 &lt;attribute name="LastModified" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MultipleActionGroup">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                 &lt;/choice>
 *                 &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *                 &lt;attribute name="LastModified" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Baseline">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                 &lt;/choice>
 *                 &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="LastModified" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Computer">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LastReportTime" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element name="Property" maxOccurs="unbounded" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;simpleContent>
 *                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                             &lt;attribute name="Name" use="required" type="{}ObjectName" />
 *                           &lt;/extension>
 *                         &lt;/simpleContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="Setting" type="{}ComputerSetting" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ComputerSettings">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TargetComputers" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ComputerID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Setting" type="{}ComputerSetting" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AdminField">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DashboardData">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Dashboard" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                   &lt;element name="IsPrivate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="User" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SiteFile">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="FileSize" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="IsClientFile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="LastModified" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ClientReports">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EncryptionStatus" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                   &lt;element name="Details" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                   &lt;element name="KeySize" type="{}EncryptionKeySizeType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Resource" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SystemOptions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MinimumRefreshSeconds" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="DefaultFixletVisibility" type="{}DefaultFixletVisibilityType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Resource" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ComputerGroup">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Resource" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *                 &lt;attribute name="LastModified" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Operator" type="{}Operator"/>
 *         &lt;element name="ExternalSite">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                   &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Resource" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="LastModified" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CustomSite">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                   &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Resource" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="LastModified" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OperatorSite">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Resource" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="LastModified" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ActionSite">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Resource" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *                 &lt;attribute name="LastModified" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Role" type="{}Role"/>
 *         &lt;element name="Site">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                   &lt;element name="Permission" type="{}SitePermissionString" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *                 &lt;attribute name="LastModified" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SitePermission">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Permission" type="{}SitePermissionString"/>
 *                   &lt;choice minOccurs="0">
 *                     &lt;element name="Operator" type="{}StringWithReference"/>
 *                     &lt;element name="Role" type="{}IntegerWithReference"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LDAPDirectory">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                   &lt;element name="IsActiveDirectory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="IsGlobalCatalog" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="UseSSL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="AllowEmptyPasswords" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="BaseDN" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                   &lt;element name="UIDAttribute" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                   &lt;element name="UserFilter" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                   &lt;element name="GroupFilter" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                   &lt;element name="User" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                   &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                   &lt;element name="Servers" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Server" type="{}LDAPServer" maxOccurs="4"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ComputerMailboxFile">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="SHA1" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                   &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                   &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Query">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Result" type="{}RelevanceResult"/>
 *                   &lt;choice>
 *                     &lt;element name="Evaluation">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                               &lt;element name="Plurality" type="{}RelevancePlurality"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MastheadParameters">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PortNumber" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                   &lt;element name="GatherInterval" type="{}MastheadGatherInterval" minOccurs="0"/>
 *                   &lt;element name="Controller" type="{}MastheadController" minOccurs="0"/>
 *                   &lt;choice minOccurs="0">
 *                     &lt;element name="InitialLockState" type="{}MastheadLockState"/>
 *                     &lt;element name="InitialLockDuration" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *                   &lt;/choice>
 *                   &lt;element name="ActionLockExemptionURL" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                   &lt;element name="RequireFIPSCompliantCrypto" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Warning" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ComputerSetting" type="{}ComputerSetting" minOccurs="0"/>
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
    "fixletOrReplicationServerOrReplicationLink"
})
@XmlRootElement(name = "BESAPI")
public class BESAPI {

    @XmlElementRefs({
        @XmlElementRef(name = "FileUpload", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AnalysisActivation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ActionResults", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CustomSite", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ReplicationLink", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Fixlet", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AdminField", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SingleAction", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Role", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Task", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DashboardData", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MastheadParameters", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SiteFile", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ClientReports", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Computer", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Error", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Property", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SystemOptions", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Query", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ComputerSetting", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Analysis", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Operator", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ComputerMailboxFile", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Warning", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ComputerGroup", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ComputerSettings", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ReplicationServer", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Baseline", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MultipleActionGroup", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Site", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SitePermission", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ActionSite", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LDAPDirectory", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ExternalSite", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OperatorSite", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Action", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> fixletOrReplicationServerOrReplicationLink;

    /**
     * Gets the value of the fixletOrReplicationServerOrReplicationLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fixletOrReplicationServerOrReplicationLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFixletOrReplicationServerOrReplicationLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link BESAPI.FileUpload }{@code >}
     * {@link JAXBElement }{@code <}{@link BESAPI.AnalysisActivation }{@code >}
     * {@link JAXBElement }{@code <}{@link BESAPI.ActionResults }{@code >}
     * {@link JAXBElement }{@code <}{@link BESAPI.CustomSite }{@code >}
     * {@link JAXBElement }{@code <}{@link ReplicationLinkType }{@code >}
     * {@link JAXBElement }{@code <}{@link BESAPI.Fixlet }{@code >}
     * {@link JAXBElement }{@code <}{@link BESAPI.AdminField }{@code >}
     * {@link JAXBElement }{@code <}{@link BESAPI.SingleAction }{@code >}
     * {@link JAXBElement }{@code <}{@link Role }{@code >}
     * {@link JAXBElement }{@code <}{@link BESAPI.Task }{@code >}
     * {@link JAXBElement }{@code <}{@link BESAPI.DashboardData }{@code >}
     * {@link JAXBElement }{@code <}{@link BESAPI.MastheadParameters }{@code >}
     * {@link JAXBElement }{@code <}{@link BESAPI.SiteFile }{@code >}
     * {@link JAXBElement }{@code <}{@link BESAPI.ClientReports }{@code >}
     * {@link JAXBElement }{@code <}{@link BESAPI.Computer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BESAPI.Property }{@code >}
     * {@link JAXBElement }{@code <}{@link BESAPI.SystemOptions }{@code >}
     * {@link JAXBElement }{@code <}{@link BESAPI.Query }{@code >}
     * {@link JAXBElement }{@code <}{@link ComputerSetting }{@code >}
     * {@link JAXBElement }{@code <}{@link BESAPI.Analysis }{@code >}
     * {@link JAXBElement }{@code <}{@link Operator }{@code >}
     * {@link JAXBElement }{@code <}{@link BESAPI.ComputerMailboxFile }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BESAPI.ComputerGroup }{@code >}
     * {@link JAXBElement }{@code <}{@link BESAPI.ComputerSettings }{@code >}
     * {@link JAXBElement }{@code <}{@link BESAPI.ReplicationServer }{@code >}
     * {@link JAXBElement }{@code <}{@link BESAPI.Baseline }{@code >}
     * {@link JAXBElement }{@code <}{@link BESAPI.MultipleActionGroup }{@code >}
     * {@link JAXBElement }{@code <}{@link BESAPI.Site }{@code >}
     * {@link JAXBElement }{@code <}{@link BESAPI.SitePermission }{@code >}
     * {@link JAXBElement }{@code <}{@link BESAPI.ActionSite }{@code >}
     * {@link JAXBElement }{@code <}{@link BESAPI.LDAPDirectory }{@code >}
     * {@link JAXBElement }{@code <}{@link BESAPI.ExternalSite }{@code >}
     * {@link JAXBElement }{@code <}{@link BESAPI.OperatorSite }{@code >}
     * {@link JAXBElement }{@code <}{@link BESAPI.Action }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getFixletOrReplicationServerOrReplicationLink() {
        if (fixletOrReplicationServerOrReplicationLink == null) {
            fixletOrReplicationServerOrReplicationLink = new ArrayList<JAXBElement<?>>();
        }
        return this.fixletOrReplicationServerOrReplicationLink;
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
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *       &lt;attribute name="LastModified" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
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
        "id"
    })
    public static class Action {

        @XmlElement(name = "Name")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String name;
        @XmlElement(name = "ID", required = true)
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger id;
        @XmlAttribute(name = "Resource")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String resource;
        @XmlAttribute(name = "LastModified")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String lastModified;

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
         * Gets the value of the lastModified property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastModified() {
            return lastModified;
        }

        /**
         * Sets the value of the lastModified property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastModified(String value) {
            this.lastModified = value;
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
     *         &lt;element name="ActionID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
     *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
     *         &lt;element name="DateIssued" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *         &lt;element name="Computer" type="{}ComputerResultType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="MemberActionResult" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ActionID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
     *                   &lt;element name="Computer" type="{}ComputerResultType" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
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
    @XmlType(name = "", propOrder = {
        "actionID",
        "status",
        "dateIssued",
        "computer",
        "memberActionResult"
    })
    public static class ActionResults {

        @XmlElement(name = "ActionID", required = true)
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger actionID;
        @XmlElement(name = "Status", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String status;
        @XmlElement(name = "DateIssued")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String dateIssued;
        @XmlElement(name = "Computer")
        protected List<ComputerResultType> computer;
        @XmlElement(name = "MemberActionResult")
        protected List<BESAPI.ActionResults.MemberActionResult> memberActionResult;
        @XmlAttribute(name = "Resource")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String resource;

        /**
         * Gets the value of the actionID property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getActionID() {
            return actionID;
        }

        /**
         * Sets the value of the actionID property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setActionID(BigInteger value) {
            this.actionID = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }

        /**
         * Gets the value of the dateIssued property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDateIssued() {
            return dateIssued;
        }

        /**
         * Sets the value of the dateIssued property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDateIssued(String value) {
            this.dateIssued = value;
        }

        /**
         * Gets the value of the computer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the computer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getComputer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ComputerResultType }
         * 
         * 
         */
        public List<ComputerResultType> getComputer() {
            if (computer == null) {
                computer = new ArrayList<ComputerResultType>();
            }
            return this.computer;
        }

        /**
         * Gets the value of the memberActionResult property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the memberActionResult property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMemberActionResult().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BESAPI.ActionResults.MemberActionResult }
         * 
         * 
         */
        public List<BESAPI.ActionResults.MemberActionResult> getMemberActionResult() {
            if (memberActionResult == null) {
                memberActionResult = new ArrayList<BESAPI.ActionResults.MemberActionResult>();
            }
            return this.memberActionResult;
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
         *         &lt;element name="ActionID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
         *         &lt;element name="Computer" type="{}ComputerResultType" maxOccurs="unbounded" minOccurs="0"/>
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
        @XmlType(name = "", propOrder = {
            "actionID",
            "computer"
        })
        public static class MemberActionResult {

            @XmlElement(name = "ActionID", required = true)
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger actionID;
            @XmlElement(name = "Computer")
            protected List<ComputerResultType> computer;
            @XmlAttribute(name = "Resource")
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String resource;

            /**
             * Gets the value of the actionID property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getActionID() {
                return actionID;
            }

            /**
             * Sets the value of the actionID property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setActionID(BigInteger value) {
                this.actionID = value;
            }

            /**
             * Gets the value of the computer property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the computer property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getComputer().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ComputerResultType }
             * 
             * 
             */
            public List<ComputerResultType> getComputer() {
                if (computer == null) {
                    computer = new ArrayList<ComputerResultType>();
                }
                return this.computer;
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
     *       &lt;/sequence>
     *       &lt;attribute name="Resource" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *       &lt;attribute name="LastModified" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name"
    })
    public static class ActionSite {

        @XmlElement(name = "Name", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String name;
        @XmlAttribute(name = "Resource", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String resource;
        @XmlAttribute(name = "LastModified")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String lastModified;

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
         * Gets the value of the lastModified property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastModified() {
            return lastModified;
        }

        /**
         * Sets the value of the lastModified property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastModified(String value) {
            this.lastModified = value;
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
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "value"
    })
    public static class AdminField {

        @XmlElement(name = "Name")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String name;
        @XmlElement(name = "Value")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String value;
        @XmlAttribute(name = "Resource")
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
     *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *       &lt;attribute name="LastModified" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
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
        "id"
    })
    public static class Analysis {

        @XmlElement(name = "Name", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String name;
        @XmlElement(name = "ID")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger id;
        @XmlAttribute(name = "Resource")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String resource;
        @XmlAttribute(name = "LastModified")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String lastModified;

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
         * Gets the value of the lastModified property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastModified() {
            return lastModified;
        }

        /**
         * Sets the value of the lastModified property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastModified(String value) {
            this.lastModified = value;
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
     *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *       &lt;attribute name="LastModified" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
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
        "id"
    })
    public static class AnalysisActivation {

        @XmlElement(name = "Name", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String name;
        @XmlElement(name = "ID")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger id;
        @XmlAttribute(name = "Resource")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String resource;
        @XmlAttribute(name = "LastModified")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String lastModified;

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
         * Gets the value of the lastModified property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastModified() {
            return lastModified;
        }

        /**
         * Sets the value of the lastModified property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastModified(String value) {
            this.lastModified = value;
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
     *       &lt;choice>
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
     *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *       &lt;/choice>
     *       &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="LastModified" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
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
        "id"
    })
    public static class Baseline {

        @XmlElement(name = "Name")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String name;
        @XmlElement(name = "ID")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger id;
        @XmlAttribute(name = "Resource")
        protected String resource;
        @XmlAttribute(name = "LastModified")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String lastModified;

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
         * Gets the value of the lastModified property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastModified() {
            return lastModified;
        }

        /**
         * Sets the value of the lastModified property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastModified(String value) {
            this.lastModified = value;
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
     *         &lt;element name="EncryptionStatus" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
     *         &lt;element name="Details" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *         &lt;element name="KeySize" type="{}EncryptionKeySizeType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Resource" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "encryptionStatus",
        "details",
        "keySize"
    })
    public static class ClientReports {

        @XmlElement(name = "EncryptionStatus", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String encryptionStatus;
        @XmlElement(name = "Details")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String details;
        @XmlElement(name = "KeySize")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String keySize;
        @XmlAttribute(name = "Resource", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String resource;

        /**
         * Gets the value of the encryptionStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEncryptionStatus() {
            return encryptionStatus;
        }

        /**
         * Sets the value of the encryptionStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEncryptionStatus(String value) {
            this.encryptionStatus = value;
        }

        /**
         * Gets the value of the details property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDetails() {
            return details;
        }

        /**
         * Sets the value of the details property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDetails(String value) {
            this.details = value;
        }

        /**
         * Gets the value of the keySize property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKeySize() {
            return keySize;
        }

        /**
         * Sets the value of the keySize property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKeySize(String value) {
            this.keySize = value;
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
     *         &lt;element name="LastReportTime" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *           &lt;element name="Property" maxOccurs="unbounded" minOccurs="0">
     *             &lt;complexType>
     *               &lt;simpleContent>
     *                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                   &lt;attribute name="Name" use="required" type="{}ObjectName" />
     *                 &lt;/extension>
     *               &lt;/simpleContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="Setting" type="{}ComputerSetting" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;/choice>
     *       &lt;/sequence>
     *       &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "lastReportTime",
        "id",
        "propertyOrSetting"
    })
    public static class Computer {

        @XmlElement(name = "LastReportTime")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String lastReportTime;
        @XmlElement(name = "ID")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger id;
        @XmlElements({
            @XmlElement(name = "Property", type = BESAPI.Computer.Property.class),
            @XmlElement(name = "Setting", type = ComputerSetting.class)
        })
        protected List<Object> propertyOrSetting;
        @XmlAttribute(name = "Resource")
        protected String resource;

        /**
         * Gets the value of the lastReportTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastReportTime() {
            return lastReportTime;
        }

        /**
         * Sets the value of the lastReportTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastReportTime(String value) {
            this.lastReportTime = value;
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
         * Gets the value of the propertyOrSetting property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the propertyOrSetting property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPropertyOrSetting().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BESAPI.Computer.Property }
         * {@link ComputerSetting }
         * 
         * 
         */
        public List<Object> getPropertyOrSetting() {
            if (propertyOrSetting == null) {
                propertyOrSetting = new ArrayList<Object>();
            }
            return this.propertyOrSetting;
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
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="Name" use="required" type="{}ObjectName" />
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
        public static class Property {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Name", required = true)
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            protected String name;

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
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
     *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Resource" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *       &lt;attribute name="LastModified" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
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
        "id"
    })
    public static class ComputerGroup {

        @XmlElement(name = "Name", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String name;
        @XmlElement(name = "ID")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger id;
        @XmlAttribute(name = "Resource", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String resource;
        @XmlAttribute(name = "LastModified")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String lastModified;

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
         * Gets the value of the lastModified property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastModified() {
            return lastModified;
        }

        /**
         * Sets the value of the lastModified property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastModified(String value) {
            this.lastModified = value;
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
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="SHA1" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "name",
        "id",
        "sha1",
        "size",
        "timestamp"
    })
    public static class ComputerMailboxFile {

        @XmlElement(name = "Name")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String name;
        @XmlElement(name = "ID")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger id;
        @XmlElement(name = "SHA1")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String sha1;
        @XmlElement(name = "Size")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String size;
        @XmlElement(name = "Timestamp")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String timestamp;
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
         * Gets the value of the sha1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSHA1() {
            return sha1;
        }

        /**
         * Sets the value of the sha1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSHA1(String value) {
            this.sha1 = value;
        }

        /**
         * Gets the value of the size property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSize() {
            return size;
        }

        /**
         * Sets the value of the size property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSize(String value) {
            this.size = value;
        }

        /**
         * Gets the value of the timestamp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTimestamp() {
            return timestamp;
        }

        /**
         * Sets the value of the timestamp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTimestamp(String value) {
            this.timestamp = value;
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
     *         &lt;element name="TargetComputers" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ComputerID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Setting" type="{}ComputerSetting" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "targetComputers",
        "setting"
    })
    public static class ComputerSettings {

        @XmlElement(name = "TargetComputers")
        protected BESAPI.ComputerSettings.TargetComputers targetComputers;
        @XmlElement(name = "Setting")
        protected List<ComputerSetting> setting;
        @XmlAttribute(name = "Resource")
        protected String resource;

        /**
         * Gets the value of the targetComputers property.
         * 
         * @return
         *     possible object is
         *     {@link BESAPI.ComputerSettings.TargetComputers }
         *     
         */
        public BESAPI.ComputerSettings.TargetComputers getTargetComputers() {
            return targetComputers;
        }

        /**
         * Sets the value of the targetComputers property.
         * 
         * @param value
         *     allowed object is
         *     {@link BESAPI.ComputerSettings.TargetComputers }
         *     
         */
        public void setTargetComputers(BESAPI.ComputerSettings.TargetComputers value) {
            this.targetComputers = value;
        }

        /**
         * Gets the value of the setting property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the setting property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSetting().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ComputerSetting }
         * 
         * 
         */
        public List<ComputerSetting> getSetting() {
            if (setting == null) {
                setting = new ArrayList<ComputerSetting>();
            }
            return this.setting;
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
         *         &lt;element name="ComputerID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" maxOccurs="unbounded"/>
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
            "computerID"
        })
        public static class TargetComputers {

            @XmlElement(name = "ComputerID", required = true)
            @XmlSchemaType(name = "nonNegativeInteger")
            protected List<BigInteger> computerID;

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
     *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Resource" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="LastModified" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
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
        "displayName"
    })
    public static class CustomSite {

        @XmlElement(name = "Name", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String name;
        @XmlElement(name = "DisplayName")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String displayName;
        @XmlAttribute(name = "Resource", required = true)
        protected String resource;
        @XmlAttribute(name = "LastModified")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String lastModified;

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
         * Gets the value of the displayName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDisplayName() {
            return displayName;
        }

        /**
         * Sets the value of the displayName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDisplayName(String value) {
            this.displayName = value;
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
         * Gets the value of the lastModified property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastModified() {
            return lastModified;
        }

        /**
         * Sets the value of the lastModified property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastModified(String value) {
            this.lastModified = value;
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
     *         &lt;element name="Dashboard" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *         &lt;element name="IsPrivate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="User" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dashboard",
        "name",
        "isPrivate",
        "user",
        "value"
    })
    public static class DashboardData {

        @XmlElement(name = "Dashboard")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String dashboard;
        @XmlElement(name = "Name")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String name;
        @XmlElement(name = "IsPrivate")
        protected Boolean isPrivate;
        @XmlElement(name = "User")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String user;
        @XmlElement(name = "Value")
        protected String value;
        @XmlAttribute(name = "Resource")
        protected String resource;

        /**
         * Gets the value of the dashboard property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDashboard() {
            return dashboard;
        }

        /**
         * Sets the value of the dashboard property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDashboard(String value) {
            this.dashboard = value;
        }

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
         * Gets the value of the isPrivate property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsPrivate() {
            return isPrivate;
        }

        /**
         * Sets the value of the isPrivate property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsPrivate(Boolean value) {
            this.isPrivate = value;
        }

        /**
         * Gets the value of the user property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUser() {
            return user;
        }

        /**
         * Sets the value of the user property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUser(String value) {
            this.user = value;
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
     *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Resource" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="LastModified" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
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
        "displayName"
    })
    public static class ExternalSite {

        @XmlElement(name = "Name", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String name;
        @XmlElement(name = "DisplayName")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String displayName;
        @XmlAttribute(name = "Resource", required = true)
        protected String resource;
        @XmlAttribute(name = "LastModified")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String lastModified;

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
         * Gets the value of the displayName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDisplayName() {
            return displayName;
        }

        /**
         * Sets the value of the displayName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDisplayName(String value) {
            this.displayName = value;
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
         * Gets the value of the lastModified property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastModified() {
            return lastModified;
        }

        /**
         * Sets the value of the lastModified property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastModified(String value) {
            this.lastModified = value;
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
     *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
     *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
     *         &lt;element name="SHA1" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
     *         &lt;element name="SHA256" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
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
    @XmlType(name = "", propOrder = {
        "name",
        "url",
        "size",
        "sha1",
        "sha256"
    })
    public static class FileUpload {

        @XmlElement(name = "Name", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String name;
        @XmlElement(name = "URL", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String url;
        @XmlElement(name = "Size", required = true)
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger size;
        @XmlElement(name = "SHA1", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String sha1;
        @XmlElement(name = "SHA256", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String sha256;
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
         * Gets the value of the url property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getURL() {
            return url;
        }

        /**
         * Sets the value of the url property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setURL(String value) {
            this.url = value;
        }

        /**
         * Gets the value of the size property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSize() {
            return size;
        }

        /**
         * Sets the value of the size property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSize(BigInteger value) {
            this.size = value;
        }

        /**
         * Gets the value of the sha1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSHA1() {
            return sha1;
        }

        /**
         * Sets the value of the sha1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSHA1(String value) {
            this.sha1 = value;
        }

        /**
         * Gets the value of the sha256 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSHA256() {
            return sha256;
        }

        /**
         * Sets the value of the sha256 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSHA256(String value) {
            this.sha256 = value;
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
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *       &lt;attribute name="LastModified" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
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
        "id"
    })
    public static class Fixlet {

        @XmlElement(name = "Name")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String name;
        @XmlElement(name = "ID")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger id;
        @XmlAttribute(name = "Resource")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String resource;
        @XmlAttribute(name = "LastModified")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String lastModified;

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
         * Gets the value of the lastModified property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastModified() {
            return lastModified;
        }

        /**
         * Sets the value of the lastModified property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastModified(String value) {
            this.lastModified = value;
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
     *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *         &lt;element name="IsActiveDirectory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="IsGlobalCatalog" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="UseSSL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="AllowEmptyPasswords" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="BaseDN" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *         &lt;element name="UIDAttribute" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *         &lt;element name="UserFilter" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *         &lt;element name="GroupFilter" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *         &lt;element name="User" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *         &lt;element name="Servers" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Server" type="{}LDAPServer" maxOccurs="4"/>
     *                 &lt;/sequence>
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
    @XmlType(name = "", propOrder = {
        "id",
        "name",
        "isActiveDirectory",
        "isGlobalCatalog",
        "useSSL",
        "allowEmptyPasswords",
        "baseDN",
        "uidAttribute",
        "userFilter",
        "groupFilter",
        "user",
        "password",
        "servers"
    })
    public static class LDAPDirectory {

        @XmlElement(name = "ID")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger id;
        @XmlElement(name = "Name")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String name;
        @XmlElement(name = "IsActiveDirectory")
        protected Boolean isActiveDirectory;
        @XmlElement(name = "IsGlobalCatalog")
        protected Boolean isGlobalCatalog;
        @XmlElement(name = "UseSSL")
        protected Boolean useSSL;
        @XmlElement(name = "AllowEmptyPasswords")
        protected Boolean allowEmptyPasswords;
        @XmlElement(name = "BaseDN")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String baseDN;
        @XmlElement(name = "UIDAttribute")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String uidAttribute;
        @XmlElement(name = "UserFilter")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String userFilter;
        @XmlElement(name = "GroupFilter")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String groupFilter;
        @XmlElement(name = "User")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String user;
        @XmlElement(name = "Password")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String password;
        @XmlElement(name = "Servers")
        protected BESAPI.LDAPDirectory.Servers servers;
        @XmlAttribute(name = "Resource")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String resource;

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
         * Gets the value of the isActiveDirectory property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsActiveDirectory() {
            return isActiveDirectory;
        }

        /**
         * Sets the value of the isActiveDirectory property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsActiveDirectory(Boolean value) {
            this.isActiveDirectory = value;
        }

        /**
         * Gets the value of the isGlobalCatalog property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsGlobalCatalog() {
            return isGlobalCatalog;
        }

        /**
         * Sets the value of the isGlobalCatalog property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsGlobalCatalog(Boolean value) {
            this.isGlobalCatalog = value;
        }

        /**
         * Gets the value of the useSSL property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isUseSSL() {
            return useSSL;
        }

        /**
         * Sets the value of the useSSL property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setUseSSL(Boolean value) {
            this.useSSL = value;
        }

        /**
         * Gets the value of the allowEmptyPasswords property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAllowEmptyPasswords() {
            return allowEmptyPasswords;
        }

        /**
         * Sets the value of the allowEmptyPasswords property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAllowEmptyPasswords(Boolean value) {
            this.allowEmptyPasswords = value;
        }

        /**
         * Gets the value of the baseDN property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBaseDN() {
            return baseDN;
        }

        /**
         * Sets the value of the baseDN property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBaseDN(String value) {
            this.baseDN = value;
        }

        /**
         * Gets the value of the uidAttribute property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUIDAttribute() {
            return uidAttribute;
        }

        /**
         * Sets the value of the uidAttribute property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUIDAttribute(String value) {
            this.uidAttribute = value;
        }

        /**
         * Gets the value of the userFilter property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserFilter() {
            return userFilter;
        }

        /**
         * Sets the value of the userFilter property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserFilter(String value) {
            this.userFilter = value;
        }

        /**
         * Gets the value of the groupFilter property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGroupFilter() {
            return groupFilter;
        }

        /**
         * Sets the value of the groupFilter property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGroupFilter(String value) {
            this.groupFilter = value;
        }

        /**
         * Gets the value of the user property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUser() {
            return user;
        }

        /**
         * Sets the value of the user property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUser(String value) {
            this.user = value;
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
         * Gets the value of the servers property.
         * 
         * @return
         *     possible object is
         *     {@link BESAPI.LDAPDirectory.Servers }
         *     
         */
        public BESAPI.LDAPDirectory.Servers getServers() {
            return servers;
        }

        /**
         * Sets the value of the servers property.
         * 
         * @param value
         *     allowed object is
         *     {@link BESAPI.LDAPDirectory.Servers }
         *     
         */
        public void setServers(BESAPI.LDAPDirectory.Servers value) {
            this.servers = value;
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
         *         &lt;element name="Server" type="{}LDAPServer" maxOccurs="4"/>
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
            "server"
        })
        public static class Servers {

            @XmlElement(name = "Server", required = true)
            protected List<LDAPServer> server;

            /**
             * Gets the value of the server property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the server property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getServer().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LDAPServer }
             * 
             * 
             */
            public List<LDAPServer> getServer() {
                if (server == null) {
                    server = new ArrayList<LDAPServer>();
                }
                return this.server;
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
     *         &lt;element name="PortNumber" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *         &lt;element name="GatherInterval" type="{}MastheadGatherInterval" minOccurs="0"/>
     *         &lt;element name="Controller" type="{}MastheadController" minOccurs="0"/>
     *         &lt;choice minOccurs="0">
     *           &lt;element name="InitialLockState" type="{}MastheadLockState"/>
     *           &lt;element name="InitialLockDuration" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
     *         &lt;/choice>
     *         &lt;element name="ActionLockExemptionURL" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *         &lt;element name="RequireFIPSCompliantCrypto" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "portNumber",
        "gatherInterval",
        "controller",
        "initialLockState",
        "initialLockDuration",
        "actionLockExemptionURL",
        "requireFIPSCompliantCrypto"
    })
    public static class MastheadParameters {

        @XmlElement(name = "PortNumber")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String portNumber;
        @XmlElement(name = "GatherInterval")
        @XmlSchemaType(name = "normalizedString")
        protected MastheadGatherInterval gatherInterval;
        @XmlElement(name = "Controller")
        @XmlSchemaType(name = "normalizedString")
        protected MastheadController controller;
        @XmlElement(name = "InitialLockState")
        @XmlSchemaType(name = "normalizedString")
        protected MastheadLockState initialLockState;
        @XmlElement(name = "InitialLockDuration")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger initialLockDuration;
        @XmlElement(name = "ActionLockExemptionURL")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String actionLockExemptionURL;
        @XmlElement(name = "RequireFIPSCompliantCrypto")
        protected Boolean requireFIPSCompliantCrypto;

        /**
         * Gets the value of the portNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPortNumber() {
            return portNumber;
        }

        /**
         * Sets the value of the portNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPortNumber(String value) {
            this.portNumber = value;
        }

        /**
         * Gets the value of the gatherInterval property.
         * 
         * @return
         *     possible object is
         *     {@link MastheadGatherInterval }
         *     
         */
        public MastheadGatherInterval getGatherInterval() {
            return gatherInterval;
        }

        /**
         * Sets the value of the gatherInterval property.
         * 
         * @param value
         *     allowed object is
         *     {@link MastheadGatherInterval }
         *     
         */
        public void setGatherInterval(MastheadGatherInterval value) {
            this.gatherInterval = value;
        }

        /**
         * Gets the value of the controller property.
         * 
         * @return
         *     possible object is
         *     {@link MastheadController }
         *     
         */
        public MastheadController getController() {
            return controller;
        }

        /**
         * Sets the value of the controller property.
         * 
         * @param value
         *     allowed object is
         *     {@link MastheadController }
         *     
         */
        public void setController(MastheadController value) {
            this.controller = value;
        }

        /**
         * Gets the value of the initialLockState property.
         * 
         * @return
         *     possible object is
         *     {@link MastheadLockState }
         *     
         */
        public MastheadLockState getInitialLockState() {
            return initialLockState;
        }

        /**
         * Sets the value of the initialLockState property.
         * 
         * @param value
         *     allowed object is
         *     {@link MastheadLockState }
         *     
         */
        public void setInitialLockState(MastheadLockState value) {
            this.initialLockState = value;
        }

        /**
         * Gets the value of the initialLockDuration property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getInitialLockDuration() {
            return initialLockDuration;
        }

        /**
         * Sets the value of the initialLockDuration property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setInitialLockDuration(BigInteger value) {
            this.initialLockDuration = value;
        }

        /**
         * Gets the value of the actionLockExemptionURL property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActionLockExemptionURL() {
            return actionLockExemptionURL;
        }

        /**
         * Sets the value of the actionLockExemptionURL property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActionLockExemptionURL(String value) {
            this.actionLockExemptionURL = value;
        }

        /**
         * Gets the value of the requireFIPSCompliantCrypto property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRequireFIPSCompliantCrypto() {
            return requireFIPSCompliantCrypto;
        }

        /**
         * Sets the value of the requireFIPSCompliantCrypto property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRequireFIPSCompliantCrypto(Boolean value) {
            this.requireFIPSCompliantCrypto = value;
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
     *       &lt;choice>
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
     *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *       &lt;/choice>
     *       &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *       &lt;attribute name="LastModified" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
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
        "id"
    })
    public static class MultipleActionGroup {

        @XmlElement(name = "Name")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String name;
        @XmlElement(name = "ID")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger id;
        @XmlAttribute(name = "Resource")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String resource;
        @XmlAttribute(name = "LastModified")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String lastModified;

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
         * Gets the value of the lastModified property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastModified() {
            return lastModified;
        }

        /**
         * Sets the value of the lastModified property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastModified(String value) {
            this.lastModified = value;
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
     *       &lt;/sequence>
     *       &lt;attribute name="Resource" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="LastModified" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name"
    })
    public static class OperatorSite {

        @XmlElement(name = "Name", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String name;
        @XmlAttribute(name = "Resource", required = true)
        protected String resource;
        @XmlAttribute(name = "LastModified")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String lastModified;

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
         * Gets the value of the lastModified property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastModified() {
            return lastModified;
        }

        /**
         * Sets the value of the lastModified property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastModified(String value) {
            this.lastModified = value;
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
     *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="IsReserved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *       &lt;attribute name="LastModified" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
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
        "id",
        "isReserved"
    })
    public static class Property {

        @XmlElement(name = "Name", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String name;
        @XmlElement(name = "ID")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger id;
        @XmlElement(name = "IsReserved")
        protected Boolean isReserved;
        @XmlAttribute(name = "Resource")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String resource;
        @XmlAttribute(name = "LastModified")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String lastModified;

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
         * Gets the value of the isReserved property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsReserved() {
            return isReserved;
        }

        /**
         * Sets the value of the isReserved property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsReserved(Boolean value) {
            this.isReserved = value;
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
         * Gets the value of the lastModified property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastModified() {
            return lastModified;
        }

        /**
         * Sets the value of the lastModified property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastModified(String value) {
            this.lastModified = value;
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
     *         &lt;element name="Result" type="{}RelevanceResult"/>
     *         &lt;choice>
     *           &lt;element name="Evaluation">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
     *                     &lt;element name="Plurality" type="{}RelevancePlurality"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
     *         &lt;/choice>
     *       &lt;/sequence>
     *       &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "result",
        "evaluation",
        "error"
    })
    public static class Query {

        @XmlElement(name = "Result", required = true)
        protected RelevanceResult result;
        @XmlElement(name = "Evaluation")
        protected BESAPI.Query.Evaluation evaluation;
        @XmlElement(name = "Error")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String error;
        @XmlAttribute(name = "Resource")
        protected String resource;

        /**
         * Gets the value of the result property.
         * 
         * @return
         *     possible object is
         *     {@link RelevanceResult }
         *     
         */
        public RelevanceResult getResult() {
            return result;
        }

        /**
         * Sets the value of the result property.
         * 
         * @param value
         *     allowed object is
         *     {@link RelevanceResult }
         *     
         */
        public void setResult(RelevanceResult value) {
            this.result = value;
        }

        /**
         * Gets the value of the evaluation property.
         * 
         * @return
         *     possible object is
         *     {@link BESAPI.Query.Evaluation }
         *     
         */
        public BESAPI.Query.Evaluation getEvaluation() {
            return evaluation;
        }

        /**
         * Sets the value of the evaluation property.
         * 
         * @param value
         *     allowed object is
         *     {@link BESAPI.Query.Evaluation }
         *     
         */
        public void setEvaluation(BESAPI.Query.Evaluation value) {
            this.evaluation = value;
        }

        /**
         * Gets the value of the error property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getError() {
            return error;
        }

        /**
         * Sets the value of the error property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setError(String value) {
            this.error = value;
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
         *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
         *         &lt;element name="Plurality" type="{}RelevancePlurality"/>
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
            "time",
            "plurality"
        })
        public static class Evaluation {

            @XmlElement(name = "Time", required = true)
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String time;
            @XmlElement(name = "Plurality", required = true)
            @XmlSchemaType(name = "normalizedString")
            protected RelevancePlurality plurality;

            /**
             * Gets the value of the time property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTime() {
                return time;
            }

            /**
             * Sets the value of the time property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTime(String value) {
                this.time = value;
            }

            /**
             * Gets the value of the plurality property.
             * 
             * @return
             *     possible object is
             *     {@link RelevancePlurality }
             *     
             */
            public RelevancePlurality getPlurality() {
                return plurality;
            }

            /**
             * Sets the value of the plurality property.
             * 
             * @param value
             *     allowed object is
             *     {@link RelevancePlurality }
             *     
             */
            public void setPlurality(RelevancePlurality value) {
                this.plurality = value;
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
     *         &lt;element name="ServerID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *         &lt;element name="DNS" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *         &lt;element name="ReplicationIntervalSeconds" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="ReplicationLink" type="{}ReplicationLinkType" maxOccurs="unbounded" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "serverID",
        "url",
        "dns",
        "replicationIntervalSeconds",
        "replicationLink"
    })
    public static class ReplicationServer {

        @XmlElement(name = "ServerID")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger serverID;
        @XmlElement(name = "URL")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String url;
        @XmlElement(name = "DNS")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String dns;
        @XmlElement(name = "ReplicationIntervalSeconds")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger replicationIntervalSeconds;
        @XmlElement(name = "ReplicationLink")
        protected List<ReplicationLinkType> replicationLink;
        @XmlAttribute(name = "Resource")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String resource;

        /**
         * Gets the value of the serverID property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getServerID() {
            return serverID;
        }

        /**
         * Sets the value of the serverID property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setServerID(BigInteger value) {
            this.serverID = value;
        }

        /**
         * Gets the value of the url property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getURL() {
            return url;
        }

        /**
         * Sets the value of the url property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setURL(String value) {
            this.url = value;
        }

        /**
         * Gets the value of the dns property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDNS() {
            return dns;
        }

        /**
         * Sets the value of the dns property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDNS(String value) {
            this.dns = value;
        }

        /**
         * Gets the value of the replicationIntervalSeconds property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getReplicationIntervalSeconds() {
            return replicationIntervalSeconds;
        }

        /**
         * Sets the value of the replicationIntervalSeconds property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setReplicationIntervalSeconds(BigInteger value) {
            this.replicationIntervalSeconds = value;
        }

        /**
         * Gets the value of the replicationLink property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the replicationLink property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReplicationLink().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReplicationLinkType }
         * 
         * 
         */
        public List<ReplicationLinkType> getReplicationLink() {
            if (replicationLink == null) {
                replicationLink = new ArrayList<ReplicationLinkType>();
            }
            return this.replicationLink;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
     *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *       &lt;/choice>
     *       &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *       &lt;attribute name="LastModified" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
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
        "id"
    })
    public static class SingleAction {

        @XmlElement(name = "Name")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String name;
        @XmlElement(name = "ID")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger id;
        @XmlAttribute(name = "Resource")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String resource;
        @XmlAttribute(name = "LastModified")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String lastModified;

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
         * Gets the value of the lastModified property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastModified() {
            return lastModified;
        }

        /**
         * Sets the value of the lastModified property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastModified(String value) {
            this.lastModified = value;
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
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *         &lt;element name="Permission" type="{}SitePermissionString" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *       &lt;attribute name="LastModified" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
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
    public static class Site {

        @XmlElement(name = "Name")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String name;
        @XmlElement(name = "Permission")
        @XmlSchemaType(name = "normalizedString")
        protected List<SitePermissionString> permission;
        @XmlAttribute(name = "Resource")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String resource;
        @XmlAttribute(name = "LastModified")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String lastModified;

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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the permission property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPermission().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SitePermissionString }
         * 
         * 
         */
        public List<SitePermissionString> getPermission() {
            if (permission == null) {
                permission = new ArrayList<SitePermissionString>();
            }
            return this.permission;
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
         * Gets the value of the lastModified property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastModified() {
            return lastModified;
        }

        /**
         * Sets the value of the lastModified property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastModified(String value) {
            this.lastModified = value;
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
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="FileSize" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="IsClientFile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="LastModified" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
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
        "id",
        "fileSize",
        "isClientFile"
    })
    public static class SiteFile {

        @XmlElement(name = "Name")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String name;
        @XmlElement(name = "ID")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger id;
        @XmlElement(name = "FileSize")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger fileSize;
        @XmlElement(name = "IsClientFile")
        protected Boolean isClientFile;
        @XmlAttribute(name = "Resource")
        protected String resource;
        @XmlAttribute(name = "LastModified")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String lastModified;

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
         * Gets the value of the fileSize property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getFileSize() {
            return fileSize;
        }

        /**
         * Sets the value of the fileSize property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setFileSize(BigInteger value) {
            this.fileSize = value;
        }

        /**
         * Gets the value of the isClientFile property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsClientFile() {
            return isClientFile;
        }

        /**
         * Sets the value of the isClientFile property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsClientFile(Boolean value) {
            this.isClientFile = value;
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
         * Gets the value of the lastModified property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastModified() {
            return lastModified;
        }

        /**
         * Sets the value of the lastModified property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastModified(String value) {
            this.lastModified = value;
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
     *         &lt;element name="Permission" type="{}SitePermissionString"/>
     *         &lt;choice minOccurs="0">
     *           &lt;element name="Operator" type="{}StringWithReference"/>
     *           &lt;element name="Role" type="{}IntegerWithReference"/>
     *         &lt;/choice>
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
    @XmlType(name = "", propOrder = {
        "permission",
        "operator",
        "role"
    })
    public static class SitePermission {

        @XmlElement(name = "Permission", required = true)
        @XmlSchemaType(name = "normalizedString")
        protected SitePermissionString permission;
        @XmlElement(name = "Operator")
        protected StringWithReference operator;
        @XmlElement(name = "Role")
        protected IntegerWithReference role;
        @XmlAttribute(name = "Resource")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String resource;

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

        /**
         * Gets the value of the operator property.
         * 
         * @return
         *     possible object is
         *     {@link StringWithReference }
         *     
         */
        public StringWithReference getOperator() {
            return operator;
        }

        /**
         * Sets the value of the operator property.
         * 
         * @param value
         *     allowed object is
         *     {@link StringWithReference }
         *     
         */
        public void setOperator(StringWithReference value) {
            this.operator = value;
        }

        /**
         * Gets the value of the role property.
         * 
         * @return
         *     possible object is
         *     {@link IntegerWithReference }
         *     
         */
        public IntegerWithReference getRole() {
            return role;
        }

        /**
         * Sets the value of the role property.
         * 
         * @param value
         *     allowed object is
         *     {@link IntegerWithReference }
         *     
         */
        public void setRole(IntegerWithReference value) {
            this.role = value;
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
     *         &lt;element name="MinimumRefreshSeconds" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="DefaultFixletVisibility" type="{}DefaultFixletVisibilityType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Resource" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "minimumRefreshSeconds",
        "defaultFixletVisibility"
    })
    public static class SystemOptions {

        @XmlElement(name = "MinimumRefreshSeconds")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger minimumRefreshSeconds;
        @XmlElement(name = "DefaultFixletVisibility")
        @XmlSchemaType(name = "normalizedString")
        protected DefaultFixletVisibilityType defaultFixletVisibility;
        @XmlAttribute(name = "Resource", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String resource;

        /**
         * Gets the value of the minimumRefreshSeconds property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMinimumRefreshSeconds() {
            return minimumRefreshSeconds;
        }

        /**
         * Sets the value of the minimumRefreshSeconds property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMinimumRefreshSeconds(BigInteger value) {
            this.minimumRefreshSeconds = value;
        }

        /**
         * Gets the value of the defaultFixletVisibility property.
         * 
         * @return
         *     possible object is
         *     {@link DefaultFixletVisibilityType }
         *     
         */
        public DefaultFixletVisibilityType getDefaultFixletVisibility() {
            return defaultFixletVisibility;
        }

        /**
         * Sets the value of the defaultFixletVisibility property.
         * 
         * @param value
         *     allowed object is
         *     {@link DefaultFixletVisibilityType }
         *     
         */
        public void setDefaultFixletVisibility(DefaultFixletVisibilityType value) {
            this.defaultFixletVisibility = value;
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
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
     *       &lt;attribute name="LastModified" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
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
        "id"
    })
    public static class Task {

        @XmlElement(name = "Name")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String name;
        @XmlElement(name = "ID")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger id;
        @XmlAttribute(name = "Resource")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String resource;
        @XmlAttribute(name = "LastModified")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String lastModified;

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
         * Gets the value of the lastModified property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastModified() {
            return lastModified;
        }

        /**
         * Sets the value of the lastModified property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastModified(String value) {
            this.lastModified = value;
        }

    }

}
