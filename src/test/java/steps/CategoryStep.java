package steps;

import driver.manager.DriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CategoryScreen;

import java.time.Duration;

public class CategoryStep {

    protected CategoryScreen categoryScreen;

    @Step("On Category Screen")
    public void onCategoryScreen() {
        categoryScreen = new CategoryScreen();
    }

    @Step("Tap on Electronics category")
    public void tapOnElectronicsButton() {
        categoryScreen.tapOnElectronicsButton();
    }

    @Step("Tap on K-Pop category")
    public void tapOnKPopButton() {
        categoryScreen.tapOnKPopButton();
    }

    @Step("Wait until Electronics page is displayed")
    public void waitElectronicsPage() {
        WebDriverWait webDriverWait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(new By.ById("container")));
    }

    @Step("Wait until Category page is displayed")
    public void waitCategoryPage() {
        WebDriverWait webDriverWait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(new By.ById("pager")));
    }
}
