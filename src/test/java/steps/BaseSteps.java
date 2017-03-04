package steps;

import com.fasterxml.jackson.databind.ObjectMapper;
import net.thucydides.core.annotations.Step;
import pages.RecordTypeSelectionPage;
import utilities.Customer;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class BaseSteps {
    RecordTypeSelectionPage recordTypeSelectionPage;

    @Step
    public void set_record_type(String recordType) {
        recordTypeSelectionPage.create_new_record_type(recordType);
    }

    @Step
    public Customer[] get_Customer_data() {
        ObjectMapper mapper = new ObjectMapper();
        URL url = this.getClass().getResource("/customers.json");
        File f = new File(url.getPath());
        try {
            return mapper.readValue(f, Customer[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
