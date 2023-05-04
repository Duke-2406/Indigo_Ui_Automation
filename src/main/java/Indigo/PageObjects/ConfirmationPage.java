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

    @FindBy(xpath = "//h5[contains(text(),'Connecting Flight')]/following-sibling::div[1]/div[2]")
    WebElement selectSecondSector;

    @FindBy(xpath = "//span[@class='RecordLocator']")
    WebElement confirmationNumber;

    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement checkBox;

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
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

//        js.executeScript("arguments[0].scrollIntoView();", checkBox);
//        js.executeScript("arguments[0].click();", checkBox);
//        System.out.println("please refresh");
//        driver.navigate().refresh();
//        System.out.println("refresh done");
//        try {
//            Thread.sleep(4000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        boolean isElementEnabled = confirmationNumber.getText().isEmpty();
//        Assert.assertFalse(isElementEnabled);

//        String title = driver.getTitle();
//        System.out.println("We are on payment page");
//        Assert.assertEquals(title, "Book flights Online for Domestic and International - IndiGo");
    }

    public void seatSelect(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String[] row = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","26","27","28","29","30"};
        String[] col = {"A","B","C","D","E","F"};
        for(String r : row){
            int j = 0;
            for(String c : col){
                j=0;
                System.out.println(r);
                String str = r + c;
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
//        js.executeScript("arguments[0].click();", continueToPayment);
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        String title = driver.getTitle();
//        Assert.assertEquals(title, "Book flights Online for Domestic and International - IndiGo");
    }

    public void seatSelectBothSector(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String[] row = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","26","27","28","29","30"};
        String[] col = {"A","B","C","D","E","F"};
        for(String r : row){
            int j = 0;
            for(String c : col){
                j=0;
                System.out.println(r);
                String str = r + c;
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
        waitForWebElementToClickable(selectSecondSector);
        selectSecondSector.click();
        for(String r : row){
            int j = 0;
            for(String c : col){
                j=0;
                System.out.println(r);
                String str = r + c;
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
//        js.executeScript("arguments[0].click();", continueToPayment);
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        String title = driver.getTitle();
//        Assert.assertEquals(title, "Book flights Online for Domestic and International - IndiGo");
    }

    public void inboundSeatSelect(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String[] row = {"12","13","14","15","16","17","18","19","20","21","22","23","24","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","53","54","55","56"};
        String[] col = {"A","B","C","D","E","F","G","H","I"};
        for(String r : row){
            int j = 0;
            for( String c:col){
                j=0;
                System.out.println(r);
                String str = r+c;
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
//        js.executeScript("arguments[0].click();", continueToPayment);
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        String title = driver.getTitle();
//        Assert.assertEquals(title, "Book flights Online for Domestic and International - IndiGo");
    }
}
