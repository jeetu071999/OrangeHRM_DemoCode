package com.OrangeHRM.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$;
@Component
public class DashboardPage {
    public static final String DASHBOARD="//div//h6[text()='Dashboard']";

    public SelenideElement dash() {
        return $(By.xpath(DASHBOARD));

    }
}
