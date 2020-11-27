package nz.co.westpac.stepdefs;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import nz.co.westpac.controllers.KiwiSaverRetirementCalculatorController;
import nz.co.westpac.controllers.NavigationController;

/**
 * Step definition class for  KiwiSaverRetirementCalculator
 * Author: Ashika Mariasingam
 */
public class KiwiSaverRetirementCalculator
{

     private final NavigationController navigationController = new  NavigationController();
    // private final KiwiSaverRetirementCalculatorController kiwiSaverRetirementCalculatorController = new KiwiSaverRetirementCalculatorController();

     @Before
     public void setup(){

     }

     @After
     public void tearDown(){
         navigationController.getWebDriver().close();
     }

     @Given("^Open URL$")
     public void open_browser()  {
         navigationController.OpenURL();
     }

     @Then("^Navigate to the KiwiSaver Retirement Calculator page$")
     public void navigate_to_the_KiwiSaver_Retirement_Calculator_page() {
         navigationController.NavigateToKiwiSaverRetirementCalculator();
     }

     @When("^I click on the information icon beside \"([^\"]*)\"$")
     public void i_click_on_the_information_icon_beside_Current_Age(String fieldName)  {
          navigationController.ClickOnInformationIcon(fieldName);
     }

     @Then("^Message is displayed$")
     public void message_is_displayed() {
        navigationController.assertMessageDisplayed();
     }

     @Given("^User open browser and navigate to URL$")
     public void user_open_browser_and_navigate_to_URL() {
          navigationController.OpenURL();
     }

     @And("^User enter Current Age as (\\d+)$")
     public void user_enter_Current_Age_as(String currentAge) {
          navigationController.EnterCurrentAge(currentAge);
     }

     @And("^User choose Employment status \"([^\"]*)\"$")
     public void user_choose_Employment_status(String employmentStatus)  {
          navigationController.ChooseEmploymentStatus(employmentStatus);
     }

     @And("^User enter Salary as (.*)$")
     public void user_enter_Salary_as(String salary)  {
          navigationController.EnterSalary(salary);
     }

     @And("^User choose KiwiSaver contribution as (.*)$")
     public void user_choose_KiwiSaver_contribution_as(String kiwiSaverContribution)  {
          navigationController.ChooseKiwiSaverContribution(kiwiSaverContribution);
     }

     @And("^User choose Risk profile as \"([^\"]*)\"$")
     public void user_choose_Risk_profile_as(String defensiveProfile)  {
          navigationController.chooseRiskProfile(defensiveProfile);
     }

     @And("^User enters KiwiSaver balance as (.*)$")
     public void user_enters_KiwiSaver_balance_as(String kiwiSaverBalance) {
         navigationController.enterKiwiSaverBalance(kiwiSaverBalance);
     }

     @And("^User enters Savings goals as (.*)$")
     public void user_enters_Savings_goals_as(String savingGoals) {
           navigationController.enterSavingGoals(savingGoals);
     }

     @And("^User enters Voluntary Contribution as (.*) and (.*)$")
     public void user_enters_Voluntary_Contribution_as(String voluntaryContribution, String voluntaryContributionFrequency )  {
          navigationController.entersVoluntaryContribution(voluntaryContribution,voluntaryContributionFrequency);
     }

     @When("^User clicks the Complete form button$")
     public void user_clicks_the_Complete_form_button(){
          navigationController.ClickKiwiSaverSubmit();
     }

     @Then("^The correct results are displayed$")
     public void the_correct_results_are_displayed()  {

     }





}
