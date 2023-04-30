package StepDefinitions;

import PageObjects.PassengerDetails;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.TestContextSetup;

public class xPassengerDetails {
    public WebDriver driver;
    TestContextSetup testContextSetup;
    PassengerDetails passengerDetails;
    public xPassengerDetails(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.passengerDetails = testContextSetup.pageObjectManager.getPassengerDetails();
    }
    @Then("I fill passenger details")
    public void i_fill_passenger_details(){
        passengerDetails.fillPassengerDetails();
    }

}
