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

    private SeleniumHelper(){
    }

    public static WebElement getWebElement(final WebDriver driver, final String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        return driver.findElement(By.xpath(xpath));
    }

    public static void takeScreenshot(final WebDriver driver, final Scenario scenario, final String s) {
        try {
            log.info(s, scenario.getName());
            scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
        } catch (Exception e) {
            log.error("Encountered error {} while taking screenshot", e.getMessage(), e);
        }
    }


}
