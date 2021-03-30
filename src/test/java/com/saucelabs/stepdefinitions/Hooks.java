package com.saucelabs.stepdefinitions;

import com.saucelabs.base.BasePage;
import com.saucelabs.base.PageManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void start(){

        BasePage.initializeDriver();

    }

    @After
    public void ent(){

        BasePage.tearDown();

    }
}
