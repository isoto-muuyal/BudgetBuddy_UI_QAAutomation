package com.muuyal.qa.budgetwise_automation.testData;

import com.muuyal.qa.budgetwise_automation.models.User;

public enum UsersEnum {

    VALID_USER( "VALID_USER"),
    ADMIN_USER("ADMIN_USER"),
    INVALID_USER( "INVALID_USER"),
    WRONG_PASSWORD("WRONG_USER");

    private final String id;
    UsersEnum(String id) {
        this.id = id;
    }


    public String getId(){
        return this.id;
    }

}
