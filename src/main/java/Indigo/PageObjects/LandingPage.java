package Indigo.PageObjects;

import Indigo.AbstractComponents.abstractComponent;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends abstractComponent {
    WebDriver driver;
    public LandingPage(WebDriver driver)
    {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//input[@placeholder='From']")
    WebElement fromInput;

    @FindBy(xpath = "//input[@placeholder='To']")
    WebElement toInput;

    @FindBy(xpath = "//input[@placeholder='Travel Dates']")
    WebElement dateInput;

    @FindBy(xpath = "//input[@placeholder='Add return trip']")
    WebElement returnDateInput;

    @FindBy(xpath = "//span[contains(text(),'Search Flight')]")
    WebElement searchFlightButton;

    public void goTo(){
        driver.get("https://aem-prod-skyplus6e.goindigo.in/");
    }

    public void searchFlight(String pickUpLoc, String dropOfLoc){
        fromInput.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        fromInput.sendKeys(pickUpLoc);
        fromInput.click();
        fromInput.clear();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        fromInput.click();
        fromInput.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
        fromInput.sendKeys(pickUpLoc);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        toInput.click();
        toInput.clear();
        toInput.sendKeys(dropOfLoc);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        dateInput.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        dateInput.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
        dateInput.sendKeys("15 Jun 2023");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        searchFlightButton.click();
    }

    public void searchFlightRoundTrip(String pickUpLoc, String dropOfLoc){
        fromInput.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        fromInput.sendKeys(pickUpLoc);
        fromInput.click();
        fromInput.clear();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        fromInput.click();
        fromInput.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
        fromInput.sendKeys(pickUpLoc);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        toInput.click();
        toInput.clear();
        toInput.sendKeys(dropOfLoc);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        dateInput.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        dateInput.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
        dateInput.sendKeys("15 Jun 2023");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        returnDateInput.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        returnDateInput.sendKeys("21 Jun 2023");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        searchFlightButton.click();
    }

}
