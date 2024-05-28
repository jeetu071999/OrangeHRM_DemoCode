package com.OrangeHRM.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HeaderPage {

    public static final String ADMIN = ".//span[text()='Admin']";
    public static final String PIM=".//span[text()='PIM']";
    public static final String LEAVE=".//span[text()='Leave']";
    public static final String TIME=".//span[text()='Time']";
    public static final String RECRUITMENT=".//span[text()='Recruitment']";
    public static final String INFO=".//span[text()='My Info']";
    public static final String PERFORMANCE=".//span[text()='Performance']";
    public static final String DASHBOARD=".//span[text()='Dashboard']";
    public static final String USERPROFILE="//div//ul//span[@class='oxd-userdropdown-tab']";
    public static final String LOGOUT="//div//ul//li//a[@href='/web/index.php/auth/logout']";

    public SelenideElement admin(){
        return $(By.xpath(ADMIN));
    }

    public SelenideElement pim(){
        return $(By.xpath(PIM));
    }

    public SelenideElement leave(){
        return $(By.xpath(LEAVE));
    }

    public SelenideElement time(){
        return $(By.xpath(TIME));
    }
    public SelenideElement recruitment(){
        return $(By.xpath(RECRUITMENT));
    }

    public SelenideElement info(){
        return $(By.xpath(INFO));
    }
    public SelenideElement performance(){
        return $(By.xpath(PERFORMANCE));
    }
    public SelenideElement dashboard(){
        return $(By.xpath(DASHBOARD));
    }
    public SelenideElement userprofile(){
        return $(By.xpath(USERPROFILE));
    }
    public SelenideElement logout(){
        return $(By.xpath(LOGOUT));
    }

}
