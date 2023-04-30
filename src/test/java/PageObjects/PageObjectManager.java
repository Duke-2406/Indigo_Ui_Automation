package PageObjects;

import PageObjects.FlightCatalogue;
import PageObjects.LandingPage;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    public LandingPage landingPage;
    public FlightCatalogue flightCatalogue;
    public PassengerDetails passengerDetails;
    public ConfirmationPage confirmationPage;
    public WebDriver driver;

    public PageObjectManager(WebDriver driver)
    {
        this.driver = driver;
    }



    public LandingPage getLandingPage()
    {

        landingPage= new LandingPage(driver);
        return landingPage;
    }

    public FlightCatalogue getFlightCatalogue()
    {
        flightCatalogue = new FlightCatalogue(driver);
        return flightCatalogue;
    }

    public PassengerDetails getPassengerDetails()
    {
        passengerDetails = new PassengerDetails(driver);
        return passengerDetails;
    }

    public ConfirmationPage getConfirmationPage()
    {
        confirmationPage = new ConfirmationPage(driver);
        return confirmationPage;
    }
}
