package com.OrangeHRM.steps.Buzz;

import com.OrangeHRM.pages.BuzzPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
//import junit.framework.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.open;

public class Buzz {
    @Autowired
    private BuzzPage buzzPage;

    @Then("User should see the Buzz page title")
    public void Buzztitle() throws InterruptedException {
        buzzPage.buzztitle().should(Condition.visible);
    }

    @And("User post a status update with the message {string}")
    public void user_post_a_status_update_with_the_message(String post) {
        buzzPage.post().setValue(post);
        buzzPage.postbutton().click();
        System.out.println("post message");

    }

    @Then("User should see the status update with the message {string} in the feed")
    public void user_should_see_the_status_update_with_the_message_in_the_feed(String getpost) {

        Assert.assertEquals(buzzPage.getrecentpost().getText(),getpost);
        System.out.println("Check message");

    }




}
