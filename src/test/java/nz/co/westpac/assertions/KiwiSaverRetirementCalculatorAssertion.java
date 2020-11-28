package nz.co.westpac.assertions;

import org.apache.commons.lang3.StringUtils;

import static org.junit.Assert.assertEquals;

public class KiwiSaverRetirementCalculatorAssertion {

    private static final String RESULT_EXAMPLE_1 = "436365";
    private static final String RESULT_EXAMPLE_2 = "259581";
    private static final String RESULT_EXAMPLE_3 = "260734";
    private static final String DISPLAYED_RESULTS = "Displayed results - ";
    private static final String SHOULD_BE = "should be";
    private static final String CURRENT_AGE_EXPECTED_INFO_MESSAGE = "This calculator has an age limit of 64 years old as you need to be under the age of 65 to join KiwiSaver.";

    public void assertCurrentAgeInfoMessage(final String actualMessage){
        assertEquals("Displayed message - ", CURRENT_AGE_EXPECTED_INFO_MESSAGE, actualMessage);
    }

    public void assertResults(final String expectedResult, final String actualResult) {
        if (StringUtils.isNotBlank(actualResult)) {
            switch (actualResult) {
                case RESULT_EXAMPLE_1:
                    assertEquals(DISPLAYED_RESULTS + actualResult + SHOULD_BE + RESULT_EXAMPLE_1, actualResult, RESULT_EXAMPLE_1);
                    break;
                case RESULT_EXAMPLE_2:
                    assertEquals(DISPLAYED_RESULTS + actualResult + SHOULD_BE + RESULT_EXAMPLE_2, actualResult, RESULT_EXAMPLE_2);
                    break;
                case RESULT_EXAMPLE_3:
                    assertEquals(DISPLAYED_RESULTS + actualResult + SHOULD_BE + RESULT_EXAMPLE_3, actualResult, RESULT_EXAMPLE_3);
                    break;
                default:
                    break;
            }
        }
    }
}