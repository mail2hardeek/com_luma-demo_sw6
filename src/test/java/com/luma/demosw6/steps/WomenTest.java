package com.luma.demosw6.steps;

import com.luma.demosw6.pages.HomePage;
import com.luma.demosw6.pages.WomenPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WomenTest {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I Mouse Hover on Women Menu$")
    public void iMouseHoverOnWomenMenu() {
        new HomePage().mouseHoverToWomenMenu();
    }

    @And("^I Mouse Hover on Tops$")
    public void iMouseHoverOnTops() {
        new HomePage().mouseHoverToWomenTops();
    }

    @And("^I Click on Jackets$")
    public void iClickOnJackets() {
        new HomePage().clickOnJackets();
    }

    @And("^I Select Sort By filter “Product Name”$")
    public void iSelectSortByFilterProductName() {
        new WomenPage().selectSortByFilterProductName();

    }

    @Then("^User should be able to Verify the products name display in alphabetical order$")
    public void userShouldBeAbleToVerifyTheProductsNameDisplayInAlphabeticalOrder() {
        new WomenPage().verifyProductsNameAlphabeticalOrder();
    }

    @And("^I Select Sort By filter “Price”$")
    public void iSelectSortByFilterPrice() {
        new WomenPage().selectSortByFilterPrice();
    }

    @Then("^User should be able to Verify the products price display in Low to High$")
    public void userShouldBeAbleToVerifyTheProductsPriceDisplayInLowToHigh() {
        new WomenPage().verifyProductsPriceLowToHigh();
    }


}
