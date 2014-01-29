import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class StringCalculatorTest {
    @Test
    public void tddWorks() {
        Assert.assertTrue(true);
    }

    @Test
    public void emptyStringShouldReturnZero() {
        assertEquals(0, new StringCalculator("").calculate());
    }

    @Test
    public void oneNumberShouldEvaluateToItself() {
        assertEquals(23, new StringCalculator("23").calculate());
    }

    @Test
    public void onTwoNumbersSepByCommaItShouldReturnTheirSum() {
        assertEquals(7, new StringCalculator("2,5").calculate());
        assertEquals(11, new StringCalculator("2,9").calculate());
    }

    @Test
    public void onThreeNumbersSepByCommaItShouldReturnTheirSum() {
        assertEquals(17, new StringCalculator("2,5,10").calculate());
        assertEquals(30, new StringCalculator("20,9,1").calculate());
    }

    @Test
    public void oneNumberWithCommaShouldEvaluateToTheNumber() {
        assertEquals(2, new StringCalculator(",2").calculate());
        assertEquals(2, new StringCalculator("2,").calculate());
    }

    @Test
    public void allowNewLineInsteadOfComma() {
        assertEquals(7, new StringCalculator("2\n5").calculate());
    }

    @Test
    public void allowArbitrarySeparator() {
        assertEquals(3, new StringCalculator("//;\n1;2").calculate());
    }

    @Test(expected = NegativeNumberException.class)
    public void negativeNumbersShouldThrowException() {
        new StringCalculator("-2,3,4").calculate();
    }

    @Test
    public void negativeNumberShouldLaunchExceptionWithMessage() {
        try {
            new StringCalculator("-2").calculate();
        } catch(NegativeNumberException e) {
            Assert.assertEquals("negatives not allowed -2", e.getMessage());
        }
    }

    @Test
    public void negativeNumbersShouldLaunchExceptionWithMessage() {
        try {
            new StringCalculator("-2,-5").calculate();
        } catch(NegativeNumberException e) {
            Assert.assertEquals("negatives not allowed -2 -5", e.getMessage());
        }
    }
}
