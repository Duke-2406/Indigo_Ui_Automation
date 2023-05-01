package Indigo.PageObjects;

import Indigo.AbstractComponents.abstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class ConfirmationPage extends abstractComponent {
    WebDriver driver;
    public ConfirmationPage(WebDriver driver)
    {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[contains(text(),'Skip')]")
    WebElement skipBtn;

    @FindBy(xpath = "//span[@class='RecordLocator']")
    WebElement confirmationNumber;

    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement checkBox;

//    @FindBy(xpath = ".//div[@data-designator='1A']/button")
//    WebElement seatNumber;


    public List<WebElement> getDynamicSeat(String SystemName){
        return driver.findElements(By.xpath("//div[contains(@class,'open') and @data-designator='"+SystemName+"']//button"));
    }

    @FindBy(xpath = ".//span[contains(text(),'OK')]")
    WebElement okBtn;

    @FindBy(xpath = ".//span[contains(text(),'Continue to Payment')]")
    WebElement continueToPayment;

    public void confirmPage(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", skipBtn);
        js.executeScript("arguments[0].click();", skipBtn);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        js.executeScript("arguments[0].scrollIntoView();", checkBox);
//        js.executeScript("arguments[0].click();", checkBox);
//        boolean isElementEnabled = false;
//        if(confirmationNumber.getText().isEmpty()){
//            isElementEnabled = true;
//        }
//        Assert.assertTrue(isElementEnabled);
        String title = driver.getTitle();
        Assert.assertEquals(title, "Book flights Online for Domestic and International - IndiGo");
    }

    public void seatSelect(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        char[] row = {'A','B','C','D','E','F'};
        for(int i=1;i<=30;i++){
            int j = 0;
            for( char c:row){
                j=0;
                char ch=(char)(i+'0');
                System.out.println(ch);
                String str = String.valueOf(ch) + c;
                System.out.println(str);
                if(getDynamicSeat(str).size() == 1) {
                    System.out.println("you can click on seat");
                    WebElement element = getDynamicSeat(str).get(0);
                    js.executeScript("arguments[0].scrollIntoView();", element);
                    js.executeScript("arguments[0].click();", element);
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    okBtn.click();
                    j=1;
                    break;
                }
            }
            if(j==1){break;}
        }
        js.executeScript("arguments[0].scrollIntoView();", continueToPayment);
        js.executeScript("arguments[0].click();", continueToPayment);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String title = driver.getTitle();
        Assert.assertEquals(title, "Book flights Online for Domestic and International - IndiGo");
    }
}
