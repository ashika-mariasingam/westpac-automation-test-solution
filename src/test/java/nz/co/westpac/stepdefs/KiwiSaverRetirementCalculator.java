package nz.co.westpac.stepdefs;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import nz.co.westpac.controllers.KiwiSaverRetirementCalculatorController;
import nz.co.westpac.controllers.NavigationController;

/**
 * Step definition class for  KiwiSaverRetirementCalculator
 * Author: Ashika Mariasingam
 */
public class KiwiSaverRetirementCalculator
{

   private final NavigationController navigationController = new  NavigationController();
   private final KiwiSaverRetirementCalculatorController kiwiSaverRetirementCalculatorController = new KiwiSaverRetirementCalculatorController();

    @Given("^Open browser \"([^\"]*)\"$")
    public void open_browser(String browser)  {

     navigationController.OpenBrowser(browser);    }

    @And("^Navigate to the KiwiSaver Retirement Calculator page$")
    public void navigate_to_the_KiwiSaver_Retirement_Calculator_page() {

     navigationController.NavigateToKiwiSaverRetirementCalculator();    }

    @When("^I click on the information icon beside Current Age$")
    public void i_click_on_the_information_icon_beside_Current_Age(String fieldName)  {
     kiwiSaverRetirementCalculatorController.ClickOnInformationIcon(fieldName);    }

    @Then("^Message is displayed$")
    public void message_is_displayed() {

    }

}
