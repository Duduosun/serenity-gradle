package features.Customer;

import com.fasterxml.jackson.databind.ObjectMapper;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.Customer.NewCustomerSteps;
import sun.reflect.generics.tree.Tree;
import utilities.Customer;
import java.util.Arrays;
import java.util.TreeMap;


@RunWith(SerenityRunner.class)
public class NewCustomerSpec {

    @Managed(driver="chrome")
    WebDriver driver;
    Customer[] customers;

    @Steps
    NewCustomerSteps newCustomerSteps;

    @Before
    public void setup() {
        driver.get(System.getProperty("webdriver.base.url"));
         customers = newCustomerSteps.get_Customer_data();
    }

    @Test
    @Title("Create a New Sales Customer")
    public void create_sales_customer() {
        newCustomerSteps.set_customer_record_type("Sales Customer");

        newCustomerSteps.create_new_customer("Sales Customer", Arrays.asList(customers));
    }
}
