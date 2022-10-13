package steps;

import pages.PreviewScreen;
import driver.manager.DriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PreviewStep {

    protected PreviewScreen previewScreen;

    @Step("On PreviewScreen")
    public void onPreviewScreen() {
        previewScreen = new PreviewScreen();
    }

    @Step("Tap on search button on Preview screen")
    public void tapOnSearchButton() {
        previewScreen.tapOnSearchButton();
    }

    @Step("Wait until Home page is displayed")
    public void waitHomePage() {
        WebDriverWait webDriverWait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(new By.ById("feed_recycler")));
    }

    @Step("Wait until bottom bar is displayed")
    public void waitBottomBar() {
        WebDriverWait webDriverWait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(new By.ById("main_bottom_bar")));
    }
}
