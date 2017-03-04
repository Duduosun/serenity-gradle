package features.Store;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.Store.NewStoreSteps;

@RunWith(SerenityRunner.class)
public class NewStoreSpec {
    @Managed(driver="chrome")
    WebDriver driver;

    @Steps
    NewStoreSteps newStoreSteps;

    @Before
    public void setup() {
        driver.get(System.getProperty("webdriver.base.url"));
    }

    @Test
    public void adding_stores() {

        newStoreSteps.open_new_store_page("Nike Only Store");

    }

}
