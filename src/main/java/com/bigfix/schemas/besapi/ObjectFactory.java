
package com.bigfix.schemas.besapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bigfix.schemas.besapi package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RoleOperatorsInherited_QNAME = new QName("", "Inherited");
    private final static QName _RoleOperatorsExplicit_QNAME = new QName("", "Explicit");
    private final static QName _BESAPIOperator_QNAME = new QName("", "Operator");
    private final static QName _BESAPISite_QNAME = new QName("", "Site");
    private final static QName _BESAPISitePermission_QNAME = new QName("", "SitePermission");
    private final static QName _BESAPIAction_QNAME = new QName("", "Action");
    private final static QName _BESAPITask_QNAME = new QName("", "Task");
    private final static QName _BESAPIWarning_QNAME = new QName("", "Warning");
    private final static QName _BESAPIReplicationLink_QNAME = new QName("", "ReplicationLink");
    private final static QName _BESAPIQuery_QNAME = new QName("", "Query");
    private final static QName _BESAPIActionResults_QNAME = new QName("", "ActionResults");
    private final static QName _BESAPIComputerSettings_QNAME = new QName("", "ComputerSettings");
    private final static QName _BESAPIActionSite_QNAME = new QName("", "ActionSite");
    private final static QName _BESAPIAnalysisActivation_QNAME = new QName("", "AnalysisActivation");
    private final static QName _BESAPISiteFile_QNAME = new QName("", "SiteFile");
    private final static QName _BESAPIDashboardData_QNAME = new QName("", "DashboardData");
    private final static QName _BESAPIComputerSetting_QNAME = new QName("", "ComputerSetting");
    private final static QName _BESAPIMultipleActionGroup_QNAME = new QName("", "MultipleActionGroup");
    private final static QName _BESAPIComputer_QNAME = new QName("", "Computer");
    private final static QName _BESAPIComputerGroup_QNAME = new QName("", "ComputerGroup");
    private final static QName _BESAPISingleAction_QNAME = new QName("", "SingleAction");
    private final static QName _BESAPISystemOptions_QNAME = new QName("", "SystemOptions");
    private final static QName _BESAPIProperty_QNAME = new QName("", "Property");
    private final static QName _BESAPIComputerMailboxFile_QNAME = new QName("", "ComputerMailboxFile");
    private final static QName _BESAPIFileUpload_QNAME = new QName("", "FileUpload");
    private final static QName _BESAPIReplicationServer_QNAME = new QName("", "ReplicationServer");
    private final static QName _BESAPIOperatorSite_QNAME = new QName("", "OperatorSite");
    private final static QName _BESAPIError_QNAME = new QName("", "Error");
    private final static QName _BESAPILDAPDirectory_QNAME = new QName("", "LDAPDirectory");
    private final static QName _BESAPIBaseline_QNAME = new QName("", "Baseline");
    private final static QName _BESAPIRole_QNAME = new QName("", "Role");
    private final static QName _BESAPICustomSite_QNAME = new QName("", "CustomSite");
    private final static QName _BESAPIMastheadParameters_QNAME = new QName("", "MastheadParameters");
    private final static QName _BESAPIFixlet_QNAME = new QName("", "Fixlet");
    private final static QName _BESAPIAnalysis_QNAME = new QName("", "Analysis");
    private final static QName _BESAPIAdminField_QNAME = new QName("", "AdminField");
    private final static QName _BESAPIExternalSite_QNAME = new QName("", "ExternalSite");
    private final static QName _BESAPIClientReports_QNAME = new QName("", "ClientReports");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bigfix.schemas.besapi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BESAPI }
     * 
     */
    public BESAPI createBESAPI() {
        return new BESAPI();
    }

    /**
     * Create an instance of {@link ComputerResultType }
     * 
     */
    public ComputerResultType createComputerResultType() {
        return new ComputerResultType();
    }

    /**
     * Create an instance of {@link BESAPI.Query }
     * 
     */
    public BESAPI.Query createBESAPIQuery() {
        return new BESAPI.Query();
    }

    /**
     * Create an instance of {@link BESAPI.LDAPDirectory }
     * 
     */
    public BESAPI.LDAPDirectory createBESAPILDAPDirectory() {
        return new BESAPI.LDAPDirectory();
    }

    /**
     * Create an instance of {@link Role }
     * 
     */
    public Role createRole() {
        return new Role();
    }

    /**
     * Create an instance of {@link Role.Sites }
     * 
     */
    public Role.Sites createRoleSites() {
        return new Role.Sites();
    }

    /**
     * Create an instance of {@link Role.LDAPGroups }
     * 
     */
    public Role.LDAPGroups createRoleLDAPGroups() {
        return new Role.LDAPGroups();
    }

    /**
     * Create an instance of {@link BESAPI.ComputerSettings }
     * 
     */
    public BESAPI.ComputerSettings createBESAPIComputerSettings() {
        return new BESAPI.ComputerSettings();
    }

    /**
     * Create an instance of {@link BESAPI.Computer }
     * 
     */
    public BESAPI.Computer createBESAPIComputer() {
        return new BESAPI.Computer();
    }

    /**
     * Create an instance of {@link BESAPI.ActionResults }
     * 
     */
    public BESAPI.ActionResults createBESAPIActionResults() {
        return new BESAPI.ActionResults();
    }

    /**
     * Create an instance of {@link BESAPI.Fixlet }
     * 
     */
    public BESAPI.Fixlet createBESAPIFixlet() {
        return new BESAPI.Fixlet();
    }

    /**
     * Create an instance of {@link BESAPI.ReplicationServer }
     * 
     */
    public BESAPI.ReplicationServer createBESAPIReplicationServer() {
        return new BESAPI.ReplicationServer();
    }

    /**
     * Create an instance of {@link ReplicationLinkType }
     * 
     */
    public ReplicationLinkType createReplicationLinkType() {
        return new ReplicationLinkType();
    }

    /**
     * Create an instance of {@link BESAPI.Action }
     * 
     */
    public BESAPI.Action createBESAPIAction() {
        return new BESAPI.Action();
    }

    /**
     * Create an instance of {@link BESAPI.FileUpload }
     * 
     */
    public BESAPI.FileUpload createBESAPIFileUpload() {
        return new BESAPI.FileUpload();
    }

    /**
     * Create an instance of {@link BESAPI.Analysis }
     * 
     */
    public BESAPI.Analysis createBESAPIAnalysis() {
        return new BESAPI.Analysis();
    }

    /**
     * Create an instance of {@link BESAPI.AnalysisActivation }
     * 
     */
    public BESAPI.AnalysisActivation createBESAPIAnalysisActivation() {
        return new BESAPI.AnalysisActivation();
    }

    /**
     * Create an instance of {@link BESAPI.Task }
     * 
     */
    public BESAPI.Task createBESAPITask() {
        return new BESAPI.Task();
    }

    /**
     * Create an instance of {@link BESAPI.Property }
     * 
     */
    public BESAPI.Property createBESAPIProperty() {
        return new BESAPI.Property();
    }

    /**
     * Create an instance of {@link BESAPI.SingleAction }
     * 
     */
    public BESAPI.SingleAction createBESAPISingleAction() {
        return new BESAPI.SingleAction();
    }

    /**
     * Create an instance of {@link BESAPI.MultipleActionGroup }
     * 
     */
    public BESAPI.MultipleActionGroup createBESAPIMultipleActionGroup() {
        return new BESAPI.MultipleActionGroup();
    }

    /**
     * Create an instance of {@link BESAPI.Baseline }
     * 
     */
    public BESAPI.Baseline createBESAPIBaseline() {
        return new BESAPI.Baseline();
    }

    /**
     * Create an instance of {@link BESAPI.AdminField }
     * 
     */
    public BESAPI.AdminField createBESAPIAdminField() {
        return new BESAPI.AdminField();
    }

    /**
     * Create an instance of {@link BESAPI.DashboardData }
     * 
     */
    public BESAPI.DashboardData createBESAPIDashboardData() {
        return new BESAPI.DashboardData();
    }

    /**
     * Create an instance of {@link BESAPI.SiteFile }
     * 
     */
    public BESAPI.SiteFile createBESAPISiteFile() {
        return new BESAPI.SiteFile();
    }

    /**
     * Create an instance of {@link BESAPI.ClientReports }
     * 
     */
    public BESAPI.ClientReports createBESAPIClientReports() {
        return new BESAPI.ClientReports();
    }

    /**
     * Create an instance of {@link BESAPI.SystemOptions }
     * 
     */
    public BESAPI.SystemOptions createBESAPISystemOptions() {
        return new BESAPI.SystemOptions();
    }

    /**
     * Create an instance of {@link BESAPI.ComputerGroup }
     * 
     */
    public BESAPI.ComputerGroup createBESAPIComputerGroup() {
        return new BESAPI.ComputerGroup();
    }

    /**
     * Create an instance of {@link Operator }
     * 
     */
    public Operator createOperator() {
        return new Operator();
    }

    /**
     * Create an instance of {@link BESAPI.ExternalSite }
     * 
     */
    public BESAPI.ExternalSite createBESAPIExternalSite() {
        return new BESAPI.ExternalSite();
    }

    /**
     * Create an instance of {@link BESAPI.CustomSite }
     * 
     */
    public BESAPI.CustomSite createBESAPICustomSite() {
        return new BESAPI.CustomSite();
    }

    /**
     * Create an instance of {@link BESAPI.OperatorSite }
     * 
     */
    public BESAPI.OperatorSite createBESAPIOperatorSite() {
        return new BESAPI.OperatorSite();
    }

    /**
     * Create an instance of {@link BESAPI.ActionSite }
     * 
     */
    public BESAPI.ActionSite createBESAPIActionSite() {
        return new BESAPI.ActionSite();
    }

    /**
     * Create an instance of {@link BESAPI.Site }
     * 
     */
    public BESAPI.Site createBESAPISite() {
        return new BESAPI.Site();
    }

    /**
     * Create an instance of {@link BESAPI.SitePermission }
     * 
     */
    public BESAPI.SitePermission createBESAPISitePermission() {
        return new BESAPI.SitePermission();
    }

    /**
     * Create an instance of {@link BESAPI.ComputerMailboxFile }
     * 
     */
    public BESAPI.ComputerMailboxFile createBESAPIComputerMailboxFile() {
        return new BESAPI.ComputerMailboxFile();
    }

    /**
     * Create an instance of {@link BESAPI.MastheadParameters }
     * 
     */
    public BESAPI.MastheadParameters createBESAPIMastheadParameters() {
        return new BESAPI.MastheadParameters();
    }

    /**
     * Create an instance of {@link ComputerSetting }
     * 
     */
    public ComputerSetting createComputerSetting() {
        return new ComputerSetting();
    }

    /**
     * Create an instance of {@link StringWithReference }
     * 
     */
    public StringWithReference createStringWithReference() {
        return new StringWithReference();
    }

    /**
     * Create an instance of {@link LDAPServer }
     * 
     */
    public LDAPServer createLDAPServer() {
        return new LDAPServer();
    }

    /**
     * Create an instance of {@link IntegerWithReference }
     * 
     */
    public IntegerWithReference createIntegerWithReference() {
        return new IntegerWithReference();
    }

    /**
     * Create an instance of {@link RelevanceResult }
     * 
     */
    public RelevanceResult createRelevanceResult() {
        return new RelevanceResult();
    }

    /**
     * Create an instance of {@link RelevanceAnswer }
     * 
     */
    public RelevanceAnswer createRelevanceAnswer() {
        return new RelevanceAnswer();
    }

    /**
     * Create an instance of {@link ComputerResultType.State }
     * 
     */
    public ComputerResultType.State createComputerResultTypeState() {
        return new ComputerResultType.State();
    }

    /**
     * Create an instance of {@link BESAPI.Query.Evaluation }
     * 
     */
    public BESAPI.Query.Evaluation createBESAPIQueryEvaluation() {
        return new BESAPI.Query.Evaluation();
    }

    /**
     * Create an instance of {@link BESAPI.LDAPDirectory.Servers }
     * 
     */
    public BESAPI.LDAPDirectory.Servers createBESAPILDAPDirectoryServers() {
        return new BESAPI.LDAPDirectory.Servers();
    }

    /**
     * Create an instance of {@link Role.Operators }
     * 
     */
    public Role.Operators createRoleOperators() {
        return new Role.Operators();
    }

    /**
     * Create an instance of {@link Role.Sites.CustomSite }
     * 
     */
    public Role.Sites.CustomSite createRoleSitesCustomSite() {
        return new Role.Sites.CustomSite();
    }

    /**
     * Create an instance of {@link Role.Sites.ExternalSite }
     * 
     */
    public Role.Sites.ExternalSite createRoleSitesExternalSite() {
        return new Role.Sites.ExternalSite();
    }

    /**
     * Create an instance of {@link Role.LDAPGroups.Group }
     * 
     */
    public Role.LDAPGroups.Group createRoleLDAPGroupsGroup() {
        return new Role.LDAPGroups.Group();
    }

    /**
     * Create an instance of {@link BESAPI.ComputerSettings.TargetComputers }
     * 
     */
    public BESAPI.ComputerSettings.TargetComputers createBESAPIComputerSettingsTargetComputers() {
        return new BESAPI.ComputerSettings.TargetComputers();
    }

    /**
     * Create an instance of {@link BESAPI.Computer.Property }
     * 
     */
    public BESAPI.Computer.Property createBESAPIComputerProperty() {
        return new BESAPI.Computer.Property();
    }

    /**
     * Create an instance of {@link BESAPI.ActionResults.MemberActionResult }
     * 
     */
    public BESAPI.ActionResults.MemberActionResult createBESAPIActionResultsMemberActionResult() {
        return new BESAPI.ActionResults.MemberActionResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Inherited", scope = Role.Operators.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createRoleOperatorsInherited(String value) {
        return new JAXBElement<String>(_RoleOperatorsInherited_QNAME, String.class, Role.Operators.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Explicit", scope = Role.Operators.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createRoleOperatorsExplicit(String value) {
        return new JAXBElement<String>(_RoleOperatorsExplicit_QNAME, String.class, Role.Operators.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Operator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Operator", scope = BESAPI.class)
    public JAXBElement<Operator> createBESAPIOperator(Operator value) {
        return new JAXBElement<Operator>(_BESAPIOperator_QNAME, Operator.class, BESAPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BESAPI.Site }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Site", scope = BESAPI.class)
    public JAXBElement<BESAPI.Site> createBESAPISite(BESAPI.Site value) {
        return new JAXBElement<BESAPI.Site>(_BESAPISite_QNAME, BESAPI.Site.class, BESAPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BESAPI.SitePermission }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SitePermission", scope = BESAPI.class)
    public JAXBElement<BESAPI.SitePermission> createBESAPISitePermission(BESAPI.SitePermission value) {
        return new JAXBElement<BESAPI.SitePermission>(_BESAPISitePermission_QNAME, BESAPI.SitePermission.class, BESAPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BESAPI.Action }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Action", scope = BESAPI.class)
    public JAXBElement<BESAPI.Action> createBESAPIAction(BESAPI.Action value) {
        return new JAXBElement<BESAPI.Action>(_BESAPIAction_QNAME, BESAPI.Action.class, BESAPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BESAPI.Task }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Task", scope = BESAPI.class)
    public JAXBElement<BESAPI.Task> createBESAPITask(BESAPI.Task value) {
        return new JAXBElement<BESAPI.Task>(_BESAPITask_QNAME, BESAPI.Task.class, BESAPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Warning", scope = BESAPI.class)
    public JAXBElement<String> createBESAPIWarning(String value) {
        return new JAXBElement<String>(_BESAPIWarning_QNAME, String.class, BESAPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplicationLinkType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ReplicationLink", scope = BESAPI.class)
    public JAXBElement<ReplicationLinkType> createBESAPIReplicationLink(ReplicationLinkType value) {
        return new JAXBElement<ReplicationLinkType>(_BESAPIReplicationLink_QNAME, ReplicationLinkType.class, BESAPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BESAPI.Query }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Query", scope = BESAPI.class)
    public JAXBElement<BESAPI.Query> createBESAPIQuery(BESAPI.Query value) {
        return new JAXBElement<BESAPI.Query>(_BESAPIQuery_QNAME, BESAPI.Query.class, BESAPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BESAPI.ActionResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ActionResults", scope = BESAPI.class)
    public JAXBElement<BESAPI.ActionResults> createBESAPIActionResults(BESAPI.ActionResults value) {
        return new JAXBElement<BESAPI.ActionResults>(_BESAPIActionResults_QNAME, BESAPI.ActionResults.class, BESAPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BESAPI.ComputerSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ComputerSettings", scope = BESAPI.class)
    public JAXBElement<BESAPI.ComputerSettings> createBESAPIComputerSettings(BESAPI.ComputerSettings value) {
        return new JAXBElement<BESAPI.ComputerSettings>(_BESAPIComputerSettings_QNAME, BESAPI.ComputerSettings.class, BESAPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BESAPI.ActionSite }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ActionSite", scope = BESAPI.class)
    public JAXBElement<BESAPI.ActionSite> createBESAPIActionSite(BESAPI.ActionSite value) {
        return new JAXBElement<BESAPI.ActionSite>(_BESAPIActionSite_QNAME, BESAPI.ActionSite.class, BESAPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BESAPI.AnalysisActivation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AnalysisActivation", scope = BESAPI.class)
    public JAXBElement<BESAPI.AnalysisActivation> createBESAPIAnalysisActivation(BESAPI.AnalysisActivation value) {
        return new JAXBElement<BESAPI.AnalysisActivation>(_BESAPIAnalysisActivation_QNAME, BESAPI.AnalysisActivation.class, BESAPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BESAPI.SiteFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SiteFile", scope = BESAPI.class)
    public JAXBElement<BESAPI.SiteFile> createBESAPISiteFile(BESAPI.SiteFile value) {
        return new JAXBElement<BESAPI.SiteFile>(_BESAPISiteFile_QNAME, BESAPI.SiteFile.class, BESAPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BESAPI.DashboardData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DashboardData", scope = BESAPI.class)
    public JAXBElement<BESAPI.DashboardData> createBESAPIDashboardData(BESAPI.DashboardData value) {
        return new JAXBElement<BESAPI.DashboardData>(_BESAPIDashboardData_QNAME, BESAPI.DashboardData.class, BESAPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComputerSetting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ComputerSetting", scope = BESAPI.class)
    public JAXBElement<ComputerSetting> createBESAPIComputerSetting(ComputerSetting value) {
        return new JAXBElement<ComputerSetting>(_BESAPIComputerSetting_QNAME, ComputerSetting.class, BESAPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BESAPI.MultipleActionGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MultipleActionGroup", scope = BESAPI.class)
    public JAXBElement<BESAPI.MultipleActionGroup> createBESAPIMultipleActionGroup(BESAPI.MultipleActionGroup value) {
        return new JAXBElement<BESAPI.MultipleActionGroup>(_BESAPIMultipleActionGroup_QNAME, BESAPI.MultipleActionGroup.class, BESAPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BESAPI.Computer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Computer", scope = BESAPI.class)
    public JAXBElement<BESAPI.Computer> createBESAPIComputer(BESAPI.Computer value) {
        return new JAXBElement<BESAPI.Computer>(_BESAPIComputer_QNAME, BESAPI.Computer.class, BESAPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BESAPI.ComputerGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ComputerGroup", scope = BESAPI.class)
    public JAXBElement<BESAPI.ComputerGroup> createBESAPIComputerGroup(BESAPI.ComputerGroup value) {
        return new JAXBElement<BESAPI.ComputerGroup>(_BESAPIComputerGroup_QNAME, BESAPI.ComputerGroup.class, BESAPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BESAPI.SingleAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SingleAction", scope = BESAPI.class)
    public JAXBElement<BESAPI.SingleAction> createBESAPISingleAction(BESAPI.SingleAction value) {
        return new JAXBElement<BESAPI.SingleAction>(_BESAPISingleAction_QNAME, BESAPI.SingleAction.class, BESAPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BESAPI.SystemOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SystemOptions", scope = BESAPI.class)
    public JAXBElement<BESAPI.SystemOptions> createBESAPISystemOptions(BESAPI.SystemOptions value) {
        return new JAXBElement<BESAPI.SystemOptions>(_BESAPISystemOptions_QNAME, BESAPI.SystemOptions.class, BESAPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BESAPI.Property }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Property", scope = BESAPI.class)
    public JAXBElement<BESAPI.Property> createBESAPIProperty(BESAPI.Property value) {
        return new JAXBElement<BESAPI.Property>(_BESAPIProperty_QNAME, BESAPI.Property.class, BESAPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BESAPI.ComputerMailboxFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ComputerMailboxFile", scope = BESAPI.class)
    public JAXBElement<BESAPI.ComputerMailboxFile> createBESAPIComputerMailboxFile(BESAPI.ComputerMailboxFile value) {
        return new JAXBElement<BESAPI.ComputerMailboxFile>(_BESAPIComputerMailboxFile_QNAME, BESAPI.ComputerMailboxFile.class, BESAPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BESAPI.FileUpload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FileUpload", scope = BESAPI.class)
    public JAXBElement<BESAPI.FileUpload> createBESAPIFileUpload(BESAPI.FileUpload value) {
        return new JAXBElement<BESAPI.FileUpload>(_BESAPIFileUpload_QNAME, BESAPI.FileUpload.class, BESAPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BESAPI.ReplicationServer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ReplicationServer", scope = BESAPI.class)
    public JAXBElement<BESAPI.ReplicationServer> createBESAPIReplicationServer(BESAPI.ReplicationServer value) {
        return new JAXBElement<BESAPI.ReplicationServer>(_BESAPIReplicationServer_QNAME, BESAPI.ReplicationServer.class, BESAPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BESAPI.OperatorSite }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OperatorSite", scope = BESAPI.class)
    public JAXBElement<BESAPI.OperatorSite> createBESAPIOperatorSite(BESAPI.OperatorSite value) {
        return new JAXBElement<BESAPI.OperatorSite>(_BESAPIOperatorSite_QNAME, BESAPI.OperatorSite.class, BESAPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Error", scope = BESAPI.class)
    public JAXBElement<String> createBESAPIError(String value) {
        return new JAXBElement<String>(_BESAPIError_QNAME, String.class, BESAPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BESAPI.LDAPDirectory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LDAPDirectory", scope = BESAPI.class)
    public JAXBElement<BESAPI.LDAPDirectory> createBESAPILDAPDirectory(BESAPI.LDAPDirectory value) {
        return new JAXBElement<BESAPI.LDAPDirectory>(_BESAPILDAPDirectory_QNAME, BESAPI.LDAPDirectory.class, BESAPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BESAPI.Baseline }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Baseline", scope = BESAPI.class)
    public JAXBElement<BESAPI.Baseline> createBESAPIBaseline(BESAPI.Baseline value) {
        return new JAXBElement<BESAPI.Baseline>(_BESAPIBaseline_QNAME, BESAPI.Baseline.class, BESAPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Role }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Role", scope = BESAPI.class)
    public JAXBElement<Role> createBESAPIRole(Role value) {
        return new JAXBElement<Role>(_BESAPIRole_QNAME, Role.class, BESAPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BESAPI.CustomSite }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CustomSite", scope = BESAPI.class)
    public JAXBElement<BESAPI.CustomSite> createBESAPICustomSite(BESAPI.CustomSite value) {
        return new JAXBElement<BESAPI.CustomSite>(_BESAPICustomSite_QNAME, BESAPI.CustomSite.class, BESAPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BESAPI.MastheadParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MastheadParameters", scope = BESAPI.class)
    public JAXBElement<BESAPI.MastheadParameters> createBESAPIMastheadParameters(BESAPI.MastheadParameters value) {
        return new JAXBElement<BESAPI.MastheadParameters>(_BESAPIMastheadParameters_QNAME, BESAPI.MastheadParameters.class, BESAPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BESAPI.Fixlet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Fixlet", scope = BESAPI.class)
    public JAXBElement<BESAPI.Fixlet> createBESAPIFixlet(BESAPI.Fixlet value) {
        return new JAXBElement<BESAPI.Fixlet>(_BESAPIFixlet_QNAME, BESAPI.Fixlet.class, BESAPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BESAPI.Analysis }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Analysis", scope = BESAPI.class)
    public JAXBElement<BESAPI.Analysis> createBESAPIAnalysis(BESAPI.Analysis value) {
        return new JAXBElement<BESAPI.Analysis>(_BESAPIAnalysis_QNAME, BESAPI.Analysis.class, BESAPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BESAPI.AdminField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AdminField", scope = BESAPI.class)
    public JAXBElement<BESAPI.AdminField> createBESAPIAdminField(BESAPI.AdminField value) {
        return new JAXBElement<BESAPI.AdminField>(_BESAPIAdminField_QNAME, BESAPI.AdminField.class, BESAPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BESAPI.ExternalSite }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ExternalSite", scope = BESAPI.class)
    public JAXBElement<BESAPI.ExternalSite> createBESAPIExternalSite(BESAPI.ExternalSite value) {
        return new JAXBElement<BESAPI.ExternalSite>(_BESAPIExternalSite_QNAME, BESAPI.ExternalSite.class, BESAPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BESAPI.ClientReports }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ClientReports", scope = BESAPI.class)
    public JAXBElement<BESAPI.ClientReports> createBESAPIClientReports(BESAPI.ClientReports value) {
        return new JAXBElement<BESAPI.ClientReports>(_BESAPIClientReports_QNAME, BESAPI.ClientReports.class, BESAPI.class, value);
    }

}
