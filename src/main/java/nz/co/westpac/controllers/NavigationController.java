package nz.co.westpac.controllers;

import nz.co.westpac.views.KiwiSaverRetirementCalculatorView;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

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
        //WebDriverWait wait = new WebDriverWait(this.driver, 20);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[1]")));
        this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return this.driver.findElement(By.xpath("//iframe[1]"));
    }

    public WebElement getKiwiSaverRetirementCalculatorInformationIconCurrentAge() {
        WebDriverWait wait = new WebDriverWait(this.driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@help-id='CurrentAge']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button")));
        return this.driver.findElement(By.xpath("//div[@help-id='CurrentAge']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button"));
    }

    public WebElement getKiwiSaverCurrentAgeTextField() {
        return this.driver.findElement(By.xpath("//div[@label='Current age']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[@type='text']"));
    }

    public WebElement getKiwiSaverSalary(){
       return  this.driver.findElement(By.xpath("//div[@label='Salary or wages per year (before tax)']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[@type='text']"));
    }
    public WebElement getKiwiSaverEmploymentStatus() {
        WebDriverWait wait = new WebDriverWait(this.driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@label='Employment status']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")));
        return this.driver.findElement(By.xpath("//div[@label='Employment status']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
    }

    public WebElement getKiwiSaverEmploymentStatusEmployed(){
        WebDriverWait wait = new WebDriverWait(this.driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@label='Employment status']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul/li[1]/div[1]")));
        return  this.driver.findElement(By.xpath("//div[@label='Employment status']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul/li[1]/div[1]"));
    }

    public WebElement getKiwiSaverEmploymentStatusSelfEmployed(){
        WebDriverWait wait = new WebDriverWait(this.driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@label='Employment status']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul/li[2]/div[1]")));
        return  this.driver.findElement(By.xpath("//div[@label='Employment status']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul/li[2]/div[1]"));
    }

    public WebElement getKiwiSaverEmploymentStatusNotEmployed(){
        WebDriverWait wait = new WebDriverWait(this.driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@label='Employment status']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul/li[3]/div[1]")));
        return  this.driver.findElement(By.xpath("//div[@label='Employment status']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul/li[3]/div[1]"));
    }

    public WebElement getKiwiSaverMemberContributionFour() {
        return this.driver.findElement(By.xpath("//div[@label='KiwiSaver member contribution']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/label/span/input[@id='radio-option-04F']"));
    }

    public WebElement getKiwiSaverRiskProfileDefensive() {
        return this.driver.findElement(By.xpath("//div[@label='Risk profile']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label/span/input[@id='radio-option-013']"));
    }

    public WebElement getKiwiSaverRetirementCalculatorSubmit() {
        return this.driver.findElement(By.xpath("//div[@class='widget-body']/div[1]/div[2]/button[@class='btn-results-reveal']"));
    }

    public WebElement getKiwiSaverBalance() {
        return this.driver.findElement(By.xpath("//div[@help-id='KiwiSaverBalance']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[@type='text']"));
    }

    public WebElement getVoluntaryContribution(){
       return this.driver.findElement(By.xpath("//div[@help-id='VoluntaryContributions']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[@type='text']"));
    }

    public  WebElement getVoluntaryContributionFrequency(){
       return this.driver.findElement(By.xpath("//div[@help-id='VoluntaryContributions']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]"));
    }


    public WebElement getVoluntaryConributionWeekly(){
        return this.driver.findElement(By.xpath("//div[@help-id='VoluntaryContributions']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul/li[2]"));
    }

    public WebElement getVoluntaryConributionFortnightly(){
       return this.driver.findElement(By.xpath("//div[@help-id='VoluntaryContributions']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul/li[3]"));
    }

    public WebElement getVoluntaryConributionMonthly(){
        return this.driver.findElement(By.xpath("//div[@help-id='VoluntaryContributions']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul/li[4]"));
    }

    public WebElement getVoluntaryContributionAnnually(){
       return this.driver.findElement(By.xpath("//div[@help-id='VoluntaryContributions']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul/li[5]"));
    }

    public WebElement getRiskProfileConservative(){
        return this.driver.findElement(By.xpath("//div[@help-id='RiskProfile']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/label/span[1]/input[@id='radio-option-016']"));
    }

    public WebElement getRiskProfileBalanced(){
        return this.driver.findElement(By.xpath("//div[@help-id='RiskProfile']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/label/span[1]/input[@id='radio-option-019']"));
    }

    public WebElement getRiskProfileGrowth(){
        return this.driver.findElement(By.xpath("//div[@help-id='RiskProfile']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/label/span[1]/input[@id='radio-option-01C']"));
    }

    public WebElement getSavingsGoal(){
        return this.driver.findElement(By.xpath("//div[@help-id='SavingsGoal']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[@type='text']"));
    }

    public WebElement getInformationIconElement(){
       return  this.driver.findElement(By.xpath("//div[@class ='message-row ng-scope']/div[1]/p[1]"));
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
                WebElement currentAgeButton = getKiwiSaverRetirementCalculatorInformationIconCurrentAge();
                currentAgeButton.click();
            }
        }

        public void EnterCurrentAge (String currentAge){
            driver.switchTo().frame(getKiwiSaverRetirementCalculatorIframe());
            getKiwiSaverCurrentAgeTextField().sendKeys(currentAge);
        }

         public void ChooseEmploymentStatus (String employmentStatus){
             //driver.switchTo().frame(getKiwiSaverRetirementCalculatorIframe());
             WebElement kiwiSaverEmploymentStatusElement = getKiwiSaverEmploymentStatus();
             kiwiSaverEmploymentStatusElement.click();

             switch (employmentStatus){
                 case "Employed":
                    WebElement kiwiSaverEmployedElement = getKiwiSaverEmploymentStatusEmployed();
                     kiwiSaverEmployedElement.click();
                 case "Self-employed":
                     WebElement kiwiSaverSelfEmployedElement = getKiwiSaverEmploymentStatusSelfEmployed();
                     kiwiSaverSelfEmployedElement.click();
                 case "Not employed":
                     WebElement kiwiSaverNotEmployedElement = getKiwiSaverEmploymentStatusNotEmployed();
                     kiwiSaverNotEmployedElement.click();

             }

         }

         public void EnterSalary(String salary){
             if(StringUtils.isNotBlank(salary)) {
                 getKiwiSaverSalary().sendKeys(salary);
             }
         }

         public void ChooseKiwiSaverContribution (String kiwiSaverContribution){
             WebElement kiwiSaverMemberContributionFourElement = getKiwiSaverMemberContributionFour();
             kiwiSaverMemberContributionFourElement.click();
         }

         public void chooseRiskProfile (String riskProfile){
            if(StringUtils.isNotBlank(riskProfile)) {
                switch (riskProfile){
                    case "Defensive":
                         WebElement defensiveRiskProfileElement = getKiwiSaverRiskProfileDefensive();
                         defensiveRiskProfileElement.click();
                    case "Conservative":
                        WebElement conservativeRiskProfileElement = getRiskProfileConservative();
                        conservativeRiskProfileElement.click();
                    case "Balanced":
                        WebElement balancedRiskProfileElement = getRiskProfileBalanced();
                        balancedRiskProfileElement.click();
                    case "Growth":
                        WebElement growthRiskProfileElement = getRiskProfileGrowth();
                        growthRiskProfileElement.click();
                }
            }
         }

         public void ClickKiwiSaverSubmit(){
             WebElement kiwiSaverRetirementSubmitElement = getKiwiSaverRetirementCalculatorSubmit();
             kiwiSaverRetirementSubmitElement.click();
         }

          public void enterKiwiSaverBalance(String kiwiSaverBalance){
              if(StringUtils.isNotBlank(kiwiSaverBalance)) {
                  getKiwiSaverBalance().sendKeys(kiwiSaverBalance);
              }
          }

          public void enterSavingGoals(String savingGoals){
            if(StringUtils.isNotBlank(savingGoals)){
                WebElement savingsTextElement = getSavingsGoal();
                savingsTextElement.sendKeys(savingGoals);
            }
          }

          public void entersVoluntaryContribution(String voluntaryContribution, String voluntaryContributionFrequency ){

            if(StringUtils.isNotBlank(voluntaryContribution) && StringUtils.isNotBlank(voluntaryContributionFrequency)){
                WebElement voluntaryContributionElement = getVoluntaryContribution();
                WebElement voluntaryContributionFrequencyElement = getVoluntaryContributionFrequency();
                WebElement voluntaryContributionWeeklyElement = getVoluntaryConributionWeekly();
                WebElement voluntaryContributionFortnightlyElement = getVoluntaryConributionFortnightly();
                WebElement voluntaryContributionMonthlyElement = getVoluntaryConributionMonthly();
                WebElement voluntaryContributionAnnuallyElement = getVoluntaryContributionAnnually();
                voluntaryContributionElement.sendKeys(voluntaryContribution);
                voluntaryContributionFrequencyElement.click();
                switch (voluntaryContributionFrequency){
                    case "Weekly":
                        voluntaryContributionWeeklyElement.click();
                    case "Fortnightly":
                        voluntaryContributionFortnightlyElement.click();
                    case "Monthly":
                        voluntaryContributionMonthlyElement.click();
                    case "Annually":
                        voluntaryContributionAnnuallyElement.click();

                }

            }

          }

          public void assertMessageDisplayed(){
           String expectedMessage = "This calculator has an age limit of 64 years old as you need to be under the age of 65 to join KiwiSaver.";
           String actualMessage = getInformationIconElement().getText();
           assert(expectedMessage).equals(actualMessage);

          }


    public WebDriver getWebDriver () {
       return webDriverThreadLocal.get();
    }

   }



