package com.muuyal.qa.budgetwise_automation.testData;

public enum PagesEnum {

    BASE(Environment.BASE_URL),
    LOGIN(Environment.BASE_URL + "/login"),
    HOME(Environment.BASE_URL + "/home");

    private final String page;

    PagesEnum(String page){
        this.page = page;
    }

    public String getPage(){
        return this.page;
    }
}
