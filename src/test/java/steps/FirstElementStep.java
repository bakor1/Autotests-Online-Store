package steps;

import driver.manager.DriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.FirstElementScreen;
import verification.Verify;

import java.time.Duration;

import static constants.GlobalData.FIRST_ELEMENT_INFO;

public class FirstElementStep {

    protected FirstElementScreen firstElementScreen;

    @Step("On First Element Screen")
    public void onFirstElementScreen() {
        firstElementScreen = new FirstElementScreen();
    }

    @Step("Wait until first element info is displayed")
    public void waitFirstElementPage() {
        WebDriverWait webDriverWait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(firstElementScreen.getCableInfo(), FIRST_ELEMENT_INFO));
        verifyFirstElementInfoEquals(FIRST_ELEMENT_INFO);
    }

    @Step("Verify first element info equals")
    public void verifyFirstElementInfoEquals(String expectedText) {
        Verify.verifyEquals(firstElementScreen.getCableInfoText().substring(0, 3), expectedText, "Text of first element info equals: " + expectedText);
    }
}
