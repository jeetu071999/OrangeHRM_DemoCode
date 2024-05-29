package com.OrangeHRM.steps.Navigation;

import com.OrangeHRM.pages.Dashboard;
import com.OrangeHRM.steps.CucumberSpringConfiguration;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class NavigateSteps extends CucumberSpringConfiguration {
    @Autowired
    private Dashboard dashboard;

    @When("User Navigates to Admin")
    public void user_navigates_to_Admin() throws InterruptedException {
        dashboard.admin().should(Condition.appear).click();
        Selenide.sleep(5000);

    }
    @When("User Navigates to Pim")
    public void user_navigates_to_Pim() throws InterruptedException {
        dashboard.pim().should(Condition.appear).click();
        Selenide.sleep(5000);

    }
    @When("User Navigates to Leave")
    public void user_navigates_to_Leave() throws InterruptedException {
        dashboard.leave().should(Condition.appear).click();
        Selenide.sleep(5000);

    }
    @When("User Navigates to Recritment")
    public void user_navigates_to_Recritment() throws InterruptedException {
        dashboard.recruitment().should(Condition.appear).click();
        Selenide.sleep(5000);
    }

    @When("User Navigates to Info")
    public void user_navigates_to_Info() throws InterruptedException {
        dashboard.info().should(Condition.appear).click();
        Selenide.sleep(5000);
    }

    @When("User Navigates to Performance")
    public void user_navigates_to_Performance() throws InterruptedException {
        dashboard.performance().should(Condition.appear).click();
        Selenide.sleep(5000);
    }

    @When("User Navigates to Dashboard")
    public void user_navigates_to_Dashboard() throws InterruptedException {
        dashboard.dashboard().should(Condition.appear).click();
        Selenide.sleep(5000);
    }
    @When("User Navigates to Userprofile --> Logout")
    public void user_navigates_to_Logout() throws InterruptedException {
        dashboard.userprofile().should(Condition.appear).click();
        dashboard.logout().should(Condition.appear).click();
        Selenide.sleep(5000);
    }
@When("User navigate to the Buzz page")
public void user_navigates_to_Buzzpage() throws InterruptedException {
    dashboard.buzz().should(Condition.appear).click();
    System.out.println("Navigate");
}



}
