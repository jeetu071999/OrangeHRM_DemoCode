package com.OrangeHRM.framework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan("com.OrangeHRM")
@PropertySource("classpath:environment/${spring.profiles.active:dev}.properties")
public class FrameworkConfig {

    public static String  tempUsername;
    public static String tempPassword;

    @Autowired
    public FrameworkConfig(Environment env) {
        com.codeborne.selenide.Configuration.baseUrl = env.getProperty("frontend.url");
        com.codeborne.selenide.Configuration.browser = env.getProperty("browser");
//        com.codeborne.selenide.Configuration.browser ="edge";
        com.codeborne.selenide.Configuration.timeout = 40000;
//        com.codeborne.selenide.Configuration.startMaximized = true;
        com.codeborne.selenide.Configuration.savePageSource = false;

        // To take Screenshots
        com.codeborne.selenide.Configuration.reportsFolder = "test-result/reports";
        com.codeborne.selenide.Configuration.screenshots = true;
        //You can use property -Dselenide.reportsFolder=test-result/reports to set any directory to store screenshots to.
        // For v4.x use -Dselenide.reports=test-result/reports

//        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));

//        WebDriverManager.edgedriver().setup();

//        RestAssured.baseURI = env.getProperty("api.uri");
        tempUsername = env.getProperty("temp.username");
        tempPassword = env.getProperty("temp.password");

    }
}
