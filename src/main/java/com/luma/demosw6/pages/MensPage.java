package com.luma.demosw6.pages;

import com.luma.demosw6.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MensPage extends Utility {
    @CacheLookup
    @FindBy(css=".product-item-link")
    WebElement productName;
    @CacheLookup
    @FindBy(xpath="(//div[@id='option-label-size-143-item-175'])[1]")
    WebElement size32;
    @CacheLookup
    @FindBy(css="#option-label-color-93-item-49")
    WebElement colourBlack;
    @CacheLookup
    @FindBy(css=".action.tocart.primary")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(xpath="//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement addedPant;
    @CacheLookup
    @FindBy(css=".message-success.success.message div a")
    WebElement linkShoppingCart;
    @CacheLookup
    @FindBy(css="main div h1 span")
    WebElement textShoppingCart;
    @CacheLookup
    @FindBy(xpath="//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement textCronusYogaPant;
    @CacheLookup
    @FindBy(css=".item-options>dd:first-of-type")
    WebElement textSize32;
    @CacheLookup
    @FindBy(css=".item-options>dd:last-of-type")
    WebElement textBlack;

    public void hoverAndClickProduct(){
        mouseHoverToElement(productName);
        clickOnElement(size32);
    }
    public void hoverAndClickProductColour(){
        mouseHoverToElement(productName);
        mouseHoverToElementAndClick(colourBlack);
    }
    public void hoverAndClickOnAddToCartButton(){
        mouseHoverToElement(productName);
        mouseHoverToElementAndClick(addToCartButton);
    }
    public String getTextAddedPantToShoppingCart(){
        return getTextFromElement(addedPant);
    }
    public void clickOnShoppingCart(){
        clickOnElement(linkShoppingCart);
    }
    public String getTextShoppingCart(){
       return getTextFromElement(textShoppingCart);
    }
    public String getTextCronusYogaPant(){
        return getTextFromElement(textCronusYogaPant);
    }
    public String getTextSize32(){
        return getTextFromElement(textSize32);
    }
    public String getTextBlack(){
        return getTextFromElement(textBlack);
    }

}
