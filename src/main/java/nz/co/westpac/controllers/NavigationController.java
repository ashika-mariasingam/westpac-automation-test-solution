package nz.co.westpac.controllers;


import com.sun.jmx.snmp.ThreadContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NavigationController {

    private WebDriver driver;
    private static String webDriverPath = "./src/main/resources/drivers/";

   public NavigationController() {

   }

   public void  OpenBrowser(String browser) {
       if (browser != null && browser.equals("Chrome")) {
           System.setProperty("webdriver.chrome.driver", webDriverPath+ "/chromedriver.exe");
           this.driver = new ChromeDriver();
           driver.manage().window().maximize();
           driver.get("http://www.westpac.co.nz/");
       }

    }



    public void NavigateToKiwiSaverRetirementCalculator(){



    }


}
