package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static constants.GlobalData.PREVIEW_TITLE;

@PageName(pageName = PREVIEW_TITLE)
public class PreviewScreen extends BaseScreen {

    @Required
    @FindBy(id = "main")
    private WebElement previewScreenBaseElement;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Search\"]")
    private WebElement searchButton;

    public void tapOnSearchButton() {
        searchButton.click();
    }
}
