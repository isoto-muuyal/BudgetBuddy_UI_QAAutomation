package com.muuyal.qa.budgetwise_automation.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TextField extends BaseComponent{


    public TextField(WebDriver driver, By locator) {
        super(driver);
        super.function = ExpectedConditions.visibilityOfElementLocated(locator);
    }

    private WebElement getElement(){
        return wait.until(function);
    }

    public void sendText(String text){
       getElement().sendKeys(text);
    }

    public void clearField(){
        getElement().clear();
    }

}
