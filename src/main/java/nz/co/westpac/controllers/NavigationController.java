package nz.co.westpac.controllers;

import nz.co.westpac.views.KiwiSaverRetirementCalculatorView;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class NavigationController {

    private WebDriver driver;
    private final String browser;
    public ThreadLocal<WebDriver> webDriverThreadLocal;
   // private final KiwiSaverRetirementCalculatorView kiwiSaverRetirementCalculator = new KiwiSaverRetirementCalculatorView();



   public NavigationController() {
       this.browser = "Chrome";
       this.webDriverThreadLocal = new ThreadLocal<>();
       System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
       this.driver = new ChromeDriver();
       if (webDriverThreadLocal.get() == null) {
          this.webDriverThreadLocal.set(driver);
      }
   }

   public void OpenURL() {
           this.driver.manage().window().maximize();
           this.driver.get("http://www.westpac.co.nz/");
       }

    public WebElement getKiwiSaverMenuTab() {
        return this.driver.findElement(By.xpath("//a[@id='ubermenu-section-link-kiwisaver-ps']"));
    }

    public WebElement getKiwiSaverLink() {
        return this.driver.findElement(By.xpath("//a[@id='ubermenu-item-cta-kiwisaver-calculators-ps']"));
    }

    public WebElement getKiwiSaverRetirementCalculatorLink() {
        return this.driver.findElement(By.xpath("//a[@id=\"responsive-children-title-3956-ps\"]"));
    }

    public WebElement getKiwiSaverRetirementCalculatorIframe() {
        return this.driver.findElement(By.xpath("//iframe[1]"));
    }

    public WebElement getKiwiSaverRetirementCalculatorInformationIconCurrentAge() {
        return this.driver.findElement(By.xpath("//div[@help-id='CurrentAge']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button[@class='icon-target-help-toggle']"));
    }


       public void NavigateToKiwiSaverRetirementCalculator () {

          WebElement kiwi = getKiwiSaverMenuTab();
          Actions action = new Actions(driver);
          action.moveToElement(kiwi).perform();
          getKiwiSaverLink().click();
          getKiwiSaverRetirementCalculatorLink().click();
       }


        public void ClickOnInformationIcon(String fieldName){
            if(fieldName == "Current Age") {
                driver.switchTo().frame(getKiwiSaverRetirementCalculatorIframe());
                getKiwiSaverRetirementCalculatorInformationIconCurrentAge().click();
            }
        }

    public WebDriver getWebDriver () {
        return webDriverThreadLocal.get();
    }

   }



