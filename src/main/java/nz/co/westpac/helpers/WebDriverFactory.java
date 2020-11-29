package nz.co.westpac.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import java.util.Properties;

/**
 * Factory Class for Webdriver Object.
 * Author: Ashika Mariasingam
 */
public class WebDriverFactory {

    /**
     * Private Constructor.
     */
    private WebDriverFactory(){
    }

    /**
     * Factory method to select appropriate driver.
     *
     * @return
     */
    public static WebDriver createWebDriver(final Properties properties) {

        String webdriver = System.getProperty("browser", "chrome");
        switch (webdriver) {
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "./src/main/resources/drivers/geckodriver.exe");
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.setHeadless(new Boolean(properties.getProperty(PropertyConstants.HEADLESS)));
                return new FirefoxDriver(firefoxOptions);
            case "ie":
                //Headless method not available
                System.setProperty("webdriver.ie.driver", "./src/main/resources/drivers/IEDriverServer-64.exe");
                InternetExplorerOptions internetExplorerOptions = new InternetExplorerOptions();
                internetExplorerOptions.setCapability(PropertyConstants.HEADLESS, new Boolean(properties.getProperty(PropertyConstants.HEADLESS)));
                return new InternetExplorerDriver(internetExplorerOptions);
            case "edge":
                System.setProperty("webdriver.edge.driver", "./src/main/resources/drivers/msedgedriver.exe");
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.setCapability(PropertyConstants.HEADLESS, new Boolean(properties.getProperty(PropertyConstants.HEADLESS)));
                return new EdgeDriver(edgeOptions);
            default:
                System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setHeadless(new Boolean(properties.getProperty(PropertyConstants.HEADLESS)));
                return new ChromeDriver(chromeOptions);
        }
    }
}
