package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static constants.GlobalData.FIRST_ELEMENT_TITLE;

@PageName(pageName = FIRST_ELEMENT_TITLE)
public class FirstElementScreen extends BaseScreen {

    @Required
    @FindBy(id = "main")
    private WebElement firstBaseElement;

    @FindBy(id = "product_info_current_price_label")
    private WebElement cableInfo;

    public WebElement getCableInfo() {
        return cableInfo;
    }

    public String getCableInfoText() {
        return cableInfo.getText();
    }
}
