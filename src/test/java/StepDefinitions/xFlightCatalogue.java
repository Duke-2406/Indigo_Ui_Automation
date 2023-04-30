package StepDefinitions;

import PageObjects.FlightCatalogue;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import utils.TestContextSetup;

public class xFlightCatalogue {
    public WebDriver driver;
    TestContextSetup testContextSetup;
    FlightCatalogue flightCatalogue;
    public xFlightCatalogue(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.flightCatalogue = testContextSetup.pageObjectManager.getFlightCatalogue();
    }
    @Then("I select My Flight")
    public void i_select_my_flight(){
        flightCatalogue.selectFlight();
    }

}
