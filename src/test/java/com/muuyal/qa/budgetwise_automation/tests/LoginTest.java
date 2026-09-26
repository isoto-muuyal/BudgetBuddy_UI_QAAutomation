package com.muuyal.qa.budgetwise_automation.tests;

import com.muuyal.qa.budgetwise_automation.models.User;
import com.muuyal.qa.budgetwise_automation.pages.LoginPage;
import com.muuyal.qa.budgetwise_automation.shared.BaseFreshSessionTest;
import com.muuyal.qa.budgetwise_automation.testData.Environment;
import com.muuyal.qa.budgetwise_automation.testData.UsersEnum;
import org.testng.annotations.Test;

public class LoginTest extends BaseFreshSessionTest  {

    LoginPage loginPage = new LoginPage(driver);

    @Test
    private void validLogin(){
        User user = Environment.getUser(UsersEnum.VALID_USER);
        loginPage.login(user);
    }

}
