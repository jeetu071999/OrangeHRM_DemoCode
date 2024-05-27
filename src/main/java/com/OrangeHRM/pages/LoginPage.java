package com.OrangeHRM.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$;

@Component
public class LoginPage {
    private static final String USERNAME = "//div/input[@name='username']";
    private static final String PASSWORD = "//div/input[@name='password']";
    private static final String SIGNIN = "//button [@type='submit']";

    public SelenideElement username() {
        return $(By.xpath(USERNAME));
    }

    public SelenideElement password() {
        return $(By.xpath(PASSWORD));
    }

    public SelenideElement signin() {
        return $(By.xpath(SIGNIN));
    }


}
