package com.saucelabs.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        plugin = {"pretty","html:target/site/cucumber-pretty.html"
                ,"json:target/cucumber-html-reports/cucumber.json"
                ,"junit:target/cucumber-xml-reports/cucumber.xml"},
        features = {"src/test/resources/features"},
        glue = {"com/saucelabs/stepdefinitions"},
        tags = "@Login",
        monochrome = true, //changes the console output and if value is true, consol output is going to look more simple
        dryRun = false  //checks the scenarios if there is any tag without definition
)
public class TestRunner {





}
