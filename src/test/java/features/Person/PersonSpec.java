package features.Person;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import steps.Person.PersonSteps;

@Narrative(text={"In order to test something",
        "As a SalesForce Admin",
        "I want to be able to search for flights between specific destinations"})
@RunWith(SerenityRunner.class)
public class PersonSpec {

    @Managed(driver="chrome")
    WebDriver driver;

    @Steps
    PersonSteps personSteps;

    @Before
    public void setup() {
        driver.get(System.getProperty("webdriver.base.url"));
    }

    @Test
    public void adding_person() {
        personSteps.open_new_person();
    }
}
