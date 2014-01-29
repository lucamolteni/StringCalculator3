import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TokenGeneratorTest {
    TokenGenerator tokenGenerator;

    @Before
    public void setUp() {
        tokenGenerator = new TokenGenerator();
    }

    @Test
    public void onOneNumbersSepByCommaThereShouldBeTwoTokens() {
        assertEquals(2, tokenGenerator.generateTokens(",2").length);
    }

    @Test
    public void twoNumbersDividedByCommaShouldHaveTwoTokens() {
        assertEquals(2, tokenGenerator.generateTokens("2,5").length);
    }
}
