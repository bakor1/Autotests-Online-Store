package verification;

import org.testng.Assert;

import static constants.Messages.CONDITIONS_NOT_REACHED;

public class Verify {

    public static void verifyTrue(boolean condition, String message) {
        Assert.assertTrue(condition, CONDITIONS_NOT_REACHED + message);
    }

    public static void verifyFalse(boolean condition, String message) {
        Assert.assertFalse(condition, CONDITIONS_NOT_REACHED + message);
    }

    public static void verifyEquals(int actual, int expected, String message) {
        Assert.assertEquals(actual, expected, CONDITIONS_NOT_REACHED + message);
    }

    public static void verifyEquals(String actual, String expected, String message) {
        Assert.assertEquals(actual, expected, CONDITIONS_NOT_REACHED + message);
    }
}
