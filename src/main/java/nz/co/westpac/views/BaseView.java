package nz.co.westpac.views;

import org.openqa.selenium.WebDriver;

/**
 * BaseView Class.
 * Author: Ashika Mariasingam
 */
public class BaseView {

    protected final WebDriver driver;

    /**
     * Parameterized Constructor.
     * @param driver
     */
    public BaseView(final WebDriver driver) {
        this.driver = driver;
    }
}
