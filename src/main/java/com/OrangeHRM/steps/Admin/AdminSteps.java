package com.OrangeHRM.steps.Admin;

import com.OrangeHRM.pages.AdminPage;
import com.OrangeHRM.pages.Dashboard;
import com.OrangeHRM.steps.CucumberSpringConfiguration;
import com.codeborne.selenide.Condition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

public class AdminSteps extends CucumberSpringConfiguration {


    @Autowired
    private AdminPage adminPage;

    @Autowired
    private Dashboard dashboard;

    @And("User click the Add button")
    public void user_click_addbutton() throws InterruptedException {
        adminPage.addbutton().click();
    }

    @Then("User should be able to access the HR Administration panel without any issues")
    public void user_navigate_to_adminpage() throws InterruptedException {
        adminPage.systemuser().shouldBe(Condition.visible);
    }
}