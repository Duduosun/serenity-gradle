package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.WhenPageOpens;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Tabs;

public class NavigationTabsPage extends PageObject {

    @FindBy(id = "AllTab_Tab") WebElement tabAll;

    @WhenPageOpens
    public void waitUntilTitleAppears() {
        element(tabAll).waitUntilVisible();
    }

    public void navigate_to_tab(Tabs tabName) {

        element(tabAll).waitUntilClickable();
        element(tabAll).click();
        find(By.linkText(tabName.toString())).click();
    }

}
