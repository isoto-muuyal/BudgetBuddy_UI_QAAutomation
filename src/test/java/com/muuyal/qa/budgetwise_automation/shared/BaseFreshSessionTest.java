package com.muuyal.qa.budgetwise_automation.shared;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseFreshSessionTest {

    WebDriver driver;
    Actions actions;

    @BeforeMethod
    void setup() {
        driver = new ChromeDriver();
        actions =  new Actions(driver);
        driver.manage().window().maximize();
    }

    @AfterMethod
    void tearDown() {
        if (driver != null){
            driver.quit();
        }
    }

}
