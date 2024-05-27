package com.OrangeHRM.steps.login;

import com.OrangeHRM.framework.FrameworkConfig;

import com.OrangeHRM.pages.LoginPage;
import com.OrangeHRM.steps.CucumberSpringConfiguration;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

import static com.codeborne.selenide.Selenide.open;

public class LoginPageSteps extends CucumberSpringConfiguration {

    @Autowired
    private LoginPage loginPage;


    @Given("User logins to OrangeHRM application")
    public void user_logins_to_orangeHRM_application() throws InterruptedException {
       open("");
        loginPage.username().sendKeys(FrameworkConfig.tempUsername);

        loginPage.password().sendKeys(FrameworkConfig.tempPassword);
        loginPage.signin().click();

    }





}
