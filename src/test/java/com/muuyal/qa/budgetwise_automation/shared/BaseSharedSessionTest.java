package com.muuyal.qa.budgetwise_automation.shared;

import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseSharedSessionTest {

    WebDriver driver;
    Actions actions;

    @BeforeClass
    void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        actions = new Actions(driver);
    }

    @AfterClass
    void tearDown(){
        if (driver != null){
            driver.quit();
        }
    }

}
