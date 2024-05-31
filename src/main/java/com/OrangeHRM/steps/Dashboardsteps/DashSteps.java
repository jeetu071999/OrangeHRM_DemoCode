package com.OrangeHRM.steps.Dashboardsteps;

import com.OrangeHRM.pages.DashboardPage;
import com.codeborne.selenide.Condition;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;

public class DashSteps {
@Autowired
private DashboardPage dashboardPage;

    @Then("User should be able to access the Dashboard page without any issues")
    public void user_navigate_to_dashboard() throws InterruptedException {
        dashboardPage.dash().shouldBe(Condition.visible);
        Assert.assertTrue(dashboardPage.dash().isDisplayed());

    }
}
