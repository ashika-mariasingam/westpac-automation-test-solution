package nz.co.westpac.testrunners;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/KiwiSaverRetirementCalculator.feature",
        glue = "nz.co.westpac.stepdefs",
        plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
        "junit:target/cucumber-reports/Cucumber.xml",
        "html:target/cucumber-reports"},
        monochrome = true
)
public class Run_KiwiSaverRetirementCalculatorTest {

}
