package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static constants.GlobalData.CATEGORY_TITLE;

@PageName(pageName = CATEGORY_TITLE)
public class CategoryScreen extends BaseScreen {

    @Required
    @FindBy(id = "main")
    private WebElement categoryScreenBaseElement;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Electronics\"]")
    private WebElement electronicsButton;

    public void tapOnElectronicsButton() {
        electronicsButton.click();
    }

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"K-pop\"]")
    private WebElement kPopButton;

    public void tapOnKPopButton() {
        kPopButton.click();
    }
}
