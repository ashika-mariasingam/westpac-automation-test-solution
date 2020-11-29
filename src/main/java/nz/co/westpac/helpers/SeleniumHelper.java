package nz.co.westpac.helpers;

import cucumber.api.Scenario;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Helper Class for  common operations.
 * Author: Ashika Mariasingam
 */
public final class SeleniumHelper {

    private static Logger log = LoggerFactory.getLogger(SeleniumHelper.class);

    /**
     * Default private constructor.
     */
    private SeleniumHelper(){
    }

    /**
     * Common method to stop the driver and wait for elements to appear on the page
     * before attempting to locate them.
     * @param driver
     * @param xpath
     * @return
     */
    public static WebElement getWebElement(final WebDriver driver, final String xpath) {
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        log.debug("Located element with xpath: {}", xpath);
        return driver.findElement(By.xpath(xpath));
    }

    /**
     * Method to take screenshots of passed and failed tests for reporting.
     * @param driver
     * @param scenario
     * @param testStatusMessage
     */
    public static void takeScreenshot(final WebDriver driver, final Scenario scenario, final String testStatusMessage) {
        try {
            log.info(testStatusMessage, scenario.getName());
            scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
        } catch (Exception e) {
            log.error("Encountered error {} while taking screenshot", e.getMessage(), e);
        }
    }
}
