package steps.Person;

import net.thucydides.core.annotations.Step;
import pages.LoginPage;
import pages.NavigationTabsPage;
import utilities.Tabs;

public class PersonSteps {

    NavigationTabsPage tabsPage;

    @Step
    public void open_new_person() {
        tabsPage.navigate_to_tab(Tabs.PERSONS);
    }
}
