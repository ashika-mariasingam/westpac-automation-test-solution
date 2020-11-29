package nz.co.westpac.controllers;

import nz.co.westpac.helpers.PropertyConstants;
import nz.co.westpac.helpers.WebDriverFactory;
import nz.co.westpac.views.KiwiSaverRetirementCalculatorView;
import nz.co.westpac.views.NavigationView;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

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


    /**
     * Default Constructor
     */
    public KiwiSaverRetirementCalculatorController() {
        this.driver = WebDriverFactory.createWebDriver(properties);
        if (webDriverThreadLocal.get() == null) {
            this.webDriverThreadLocal.set(this.driver);
        }
        this.navigationView = new NavigationView(this.driver);
        this.kiwiSaverRetirementCalculatorView = new KiwiSaverRetirementCalculatorView(this.driver);
    }

    /**
     * Method to open url.
     */
    public void openURL() {
        try {
            this.driver.manage().window().maximize();
            this.driver.get(properties.get(PropertyConstants.BASE_URL).toString());
        } catch (Exception e) {
            log.error("Encountered error {} while opening URL", e.getMessage(), e);
        }
    }

    /**
     * Method to assist in navigating to the required pages.
     */
    public void navigateToKiwiSaverRetirementCalculator() {
        WebElement kiwi = navigationView.getKiwiSaverMenuTab();
        Actions action = new Actions(driver);
        action.moveToElement(kiwi).perform();
        navigationView.getKiwiSaverLink().click();
        navigationView.getKiwiSaverRetirementCalculatorLink().click();
    }

    /**
     * Method to assist in clicking the information icon.
     * @param fieldName
     */
    public void clickOnInformationIcon(String fieldName) {
        if (StringUtils.equals(fieldName, CURRENT_AGE)) {
            this.driver.switchTo().frame(navigationView.getKiwiSaverRetirementCalculatorIframe());
            WebElement currentAgeButton = navigationView.getKiwiSaverRetirementCalculatorInformationIconCurrentAge();
            currentAgeButton.click();
        }
    }

    /**
     * Method to assist getting CurrentAge Info Message Displayed.
     * @return
     */
    public String getCurrentAgeInfoMessageDisplayed() {
        return navigationView.getInformationIconElement().getText();
    }

    /**
     * Method to assist entering current age in the text field.
     * @param currentAge
     */
    public void enterCurrentAge(String currentAge) {
        this.driver.switchTo().frame(kiwiSaverRetirementCalculatorView.getKiwiSaverRetirementCalculatorIframe());
        kiwiSaverRetirementCalculatorView.getKiwiSaverCurrentAgeTextField().sendKeys(currentAge);
    }

    /**
     * Method to assist in selecting an employment status from drop-down.
     * @param employmentStatus
     */
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

    /**
     * Method to assist in entering salary in the text-field.
     * @param salary
     */
    public void enterSalary(String salary) {
        if (StringUtils.isNotBlank(salary)) {
            kiwiSaverRetirementCalculatorView.getKiwiSaverSalary().sendKeys(salary);
        }
    }

    /**
     * Method to assist in selecting a kiwi-saver contribution from the radio button list.
     * @param kiwiSaverContribution
     */
    public void chooseKiwiSaverContribution(String kiwiSaverContribution) {
        if (StringUtils.isNotBlank(kiwiSaverContribution)) {
            switch (kiwiSaverContribution) {
                case INT_3:
                    WebElement kiwiSaverMemberContributionThreeElement = kiwiSaverRetirementCalculatorView.getKiwiSaverMemberContributionThree();
                    kiwiSaverMemberContributionThreeElement.click();
                    break;
                case INT_4:
                    WebElement kiwiSaverMemberContributionFourElement = kiwiSaverRetirementCalculatorView.getKiwiSaverMemberContributionFour();
                    kiwiSaverMemberContributionFourElement.click();
                    break;
                case INT_6:
                    WebElement kiwiSaverMemberContributionSixElement = kiwiSaverRetirementCalculatorView.getKiwiSaverMemberContributionSix();
                    kiwiSaverMemberContributionSixElement.click();
                    break;
                case INT_8:
                    WebElement kiwiSaverMemberContributionEightElement = kiwiSaverRetirementCalculatorView.getKiwiSaverMemberContributionEight();
                    kiwiSaverMemberContributionEightElement.click();
                    break;
                case INT_10:
                    WebElement kiwiSaverMemberContributionTenElement = kiwiSaverRetirementCalculatorView.getKiwiSaverMemberContributionTen();
                    kiwiSaverMemberContributionTenElement.click();
                    break;
                default:
                    break;
            }
        }
    }

    /**
     * Method to assist in entering current kiwi-saver balance in the text-field.
     * @param kiwiSaverBalance
     */
    public void enterKiwiSaverBalance(String kiwiSaverBalance) {
        if (StringUtils.isNotBlank(kiwiSaverBalance)) {
            kiwiSaverRetirementCalculatorView.getKiwiSaverBalance().sendKeys(kiwiSaverBalance);
        }
    }

    /**
     * Method to assist in entering voluntary contribution details
     * @param voluntaryContribution
     * @param voluntaryContributionFrequency
     */
    public void enterVoluntaryContribution(String voluntaryContribution, String voluntaryContributionFrequency) {
        if (StringUtils.isNotBlank(voluntaryContribution) && StringUtils.isNotBlank(voluntaryContributionFrequency)) {

            // Enter voluntary contribution amount in text-field.
            WebElement voluntaryContributionElement = kiwiSaverRetirementCalculatorView.getVoluntaryContribution();
            voluntaryContributionElement.sendKeys(voluntaryContribution);

            // Select payment frequency from drop-down.
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

    /**
     * Method to assist in selecting a risk profile from the radio button list.
     * @param riskProfile
     */
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

    /**
     * Method to assist in entering savings goal in text-box.
     * @param savingGoals
     */
    public void enterSavingGoals(String savingGoals) {
        if (StringUtils.isNotBlank(savingGoals)) {
            WebElement savingsTextElement = kiwiSaverRetirementCalculatorView.getSavingsGoal();
            savingsTextElement.sendKeys(savingGoals);
        }
    }

    /**
     * Method to assist in clicking the kiwi-saver retirement calculation submit button.
     */
    public void clickKiwiSaverSubmit() {
        WebElement kiwiSaverRetirementSubmitElement = kiwiSaverRetirementCalculatorView.getKiwiSaverRetirementCalculatorSubmit();
        kiwiSaverRetirementSubmitElement.click();
    }

    /**
     * Method to get the calculated projection.
     * @return
     */
    public String getResultValue() {
        return kiwiSaverRetirementCalculatorView.getResultsDivElement().getText();
    }
}
