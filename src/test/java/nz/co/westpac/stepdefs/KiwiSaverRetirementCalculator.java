package nz.co.westpac.stepdefs;

import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import nz.co.westpac.assertions.KiwiSaverRetirementCalculatorAssertion;
import nz.co.westpac.controllers.KiwiSaverRetirementCalculatorController;
import nz.co.westpac.helpers.SeleniumHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

/**
 * Step definition class for  KiwiSaverRetirementCalculator
 * Author: Ashika Mariasingam
 */
public class KiwiSaverRetirementCalculator {

    private final KiwiSaverRetirementCalculatorController kiwiSaverRetirementCalculatorController = new KiwiSaverRetirementCalculatorController();
    public static Scenario scenario;
    private Logger log = LoggerFactory.getLogger(KiwiSaverRetirementCalculator.class);
    private KiwiSaverRetirementCalculatorAssertion kiwiSaverRetirementCalculatorAssertion;

    @Before
    public void setup() {
        kiwiSaverRetirementCalculatorAssertion = new KiwiSaverRetirementCalculatorAssertion();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            SeleniumHelper.takeScreenshot(kiwiSaverRetirementCalculatorController.getWebDriver(), scenario, "Scenario {} failed.");
        } else {
            SeleniumHelper.takeScreenshot(kiwiSaverRetirementCalculatorController.getWebDriver(), scenario, "Scenario {} passed.");
        }
        kiwiSaverRetirementCalculatorController.getWebDriver().close();
        kiwiSaverRetirementCalculatorController.getWebDriver().quit();
    }

    //##################################################################################################
    //########################################### SCENARIO 1 ###########################################
    //##################################################################################################

    @Given("^User opens browser and navigates to Website$")
    public void user_open_browser_and_navigate_to_URL() {
        kiwiSaverRetirementCalculatorController.openURL();
    }

    @And("^User navigates to the KiwiSaver Retirement Calculator page$")
    public void navigate_to_the_KiwiSaver_Retirement_Calculator_page() {
        kiwiSaverRetirementCalculatorController.navigateToKiwiSaverRetirementCalculator();
    }

    @When("^User clicks on the information icon besides \"([^\"]*)\"$")
    public void i_click_on_the_information_icon_beside_Current_Age(String fieldName) {
        kiwiSaverRetirementCalculatorController.clickOnInformationIcon(fieldName);
    }

    @Then("^Informative message is displayed$")
    public void message_is_displayed() {
        kiwiSaverRetirementCalculatorAssertion.assertCurrentAgeInfoMessage(kiwiSaverRetirementCalculatorController.getCurrentAgeInfoMessageDisplayed());
    }


    //##################################################################################################
    //########################################### SCENARIO 2 ###########################################
    //##################################################################################################


    @And("^User enters Current Age as (.*)$")
    public void user_enter_Current_Age_as(String currentAge) {
        kiwiSaverRetirementCalculatorController.enterCurrentAge(currentAge);
    }

    @And("^User selects Employment status \"([^\"]*)\"$")
    public void user_choose_Employment_status(String employmentStatus) {
        kiwiSaverRetirementCalculatorController.chooseEmploymentStatus(employmentStatus);
    }

    @And("^User enters Salary as (.*)$")
    public void user_enter_Salary_as(String salary) {
        kiwiSaverRetirementCalculatorController.enterSalary(salary);
    }

    @And("^User selects KiwiSaver contribution as (.*)$")
    public void user_choose_KiwiSaver_contribution_as(String kiwiSaverContribution) {
        kiwiSaverRetirementCalculatorController.chooseKiwiSaverContribution(kiwiSaverContribution);
    }

    @And("^User selects Risk profile as \"([^\"]*)\"$")
    public void user_choose_Risk_profile_as(String defensiveProfile) {
        kiwiSaverRetirementCalculatorController.chooseRiskProfile(defensiveProfile);
    }

    @And("^User enters KiwiSaver balance as (.*)$")
    public void user_enters_KiwiSaver_balance_as(String kiwiSaverBalance) {
        kiwiSaverRetirementCalculatorController.enterKiwiSaverBalance(kiwiSaverBalance);
    }

    @And("^User enters Savings goals as (.*)$")
    public void user_enters_Savings_goals_as(String savingGoals) {
        kiwiSaverRetirementCalculatorController.enterSavingGoals(savingGoals);
    }

    @And("^User enters Voluntary Contribution as (.*) and (.*)$")
    public void user_enters_Voluntary_Contribution_as(String voluntaryContribution, String voluntaryContributionFrequency) {
        kiwiSaverRetirementCalculatorController.entersVoluntaryContribution(voluntaryContribution, voluntaryContributionFrequency);
    }

    @When("^User clicks the Complete the form button$")
    public void user_clicks_the_Complete_form_button() {
        kiwiSaverRetirementCalculatorController.clickKiwiSaverSubmit();
    }

    @Then("^The result is displayed as (.*)$")
    public void the_correct_results_are_displayed(String expectedResult) {
        String actualResult = kiwiSaverRetirementCalculatorController.getResultValue();
        kiwiSaverRetirementCalculatorAssertion.assertResults(expectedResult,actualResult);
    }
}
