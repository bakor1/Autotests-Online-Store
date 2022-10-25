package steps;

import driver.manager.DriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.XiaomiScreen;

import java.time.Duration;


public class XiaomiStep {

    protected XiaomiScreen xiaomiScreen;

    @Step("On Xiaomi Screen")
    public void onXiaomiScreen() {
        xiaomiScreen = new XiaomiScreen();
    }

    @Step("Tap on sorting button")
    public void tapOnSortButton() {
        xiaomiScreen.tapOnSortButton();
    }
    @Step("Tap on all category button")
    public void tapOnAllCategory() {
        xiaomiScreen.tapOnAllCategory();
    }

    @Step("Tap on ascending button")
    public void tapOnAscButton() {
        xiaomiScreen.tapOnAscending();
    }

    @Step("Tap on show button")
    public void tapOnShowButton() {
        xiaomiScreen.tapOnShowButton();
    }

    @Step("Tap on first element")
    public void tapOnFirstElement() {
        xiaomiScreen.tapOnFirstElement();
    }

    @Step("Wait until Xiaomi page is displayed")
    public void waitXiaomiPage() {
        WebDriverWait webDriverWait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(new By.ById("feed_recycler")));
    }

    @Step("Wait until pop-up is displayed")
    public void waitPopUp() {
        WebDriverWait webDriverWait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(new By.ById("recycler")));
    }
}
