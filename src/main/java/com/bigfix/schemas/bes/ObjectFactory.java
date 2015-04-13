
package com.bigfix.schemas.bes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bigfix.schemas.bes package. 
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

    private final static QName _ActionSettingsUIGroupConstraintsDomainGroup_QNAME = new QName("", "DomainGroup");
    private final static QName _ActionSettingsUIGroupConstraintsLocalGroup_QNAME = new QName("", "LocalGroup");
    private final static QName _ActionSettingsUIGroupConstraintsWin9XGroup_QNAME = new QName("", "Win9xGroup");
    private final static QName _ActionSettingsUIGroupConstraintsWinNTGroup_QNAME = new QName("", "WinNTGroup");
    private final static QName _SearchComponentRelevanceRelevance_QNAME = new QName("", "Relevance");
    private final static QName _SearchComponentPropertyReferenceSearchText_QNAME = new QName("", "SearchText");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bigfix.schemas.bes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BES }
     * 
     */
    public BES createBES() {
        return new BES();
    }

    /**
     * Create an instance of {@link ActionSettings }
     * 
     */
    public ActionSettings createActionSettings() {
        return new ActionSettings();
    }

    /**
     * Create an instance of {@link ActionSettings.UIGroupConstraints }
     * 
     */
    public ActionSettings.UIGroupConstraints createActionSettingsUIGroupConstraints() {
        return new ActionSettings.UIGroupConstraints();
    }

    /**
     * Create an instance of {@link ActionSettingsLocks }
     * 
     */
    public ActionSettingsLocks createActionSettingsLocks() {
        return new ActionSettingsLocks();
    }

    /**
     * Create an instance of {@link FixletAction }
     * 
     */
    public FixletAction createFixletAction() {
        return new FixletAction();
    }

    /**
     * Create an instance of {@link Fixlet }
     * 
     */
    public Fixlet createFixlet() {
        return new Fixlet();
    }

    /**
     * Create an instance of {@link Action }
     * 
     */
    public Action createAction() {
        return new Action();
    }

    /**
     * Create an instance of {@link Site }
     * 
     */
    public Site createSite() {
        return new Site();
    }

    /**
     * Create an instance of {@link Baseline }
     * 
     */
    public Baseline createBaseline() {
        return new Baseline();
    }

    /**
     * Create an instance of {@link Baseline.BaselineComponentCollection }
     * 
     */
    public Baseline.BaselineComponentCollection createBaselineBaselineComponentCollection() {
        return new Baseline.BaselineComponentCollection();
    }

    /**
     * Create an instance of {@link Baseline.BaselineComponentCollection.BaselineComponentGroup }
     * 
     */
    public Baseline.BaselineComponentCollection.BaselineComponentGroup createBaselineBaselineComponentCollectionBaselineComponentGroup() {
        return new Baseline.BaselineComponentCollection.BaselineComponentGroup();
    }

    /**
     * Create an instance of {@link MultipleActionGroup }
     * 
     */
    public MultipleActionGroup createMultipleActionGroup() {
        return new MultipleActionGroup();
    }

    /**
     * Create an instance of {@link Analysis }
     * 
     */
    public Analysis createAnalysis() {
        return new Analysis();
    }

    /**
     * Create an instance of {@link FixletWithActions }
     * 
     */
    public FixletWithActions createFixletWithActions() {
        return new FixletWithActions();
    }

    /**
     * Create an instance of {@link Task }
     * 
     */
    public Task createTask() {
        return new Task();
    }

    /**
     * Create an instance of {@link SingleAction }
     * 
     */
    public SingleAction createSingleAction() {
        return new SingleAction();
    }

    /**
     * Create an instance of {@link SourcedFixletAction }
     * 
     */
    public SourcedFixletAction createSourcedFixletAction() {
        return new SourcedFixletAction();
    }

    /**
     * Create an instance of {@link ComputerGroup }
     * 
     */
    public ComputerGroup createComputerGroup() {
        return new ComputerGroup();
    }

    /**
     * Create an instance of {@link BES.CustomSite }
     * 
     */
    public BES.CustomSite createBESCustomSite() {
        return new BES.CustomSite();
    }

    /**
     * Create an instance of {@link BES.ActionSite }
     * 
     */
    public BES.ActionSite createBESActionSite() {
        return new BES.ActionSite();
    }

    /**
     * Create an instance of {@link BES.ExternalSite }
     * 
     */
    public BES.ExternalSite createBESExternalSite() {
        return new BES.ExternalSite();
    }

    /**
     * Create an instance of {@link BES.OperatorSite }
     * 
     */
    public BES.OperatorSite createBESOperatorSite() {
        return new BES.OperatorSite();
    }

    /**
     * Create an instance of {@link BES.Property }
     * 
     */
    public BES.Property createBESProperty() {
        return new BES.Property();
    }

    /**
     * Create an instance of {@link SitePermission }
     * 
     */
    public SitePermission createSitePermission() {
        return new SitePermission();
    }

    /**
     * Create an instance of {@link RelevanceString }
     * 
     */
    public RelevanceString createRelevanceString() {
        return new RelevanceString();
    }

    /**
     * Create an instance of {@link GroupRelevance }
     * 
     */
    public GroupRelevance createGroupRelevance() {
        return new GroupRelevance();
    }

    /**
     * Create an instance of {@link BESActionParameter }
     * 
     */
    public BESActionParameter createBESActionParameter() {
        return new BESActionParameter();
    }

    /**
     * Create an instance of {@link SearchComponentPropertyReference }
     * 
     */
    public SearchComponentPropertyReference createSearchComponentPropertyReference() {
        return new SearchComponentPropertyReference();
    }

    /**
     * Create an instance of {@link SearchComponentGroupReference }
     * 
     */
    public SearchComponentGroupReference createSearchComponentGroupReference() {
        return new SearchComponentGroupReference();
    }

    /**
     * Create an instance of {@link ActionSuccessCriteria }
     * 
     */
    public ActionSuccessCriteria createActionSuccessCriteria() {
        return new ActionSuccessCriteria();
    }

    /**
     * Create an instance of {@link BESActionTarget }
     * 
     */
    public BESActionTarget createBESActionTarget() {
        return new BESActionTarget();
    }

    /**
     * Create an instance of {@link com.bigfix.schemas.bes.Property }
     * 
     */
    public com.bigfix.schemas.bes.Property createProperty() {
        return new com.bigfix.schemas.bes.Property();
    }

    /**
     * Create an instance of {@link SearchComponentRelevance }
     * 
     */
    public SearchComponentRelevance createSearchComponentRelevance() {
        return new SearchComponentRelevance();
    }

    /**
     * Create an instance of {@link ExternalSitePermission }
     * 
     */
    public ExternalSitePermission createExternalSitePermission() {
        return new ExternalSitePermission();
    }

    /**
     * Create an instance of {@link SearchComponent }
     * 
     */
    public SearchComponent createSearchComponent() {
        return new SearchComponent();
    }

    /**
     * Create an instance of {@link BESSourceSiteAndFixlet }
     * 
     */
    public BESSourceSiteAndFixlet createBESSourceSiteAndFixlet() {
        return new BESSourceSiteAndFixlet();
    }

    /**
     * Create an instance of {@link BESActionSourceFixlet }
     * 
     */
    public BESActionSourceFixlet createBESActionSourceFixlet() {
        return new BESActionSourceFixlet();
    }

    /**
     * Create an instance of {@link ActionScript }
     * 
     */
    public ActionScript createActionScript() {
        return new ActionScript();
    }

    /**
     * Create an instance of {@link ActionSettings.Message }
     * 
     */
    public ActionSettings.Message createActionSettingsMessage() {
        return new ActionSettings.Message();
    }

    /**
     * Create an instance of {@link ActionSettings.PreAction }
     * 
     */
    public ActionSettings.PreAction createActionSettingsPreAction() {
        return new ActionSettings.PreAction();
    }

    /**
     * Create an instance of {@link ActionSettings.RunningMessage }
     * 
     */
    public ActionSettings.RunningMessage createActionSettingsRunningMessage() {
        return new ActionSettings.RunningMessage();
    }

    /**
     * Create an instance of {@link ActionSettings.TimeRange }
     * 
     */
    public ActionSettings.TimeRange createActionSettingsTimeRange() {
        return new ActionSettings.TimeRange();
    }

    /**
     * Create an instance of {@link ActionSettings.DayOfWeekConstraint }
     * 
     */
    public ActionSettings.DayOfWeekConstraint createActionSettingsDayOfWeekConstraint() {
        return new ActionSettings.DayOfWeekConstraint();
    }

    /**
     * Create an instance of {@link ActionSettings.Whose }
     * 
     */
    public ActionSettings.Whose createActionSettingsWhose() {
        return new ActionSettings.Whose();
    }

    /**
     * Create an instance of {@link ActionSettings.RetryWait }
     * 
     */
    public ActionSettings.RetryWait createActionSettingsRetryWait() {
        return new ActionSettings.RetryWait();
    }

    /**
     * Create an instance of {@link ActionSettings.PostActionBehavior }
     * 
     */
    public ActionSettings.PostActionBehavior createActionSettingsPostActionBehavior() {
        return new ActionSettings.PostActionBehavior();
    }

    /**
     * Create an instance of {@link ActionSettings.UIGroupConstraints.LocalGroup }
     * 
     */
    public ActionSettings.UIGroupConstraints.LocalGroup createActionSettingsUIGroupConstraintsLocalGroup() {
        return new ActionSettings.UIGroupConstraints.LocalGroup();
    }

    /**
     * Create an instance of {@link ActionSettings.UIGroupConstraints.DomainGroup }
     * 
     */
    public ActionSettings.UIGroupConstraints.DomainGroup createActionSettingsUIGroupConstraintsDomainGroup() {
        return new ActionSettings.UIGroupConstraints.DomainGroup();
    }

    /**
     * Create an instance of {@link ActionSettingsLocks.Message }
     * 
     */
    public ActionSettingsLocks.Message createActionSettingsLocksMessage() {
        return new ActionSettingsLocks.Message();
    }

    /**
     * Create an instance of {@link ActionSettingsLocks.PreAction }
     * 
     */
    public ActionSettingsLocks.PreAction createActionSettingsLocksPreAction() {
        return new ActionSettingsLocks.PreAction();
    }

    /**
     * Create an instance of {@link ActionSettingsLocks.RunningMessage }
     * 
     */
    public ActionSettingsLocks.RunningMessage createActionSettingsLocksRunningMessage() {
        return new ActionSettingsLocks.RunningMessage();
    }

    /**
     * Create an instance of {@link ActionSettingsLocks.PostActionBehavior }
     * 
     */
    public ActionSettingsLocks.PostActionBehavior createActionSettingsLocksPostActionBehavior() {
        return new ActionSettingsLocks.PostActionBehavior();
    }

    /**
     * Create an instance of {@link FixletAction.Description }
     * 
     */
    public FixletAction.Description createFixletActionDescription() {
        return new FixletAction.Description();
    }

    /**
     * Create an instance of {@link Fixlet.WizardData }
     * 
     */
    public Fixlet.WizardData createFixletWizardData() {
        return new Fixlet.WizardData();
    }

    /**
     * Create an instance of {@link Fixlet.MIMEField }
     * 
     */
    public Fixlet.MIMEField createFixletMIMEField() {
        return new Fixlet.MIMEField();
    }

    /**
     * Create an instance of {@link Action.MIMEField }
     * 
     */
    public Action.MIMEField createActionMIMEField() {
        return new Action.MIMEField();
    }

    /**
     * Create an instance of {@link Site.Subscription }
     * 
     */
    public Site.Subscription createSiteSubscription() {
        return new Site.Subscription();
    }

    /**
     * Create an instance of {@link Baseline.BaselineComponentCollection.BaselineComponentGroup.BaselineComponent }
     * 
     */
    public Baseline.BaselineComponentCollection.BaselineComponentGroup.BaselineComponent createBaselineBaselineComponentCollectionBaselineComponentGroupBaselineComponent() {
        return new Baseline.BaselineComponentCollection.BaselineComponentGroup.BaselineComponent();
    }

    /**
     * Create an instance of {@link MultipleActionGroup.MemberAction }
     * 
     */
    public MultipleActionGroup.MemberAction createMultipleActionGroupMemberAction() {
        return new MultipleActionGroup.MemberAction();
    }

    /**
     * Create an instance of {@link Analysis.Property }
     * 
     */
    public Analysis.Property createAnalysisProperty() {
        return new Analysis.Property();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActionSettings.UIGroupConstraints.DomainGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DomainGroup", scope = ActionSettings.UIGroupConstraints.class)
    public JAXBElement<ActionSettings.UIGroupConstraints.DomainGroup> createActionSettingsUIGroupConstraintsDomainGroup(ActionSettings.UIGroupConstraints.DomainGroup value) {
        return new JAXBElement<ActionSettings.UIGroupConstraints.DomainGroup>(_ActionSettingsUIGroupConstraintsDomainGroup_QNAME, ActionSettings.UIGroupConstraints.DomainGroup.class, ActionSettings.UIGroupConstraints.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActionSettings.UIGroupConstraints.LocalGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LocalGroup", scope = ActionSettings.UIGroupConstraints.class)
    public JAXBElement<ActionSettings.UIGroupConstraints.LocalGroup> createActionSettingsUIGroupConstraintsLocalGroup(ActionSettings.UIGroupConstraints.LocalGroup value) {
        return new JAXBElement<ActionSettings.UIGroupConstraints.LocalGroup>(_ActionSettingsUIGroupConstraintsLocalGroup_QNAME, ActionSettings.UIGroupConstraints.LocalGroup.class, ActionSettings.UIGroupConstraints.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Win9xGroup", scope = ActionSettings.UIGroupConstraints.class)
    public JAXBElement<Object> createActionSettingsUIGroupConstraintsWin9XGroup(Object value) {
        return new JAXBElement<Object>(_ActionSettingsUIGroupConstraintsWin9XGroup_QNAME, Object.class, ActionSettings.UIGroupConstraints.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "WinNTGroup", scope = ActionSettings.UIGroupConstraints.class)
    public JAXBElement<Object> createActionSettingsUIGroupConstraintsWinNTGroup(Object value) {
        return new JAXBElement<Object>(_ActionSettingsUIGroupConstraintsWinNTGroup_QNAME, Object.class, ActionSettings.UIGroupConstraints.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelevanceString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Relevance", scope = SearchComponentRelevance.class)
    public JAXBElement<RelevanceString> createSearchComponentRelevanceRelevance(RelevanceString value) {
        return new JAXBElement<RelevanceString>(_SearchComponentRelevanceRelevance_QNAME, RelevanceString.class, SearchComponentRelevance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelevanceString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Relevance", scope = SearchComponentPropertyReference.class)
    public JAXBElement<RelevanceString> createSearchComponentPropertyReferenceRelevance(RelevanceString value) {
        return new JAXBElement<RelevanceString>(_SearchComponentRelevanceRelevance_QNAME, RelevanceString.class, SearchComponentPropertyReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SearchText", scope = SearchComponentPropertyReference.class)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSearchComponentPropertyReferenceSearchText(String value) {
        return new JAXBElement<String>(_SearchComponentPropertyReferenceSearchText_QNAME, String.class, SearchComponentPropertyReference.class, value);
    }

}
