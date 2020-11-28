package nz.co.westpac.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Factory Class for Webdriver Object.
 * Author: Ashika Mariasingam
 */
public class WebDriverFactory {

    /**
     * Factory method to select appropriate driver.
     * @return
     */
    public static WebDriver createWebDriver() {
        String webdriver = System.getProperty("browser", "firefox");
        switch (webdriver) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
                return new ChromeDriver();
            case "ie":
                System.setProperty("webdriver.ie.driver", "./src/main/resources/drivers/IEDriver.exe");
                return new InternetExplorerDriver();
            default:
                System.setProperty("webdriver.gecko.driver", "./src/main/resources/drivers/geckodriver.exe");
                return new FirefoxDriver();
        }
    }
}
