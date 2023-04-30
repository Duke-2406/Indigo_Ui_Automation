package StepDefinitions;

import PageObjects.ConfirmationPage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import utils.TestContextSetup;

public class xConfirmationPage {
    public WebDriver driver;
    TestContextSetup testContextSetup;
    ConfirmationPage confirmationPage;
    public xConfirmationPage(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.confirmationPage = testContextSetup.pageObjectManager.getConfirmationPage();
    }
    @Then("I confirm my flight")
    public void i_confirm_my_flight(){
        confirmationPage.confirmPage();
    }
}
