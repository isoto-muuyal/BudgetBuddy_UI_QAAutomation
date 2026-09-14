package com.muuyal.qa.budgetwise_automation.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Button extends BaseComponent{

    By locator;

    public Button(WebDriver driver, By locator) {
        super(driver);
        this.locator = locator;
    }

    private WebElement getElement(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void click() {
        getElement().click();
    }
}
