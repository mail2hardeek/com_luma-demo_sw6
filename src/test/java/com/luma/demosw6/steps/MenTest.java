package com.luma.demosw6.steps;

import com.luma.demosw6.pages.HomePage;
import com.luma.demosw6.pages.MensPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class MenTest {
    @When("^I Mouse Hover on Men Menu$")
    public void iMouseHoverOnMenMenu() {
        new HomePage().mouseHoverToMenMenu();
    }

    @And("^I Mouse Hover on Bottoms$")
    public void iMouseHoverOnBottoms() {
        new HomePage().mouseHoverToMenTops();
    }

    @And("^I Click on Pants$")
    public void iClickOnPants() {
new HomePage().clickOnPants();
    }

    @And("^I Mouse Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size (\\d+)$")
    public void iMouseMouseHoverOnProductNameCronusYogaPantAndClickOnSize(int arg32) {
        new MensPage().hoverAndClickProduct();
    }

    @And("^Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black\\.$")
    public void mouseHoverOnProductNameCronusYogaPantAndClickOnColourBlack() {
        new MensPage().hoverAndClickProductColour();
    }

    @And("^Mouse Hover on product name‘Cronus Yoga Pant’ and click on‘Add To Cart’ Button\\.$")
    public void mouseHoverOnProductNameCronusYogaPantAndClickOnAddToCartButton() {
        new MensPage().hoverAndClickOnAddToCartButton();
    }

    @And("^Verify the text‘You added Cronus Yoga Pant to your shopping cart\\.’$")
    public void verifyTheTextYouAddedCronusYogaPantToYourShoppingCart() {
        Assert.assertEquals(new MensPage().getTextAddedPantToShoppingCart(),"You added Cronus Yoga Pant to your shopping cart","Error");
    }

    @And("^Click on ‘shopping cart’ Link into message$")
    public void clickOnShoppingCartLinkIntoMessage() {
        new MensPage().clickOnShoppingCart();
    }

    @And("^Verify the text ‘Shopping Cart\\.’$")
    public void verifyTheTextShoppingCart() {
        Assert.assertEquals(new MensPage().getTextShoppingCart(),"Shopping Cart","Error");

    }

    @And("^Verify the product name ‘Cronus Yoga Pant’$")
    public void verifyTheProductNameCronusYogaPant() {
        Assert.assertEquals(new MensPage().getTextCronusYogaPant(),"Cronus Yoga Pant","Error");
    }

    @And("^Verify the product size ‘(\\d+)’$")
    public void verifyTheProductSize(int arg32) {
        Assert.assertEquals(new MensPage().getTextSize32(),"32","Error");
    }

    @Then("^Verify the product colour ‘Black’$")
    public void verifyTheProductColourBlack() {
        Assert.assertEquals(new MensPage().getTextBlack(),"Black","Error");
    }
}
