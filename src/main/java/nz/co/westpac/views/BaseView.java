package nz.co.westpac.views;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Step definition class for  NavigateToKiwiSaverRetirementCalculator Step definition.
 * Author: Ashika Mariasingam
 */
public class BaseView {

    protected final WebDriver driver;
    protected Logger log = LoggerFactory.getLogger(BaseView.class);

    public BaseView(final WebDriver driver) {
        this.driver = driver;
    }
}
