package com.muuyal.qa.budgetwise_automation.testData;

public enum UsersEnum {

    VALID_USER("valid_user@muuyal.tech", "mypass"),
    INVALID_USER("not_valid@muuyal.tech", "password"),
    WRONG_PASSWORD("valid_user@muuyal.tech", "wrongpassword");

    private final String username;
    private final String password;

    UsersEnum(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }
}
