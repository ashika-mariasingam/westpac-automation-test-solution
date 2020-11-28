package nz.co.westpac.controllers;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

/**
 * Base Class for all controllers.
 * Author: Ashika Mariasingam
 */
public class BaseController {

    protected WebDriver driver;
    protected ThreadLocal<WebDriver> webDriverThreadLocal;
    protected Logger log = LoggerFactory.getLogger(BaseController.class);
    protected Properties properties;

    /**
     * Default Constructor.
     */
    public BaseController() {
        try {
            this.webDriverThreadLocal = new ThreadLocal<>();
            this.properties = new Properties();
            properties.load(getClass().getClassLoader().getResourceAsStream("configs/westpac.properties"));
        } catch (Exception e) {
            log.error("Encountered error {} while initializing base controller", e.getMessage(), e);
        }
    }

    /**
     * WebDriver Getter.
     * @return
     */
    public WebDriver getWebDriver() {
        return webDriverThreadLocal.get();
    }
}



