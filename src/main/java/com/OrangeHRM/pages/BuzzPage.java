package com.OrangeHRM.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$;
@Component
public class BuzzPage {
    public static final String BUZZTITLE=".//div//p[text()='Buzz Newsfeed']";
    public static final String POST="//textarea[@class='oxd-buzz-post-input']";
    public static final String PostButton="//button[@type='submit' and contains(@class, 'oxd-button') and contains(@class, 'oxd-button--medium') and contains(@class, 'oxd-button--main')]";
public static final String  RECENT_POST="//div [@class='orangehrm-buzz-post-body']/p";
public static final String POST_BY_TEXT="//div [@class='orangehrm-buzz-post-body']/p [text()='";



    public SelenideElement buzztitle() {
        return $(By.xpath(BUZZTITLE));
    }
    public SelenideElement post() {
        return $(By.xpath(POST));
    }

    public SelenideElement postbutton() {
        return $(By.xpath(PostButton));
    }
    public SelenideElement getrecentpost(){
        return $(By.xpath(RECENT_POST));
    }
    public SelenideElement Get_post_by_text(String text){
        return $(By.xpath(POST_BY_TEXT + text + "']"));
    }





}

