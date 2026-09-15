package com.muuyal.qa.budgetwise_automation.pages;

import com.muuyal.qa.budgetwise_automation.components.Button;
import com.muuyal.qa.budgetwise_automation.components.HeaderMenu;
import com.muuyal.qa.budgetwise_automation.components.TextField;
import com.muuyal.qa.budgetwise_automation.models.User;
import com.muuyal.qa.budgetwise_automation.testData.PagesEnum;
import com.muuyal.qa.budgetwise_automation.testData.UsersEnum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    private final TextField usernameTextField;
    private final TextField passwordTextField;
    private final Button loginButton;
    private final HeaderMenu headerMenu;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        usernameTextField = new TextField(driver, By.cssSelector("input[data-testid='input-email']"));
        passwordTextField = new TextField(driver, By.cssSelector("input[data-testid='input-password']"));
        loginButton = new Button(driver, By.cssSelector("button[data-testid='button-submit']"));
        headerMenu = new HeaderMenu(driver);
    }

    public void open(){
        driver.get(PagesEnum.LOGIN.getPage());
    }

    public void login(User user) {
        usernameTextField.clearField();
        usernameTextField.sendText(user.username());

        passwordTextField.clearField();
        passwordTextField.sendText(user.password());

        loginButton.click();
    }

}
