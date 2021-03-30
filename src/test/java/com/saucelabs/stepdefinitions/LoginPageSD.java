package com.saucelabs.stepdefinitions;

import com.saucelabs.base.ConfigReader;
import com.saucelabs.pages.LoginPage;
import com.saucelabs.utils.HelperMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPageSD {
    @Given("I am on the login page")
    public void verifyLoginPage(){
        String expectedTitle = "Swag Labs";
        Assert.assertEquals(expectedTitle, LoginPage.verifyTitle());
    }

    @When("I enter valid username")
    public void EnterValidUsername() {
        LoginPage.enterUserName(ConfigReader.getProperty("username"));
    }

    @And("I enter valid password")
    public void EnterValidPassword() {
        LoginPage.enterPassword(ConfigReader.getProperty("password"));
    }

    @And("I click on the login button")
    public void ClickOnTheLoginButton() {
        LoginPage.clickLoginBtn();
    }

    @Then("I see the homepage")
    public void SeeTheHomepage() {
        String expectedURL = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals(expectedURL, LoginPage.verifyURL());
    }

    @When("I enter invalid username")
    public void EnterInvalidUsername() {
        LoginPage.enterUserName(ConfigReader.getProperty("incorrectusername"));
    }

    @And("I enter invalid password")
    public void EnterInvalidPassword() {
        LoginPage.enterPassword(ConfigReader.getProperty("incorrectpassword"));
    }

    @Then("I see the error message")
    public void SeeTheErrorMessage() {
        Assert.assertTrue(LoginPage.verifyErrMessage());
    }
}
