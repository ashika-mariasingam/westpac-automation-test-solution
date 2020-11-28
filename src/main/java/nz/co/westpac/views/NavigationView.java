package nz.co.westpac.views;

import nz.co.westpac.helpers.XPathConstants;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import nz.co.westpac.helpers.WebElementReader;

/**
 * View class for  NavigateToKiwiSaverRetirementCalculator Step definition.
 * Author: Ashika Mariasingam
 */
public class NavigationView extends BaseView {

    public NavigationView(final WebDriver driver) {
        super(driver);
    }

    public WebElement getKiwiSaverMenuTab() {
        return WebElementReader.getWebElement(this.driver, XPathConstants.XPATH_KIWI_SAVER_MENU_TAB);
    }

    public WebElement getKiwiSaverLink() {
        return WebElementReader.getWebElement(this.driver, XPathConstants.XPATH_KIWI_SAVER_LINK);
    }

    public WebElement getKiwiSaverRetirementCalculatorLink() {
        return WebElementReader.getWebElement(this.driver, XPathConstants.XPATH_KIWI_SAVER_CALCULATOR_LINK);
    }

    public WebElement getKiwiSaverRetirementCalculatorIframe() {
        return WebElementReader.getWebElement(this.driver, XPathConstants.XPATH_IFRAME);
    }

    public WebElement getKiwiSaverRetirementCalculatorInformationIconCurrentAge() {
        return WebElementReader.getWebElement(this.driver, XPathConstants.XPATH_CURRANT_AGE_INFO_ICON);
    }

    public WebElement getInformationIconElement() {
        return WebElementReader.getWebElement(this.driver, XPathConstants.XPATH_INFORMATION_ICON);
    }

}
