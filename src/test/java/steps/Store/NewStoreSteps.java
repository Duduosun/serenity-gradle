package steps.Store;

import net.thucydides.core.annotations.Step;
import pages.NavigationTabsPage;
import pages.NewStorePage;
import pages.RecordTypeSelectionPage;
import steps.BaseSteps;
import utilities.Tabs;

public class NewStoreSteps extends BaseSteps{

    NavigationTabsPage tabsPage;

    @Step
    public void open_new_store_page(String recordType) {

        tabsPage.navigate_to_tab(Tabs.STORES);
        set_record_type(recordType);
    }
}
