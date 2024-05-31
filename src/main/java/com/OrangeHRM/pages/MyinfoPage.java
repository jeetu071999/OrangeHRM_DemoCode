package com.OrangeHRM.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$;
@Component
public class MyinfoPage {
    public static final String NAME="//input[contains(@class, 'orangehrm-firstname')]";
    public static final String SAVE_BTN="//h6[text()='Personal Details']/following::button[text()=' Save '][1]";
public static final String SUCCESMSG=".oxd-toast-content-text";

    public SelenideElement name() {
        return $(By.xpath(NAME));
    }
    public SelenideElement save_btn() {
        return $(By.xpath(SAVE_BTN));
    }
    public SelenideElement successmsg(){return $((SUCCESMSG));}
}
