package nz.co.westpac.stepdefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import nz.co.westpac.controllers.NavigationController;

/**
 * Step definition class for Navigation to KiwiSaverRetirementCalculator
 * Author: Ashika Mariasingam
 */
public class NavigateToKiwiSaverRetirementCalculator {

    private final NavigationController navigationController = new NavigationController();

    @Before
    public void setup(){

    }

    @After
    public void tearDown() {
        navigationController.getWebDriver().close();
        navigationController.getWebDriver().quit();
    }

    @Given("^Open URL$")
    public void open_browser() {
        navigationController.openURL();
    }

    @Then("^Navigate to the KiwiSaver Retirement Calculator page$")
    public void navigate_to_the_KiwiSaver_Retirement_Calculator_page() {
        navigationController.navigateToKiwiSaverRetirementCalculator();
    }

    @Given("^User open browser and navigate to URL$")
    public void user_open_browser_and_navigate_to_URL() {
        navigationController.openURL();
    }
}
