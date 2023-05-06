package Indigo.PageObjects;

import Indigo.AbstractComponents.abstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class FlightCatalogue extends abstractComponent {
    WebDriver driver;
    public FlightCatalogue(WebDriver driver)
    {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath=".//div[@class='fare-accordion']")
    List<WebElement> numbersOfFlight;

    @FindBy(xpath = ".//div[@class='fare-accordion']//div[contains(text(),'Connect')]")
    List<WebElement> numbersOfConnectingFlight;

    @FindBy(xpath="//p[contains(text(),'Departing flight')]/parent::div/parent::div/parent::div/following-sibling::div/div/div/div")
    List<WebElement> departingFlights;

    @FindBy(xpath = "//p[contains(text(),'Returning flight')]/parent::div/parent::div/parent::div/following-sibling::div/div/div/div")
    List<WebElement> returningFlights;

    @FindBy(xpath = "(//h3[contains(text(),'Saver')])[1]/parent::div/parent::div/parent::div//span[contains(text(),'Book')]")
    WebElement bookButton;

    @FindBy(xpath = "(.//div[@class='fare-accordion']//div[contains(text(),'Connect')])[1]/parent::div/parent::div/following-sibling::div/div[2]//h3[contains(text(),'Saver')]/parent::div/parent::div/following-sibling::button")
    WebElement connectingFlightBookButton;

    @FindBy(xpath = "(//h3[contains(text(),'Flexi')])[1]/parent::div/parent::div/parent::div//span[contains(text(),'Book')]")
    WebElement flexiBookButton;

    @FindBy(xpath = "(//h3[contains(text(),'Super')])[1]/parent::div/parent::div/parent::div//span[contains(text(),'Book')]")
    WebElement superBookButton;
    @FindBy(xpath = "(//p[contains(text(),'Departing flight')]/parent::div/parent::div/parent::div/following-sibling::div/div/div/div)[1]//h3[contains(text(),'Saver')]/parent::div/parent::div/following-sibling::button//span[contains(text(),'Book')]")
    WebElement departingFlightBookButton;

    @FindBy(xpath = "(//p[contains(text(),'Departing flight')]/parent::div/parent::div/parent::div/following-sibling::div/div/div/div)[1]//h3[contains(text(),'Flexi')]/parent::div/parent::div/following-sibling::button//span[contains(text(),'Book')]")
    WebElement departingFlexiFlightBookButton;

    @FindBy(xpath = "(//p[contains(text(),'Departing flight')]/parent::div/parent::div/parent::div/following-sibling::div/div/div/div)[1]//h3[contains(text(),'Super')]/parent::div/parent::div/following-sibling::button//span[contains(text(),'Book')]")
    WebElement departingSuperFlightBookButton;

    @FindBy(xpath = "(//p[contains(text(),'Returning flight')]/parent::div/parent::div/parent::div/following-sibling::div/div/div/div)[1]//h3[contains(text(),'Saver')]/parent::div/parent::div/following-sibling::button//span[contains(text(),'Book')]")
    WebElement returningFlightBookButton;

    @FindBy(xpath = "(//p[contains(text(),'Returning flight')]/parent::div/parent::div/parent::div/following-sibling::div/div/div/div)[1]//h3[contains(text(),'Flexi')]/parent::div/parent::div/following-sibling::button//span[contains(text(),'Book')]")
    WebElement returningFlexiFlightBookButton;

    @FindBy(xpath = "(//p[contains(text(),'Returning flight')]/parent::div/parent::div/parent::div/following-sibling::div/div/div/div)[1]//h3[contains(text(),'Super')]/parent::div/parent::div/following-sibling::button//span[contains(text(),'Book')]")
    WebElement returningSuperFlightBookButton;

    @FindBy(xpath = "//span[contains(text(),'Continue')]")
    WebElement continueBtn;

    @FindBy(xpath = "//span[contains(text(),'Skip & continue with saver fare')]")
    WebElement skipButton;

    @FindBy(xpath = "//span[contains(text(),'Enter Country Code')]/parent::div//input[@placeholder='Enter Mobile No.']")
    WebElement mobileNumberInput;

    @FindBy(xpath = "//h2[contains(text(),'Contact Details')]/parent::div//input[@placeholder='Email ID']")
    WebElement emailIDInput;

    @FindBy(xpath = "//span[contains(text(),'Next')]")
    WebElement nextBtn;

    @FindBy(xpath = ".//span[contains(text(),'Special fares')]/parent::button/parent::div/parent::div/preceding-sibling::div[contains(@class,'paxType')]/div/div/button")
    WebElement passengerDropdown;

    @FindBy(xpath = ".//div[contains(@class,'pax-selection')]/div[contains(@class,'pax-dropdown')]/div[5]//button[contains(@class,'plus')]")
    WebElement infantPlusBtn;

    @FindBy(xpath = ".//div[contains(@class,'pax-selection')]/div[contains(@class,'pax-dropdown')]/div[3]//button[contains(@class,'plus')]")
    WebElement seniorCitizen;

    @FindBy(xpath = ".//div[contains(@class,'pax-selection')]/div[contains(@class,'pax-dropdown')]/div[2]//button[contains(@class,'plus')]")
    WebElement multiplePassenger;

    @FindBy(xpath = ".//span[contains(text(),'Done')]")
    WebElement doneBtn;

    @FindBy(xpath = "//span[contains(text(),'Ok')]")
    WebElement okBtn;

    @FindBy(xpath = "//span[contains(text(),'Special fares')]/parent::button")
    WebElement specialFare;

    @FindBy(xpath = "//li[@data-value='STU']//span[contains(text(),'Students')]")
    WebElement student;

    @FindBy(xpath = "//li[@data-value='MEDICAL']//span[contains(text(),'Doctors & Nurses')]")
    WebElement doctorAndNurse;

    @FindBy(xpath = "//li[@data-value='DFN']//span[contains(text(),'Armed Forces')]")
    WebElement armedForces;

    @FindBy(xpath = "//li[@data-value='FNF']//span[contains(text(),'Family & Friends')]")
    WebElement familyAndFriends;

    @FindBy(xpath = "//li[@data-value='VAXI']//span[contains(text(),'Vaccinated')]")
    WebElement vacinated;

    @FindBy(xpath = "//span[contains(text(),'Show more flights')]")
    WebElement showMoreFlightsBtn;

    public void selectFlight(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(numbersOfFlight.size()==0){
            Assert.assertTrue(false);

        }
        else {
            numbersOfFlight.get(0).click();
        }
        waitForWebElementToClickable(bookButton);
        bookButton.click();
    }

    public void selectFlexiFlight(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(numbersOfFlight.size()==0){
            Assert.assertTrue(false);

        }
        else {
            numbersOfFlight.get(0).click();
        }
        waitForWebElementToClickable(flexiBookButton);
        flexiBookButton.click();
    }

    public void selectSuperFlight(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(numbersOfFlight.size()==0){
            Assert.assertTrue(false);

        }
        else {
            numbersOfFlight.get(0).click();
        }
        waitForWebElementToClickable(superBookButton);
        superBookButton.click();
    }

    public void selectConnectingFlight(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", showMoreFlightsBtn);
        js.executeScript("arguments[0].click();", showMoreFlightsBtn);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(numbersOfConnectingFlight.size()==0){
            Assert.assertTrue(false);

        }
        else {
            js.executeScript("arguments[0].scrollIntoView();", numbersOfConnectingFlight.get(0));
            js.executeScript("arguments[0].click();", numbersOfConnectingFlight.get(0));
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        waitForWebElementToClickable(connectingFlightBookButton);
        connectingFlightBookButton.click();
    }

    public void selectBothFlight(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(departingFlights.size()==0){
            Assert.assertTrue(false);

        }
        else {
            departingFlights.get(0).click();
        }
        waitForWebElementToAppear(departingFlightBookButton);
        departingFlightBookButton.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(returningFlights.size()==0){
            Assert.assertTrue(false);

        }
        else {
            returningFlights.get(0).click();
        }
        waitForWebElementToAppear(returningFlightBookButton);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", returningFlightBookButton);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        continueBtn.click();
    }

    public void selectBothFlexiFlight(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(departingFlights.size()==0){
            Assert.assertTrue(false);

        }
        else {
            departingFlights.get(0).click();
        }
        waitForWebElementToAppear(departingFlexiFlightBookButton);
        departingFlexiFlightBookButton.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(returningFlights.size()==0){
            Assert.assertTrue(false);

        }
        else {
            returningFlights.get(0).click();
        }
        waitForWebElementToAppear(returningFlexiFlightBookButton);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", returningFlexiFlightBookButton);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        continueBtn.click();
    }

    public void selectBothSuperFlight(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(departingFlights.size()==0){
            Assert.assertTrue(false);

        }
        else {
            departingFlights.get(0).click();
        }
        waitForWebElementToAppear(departingSuperFlightBookButton);
        departingSuperFlightBookButton.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(returningFlights.size()==0){
            Assert.assertTrue(false);

        }
        else {
            returningFlights.get(0).click();
        }
        waitForWebElementToAppear(returningSuperFlightBookButton);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", returningSuperFlightBookButton);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        continueBtn.click();
    }

    public void popupForPhoneNumberAndEmailID(){
        waitForWebElementToClickable(skipButton);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", skipButton);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        waitForWebElementToClickable(mobileNumberInput);
        mobileNumberInput.sendKeys("1234567890");
        emailIDInput.sendKeys("test@gmail.com");
        waitForWebElementToClickable(nextBtn);
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", nextBtn);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void popupForPhoneNumberAndEmailIDFlexi(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        waitForWebElementToClickable(mobileNumberInput);
        mobileNumberInput.sendKeys("1234567890");
        emailIDInput.sendKeys("test@gmail.com");
        waitForWebElementToClickable(nextBtn);
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", nextBtn);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void inboundPopupForPhoneNumberAndEmailID(){
        waitForWebElementToClickable(mobileNumberInput);
        mobileNumberInput.sendKeys("1234567890");
        emailIDInput.sendKeys("test@gmail.com");
        waitForWebElementToClickable(nextBtn);
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", nextBtn);
    }

    public void selectInfant(){
        waitForWebElementToClickable(passengerDropdown);
        passengerDropdown.click();
        waitForWebElementToClickable(infantPlusBtn);
        infantPlusBtn.click();
        waitForWebElementToClickable(doneBtn);
        doneBtn.click();
    }

    public void selectSeniorCitizen(){
        waitForWebElementToAppear(passengerDropdown);
        waitForWebElementToClickable(passengerDropdown);
        passengerDropdown.click();
        waitForWebElementToClickable(seniorCitizen);
        seniorCitizen.click();
//        waitForWebElementToClickable(doneBtn);
//        doneBtn.click();
        waitForWebElementToClickable(okBtn);
        okBtn.click();
    }

    public void selectMultiplePassenger(){
        waitForWebElementToAppear(passengerDropdown);
        waitForWebElementToClickable(passengerDropdown);
        passengerDropdown.click();
        waitForWebElementToClickable(multiplePassenger);
        multiplePassenger.click();
        multiplePassenger.click();
        waitForWebElementToClickable(doneBtn);
        doneBtn.click();
//        waitForWebElementToClickable(okBtn);
//        okBtn.click();
    }

    public void selectStudent(){
        waitForWebElementToClickable(specialFare);
        specialFare.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", student);
        js.executeScript("arguments[0].click();", student);
        waitForWebElementToClickable(okBtn);
        okBtn.click();
    }

    public void selectDoctorAndNurse(){
        waitForWebElementToClickable(specialFare);
        specialFare.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", doctorAndNurse);
        js.executeScript("arguments[0].click();", doctorAndNurse);
        waitForWebElementToClickable(okBtn);
        okBtn.click();
    }

    public void selectArmedForces(){
        waitForWebElementToClickable(specialFare);
        specialFare.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", armedForces);
        js.executeScript("arguments[0].click();", armedForces);
        waitForWebElementToClickable(okBtn);
        okBtn.click();
    }

    public void selectFamilyFriends(){
        waitForWebElementToClickable(specialFare);
        specialFare.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", familyAndFriends);
        js.executeScript("arguments[0].click();", familyAndFriends);
//        waitForWebElementToClickable(okBtn);
//        okBtn.click();
    }

    public void selectVacinated(){
        waitForWebElementToClickable(specialFare);
        specialFare.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", vacinated);
        js.executeScript("arguments[0].click();", vacinated);
        waitForWebElementToClickable(okBtn);
        okBtn.click();
    }
}
