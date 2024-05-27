package com.OrangeHRM.steps.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {

    @Before
    public void before(Scenario scenario) {
        System.out.println("BEFORE!");
    }

    @After
    public void after(Scenario scenario) {
        System.out.println("AFTER!");

    }

}

