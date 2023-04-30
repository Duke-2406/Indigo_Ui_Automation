package utils;

import PageObjects.PageObjectManager;
import org.openqa.selenium.WebDriver;


import java.io.IOException;

public class TestContextSetup {

    public WebDriver driver;

    public PageObjectManager pageObjectManager;
    public BaseTest baseTest;
    public GenericUtils genericUtils;


    public TestContextSetup() throws IOException
    {
        baseTest = new BaseTest();
        pageObjectManager = new PageObjectManager(baseTest.WebDriverManager());
        genericUtils = new GenericUtils(baseTest.WebDriverManager());

    }

}
