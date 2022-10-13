package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static constants.GlobalData.ELECTRONICS_TITLE;

@PageName(pageName = ELECTRONICS_TITLE)
public class ElectronicsScreen extends BaseScreen {

    @Required
    @FindBy(id = "main")
    private WebElement electronicsScreenBaseElement;

    @FindBy(xpath = ("//android.view.ViewGroup[4]"))
    private WebElement xiaomiButton;

    public void tapOnXiaomiButton() {
        xiaomiButton.click();
    }
}
