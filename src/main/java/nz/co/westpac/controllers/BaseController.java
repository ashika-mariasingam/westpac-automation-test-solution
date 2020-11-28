package nz.co.westpac.controllers;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class BaseController {

    protected final WebDriver driver;
    private final String browser;
    public final ThreadLocal<WebDriver>  webDriverThreadLocal;

    public BaseController() {
        this.browser = "Chrome";
        this.webDriverThreadLocal = new ThreadLocal<>();
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
        if (webDriverThreadLocal.get() == null) {
            this.webDriverThreadLocal.set(driver);
        }
    }

    public WebDriver getWebDriver() {
        return webDriverThreadLocal.get();
    }
}



