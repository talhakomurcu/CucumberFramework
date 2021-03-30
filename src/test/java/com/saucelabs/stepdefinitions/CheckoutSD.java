package com.saucelabs.stepdefinitions;

import com.saucelabs.base.ConfigReader;
import com.saucelabs.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CheckoutSD {

    @Given("user is actually succesfully login")
    public void verifyUserLoggedIn(){
        LoginPage.enterUserName(ConfigReader.getProperty("username"));
        LoginPage.enterPassword(ConfigReader.getProperty("password"));
        LoginPage.clickLoginBtn();
        String expectedURL = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals(expectedURL, LoginPage.verifyURL());
    }
    @When("I click on item with name {string}")
    public void clickOnTheItem(String itemName){
        HomePage.clickItem(itemName);
    }
    @And("I click on the ADD TO CART button")
    public void clickOnAddCart(){
        ItemPage.clickAddToCart();
    }
    @And("I click on the SHOPPING CART button")
    public void clickOnShoppingCart(){
        ItemPage.clickShoppingCart();
    }
    @And("I click on the CHECKOUT button")
    public void clickOnCheckout(){
        CheckoutStepOne.clickOnCheckout();
    }
    @And("I enter the order information as {string},{string} and {string}")
    public void enterInfo(String firstName, String lastName, String zipcode){
        CheckoutStepTwo.sendOrderInformation(firstName, lastName, zipcode);
    }
    @And("I click on the continue button")
    public void clickOnContinue(){
        CheckoutStepTwo.clickContinue();
    }
    @Then("Item name matches that of {string}")
    public void verify_name_matches(String item){
        Assert.assertTrue(CheckoutStepThree.verifyItem(item));
    }





}
