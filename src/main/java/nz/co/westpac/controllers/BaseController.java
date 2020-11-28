package nz.co.westpac.controllers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Base Class for all controllers.
 * Author: Ashika Mariasingam
 */
public class BaseController {

    protected WebDriver driver;
    protected final String browser;
    protected final ThreadLocal<WebDriver> webDriverThreadLocal;
    protected Logger log = LoggerFactory.getLogger(BaseController.class);

    public BaseController() {
        this.browser = "Chrome";
        this.webDriverThreadLocal = new ThreadLocal<>();
    }

    public WebDriver getWebDriver() {
        return webDriverThreadLocal.get();
    }
}



