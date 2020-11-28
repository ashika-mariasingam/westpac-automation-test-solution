package nz.co.westpac.helpers;

public final class XPathConstants {

    private XPathConstants() {
    }

    public static final String XPATH_IFRAME = "//iframe[1]";
    public static final String XPATH_CURRANT_AGE_INFO_ICON = "//div[@help-id='CurrentAge']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button";
    public static final String XPATH_CURRENT_AGE_TEXT_FIELD = "//div[@label='Current age']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[@type='text']";
    public static final String XPATH_SALARY_ELEMENT = "//div[@label='Salary or wages per year (before tax)']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[@type='text']";
    public static final String XPATH_EMPLOYMENT_STATUS_ELEMENT = "//div[@label='Employment status']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]";
    public static final String XPATH_EMPLOYMENT_STATUS_EMPLOYED = "//div[@label='Employment status']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul/li[2]/div[1]";
    public static final String XPATH_EMPLOYMENT_STATUS_SELF_EMPLOYED = "//div[@label='Employment status']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul/li[3]/div[1]";
    public static final String XPATH_EMPLOYMENT_STATUS_NOT_EMPLOYED = "//div[@label='Employment status']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul/li[4]/div[1]";
    public static final String XPATH_MEMBER_CONTRIBUTION_FOUR = "//div[@label='KiwiSaver member contribution']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/label/span/input[@id='radio-option-04F']";
    public static final String XPATH_RISK_PROFILE = "//div[@label='Risk profile']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label/span/input[@id='radio-option-013']";
    public static final String XPATH_KIWI_SAVER_SUBMIT = "//div[@class='widget-body']/div[1]/div[2]/button";
    public static final String XPATH_BALANCE = "//div[@help-id='KiwiSaverBalance']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[@type='text']";
    public static final String XPATH_VOLUNTARY_CONTRIBUTION = "//div[@help-id='VoluntaryContributions']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[@type='text']";
    public static final String XPATH_VOLUNTARY_CONTRIBUTION_FREQUENCY = "//div[@help-id='VoluntaryContributions']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]";
    public static final String XPATH_VOLUNTARY_CONTRIBUTION_WEEKLY = "//div[@help-id='VoluntaryContributions']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul/li[2]/div[1]";
    public static final String XPATH_VOLUNTARY_CONTRIBUTION_FORTNIGHTLY = "//div[@help-id='VoluntaryContributions']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul/li[3]/div[1]";
    public static final String XPATH_VOLUNTARY_CONTRIBUTION_MONTHLY = "//div[@help-id='VoluntaryContributions']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul/li[4]/div[1]";
    public static final String XPATH_VOLUNTARY_CONTRIBUTION_ANNUALLY = "//div[@help-id='VoluntaryContributions']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul/li[5]/div[1]";
    public static final String XPATH_RISK_PROFILE_CONSERVATIVE = "//div[@help-id='RiskProfile']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/label/span[1]/input[@id='radio-option-016']";
    public static final String XPATH_RISK_PROFILE_BALANCED = "//div[@help-id='RiskProfile']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/label/span[1]/input[@id='radio-option-019']";
    public static final String XPATH_RISK_PROFILE_GROWTH = "//div[@help-id='RiskProfile']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/label/span[1]/input[@id='radio-option-01C']";
    public static final String XPATH_SAVING_GOAL = "//div[@help-id='SavingsGoal']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[@type='text']";
    public static final String XPATH_INFORMATION_ICON = "//div[@class ='message-row ng-scope']/div[1]/p[1]";
    public static final String XPATH_KIWI_SAVER_MENU_TAB = "//a[@id='ubermenu-section-link-kiwisaver-ps']";
    public static final String XPATH_KIWI_SAVER_LINK = "//a[@id='ubermenu-item-cta-kiwisaver-calculators-ps']";
    public static final String XPATH_KIWI_SAVER_CALCULATOR_LINK = "//a[@id=\"responsive-children-title-3956-ps\"]";
    public static final String XPATH_RESULTS_DIV = "//div[@class='results-heading']/span[2]";
}
