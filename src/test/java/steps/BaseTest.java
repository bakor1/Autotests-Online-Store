package steps;

import driver.manager.DriverManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import verification.VerifySoft;

import java.lang.reflect.Method;
import java.time.Duration;

import static constants.Configuration.APP_PACKAGE;

public class BaseTest {

    protected AppiumDriver driver;
    protected PreviewStep previewStep = new PreviewStep();
    protected CategoryStep categoryStep = new CategoryStep();
    protected ElectronicsStep electronicsStep = new ElectronicsStep();
    protected XiaomiStep xiaomiStep = new XiaomiStep();
    protected FirstElementStep firstElementStep = new FirstElementStep();

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() {

        driver = DriverManager.getDriver();
        ((AndroidDriver) driver).activateApp(APP_PACKAGE);

    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod(Method method, ITestResult result) {
        if (driver != null) {
            ((AndroidDriver) driver).terminateApp(APP_PACKAGE);
        }
    }

    public void swipeScreen(Direction dir, int pressTime) {

        VerifySoft.showAllChecking(String.format("Swiped to '%s' direction", dir));

        final int ANIMATION_TIME = 1500; // ms

        int edgeBorder = 10; // better avoid edges
        PointOption pointOptionStart, pointOptionEnd;

        // init screen variables
        Dimension dims = driver.manage().window().getSize();

        // init start point = center of screen
        pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);

        switch (dir) {
            case DOWN: // center of footer
                pointOptionEnd = PointOption.point(dims.width / 2, dims.height - edgeBorder);
                break;
            case UP: // center of header
                pointOptionEnd = PointOption.point(dims.width / 2, edgeBorder);
                break;
            case LEFT: // center of left side
                pointOptionEnd = PointOption.point(edgeBorder, dims.height / 2);
                break;
            case RIGHT: // center of right side
                pointOptionEnd = PointOption.point(dims.width - edgeBorder, dims.height / 2);
                break;
            default:
                throw new IllegalArgumentException("swipeScreen(): dir: '" + dir + "' NOT supported");
        }

        // execute swipe using TouchAction
        try {
            new TouchAction((PerformsTouchActions) driver)
                    .press(pointOptionStart)
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(pressTime)))
                    .moveTo(pointOptionEnd)
                    .release().perform();
        } catch (Exception e) {
            System.err.println("swipeScreen(): TouchAction FAILED\n" + e.getMessage());
            return;
        }

        // always allow swipe action to complete
        try {
            Thread.sleep(ANIMATION_TIME);
        } catch (InterruptedException e) {
            // ignore
        }
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT;
    }
}
