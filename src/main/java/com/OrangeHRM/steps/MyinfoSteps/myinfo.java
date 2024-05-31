package com.OrangeHRM.steps.MyinfoSteps;

import com.OrangeHRM.pages.MyinfoPage;
import com.codeborne.selenide.Condition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;

public class myinfo {
    @Autowired
    private MyinfoPage myinfoPage;

    @And("User Updates first name{string} -->click save")
    public void user_update_name(String name) {
        myinfoPage.name().setValue(name);
        myinfoPage.save_btn().click();
        System.out.println("inside method user_update_name");
    }


    @Then("User Should see success message {string}")
    public void user_gets_success_msg(String msg) {
        System.out.println("Success msg is:"+myinfoPage.successmsg().getText());

        myinfoPage.successmsg().should(Condition.appear);
        Assert.assertEquals(myinfoPage.successmsg().getText(),msg);
    }

}
