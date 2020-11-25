package nz.co.westpac.testrunners;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;



@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/resources/features/KiwiSaverRetirementCalculator.feature",
        glue = "src/test/java/stepdefenition"
        )
public class Run_KiwiSaverRetirementCalculatorTest {

}
