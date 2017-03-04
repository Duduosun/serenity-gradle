package pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import utilities.Customer;

import java.util.Date;
import java.util.Optional;

public class CustomerPage extends PageObject{
    @FindBy(id = "acc2") WebElement txtCustomerName;
    @FindBy(id = "acc24") WebElement selCustomerCurrency;
    @FindBy(id = "00NU0000001JWsC") WebElement chkIsActive;
    @FindBy(id = "CF00NU0000004WMx3") WebElement txtRelatedCustomerAccount;
    @FindBy(id = "00NU0000004WMwo") WebElement selAccountLevel;
    @FindBy(id = "00NU0000004WMws") WebElement selDigitalTiering;
    @FindBy(id = "00NU0000003mnmM") WebElement txtGeoShortName;
    @FindBy(id = "00NU0000004WMxG") WebElement chkIsUltimate;

    public void set_sales_customer_details(Customer cust) {
        txtCustomerName.sendKeys(cust.getCustomerName() + new Date().getTime());
        element(selAccountLevel).selectByVisibleText(cust.getAccountLevel());
        element(selDigitalTiering).selectByVisibleText(cust.getDigitalTiering());
        txtRelatedCustomerAccount.sendKeys(cust.getRelatedCustomerAccount());
        txtGeoShortName.sendKeys(cust.getGeoShrtNm());
    }

}
