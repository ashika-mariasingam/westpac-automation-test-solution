package nz.co.westpac.controllers;

import nz.co.westpac.views.KiwiSaverRetirementCalculatorView;
import nz.co.westpac.views.NavigationView;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

/**
 * Controller Class for  KiwiSaverRetirementCalculator Step definition.
 * Author: Ashika Mariasingam
 */
public class KiwiSaverRetirementCalculatorController extends BaseController {

    private final KiwiSaverRetirementCalculatorView kiwiSaverRetirementCalculatorView;
    private final NavigationView navigationView;
    private static final String CURRENT_AGE = "Current Age";
    private static final String EMPLOYED = "Employed";
    private static final String SELF_EMPLOYED = "Self-employed";
    private static final String NOT_EMPLOYED = "Not employed";
    private static final String INT_3 = "3";
    private static final String INT_4 = "4";
    private static final String INT_6 = "6";
    private static final String INT_8 = "8";
    private static final String INT_10 = "10";
    private static final String DEFENSIVE = "Defensive";
    private static final String CONSERVATIVE = "Conservative";
    private static final String BALANCED = "Balanced";
    private static final String GROWTH = "Growth";
    private static final String WEEKLY = "Weekly";
    private static final String FORTNIGHTLY = "Fortnightly";
    private static final String MONTHLY = "Monthly";
    private static final String ANNUALLY = "Annually";


    public KiwiSaverRetirementCalculatorController() {
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
        if (webDriverThreadLocal.get() == null) {
            this.webDriverThreadLocal.set(this.driver);
        }
        this.navigationView = new NavigationView(this.driver);
        this.kiwiSaverRetirementCalculatorView = new KiwiSaverRetirementCalculatorView(this.driver);
    }

    public void openURL() {
        this.driver.manage().window().maximize();
        this.driver.get("http://www.westpac.co.nz/");
    }

    public void navigateToKiwiSaverRetirementCalculator() {
        WebElement kiwi = navigationView.getKiwiSaverMenuTab();
        Actions action = new Actions(driver);
        action.moveToElement(kiwi).perform();
        navigationView.getKiwiSaverLink().click();
        navigationView.getKiwiSaverRetirementCalculatorLink().click();
    }

    public void clickOnInformationIcon(String fieldName) {
        if (StringUtils.equals(fieldName, CURRENT_AGE)) {
            this.driver.switchTo().frame(navigationView.getKiwiSaverRetirementCalculatorIframe());
            WebElement currentAgeButton = navigationView.getKiwiSaverRetirementCalculatorInformationIconCurrentAge();
            currentAgeButton.click();
        }
    }

    public String getCurrentAgeInfoMessageDisplayed() {
        return navigationView.getInformationIconElement().getText();
    }

    public void enterCurrentAge(String currentAge) {
        this.driver.switchTo().frame(kiwiSaverRetirementCalculatorView.getKiwiSaverRetirementCalculatorIframe());
        kiwiSaverRetirementCalculatorView.getKiwiSaverCurrentAgeTextField().sendKeys(currentAge);
    }

    public void chooseEmploymentStatus(String employmentStatus) {
        WebElement kiwiSaverEmploymentStatusElement = kiwiSaverRetirementCalculatorView.getKiwiSaverEmploymentStatus();
        kiwiSaverEmploymentStatusElement.click();
        this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        switch (employmentStatus) {
            case EMPLOYED:
                WebElement kiwiSaverEmployedElement = kiwiSaverRetirementCalculatorView.getKiwiSaverEmploymentStatusEmployed();
                kiwiSaverEmployedElement.click();
                break;
            case SELF_EMPLOYED:
                WebElement kiwiSaverSelfEmployedElement = kiwiSaverRetirementCalculatorView.getKiwiSaverEmploymentStatusSelfEmployed();
                kiwiSaverSelfEmployedElement.click();
                break;
            case NOT_EMPLOYED:
                WebElement kiwiSaverNotEmployedElement = kiwiSaverRetirementCalculatorView.getKiwiSaverEmploymentStatusNotEmployed();
                kiwiSaverNotEmployedElement.click();
                break;
            default:
                break;
        }

    }

    public void enterSalary(String salary) {
        if (StringUtils.isNotBlank(salary)) {
            kiwiSaverRetirementCalculatorView.getKiwiSaverSalary().sendKeys(salary);
        }
    }

    public void chooseKiwiSaverContribution(String kiwiSaverContribution) {

        if (StringUtils.isNotBlank(kiwiSaverContribution)) {
            switch (kiwiSaverContribution) {
                case INT_3:
                    break;
                case INT_4:
                    WebElement kiwiSaverMemberContributionFourElement = kiwiSaverRetirementCalculatorView.getKiwiSaverMemberContributionFour();
                    kiwiSaverMemberContributionFourElement.click();
                    break;
                case INT_6:
                    break;
                case INT_8:
                    break;
                case INT_10:
                    break;
                default:
                    break;
            }
        }
    }

    public void chooseRiskProfile(String riskProfile) {
        if (StringUtils.isNotBlank(riskProfile)) {
            switch (riskProfile) {
                case DEFENSIVE:
                    WebElement defensiveRiskProfileElement = kiwiSaverRetirementCalculatorView.getKiwiSaverRiskProfileDefensive();
                    defensiveRiskProfileElement.click();
                    break;
                case CONSERVATIVE:
                    WebElement conservativeRiskProfileElement = kiwiSaverRetirementCalculatorView.getRiskProfileConservative();
                    conservativeRiskProfileElement.click();
                    break;
                case BALANCED:
                    WebElement balancedRiskProfileElement = kiwiSaverRetirementCalculatorView.getRiskProfileBalanced();
                    balancedRiskProfileElement.click();
                    break;
                case GROWTH:
                    WebElement growthRiskProfileElement = kiwiSaverRetirementCalculatorView.getRiskProfileGrowth();
                    growthRiskProfileElement.click();
                    break;
                default:
                    break;
            }
        }
    }

    public void clickKiwiSaverSubmit() {
        WebElement kiwiSaverRetirementSubmitElement = kiwiSaverRetirementCalculatorView.getKiwiSaverRetirementCalculatorSubmit();
        kiwiSaverRetirementSubmitElement.click();
    }

    public void enterKiwiSaverBalance(String kiwiSaverBalance) {
        if (StringUtils.isNotBlank(kiwiSaverBalance)) {
            kiwiSaverRetirementCalculatorView.getKiwiSaverBalance().sendKeys(kiwiSaverBalance);
        }
    }

    public void enterSavingGoals(String savingGoals) {
        if (StringUtils.isNotBlank(savingGoals)) {
            WebElement savingsTextElement = kiwiSaverRetirementCalculatorView.getSavingsGoal();
            savingsTextElement.sendKeys(savingGoals);
        }
    }

    public void entersVoluntaryContribution(String voluntaryContribution, String voluntaryContributionFrequency) {

        if (StringUtils.isNotBlank(voluntaryContribution) && StringUtils.isNotBlank(voluntaryContributionFrequency)) {
            WebElement voluntaryContributionElement = kiwiSaverRetirementCalculatorView.getVoluntaryContribution();
            voluntaryContributionElement.sendKeys(voluntaryContribution);
            WebElement voluntaryContributionFrequencyElement = kiwiSaverRetirementCalculatorView.getVoluntaryContributionFrequency();
            voluntaryContributionFrequencyElement.click();
            this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            switch (voluntaryContributionFrequency) {
                case WEEKLY:
                    log.info("### Selected WEEKLY Frequency!");
                    WebElement voluntaryContributionWeeklyElement = kiwiSaverRetirementCalculatorView.getVoluntaryContributionWeekly();
                    voluntaryContributionWeeklyElement.click();
                    break;
                case FORTNIGHTLY:
                    log.info("### Selected FORTNIGHTLY Frequency!");
                    WebElement voluntaryContributionFortnightlyElement = kiwiSaverRetirementCalculatorView.getVoluntaryContributionFortnightly();
                    voluntaryContributionFortnightlyElement.click();
                    break;
                case MONTHLY:
                    log.info("### Selected MONTHLY Frequency!");
                    WebElement voluntaryContributionMonthlyElement = kiwiSaverRetirementCalculatorView.getVoluntaryContributionMonthly();
                    voluntaryContributionMonthlyElement.click();
                    break;
                case ANNUALLY:
                    log.info("### Selected ANNUALLY Frequency!");
                    WebElement voluntaryContributionAnnuallyElement = kiwiSaverRetirementCalculatorView.getVoluntaryContributionAnnually();
                    voluntaryContributionAnnuallyElement.click();
                    break;
                default:
                    log.warn("### Wasn't able to select any Frequency!");
                    break;
            }

        }

    }

    public String getResultValue() {
        return kiwiSaverRetirementCalculatorView.getResultsDivElement().getText();
    }


}
