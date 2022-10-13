package verification;

import com.google.common.base.Verify;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.asserts.SoftAssert;

import static constants.Messages.CONDITIONS_NOT_REACHED;

public class VerifySoft {

    private static final Logger logger = LogManager.getLogger(Verify.class.getName());
    private static SoftAssert softAssert = new SoftAssert();

    private static void addMessage(String message) {
        logger.info(message);

    }

    public static void verifyTrueSoft(boolean condition, String message) {
        softAssert.assertTrue(condition, message);
    }

    public static void verifyFalseSoft(boolean condition, String message) {
        softAssert.assertFalse(condition, CONDITIONS_NOT_REACHED + message);
    }

    public static void verifyEqualsSoft(int actual, int expected, String message) {
        softAssert.assertEquals(actual, expected, CONDITIONS_NOT_REACHED + message);
    }

    public static void verifyEqualsSoft(long actual, long expected, String message) {
        softAssert.assertEquals(actual, expected, CONDITIONS_NOT_REACHED + message);
    }

    public static void verifyEqualsSoft(boolean actual, boolean expected, String message) {
        softAssert.assertEquals(actual, expected, CONDITIONS_NOT_REACHED + message);
    }

    public static void verifyEqualsSoft(String actual, String expected, String message) {
        softAssert.assertEquals(actual, expected, CONDITIONS_NOT_REACHED + message);
    }

    public static void verifyFailSoft(String message) {
        softAssert.fail(message);
    }

    public static void showAllChecking() {
        try {
            softAssert.assertAll();
        } finally {
            resetSoftAssert();
        }
    }

    public static void showAllChecking(String message) {
        showAllChecking();
        addMessage(message);
    }

    public static void resetSoftAssert() {
        softAssert = new SoftAssert();
    }
}
