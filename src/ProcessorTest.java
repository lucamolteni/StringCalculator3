import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProcessorTest {

    private Processor processor;

    @Before
    public void setUp() throws Exception {
        processor = new Processor();
    }

    @Test
    public void sumOfEmptyStringAndThreeShouldBeThree() {
        Assert.assertEquals(3, processor.sumTokens("", "3"));
    }

    @Test
    public void emptyTokenShouldBeIgnored() {
        Assert.assertEquals(7, processor.sumTokens("2", "", "", "5"));
    }

    @Test(expected = NegativeNumberException.class)
    public void negativeNumbersShouldLaunchException() {
        processor.sumTokens("-2");
    }
}
