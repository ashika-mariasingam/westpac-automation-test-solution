package nz.co.westpac.stepdefs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import nz.co.westpac.controllers.KiwiSaverRetirementCalculatorController;

/**
 * Step definition class for  KiwiSaverRetirementCalculator
 * Author: Ashika Mariasingam
 */
public class KiwiSaverRetirementCalculator {

    private final KiwiSaverRetirementCalculatorController kiwiSaverRetirementCalculatorController = new KiwiSaverRetirementCalculatorController();

    @Before
    public void setup() {

    }

    @After
    public void tearDown() {
        kiwiSaverRetirementCalculatorController.getWebDriver().close();
        kiwiSaverRetirementCalculatorController.getWebDriver().quit();
    }


    @When("^I click on the information icon beside \"([^\"]*)\"$")
    public void i_click_on_the_information_icon_beside_Current_Age(String fieldName) {
        kiwiSaverRetirementCalculatorController.clickOnInformationIcon(fieldName);
    }

    @Then("^Message is displayed$")
    public void message_is_displayed() {
        kiwiSaverRetirementCalculatorController.assertMessageDisplayed();
    }


    @And("^User enter Current Age as (\\d+)$")
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
    public void the_correct_results_are_displayed(String results) {
        kiwiSaverRetirementCalculatorController.assertResults(results);
    }
}
