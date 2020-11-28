package nz.co.westpac.controllers;

import nz.co.westpac.views.KiwiSaverRetirementCalculatorView;
import nz.co.westpac.views.NavigationView;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class NavigationController extends BaseController{

    public final NavigationView navigationView = new NavigationView();

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




}



