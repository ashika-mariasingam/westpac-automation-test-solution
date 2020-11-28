package nz.co.westpac.views;

import nz.co.westpac.helpers.WebElementReader;
import nz.co.westpac.helpers.XPathConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * View class for KiwiSaverRetirementCalculator Step definition.
 * Author: Ashika Mariasingam
 */
public class KiwiSaverRetirementCalculatorView extends BaseView {

    public KiwiSaverRetirementCalculatorView(final WebDriver driver) {
        super(driver);
    }

    public WebElement getKiwiSaverCurrentAgeTextField() {
        return WebElementReader.getWebElement(this.driver, XPathConstants.XPATH_CURRENT_AGE_TEXT_FIELD);
    }

    public WebElement getKiwiSaverSalary() {
        return WebElementReader.getWebElement(this.driver, XPathConstants.XPATH_SALARY_ELEMENT);
    }

    public WebElement getKiwiSaverEmploymentStatus() {
        return WebElementReader.getWebElement(this.driver, XPathConstants.XPATH_EMPLOYMENT_STATUS_ELEMENT);
    }

    public WebElement getKiwiSaverEmploymentStatusEmployed() {
        return WebElementReader.getWebElement(this.driver, XPathConstants.XPATH_EMPLOYMENT_STATUS_EMPLOYED);
    }

    public WebElement getKiwiSaverEmploymentStatusSelfEmployed() {
        return WebElementReader.getWebElement(this.driver, XPathConstants.XPATH_EMPLOYMENT_STATUS_SELF_EMPLOYED);
    }

    public WebElement getKiwiSaverEmploymentStatusNotEmployed() {
        return WebElementReader.getWebElement(this.driver, XPathConstants.XPATH_EMPLOYMENT_STATUS_NOT_EMPLOYED);
    }

    public WebElement getKiwiSaverMemberContributionFour() {
        return WebElementReader.getWebElement(this.driver, XPathConstants.XPATH_MEMBER_CONTRIBUTION_FOUR);
    }

    public WebElement getKiwiSaverRiskProfileDefensive() {
        return WebElementReader.getWebElement(this.driver, XPathConstants.XPATH_RISK_PROFILE);
    }

    public WebElement getKiwiSaverRetirementCalculatorSubmit() {
        return WebElementReader.getWebElement(this.driver, XPathConstants.XPATH_KIWI_SAVER_SUBMIT);
    }

    public WebElement getKiwiSaverBalance() {
        return WebElementReader.getWebElement(this.driver, XPathConstants.XPATH_BALANCE);
    }

    public WebElement getVoluntaryContribution() {
        return WebElementReader.getWebElement(this.driver, XPathConstants.XPATH_VOLUNTARY_CONTRIBUTION);
    }

    public WebElement getVoluntaryContributionFrequency() {
        return WebElementReader.getWebElement(this.driver, XPathConstants.XPATH_VOLUNTARY_CONTRIBUTION_FREQUENCY);
    }

    public WebElement getVoluntaryContributionWeekly() {
        return WebElementReader.getWebElement(this.driver, XPathConstants.XPATH_VOLUNTARY_CONTRIBUTION_WEEKLY);
    }

    public WebElement getVoluntaryContributionFortnightly() {
        return WebElementReader.getWebElement(this.driver, XPathConstants.XPATH_VOLUNTARY_CONTRIBUTION_FORTNIGHTLY);
    }

    public WebElement getVoluntaryContributionMonthly() {
        return this.driver.findElement(By.xpath(XPathConstants.XPATH_VOLUNTARY_CONTRIBUTION_MONTHLY));
    }

    public WebElement getVoluntaryContributionAnnually() {
        return WebElementReader.getWebElement(this.driver, XPathConstants.XPATH_VOLUNTARY_CONTRIBUTION_ANNUALLY);
    }

    public WebElement getRiskProfileConservative() {
        return WebElementReader.getWebElement(this.driver, XPathConstants.XPATH_RISK_PROFILE_CONSERVATIVE);
    }

    public WebElement getRiskProfileBalanced() {
        return WebElementReader.getWebElement(this.driver, XPathConstants.XPATH_RISK_PROFILE_BALANCED);
    }

    public WebElement getRiskProfileGrowth() {
        return WebElementReader.getWebElement(this.driver, XPathConstants.XPATH_RISK_PROFILE_GROWTH);
    }

    public WebElement getSavingsGoal() {
        return WebElementReader.getWebElement(this.driver, XPathConstants.XPATH_SAVING_GOAL);
    }

    public WebElement getKiwiSaverRetirementCalculatorIframe() {
        return WebElementReader.getWebElement(this.driver, XPathConstants.XPATH_IFRAME);
    }

    public WebElement getResultsDivElement() {
        return WebElementReader.getWebElement(this.driver, XPathConstants.XPATH_RESULTS_DIV);
    }


}
