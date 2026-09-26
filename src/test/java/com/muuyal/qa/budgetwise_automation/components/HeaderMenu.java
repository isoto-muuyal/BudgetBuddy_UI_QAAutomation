package com.muuyal.qa.budgetwise_automation.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderMenu {

    private WebDriver driver;
    private HeaderItem about;
    private HeaderItem howItWorks;
    private HeaderItem contactUs;
    private HeaderItem termsAndConditions;
    private HeaderItem privacy;
    private HeaderItem buyMeACoffee;
    private HeaderItem theme;
    private HeaderItem language;
    private HeaderItem logInOut;

    public HeaderMenu(WebDriver driver) {
        this.driver = driver;
        about = new HeaderItem(this.driver, new By.ByCssSelector(""));
    }



}
