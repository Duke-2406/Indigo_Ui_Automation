package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenericUtils;
import utils.TestContextSetup;

public class PassengerDetails {
    public WebDriver driver;
    public PassengerDetails(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='salutation0Mr.']")
    WebElement radioBtn;

    @FindBy(xpath = "//input[contains(@placeholder,'First Name')]")
    WebElement firstName;

    @FindBy(xpath = "//input[contains(@placeholder,'Last Name')]")
    WebElement lastName;

    @FindBy(xpath = "//span[contains(text(),'Continue to Add-ons')]")
    WebElement continueBtn;

    @FindBy(xpath = "(//span[contains(text(),'Continue to Seat Select')])[1]")
    WebElement continueSeatBtn;

    @FindBy(xpath = "//button[contains(text(),\"I'm not Interested\")]")
    WebElement notInterestedBtn;

    public void fillPassengerDetails(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        radioBtn.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        firstName.sendKeys("Deepak");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        lastName.sendKeys("Sihare");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        continueBtn.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", continueSeatBtn);
        js.executeScript("arguments[0].click();", continueSeatBtn);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        notInterestedBtn.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
