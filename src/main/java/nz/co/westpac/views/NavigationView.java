package nz.co.westpac.views;

import nz.co.westpac.helpers.XPathConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import nz.co.westpac.helpers.SeleniumHelper;

/**
 * View class for  Scenario 1.
 * This class contains methods to locate web elements on the kiwi-saver retirement calculator iframe.
 * Author: Ashika Mariasingam
 */
public class NavigationView extends BaseView {

    /**
     * Parameterized Constructor.
     * @param driver
     */
    public NavigationView(final WebDriver driver) {
        super(driver);
    }

    public WebElement getKiwiSaverMenuTab() {
        return SeleniumHelper.getWebElement(this.driver, XPathConstants.XPATH_KIWI_SAVER_MENU_TAB);
    }

    public WebElement getKiwiSaverLink() {
        return SeleniumHelper.getWebElement(this.driver, XPathConstants.XPATH_KIWI_SAVER_LINK);
    }

    public WebElement getKiwiSaverRetirementCalculatorLink() {
        return SeleniumHelper.getWebElement(this.driver, XPathConstants.XPATH_KIWI_SAVER_CALCULATOR_LINK);
    }

    public WebElement getKiwiSaverRetirementCalculatorIframe() {
        return SeleniumHelper.getWebElement(this.driver, XPathConstants.XPATH_IFRAME);
    }

    public WebElement getKiwiSaverRetirementCalculatorInformationIconCurrentAge() {
        return SeleniumHelper.getWebElement(this.driver, XPathConstants.XPATH_CURRANT_AGE_INFO_ICON);
    }

    public WebElement getInformationIconElement() {
        return SeleniumHelper.getWebElement(this.driver, XPathConstants.XPATH_INFORMATION_ICON);
    }
}
