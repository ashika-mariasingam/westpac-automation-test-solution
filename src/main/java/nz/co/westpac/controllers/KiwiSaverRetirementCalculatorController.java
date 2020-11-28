package nz.co.westpac.controllers;

import nz.co.westpac.views.KiwiSaverRetirementCalculatorView;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class KiwiSaverRetirementCalculatorController extends BaseController {


    public static final String EMPLOYED = "Employed";
    public static final String SELF_EMPLOYED = "Self-employed";
    public static final String NOT_EMPLOYED = "Not employed";
    public static final String INT_3 = "3";
    public static final String INT_4 = "4";
    public static final String INT_6 = "6";
    public static final String INT_8 = "8";
    public static final String INT_10 = "10";
    public static final String DEFENSIVE = "Defensive";
    public static final String CONSERVATIVE = "Conservative";
    public static final String BALANCED = "Balanced";
    public static final String GROWTH = "Growth";
    public static final String WEEKLY = "Weekly";
    public static final String FORTNIGHTLY = "Fortnightly";
    public static final String MONTHLY = "Monthly";
    public static final String ANNUALLY = "Annually";
    public static final String CURRENT_AGE_EXPECTED_INFO_MESSAGE = "This calculator has an age limit of 64 years old as you need to be under the age of 65 to join KiwiSaver.";
    public static final String RESULT_EXAMPLE_1 = "436365";
    public KiwiSaverRetirementCalculatorView kiwiSaverRetirementCalculatorView = new KiwiSaverRetirementCalculatorView();
    public static final String CURRENT_AGE = "Current Age";

    public KiwiSaverRetirementCalculatorController() {
    }

    public void clickOnInformationIcon(String fieldName) {
        if (StringUtils.equals(fieldName, CURRENT_AGE)) {
            this.driver.switchTo().frame(kiwiSaverRetirementCalculatorView.getKiwiSaverRetirementCalculatorIframe());
            WebElement currentAgeButton = kiwiSaverRetirementCalculatorView.getKiwiSaverRetirementCalculatorInformationIconCurrentAge();
            currentAgeButton.click();
        }
    }

    public void enterCurrentAge(String currentAge) {
        this.driver.switchTo().frame(kiwiSaverRetirementCalculatorView.getKiwiSaverRetirementCalculatorIframe());
        kiwiSaverRetirementCalculatorView.getKiwiSaverCurrentAgeTextField().sendKeys(currentAge);
    }

    public void chooseEmploymentStatus(String employmentStatus) {
        //driver.switchTo().frame(getKiwiSaverRetirementCalculatorIframe());
        WebElement kiwiSaverEmploymentStatusElement = kiwiSaverRetirementCalculatorView.getKiwiSaverEmploymentStatus();
        kiwiSaverEmploymentStatusElement.click();

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
            WebElement voluntaryContributionFrequencyElement = kiwiSaverRetirementCalculatorView.getVoluntaryContributionFrequency();
            WebElement voluntaryContributionWeeklyElement = kiwiSaverRetirementCalculatorView.getVoluntaryContributionWeekly();
            WebElement voluntaryContributionFortnightlyElement = kiwiSaverRetirementCalculatorView.getVoluntaryContributionFortnightly();
            WebElement voluntaryContributionMonthlyElement = kiwiSaverRetirementCalculatorView.getVoluntaryContributionMonthly();
            WebElement voluntaryContributionAnnuallyElement = kiwiSaverRetirementCalculatorView.getVoluntaryContributionAnnually();
            voluntaryContributionElement.sendKeys(voluntaryContribution);
            voluntaryContributionFrequencyElement.click();
            switch (voluntaryContributionFrequency) {
                case WEEKLY:
                    voluntaryContributionWeeklyElement.click();
                    break;
                case FORTNIGHTLY:
                    voluntaryContributionFortnightlyElement.click();
                    break;
                case MONTHLY:
                    voluntaryContributionMonthlyElement.click();
                    break;
                case ANNUALLY:
                    voluntaryContributionAnnuallyElement.click();
                    break;
                default:
                    break;

            }

        }

    }

    public void assertMessageDisplayed() {
        String expectedMessage = CURRENT_AGE_EXPECTED_INFO_MESSAGE;
        String actualMessage = kiwiSaverRetirementCalculatorView.getInformationIconElement().getText();
        assertEquals(expectedMessage,actualMessage);
        assertEquals("Displayed message - ",actualMessage,expectedMessage);

    }

    public String getResultValue(){
        //Add implementation
        return null;
    }

    public void assertResults(String results){
        if(StringUtils.isNotBlank(results)){
            String actualResult;
            switch (results){
                case RESULT_EXAMPLE_1:
                    actualResult = getResultValue();
                    assertEquals("Displayed results - "+actualResult+" should be 436365",actualResult,RESULT_EXAMPLE_1);
            }
        }

    }



}
