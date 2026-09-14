package com.muuyal.qa.budgetwise_automation.pages;

import com.muuyal.qa.budgetwise_automation.components.Button;
import com.muuyal.qa.budgetwise_automation.components.TextField;
import com.muuyal.qa.budgetwise_automation.shared.BaseFreshSessionTest;
import com.muuyal.qa.budgetwise_automation.testData.UsersEnum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private final TextField usernameTextField;
    private final TextField passwordTextField;
    private final Button loginButton;

    public LoginPage(WebDriver driver){
        driver.
        usernameTextField = new TextField(driver, By.cssSelector("input[data-testid='input-email']"));
        passwordTextField = new TextField(driver, By.cssSelector("input[data-testid='input-password']"));
        loginButton = new Button(driver, By.cssSelector("button[data-testid='button-submit']"));
    }

    public void login(UsersEnum user) {
        usernameTextField.clearField();
        usernameTextField.sendText(user.getUsername());
        //todo complete
        passwordTextField.clearField();
        passwordTextField.sendText(user.getPassword());

        loginButton.click();
    }

}
