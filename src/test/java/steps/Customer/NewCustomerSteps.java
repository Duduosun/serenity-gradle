package steps.Customer;

import net.thucydides.core.annotations.Step;
import pages.CustomerPage;
import pages.NavigationTabsPage;
import steps.BaseSteps;
import utilities.Customer;
import utilities.Tabs;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class NewCustomerSteps extends BaseSteps {

    NavigationTabsPage tabsPage;
    CustomerPage customerPage;


    @Step
    public void set_customer_record_type(String recordType) {

        tabsPage.navigate_to_tab(Tabs.CUSTOMERS);
        set_record_type(recordType);
    }

    @Step
    public void create_new_customer(String recordType, List<Customer> customers) {
        switch (recordType) {
            case "Sales Customer":
                set_sales_customer_data(customers);
                break;
        }

    }

    @Step
    public void set_sales_customer_data(List<Customer> customers) {
        Customer a = customers.stream()
                .filter(x -> "Sales Customer".equals(x.getCustomerType()))
                .findAny()
                .orElse(null);
        if (a != null) {
            customerPage.set_sales_customer_details(a);
        }
    }

}
