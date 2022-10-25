package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static constants.GlobalData.XIAOMI_TITLE;

@PageName(pageName = XIAOMI_TITLE)
public class XiaomiScreen extends BaseScreen {

    @Required
    @FindBy(id = "main")
    private WebElement xiaomiScreenBaseElement;

    @FindBy(xpath = "//android.view.ViewGroup[2]//android.widget.LinearLayout[1]")
    private WebElement sortButton;

    @FindBy(xpath = "//android.widget.FrameLayout[2]//android.widget.LinearLayout//android.widget.TextView[2]")
    private WebElement ascButton;

    @FindBy(id = "button_title")
    private WebElement showButton;

    @FindBy(xpath = "//android.widget.FrameLayout[2]//android.widget.FrameLayout[2]//android.widget.FrameLayout[2]//android.view.ViewGroup[1]/android.widget.FrameLayout")
    private WebElement firstElement;

    @FindBy(xpath = "//android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]//android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
    private WebElement allInThisCategoryButton;

    public void tapOnAllCategory() {
        allInThisCategoryButton.click();
    }

    public void tapOnShowButton() {
        showButton.click();
    }

    public void tapOnSortButton() {
        sortButton.click();
    }

    public void tapOnAscending() {
        ascButton.click();
    }

    public void tapOnFirstElement() {
        firstElement.click();
    }
}
