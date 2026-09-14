package com.muuyal.qa.budgetwise_automation.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TextField extends BaseComponent{

    private final By locator;

    public TextField(WebDriver driver, By locator) {
        super(driver);
        this.locator = locator;
    }

    private WebElement getElement(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void sendText(String text){
       getElement().sendKeys(text);
    }

    public void clearField(){
        getElement().clear();
    }

}
