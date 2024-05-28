package com.OrangeHRM.steps.login;

import com.OrangeHRM.framework.FrameworkConfig;

import com.OrangeHRM.pages.LoginPage;
import com.OrangeHRM.steps.CucumberSpringConfiguration;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
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
    @Given("User logins to OrangeHRM application with {string} and {string}")
    public void user_logins_to_uNamepass(String Uname,String Pass) throws InterruptedException {
        open("");
        loginPage.username().sendKeys(Uname);
        loginPage.password().sendKeys(Pass);
        loginPage.signin().click();
        Selenide.sleep(5000);


    }



}
