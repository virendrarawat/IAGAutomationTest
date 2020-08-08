package steps;

import PonchoWebObjects.Poncho_QuotePage;
import com.thoughtworks.gauge.Step;
import drivers.Driver;
import org.openqa.selenium.Keys;

public class Steps_QuotePage {

    Poncho_QuotePage New_ponchoQuotePage = new Poncho_QuotePage(Driver.driver);

    @Step("Enter First Name <FirstName>, Last Name <LastName>, Select Start Date <StartDate>")
    public void initiateQuote(String FirstName, String LastName, String StartDate) throws InterruptedException{

        Thread.sleep(5000);

        New_ponchoQuotePage.txtBox_PolicyStartFirstName.sendKeys(FirstName);

        New_ponchoQuotePage.txtBox_PolicyStartLastName.sendKeys(LastName);

        New_ponchoQuotePage.txtBox_PolicyStartDate.sendKeys(StartDate);

        New_ponchoQuotePage.txtBox_PolicyStartDate.sendKeys(Keys.ENTER);

    }

    @Step("Click Get a Quote Button.")
    public void clickGetaQuoteButton(){

        New_ponchoQuotePage.btn_GetaQuote.click();

    }





}
