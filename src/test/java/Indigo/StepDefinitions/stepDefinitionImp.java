package Indigo.StepDefinitions;

import Indigo.Components.BaseTest;
import Indigo.Components.emailSend;
import Indigo.PageObjects.ConfirmationPage;
import Indigo.PageObjects.FlightCatalogue;
import Indigo.PageObjects.LandingPage;
import Indigo.PageObjects.PassengerDetails;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;


public class stepDefinitionImp extends BaseTest {

    public WebDriver driver;
    public LandingPage landingPage;
    public FlightCatalogue flightCatalogue;
    public PassengerDetails passengerDetails;
    public ConfirmationPage confirmationPage;
    @Before
    public void launchApp() throws IOException {
        driver = initializeDriver();
        landingPage = new LandingPage(driver);
        flightCatalogue = new FlightCatalogue(driver);
        passengerDetails = new PassengerDetails(driver);
        confirmationPage = new ConfirmationPage(driver);
    }

    @Given("^I landed on Home Page and search for (.+) and (.+)$")
    public void I_landed_on_home_Page(String pickUpLoc, String dropOfLoc) throws IOException{
        landingPage.goTo();
        landingPage.searchFlight(pickUpLoc, dropOfLoc);
    }

    @Given("^I redirect on Home Page and search for round trip and search for (.+) and (.+)$")
    public void i_redirect_on_home_page_and_search_for_round_trip_and_search_for (String pickUpLoc, String dropOfLoc){
        landingPage.goTo();
        landingPage.searchFlightRoundTrip(pickUpLoc, dropOfLoc);
    }

    @Then("I select My Flight")
    public void i_select_my_flight(){
        flightCatalogue.selectFlight();
        flightCatalogue.popupForPhoneNumberAndEmailID();
    }

    @Then("I select My Connecting Flight")
    public void i_select_my_connecting_flight(){
        flightCatalogue.selectConnectingFlight();
        flightCatalogue.popupForPhoneNumberAndEmailID();
    }

    @Then("I select My flexi Flight")
    public void i_select_my_flexi_flight(){
        flightCatalogue.selectFlexiFlight();
        flightCatalogue.popupForPhoneNumberAndEmailIDFlexi();
    }

    @Then("I select My super Flight")
    public void i_select_my_super_flight(){
        flightCatalogue.selectSuperFlight();
        flightCatalogue.popupForPhoneNumberAndEmailIDFlexi();
    }

    @Then("I select My Flight for Inbound")
    public void i_select_my_flight_for_inbound(){
        flightCatalogue.selectFlight();
        flightCatalogue.inboundPopupForPhoneNumberAndEmailID();
    }

    @Then("I select My Flight for Round Trip")
    public void i_select_my_flight_for_round_trip(){
        flightCatalogue.selectBothFlight();
        flightCatalogue.popupForPhoneNumberAndEmailID();
    }

    @Then("I select My Flexi Flight for Round Trip")
    public void i_select_my_flexi_flight_for_round_trip(){
        flightCatalogue.selectBothFlexiFlight();
        flightCatalogue.popupForPhoneNumberAndEmailIDFlexi();
    }

    @Then("I select My Super Flight for Round Trip")
    public void i_select_my_super_flight_for_round_trip(){
        flightCatalogue.selectBothSuperFlight();
        flightCatalogue.popupForPhoneNumberAndEmailIDFlexi();
    }


    @Then("I select My Flight for Inbound Round Trip")
    public void i_select_my_flight_for_inbound_round_trip(){
        flightCatalogue.selectBothFlight();
        flightCatalogue.inboundPopupForPhoneNumberAndEmailID();
    }

    @Then("I select My Flight with infant child")
    public void i_select_my_flight_with_infant_child(){
        flightCatalogue.selectInfant();
        flightCatalogue.selectFlight();
        flightCatalogue.popupForPhoneNumberAndEmailID();
    }

    @Then("I select My Flight with senior citizen")
    public void i_select_my_flight_with_senior_citizen(){
        flightCatalogue.selectSeniorCitizen();
        flightCatalogue.selectFlight();
        flightCatalogue.popupForPhoneNumberAndEmailID();
    }

    @Then("I select My Flight with multiple passenger")
    public void i_select_my_flight_with_multiple_passenger(){
        flightCatalogue.selectMultiplePassenger();
        flightCatalogue.selectFlight();
        flightCatalogue.popupForPhoneNumberAndEmailID();
    }

    @Then("I select My Flight with infant child for round trip")
    public void i_select_my_flight_with_infant_child_for_round_trip(){
        flightCatalogue.selectInfant();
        flightCatalogue.selectBothFlight();
        flightCatalogue.popupForPhoneNumberAndEmailID();
    }

    @Then("I select My Flight with senior citizen for round trip")
    public void i_select_my_flight_with_senior_citizen_for_round_trip(){
        flightCatalogue.selectSeniorCitizen();
        flightCatalogue.selectBothFlight();
        flightCatalogue.popupForPhoneNumberAndEmailID();
    }

    @Then("I select My Flight with multiple passenger for round trip")
    public void i_select_my_flight_with_multiple_passenger_for_round_trip(){
        flightCatalogue.selectMultiplePassenger();
        flightCatalogue.selectBothFlight();
        flightCatalogue.popupForPhoneNumberAndEmailID();
    }

    @Then("I select My Flight for student")
    public void i_select_my_flight_for_student(){
        flightCatalogue.selectStudent();
        flightCatalogue.selectFlight();
        flightCatalogue.popupForPhoneNumberAndEmailID();
    }

    @Then("I select My Flight for Doctor and Nurse")
    public void i_select_my_flight_for_doctor_nurse(){
        flightCatalogue.selectDoctorAndNurse();
        flightCatalogue.selectFlight();
        flightCatalogue.popupForPhoneNumberAndEmailID();
    }

    @Then("I select My Flight for Armed Forces")
    public void i_select_my_flight_for_armed_forces(){
        flightCatalogue.selectArmedForces();
        flightCatalogue.selectFlight();
        flightCatalogue.popupForPhoneNumberAndEmailID();
    }

    @Then("I select My Flight for Family and Friends")
    public void i_select_my_flight_for_family_friends(){
        flightCatalogue.selectFamilyFriends();
        flightCatalogue.selectFlight();
        flightCatalogue.popupForPhoneNumberAndEmailID();
    }

    @Then("I select My Flight for Vacinated")
    public void i_select_my_flight_for_vacinated(){
        flightCatalogue.selectVacinated();
        flightCatalogue.selectFlight();
        flightCatalogue.popupForPhoneNumberAndEmailID();
    }

    @Then("I select My Flight for Student for Round Trip")
    public void i_select_my_flight_for_student_round_trip(){
        flightCatalogue.selectStudent();
        flightCatalogue.selectBothFlight();
        flightCatalogue.popupForPhoneNumberAndEmailID();
    }

    @Then("I select My Flight for Doctor and Nurse for Round Trip")
    public void i_select_my_flight_for_doctor_nurse_round_trip(){
        flightCatalogue.selectDoctorAndNurse();
        flightCatalogue.selectBothFlight();
        flightCatalogue.popupForPhoneNumberAndEmailID();
    }

    @Then("I select My Flight for Armed Forces for Round Trip")
    public void i_select_my_flight_for_armed_forces_round_trip(){
        flightCatalogue.selectArmedForces();
        flightCatalogue.selectBothFlight();
        flightCatalogue.popupForPhoneNumberAndEmailID();
    }

    @Then("I select My Flight for Family and Friends for Round Trip")
    public void i_select_my_flight_for_family_friends_round_trip(){
        flightCatalogue.selectFamilyFriends();
        flightCatalogue.selectBothFlight();
        flightCatalogue.popupForPhoneNumberAndEmailID();
    }

    @Then("I select My Flight for Vacinated for Round Trip")
    public void i_select_my_flight_for_vacinated_round_trip(){
        flightCatalogue.selectVacinated();
        flightCatalogue.selectBothFlight();
        flightCatalogue.popupForPhoneNumberAndEmailID();
    }

    @Then("I fill passenger details")
    public void i_fill_passenger_details(){
        passengerDetails.fillPassengerDetails();
    }

    @Then("I fill passenger details and add single meal")
    public void i_fill_passenger_details_add_single_meal(){
        passengerDetails.fillPassengerDetailsSingleMeal();
    }

    @Then("I fill passenger details and add double meal")
    public void i_fill_passenger_details_add_double_meal(){
        passengerDetails.fillPassengerDetailsDoubleMeal();
    }

    @Then("I fill passenger details and add prime addon")
    public void i_fill_passenger_details_add_prime_addon(){
        passengerDetails.fillPassengerDetailsWithPrime();
        passengerDetails.informationPopUp();
    }


    @Then("I fill passenger details for flexi")
    public void i_fill_passenger_details_for_flexi(){
        passengerDetails.fillFlexiPassengerDetails();
        passengerDetails.informationPopUp();
    }

    @Then("I fill passenger details for flexi for Round Trip")
    public void i_fill_passenger_details_for_flexi_for_Round_Trip(){
        passengerDetails.fillFlexiPassengerDetailsRoundTrip();
        passengerDetails.informationPopUp();
    }

    @Then("I fill passenger details for Super")
    public void i_fill_passenger_details_for_super(){
        passengerDetails.fillSuperPassengerDetails();
        passengerDetails.informationPopUp();
    }

    @Then("I fill passenger details for Super for Round Trip")
    public void i_fill_passenger_details_for_super_for_Round_Trip(){
        passengerDetails.fillSuperPassengerDetailsRoundTrip();
        passengerDetails.informationPopUp();
    }

    @Then("I fill passenger details for Inbound")
    public void i_fill_passenger_details_for_inbound(){
        passengerDetails.inboundFillPassengerDetails();
    }

    @Then("I fill passenger details for Inbound Round Trip")
    public void i_fill_passenger_details_for_inbound_round_trip(){
        passengerDetails.inboundRoundTripFillPassengerDetails();
    }

    @Then("I fill passenger details for Outbound")
    public void i_fill_passenger_details_for_outbound(){
        passengerDetails.outboundFillPassengerDetails();
    }

    @Then("I confirm my flight")
    public void i_confirm_my_flight(){
        confirmationPage.confirmPage();
    }

    @Then("I confirm my flight with seat")
    public void i_confirm_my_flight_with_seat(){
        confirmationPage.seatSelect();
    }

    @Then("I confirm my flight with seat for Inbound")
    public void i_confirm_my_flight_with_seat_for_inbound(){
        confirmationPage.inboundSeatSelect();
    }

    @Then("I confirm my flight with seat for 1 sector")
    public void i_confirm_my_flight_with_seat_for_one_sector(){
        confirmationPage.seatSelect();
    }

    @Then("I confirm my flight with seat for both sector")
    public void i_confirm_my_flight_with_seat_for_both_sector(){
        confirmationPage.seatSelectBothSector();
    }

//    @After
//    public void AfterScenario()
//    {
//        System.out.println("browser close");
//        driver.quit();
//    }

    @After
    public void AddScreenshot(Scenario scenario) throws IOException
    {
        System.out.println("take screenshot");
        if(scenario.isFailed())
        {
            //screenshot
            File sourcePath= 	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
            scenario.attach(fileContent, "image/png", "image");

        }
        System.out.println("browser close");
        driver.quit();
    }
}
