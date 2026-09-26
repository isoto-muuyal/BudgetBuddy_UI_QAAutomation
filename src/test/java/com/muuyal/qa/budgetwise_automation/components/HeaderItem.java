package com.muuyal.qa.budgetwise_automation.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HeaderItem extends BaseComponent{

    public HeaderItem(WebDriver driver, By locator) {
        super(driver);
        super.function = ExpectedConditions.visibilityOfElementLocated(locator);
    }

    public String getText() {
        return wait.until(function).getText();
    }

    public void click() {
        wait.until(function).click();
    }

}
