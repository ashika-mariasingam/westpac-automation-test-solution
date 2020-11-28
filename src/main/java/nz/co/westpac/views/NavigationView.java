package nz.co.westpac.views;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class NavigationView extends BaseView {

    public WebElement getKiwiSaverMenuTab() {
        return this.driver.findElement(By.xpath("//a[@id='ubermenu-section-link-kiwisaver-ps']"));
    }

    public WebElement getKiwiSaverLink() {
        return this.driver.findElement(By.xpath("//a[@id='ubermenu-item-cta-kiwisaver-calculators-ps']"));
    }

    public WebElement getKiwiSaverRetirementCalculatorLink() {
        return this.driver.findElement(By.xpath("//a[@id=\"responsive-children-title-3956-ps\"]"));
    }


}
