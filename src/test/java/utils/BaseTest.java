package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


public class BaseTest {

    public WebDriver driver;

    public WebDriver WebDriverManager() throws IOException{
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//GlobalData.properties");
        Properties prop = new Properties();
        prop.load(fis);
        String url = prop.getProperty("QAUrl");
        String browser_properties = prop.getProperty("browser");
        String browser_maven=System.getProperty("browser");
        // result = testCondition ? value1 : value2

        String browser = browser_maven!=null ? browser_maven : browser_properties;
        if(driver != null)
        {
            if(browser.equalsIgnoreCase("chrome"))
            {
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver();// driver gets the life
            }
            if (browser.equalsIgnoreCase("edge")){
                WebDriverManager.edgedriver().setup();
                EdgeOptions options = new EdgeOptions();
                options.addArguments("--remote-allow-origins=*");
                driver = new EdgeDriver(options);
            }
            if(browser.equalsIgnoreCase("firefox"))
            {
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions options = new FirefoxOptions();
                options.addArguments("--remote-allow-origins=*");

                driver = new FirefoxDriver();
            }
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        return driver;
    }
}
