package StepDefinitions;

import PageObjects.LandingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.jv.Lan;
import org.openqa.selenium.WebDriver;
import utils.TestContextSetup;

import java.io.IOException;

public class xLandingPage {
    public WebDriver driver;
    TestContextSetup testContextSetup;
    LandingPage landingPage;
    public xLandingPage(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.landingPage = testContextSetup.pageObjectManager.getLandingPage();
    }
    @Given("I landed on Home Page")
    public void I_landed_on_home_Page() throws IOException {
        landingPage.goTo();
        landingPage.searchFlight();
    }
}
