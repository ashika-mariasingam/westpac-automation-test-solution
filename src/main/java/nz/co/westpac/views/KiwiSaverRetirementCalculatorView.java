package nz.co.westpac.views;

import nz.co.westpac.helpers.SeleniumHelper;
import nz.co.westpac.helpers.XPathConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * View class for Scenario 2.
 * This class contains methods to locate web elements on the kiwi-saver retirement calculator iframe.
 * Author: Ashika Mariasingam
 */
public class KiwiSaverRetirementCalculatorView extends BaseView {

    /**
     * Parameterized Constructor.
     * @param driver
     */
    public KiwiSaverRetirementCalculatorView(final WebDriver driver) {
        super(driver);
    }

    public WebElement getKiwiSaverCurrentAgeTextField() {
        return SeleniumHelper.getWebElement(this.driver, XPathConstants.XPATH_CURRENT_AGE_TEXT_FIELD);
    }

    public WebElement getKiwiSaverSalary() {
        return SeleniumHelper.getWebElement(this.driver, XPathConstants.XPATH_SALARY_ELEMENT);
    }

    public WebElement getKiwiSaverEmploymentStatus() {
        return SeleniumHelper.getWebElement(this.driver, XPathConstants.XPATH_EMPLOYMENT_STATUS_ELEMENT);
    }

    public WebElement getKiwiSaverEmploymentStatusEmployed() {
        return SeleniumHelper.getWebElement(this.driver, XPathConstants.XPATH_EMPLOYMENT_STATUS_EMPLOYED);
    }

    public WebElement getKiwiSaverEmploymentStatusSelfEmployed() {
        return SeleniumHelper.getWebElement(this.driver, XPathConstants.XPATH_EMPLOYMENT_STATUS_SELF_EMPLOYED);
    }

    public WebElement getKiwiSaverEmploymentStatusNotEmployed() {
        return SeleniumHelper.getWebElement(this.driver, XPathConstants.XPATH_EMPLOYMENT_STATUS_NOT_EMPLOYED);
    }

    public WebElement getKiwiSaverMemberContributionThree() {
        return SeleniumHelper.getWebElement(this.driver, XPathConstants.XPATH_MEMBER_CONTRIBUTION_THREE);
    }

    public WebElement getKiwiSaverMemberContributionFour() {
        return SeleniumHelper.getWebElement(this.driver, XPathConstants.XPATH_MEMBER_CONTRIBUTION_FOUR);
    }

    public WebElement getKiwiSaverMemberContributionSix() {
        return SeleniumHelper.getWebElement(this.driver, XPathConstants.XPATH_MEMBER_CONTRIBUTION_SIX);
    }

    public WebElement getKiwiSaverMemberContributionEight() {
        return SeleniumHelper.getWebElement(this.driver, XPathConstants.XPATH_MEMBER_CONTRIBUTION_EIGHT);
    }

    public WebElement getKiwiSaverMemberContributionTen() {
        return SeleniumHelper.getWebElement(this.driver, XPathConstants.XPATH_MEMBER_CONTRIBUTION_TEN);
    }

    public WebElement getKiwiSaverRiskProfileDefensive() {
        return SeleniumHelper.getWebElement(this.driver, XPathConstants.XPATH_RISK_PROFILE);
    }

    public WebElement getKiwiSaverRetirementCalculatorSubmit() {
        return SeleniumHelper.getWebElement(this.driver, XPathConstants.XPATH_KIWI_SAVER_SUBMIT);
    }

    public WebElement getKiwiSaverBalance() {
        return SeleniumHelper.getWebElement(this.driver, XPathConstants.XPATH_BALANCE);
    }

    public WebElement getVoluntaryContribution() {
        return SeleniumHelper.getWebElement(this.driver, XPathConstants.XPATH_VOLUNTARY_CONTRIBUTION);
    }

    public WebElement getVoluntaryContributionFrequency() {
        return SeleniumHelper.getWebElement(this.driver, XPathConstants.XPATH_VOLUNTARY_CONTRIBUTION_FREQUENCY);
    }

    public WebElement getVoluntaryContributionWeekly() {
        return SeleniumHelper.getWebElement(this.driver, XPathConstants.XPATH_VOLUNTARY_CONTRIBUTION_WEEKLY);
    }

    public WebElement getVoluntaryContributionFortnightly() {
        return SeleniumHelper.getWebElement(this.driver, XPathConstants.XPATH_VOLUNTARY_CONTRIBUTION_FORTNIGHTLY);
    }

    public WebElement getVoluntaryContributionMonthly() {
        return this.driver.findElement(By.xpath(XPathConstants.XPATH_VOLUNTARY_CONTRIBUTION_MONTHLY));
    }

    public WebElement getVoluntaryContributionAnnually() {
        return SeleniumHelper.getWebElement(this.driver, XPathConstants.XPATH_VOLUNTARY_CONTRIBUTION_ANNUALLY);
    }

    public WebElement getRiskProfileConservative() {
        return SeleniumHelper.getWebElement(this.driver, XPathConstants.XPATH_RISK_PROFILE_CONSERVATIVE);
    }

    public WebElement getRiskProfileBalanced() {
        return SeleniumHelper.getWebElement(this.driver, XPathConstants.XPATH_RISK_PROFILE_BALANCED);
    }

    public WebElement getRiskProfileGrowth() {
        return SeleniumHelper.getWebElement(this.driver, XPathConstants.XPATH_RISK_PROFILE_GROWTH);
    }

    public WebElement getSavingsGoal() {
        return SeleniumHelper.getWebElement(this.driver, XPathConstants.XPATH_SAVING_GOAL);
    }

    public WebElement getKiwiSaverRetirementCalculatorIframe() {
        return SeleniumHelper.getWebElement(this.driver, XPathConstants.XPATH_IFRAME);
    }

    public WebElement getResultsDivElement() {
        return SeleniumHelper.getWebElement(this.driver, XPathConstants.XPATH_RESULTS_DIV);
    }
}
