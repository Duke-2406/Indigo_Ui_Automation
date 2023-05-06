package Indigo.PageObjects;

import Indigo.AbstractComponents.abstractComponent;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PassengerDetails extends abstractComponent {
    WebDriver driver;
    public PassengerDetails(WebDriver driver)
    {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='salutation0Mr.']")
    WebElement radioBtn;

    @FindBy(xpath = "//input[contains(@placeholder,'First Name')]")
    WebElement firstName;

    @FindBy(xpath = "//input[contains(@placeholder,'Last Name')]")
    WebElement lastName;

    @FindBy(xpath = "//input[@placeholder='Passport Number']")
    WebElement passportNumber;
    @FindBy(xpath = "//span[contains(text(),'Continue to Add-ons')]")
    WebElement continueBtn;

    @FindBy(xpath = "//select[@name='date']")
    WebElement selectDate;

    @FindBy(xpath = "//label[contains(text(),'Month')]//following-sibling::select")
    WebElement selectMonth;

    @FindBy(xpath = ".//select[@data-form-key='passportExpiryYear']")
    WebElement selectYear;

    @FindBy(xpath = "(//span[contains(text(),'Continue to Seat Select')])[1]")
    WebElement continueSeatBtn;

    @FindBy(xpath = "//button[contains(text(),\"I'm not Interested\")]")
    WebElement notInterestedBtn;

    @FindBy(xpath = "//div[contains(text(),'Included with Flexi Plus fare')]")
    WebElement selectMealType;

    @FindBy(xpath = "//div[contains(text(),'Included with Super 6E fare')]")
    WebElement selectSuperMealType;

    @FindBy(xpath = "//div[contains(text(),'Included with Flexi Plus fare')]/parent::div/parent::div/following-sibling::div//span[contains(text(),'Add')]")
    WebElement addMealType;

    @FindBy(xpath = "//div[contains(text(),'Included with Super 6E fare')]/parent::div/parent::div/following-sibling::div//span[contains(text(),'Add')]")
    WebElement addSuperMealType;

    @FindBy(xpath = "//div[contains(text(),'Chocolate Chip Cookies')]/following-sibling::div//button[contains(text(),'Add')]")
    WebElement addMeal;

    @FindBy(xpath = "//h3[contains(text(),'6E Tiffin (Snack and Beverage *')]/parent::div/div[contains(@class,'footer')]//span[contains(text(),'Continue')]")
    WebElement continueMealBtn;

    @FindBy(xpath = "//h3[contains(text(),'6E Tiffin (Snack and Beverage *')]/parent::div/div[contains(@class,'footer')]//span[contains(text(),'Done')]")
    WebElement doneMealBtn;

    @FindBy(xpath = "//span[contains(text(),'Okay')]")
    WebElement okayBtn;

    @FindBy(xpath = "//h4[contains(text(),'6E Tiffin')]/parent::div/parent::div/parent::div/following-sibling::div/div/div/button")
    WebElement addMealBtn;

    @FindBy(xpath = "//h4[contains(text(),'6E Prime')]/parent::div/parent::div/parent::div/following-sibling::div/div/div/button")
    WebElement addPrimeBtn;
    @FindBy(xpath = "//div[contains(text(),'Salted Cashew Nuts')]/following-sibling::div//button[contains(text(),'Add')]")
    WebElement addNuts;

    @FindBy(xpath = "//h3[contains(text(),'6E Prime')]/following-sibling::div//span[contains(text(),'Add')]/parent::button")
    WebElement addPrimeAmountBtn;

    @FindBy(xpath = "//h3[contains(text(),'6E Prime')]/following-sibling::div//span[contains(text(),'Select Meal')]")
    WebElement addSelectMealBtn;

    @FindBy(xpath = "//h3[contains(text(),'6E Prime')]/following-sibling::div//span[contains(text(),'Done')]")
    WebElement donePrimeBtn;

    @FindBy(xpath = "//h3[contains(text(),'6E ADD-ONS')]/following-sibling::div/div[@class='topup-container']/div/li[2]")
    WebElement selectSecondTrip;

    public void fillPassengerDetails(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        waitForWebElementToClickable(radioBtn);
        radioBtn.click();
        waitForWebElementToClickable(firstName);
        firstName.sendKeys("Test");
        waitForWebElementToClickable(lastName);
        lastName.sendKeys("User");
        waitForWebElementToClickable(continueBtn);
        continueBtn.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", continueSeatBtn);
        js.executeScript("arguments[0].click();", continueSeatBtn);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        waitForWebElementToClickable(notInterestedBtn);
        notInterestedBtn.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void fillPassengerDetailsSingleMeal(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        waitForWebElementToClickable(radioBtn);
        radioBtn.click();
        waitForWebElementToClickable(firstName);
        firstName.sendKeys("Test");
        waitForWebElementToClickable(lastName);
        lastName.sendKeys("User");
        waitForWebElementToClickable(continueBtn);
        continueBtn.click();
        addSingleTiffinMeal();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", continueSeatBtn);
        js.executeScript("arguments[0].click();", continueSeatBtn);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        waitForWebElementToClickable(notInterestedBtn);
        notInterestedBtn.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void fillPassengerDetailsDoubleMeal(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        waitForWebElementToClickable(radioBtn);
        radioBtn.click();
        waitForWebElementToClickable(firstName);
        firstName.sendKeys("Test");
        waitForWebElementToClickable(lastName);
        lastName.sendKeys("User");
        waitForWebElementToClickable(continueBtn);
        continueBtn.click();
        addDoubleTiffinMeal();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", continueSeatBtn);
        js.executeScript("arguments[0].click();", continueSeatBtn);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        waitForWebElementToClickable(notInterestedBtn);
        notInterestedBtn.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void fillFlexiPassengerDetails() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        waitForWebElementToClickable(radioBtn);
        radioBtn.click();
        waitForWebElementToClickable(firstName);
        firstName.sendKeys("Test");
        waitForWebElementToClickable(lastName);
        lastName.sendKeys("User");
        waitForWebElementToClickable(continueBtn);
        continueBtn.click();
        addMeal();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", continueSeatBtn);
        js.executeScript("arguments[0].click();", continueSeatBtn);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        waitForWebElementToClickable(notInterestedBtn);
        notInterestedBtn.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void fillFlexiPassengerDetailsRoundTrip() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        waitForWebElementToClickable(radioBtn);
        radioBtn.click();
        waitForWebElementToClickable(firstName);
        firstName.sendKeys("Test");
        waitForWebElementToClickable(lastName);
        lastName.sendKeys("User");
        waitForWebElementToClickable(continueBtn);
        continueBtn.click();
        addMeal();
        waitForWebElementToClickable(selectSecondTrip);
        selectSecondTrip.click();
        addMeal();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", continueSeatBtn);
        js.executeScript("arguments[0].click();", continueSeatBtn);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        waitForWebElementToClickable(notInterestedBtn);
        notInterestedBtn.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void fillSuperPassengerDetails(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        waitForWebElementToClickable(radioBtn);
        radioBtn.click();
        waitForWebElementToClickable(firstName);
        firstName.sendKeys("Test");
        waitForWebElementToClickable(lastName);
        lastName.sendKeys("User");
        waitForWebElementToClickable(continueBtn);
        continueBtn.click();
        addSuperMeal();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", continueSeatBtn);
        js.executeScript("arguments[0].click();", continueSeatBtn);
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        waitForWebElementToClickable(notInterestedBtn);
//        notInterestedBtn.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void fillSuperPassengerDetailsRoundTrip(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        waitForWebElementToClickable(radioBtn);
        radioBtn.click();
        waitForWebElementToClickable(firstName);
        firstName.sendKeys("Test");
        waitForWebElementToClickable(lastName);
        lastName.sendKeys("User");
        waitForWebElementToClickable(continueBtn);
        continueBtn.click();
        addSuperMeal();
        waitForWebElementToClickable(selectSecondTrip);
        selectSecondTrip.click();
        addSuperMeal();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", continueSeatBtn);
        js.executeScript("arguments[0].click();", continueSeatBtn);
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        waitForWebElementToClickable(notInterestedBtn);
//        notInterestedBtn.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void fillPassengerDetailsWithPrime(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        waitForWebElementToClickable(radioBtn);
        radioBtn.click();
        waitForWebElementToClickable(firstName);
        firstName.sendKeys("Test");
        waitForWebElementToClickable(lastName);
        lastName.sendKeys("User");
        waitForWebElementToClickable(continueBtn);
        continueBtn.click();
        addPrime();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", continueSeatBtn);
        js.executeScript("arguments[0].click();", continueSeatBtn);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        waitForWebElementToClickable(notInterestedBtn);
        notInterestedBtn.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void addMeal(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", selectMealType);
        js.executeScript("arguments[0].click();", addMealType);
        js.executeScript("arguments[0].scrollIntoView();", addMeal);
        js.executeScript("arguments[0].click();", addMeal);
        js.executeScript("arguments[0].click();", continueMealBtn);
    }

    public void addSuperMeal(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", selectSuperMealType);
        js.executeScript("arguments[0].click();", addSuperMealType);
        js.executeScript("arguments[0].scrollIntoView();", addMeal);
        js.executeScript("arguments[0].click();", addMeal);
        js.executeScript("arguments[0].click();", continueMealBtn);
    }

    public void addSingleTiffinMeal(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", addMealBtn);
        js.executeScript("arguments[0].click();", addMealBtn);
        js.executeScript("arguments[0].scrollIntoView();", addMeal);
        js.executeScript("arguments[0].click();", addMeal);
        js.executeScript("arguments[0].click();", continueMealBtn);
    }

    public void addDoubleTiffinMeal(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", addMealBtn);
        js.executeScript("arguments[0].click();", addMealBtn);
        js.executeScript("arguments[0].scrollIntoView();", addMeal);
        js.executeScript("arguments[0].click();", addMeal);
        js.executeScript("arguments[0].click();", addNuts);
        js.executeScript("arguments[0].click();", continueMealBtn);
    }

    public void addPrime(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", addPrimeBtn);
        js.executeScript("arguments[0].click();", addPrimeBtn);
        js.executeScript("arguments[0].scrollIntoView();", addPrimeAmountBtn);
        js.executeScript("arguments[0].click();", addPrimeAmountBtn);
        js.executeScript("arguments[0].scrollIntoView();", addSelectMealBtn);
        js.executeScript("arguments[0].click();", addSelectMealBtn);
        js.executeScript("arguments[0].click();", addMeal);
        js.executeScript("arguments[0].click();", doneMealBtn);
        js.executeScript("arguments[0].click();", donePrimeBtn);

    }

    public void informationPopUp(){
        waitForWebElementToClickable(okayBtn);
        okayBtn.click();
    }
    public void inboundFillPassengerDetails(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        waitForWebElementToClickable(radioBtn);
        radioBtn.click();
        waitForWebElementToClickable(firstName);
        firstName.sendKeys("Test");
        waitForWebElementToClickable(lastName);
        lastName.sendKeys("User");
        waitForWebElementToClickable(continueBtn);
        continueBtn.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", continueSeatBtn);
        js.executeScript("arguments[0].click();", continueSeatBtn);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void inboundRoundTripFillPassengerDetails(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        waitForWebElementToClickable(radioBtn);
        radioBtn.click();
        waitForWebElementToClickable(firstName);
        firstName.sendKeys("Test");
        waitForWebElementToClickable(lastName);
        lastName.sendKeys("User");
        waitForWebElementToClickable(passportNumber);
        passportNumber.sendKeys("123456");
        Select date = new Select(selectDate);
        date.selectByValue("10");
        Select month = new Select(selectMonth);
        month.selectByValue("6");
        Select year = new Select(selectYear);
        year.selectByValue("2031");
        waitForWebElementToClickable(continueBtn);
        continueBtn.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", continueSeatBtn);
        js.executeScript("arguments[0].click();", continueSeatBtn);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void outboundFillPassengerDetails(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        waitForWebElementToClickable(radioBtn);
        radioBtn.click();
        waitForWebElementToClickable(firstName);
        firstName.sendKeys("Test");
        waitForWebElementToClickable(lastName);
        lastName.sendKeys("User");
        waitForWebElementToClickable(passportNumber);
        passportNumber.sendKeys("123456");
        Select date = new Select(selectDate);
        date.selectByValue("10");
        Select month = new Select(selectMonth);
        month.selectByValue("6");
        Select year = new Select(selectYear);
        year.selectByValue("2031");
        waitForWebElementToClickable(continueBtn);
        continueBtn.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", continueSeatBtn);
        js.executeScript("arguments[0].click();", continueSeatBtn);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
