package nz.co.westpac.stepdefs;

import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.Scenario;
import nz.co.westpac.assertions.KiwiSaverRetirementCalculatorAssertion;
import nz.co.westpac.controllers.KiwiSaverRetirementCalculatorController;
import nz.co.westpac.helpers.WebElementReader;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
            WebElementReader.takeScreenshot(kiwiSaverRetirementCalculatorController.getWebDriver(), scenario, "Scenario {} failed.");
        } else {
            WebElementReader.takeScreenshot(kiwiSaverRetirementCalculatorController.getWebDriver(), scenario, "Scenario {} passed.");
        }
        kiwiSaverRetirementCalculatorController.getWebDriver().close();
        kiwiSaverRetirementCalculatorController.getWebDriver().quit();
    }

    //##################################################################################################
    //########################################### SCENARIO 1 ###########################################
    //##################################################################################################

    @Given("^User open browser and navigate to URL$")
    public void user_open_browser_and_navigate_to_URL() {
        kiwiSaverRetirementCalculatorController.openURL();
    }

    @Then("^Navigate to the KiwiSaver Retirement Calculator page$")
    public void navigate_to_the_KiwiSaver_Retirement_Calculator_page() {
        kiwiSaverRetirementCalculatorController.navigateToKiwiSaverRetirementCalculator();
    }

    @When("^I click on the information icon beside \"([^\"]*)\"$")
    public void i_click_on_the_information_icon_beside_Current_Age(String fieldName) {
        kiwiSaverRetirementCalculatorController.clickOnInformationIcon(fieldName);
    }

    @Then("^Message is displayed$")
    public void message_is_displayed() {
        kiwiSaverRetirementCalculatorAssertion.assertCurrentAgeInfoMessage(kiwiSaverRetirementCalculatorController.getCurrentAgeInfoMessageDisplayed());
    }


    //##################################################################################################
    //########################################### SCENARIO 2 ###########################################
    //##################################################################################################


    @And("^User enter Current Age as (.*)$")
    public void user_enter_Current_Age_as(String currentAge) {
        kiwiSaverRetirementCalculatorController.enterCurrentAge(currentAge);
    }

    @And("^User choose Employment status \"([^\"]*)\"$")
    public void user_choose_Employment_status(String employmentStatus) {
        kiwiSaverRetirementCalculatorController.chooseEmploymentStatus(employmentStatus);
    }

    @And("^User enter Salary as (.*)$")
    public void user_enter_Salary_as(String salary) {
        kiwiSaverRetirementCalculatorController.enterSalary(salary);
    }

    @And("^User choose KiwiSaver contribution as (.*)$")
    public void user_choose_KiwiSaver_contribution_as(String kiwiSaverContribution) {
        kiwiSaverRetirementCalculatorController.chooseKiwiSaverContribution(kiwiSaverContribution);
    }

    @And("^User choose Risk profile as \"([^\"]*)\"$")
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

    @When("^User clicks the Complete form button$")
    public void user_clicks_the_Complete_form_button() {
        kiwiSaverRetirementCalculatorController.clickKiwiSaverSubmit();
    }

    @Then("^The correct results are displayed as (.*)$")
    public void the_correct_results_are_displayed(String expectedResult) {
        String actualResult = kiwiSaverRetirementCalculatorController.getResultValue();
        kiwiSaverRetirementCalculatorAssertion.assertResults(expectedResult,actualResult);
    }
}
