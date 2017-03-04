package pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class RecordTypeSelectionPage extends PageObject{
    @FindBy(name = "new") WebElement btnNew;
    @FindBy(id = "p3") WebElement selRecordType;
    @FindBy(css = "input[value='Continue']") WebElement btnContinue;

    public void create_new_record_type(String recordType) {
        element(btnNew).waitUntilClickable();
        element(btnNew).click();
        selectFromDropdown(selRecordType, recordType);
        element(btnContinue).waitUntilClickable();
        element(btnContinue).click();
    }
}
