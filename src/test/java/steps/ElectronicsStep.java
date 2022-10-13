package steps;

import io.qameta.allure.Step;
import pages.ElectronicsScreen;

public class ElectronicsStep {

    protected ElectronicsScreen electronicsScreen;

    @Step("On Electronics Screen")
    public void onElectronicsScreen() {
        electronicsScreen = new ElectronicsScreen();
    }

    @Step("Tap on Xiaomi category")
    public void tapOnXiaomi() {
        electronicsScreen.tapOnXiaomiButton();
    }
}
