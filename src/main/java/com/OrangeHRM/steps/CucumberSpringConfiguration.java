package com.OrangeHRM.steps;

import com.OrangeHRM.framework.FrameworkConfig;
import com.codeborne.selenide.junit.ScreenShooter;

import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.Rule;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = {FrameworkConfig.class})
public class CucumberSpringConfiguration {

}
