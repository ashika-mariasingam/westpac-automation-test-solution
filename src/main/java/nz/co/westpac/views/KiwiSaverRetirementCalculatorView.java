package nz.co.westpac.views;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class KiwiSaverRetirementCalculatorView extends BaseView {

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

    public WebElement getKiwiSaverSalary() {
        return this.driver.findElement(By.xpath("//div[@label='Salary or wages per year (before tax)']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[@type='text']"));
    }

    public WebElement getKiwiSaverEmploymentStatus() {
        WebDriverWait wait = new WebDriverWait(this.driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@label='Employment status']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")));
        return this.driver.findElement(By.xpath("//div[@label='Employment status']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
    }

    public WebElement getKiwiSaverEmploymentStatusEmployed() {
        WebDriverWait wait = new WebDriverWait(this.driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@label='Employment status']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul/li[1]/div[1]")));
        return this.driver.findElement(By.xpath("//div[@label='Employment status']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul/li[1]/div[1]"));
    }

    public WebElement getKiwiSaverEmploymentStatusSelfEmployed() {
        WebDriverWait wait = new WebDriverWait(this.driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@label='Employment status']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul/li[2]/div[1]")));
        return this.driver.findElement(By.xpath("//div[@label='Employment status']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul/li[2]/div[1]"));
    }

    public WebElement getKiwiSaverEmploymentStatusNotEmployed() {
        WebDriverWait wait = new WebDriverWait(this.driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@label='Employment status']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul/li[3]/div[1]")));
        return this.driver.findElement(By.xpath("//div[@label='Employment status']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul/li[3]/div[1]"));
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

    public WebElement getVoluntaryContribution() {
        return this.driver.findElement(By.xpath("//div[@help-id='VoluntaryContributions']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[@type='text']"));
    }

    public WebElement getVoluntaryContributionFrequency() {
        return this.driver.findElement(By.xpath("//div[@help-id='VoluntaryContributions']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]"));
    }


    public WebElement getVoluntaryContributionWeekly() {
        return this.driver.findElement(By.xpath("//div[@help-id='VoluntaryContributions']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul/li[2]"));
    }

    public WebElement getVoluntaryContributionFortnightly() {
        return this.driver.findElement(By.xpath("//div[@help-id='VoluntaryContributions']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul/li[3]"));
    }

    public WebElement getVoluntaryContributionMonthly() {
        return this.driver.findElement(By.xpath("//div[@help-id='VoluntaryContributions']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul/li[4]"));
    }

    public WebElement getVoluntaryContributionAnnually() {
        return this.driver.findElement(By.xpath("//div[@help-id='VoluntaryContributions']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul/li[5]"));
    }

    public WebElement getRiskProfileConservative() {
        return this.driver.findElement(By.xpath("//div[@help-id='RiskProfile']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/label/span[1]/input[@id='radio-option-016']"));
    }

    public WebElement getRiskProfileBalanced() {
        return this.driver.findElement(By.xpath("//div[@help-id='RiskProfile']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/label/span[1]/input[@id='radio-option-019']"));
    }

    public WebElement getRiskProfileGrowth() {
        return this.driver.findElement(By.xpath("//div[@help-id='RiskProfile']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/label/span[1]/input[@id='radio-option-01C']"));
    }

    public WebElement getSavingsGoal() {
        return this.driver.findElement(By.xpath("//div[@help-id='SavingsGoal']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[@type='text']"));
    }

    public WebElement getInformationIconElement() {
        return this.driver.findElement(By.xpath("//div[@class ='message-row ng-scope']/div[1]/p[1]"));
    }


}
