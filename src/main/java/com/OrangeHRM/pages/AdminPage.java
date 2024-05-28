package com.OrangeHRM.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$;
@Component
public class AdminPage {

    public static final String ADDBUTTON = "//button[normalize-space()='Add']";
    public static final String SYSTEMUSER = ".//div//h5[text()='System Users']";


    public SelenideElement addbutton() {
        return $(By.xpath(ADDBUTTON));

    }

    public SelenideElement systemuser() {
        return $(By.xpath(SYSTEMUSER));

    }
}




