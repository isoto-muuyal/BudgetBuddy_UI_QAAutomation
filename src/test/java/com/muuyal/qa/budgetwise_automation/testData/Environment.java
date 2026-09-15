package com.muuyal.qa.budgetwise_automation.testData;

import com.muuyal.qa.budgetwise_automation.models.User;

public final class Environment {

    public static final String BASE_URL = "https://budgetwise.muuyal.tech/";

    private Environment() {

    }

    public static User getUser(UsersEnum usersEnum) {
        return new User(System.getenv(usersEnum.getId()),
                System.getenv(usersEnum.getId() + "_PASSWORD"));
    }

}
