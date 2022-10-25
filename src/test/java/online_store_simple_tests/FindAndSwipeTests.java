package online_store_simple_tests;

import org.testng.annotations.Test;
import steps.BaseTest;

import static steps.BaseTest.Direction.*;

public class FindAndSwipeTests extends BaseTest {

    @Test(description = "Verify swipe functionality")
    public void simpleSwipe() {
        previewStep.onPreviewScreen();
        swipeScreen(UP, 500);
        previewStep.waitHomePage();
        swipeScreen(DOWN, 500);
        swipeScreen(LEFT, 500);
        swipeScreen(RIGHT, 500);
        swipeScreen(UP, 500);
        previewStep.onPreviewScreen();
    }

    @Test(description = "Find first xiaomi product after sorting in ascending price")
    public void sortingInSearchResults() {
        previewStep.onPreviewScreen();
        swipeScreen(UP, 500);
        previewStep.waitHomePage();
        swipeScreen(DOWN, 500);
        previewStep.waitBottomBar();
        previewStep.tapOnSearchButton();
        categoryStep.onCategoryScreen();
        categoryStep.waitCategoryPage();
        categoryStep.tapOnElectronicsButton();
        categoryStep.waitElectronicsPage();
        electronicsStep.onElectronicsScreen();
        electronicsStep.tapOnXiaomi();
        xiaomiStep.onXiaomiScreen();
        xiaomiStep.waitXiaomiPage();
        xiaomiStep.tapOnAllCategory();
        xiaomiStep.waitXiaomiPage();
        xiaomiStep.tapOnSortButton();
        xiaomiStep.waitPopUp();
        xiaomiStep.tapOnAscButton();
        xiaomiStep.waitXiaomiPage();
        xiaomiStep.tapOnFirstElement();
        firstElementStep.onFirstElementScreen();
        firstElementStep.waitFirstElementPage();
    }
}
