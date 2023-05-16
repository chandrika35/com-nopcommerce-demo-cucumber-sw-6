package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BuildYourOwnComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Build your own computer']")
    WebElement buildYourOwnComputer;
    @CacheLookup
    @FindBy(name = "product_attribute_1")
    WebElement processor;

    @CacheLookup
    @FindBy(name = "product_attribute_2")
    WebElement ram;

    @CacheLookup
    @FindBy(id = "product_attribute_3_7")
    WebElement hdd;

    @CacheLookup
    @FindBy(id = "product_attribute_4_9")
    WebElement vistaPremium;

    @CacheLookup
    @FindBy(id = "product_attribute_5_12")
    WebElement totalCommander;

    @CacheLookup
    @FindBy(id = "price-value-1")
    WebElement price;

    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement productAddedText;

    @CacheLookup
    @FindBy(xpath = "//span[@class='close']")
    WebElement closeButton;
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-label']")
    WebElement hoverShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement goToCart;

    public String getBuildYourOwnComputerText() {
        log.info("Get build your own computer text" + buildYourOwnComputer.toString());
        return getTextFromElement(buildYourOwnComputer);
    }

    public void selectProcessor(String text) {
        log.info("Select processor" + processor.toString());
        selectByVisibleTextFromDropDown(processor, text);
    }

    public void selectRam(String text) {
        log.info("Select ram" + ram.toString());
        selectByVisibleTextFromDropDown(ram, text);
    }

    public void selectHdd() {
        log.info("Select hdd" + hdd.toString());
        clickOnElement(hdd);
    }

    public void selectVistaPremiumOs() {
        log.info("Select vista premium Os" + vistaPremium.toString());
        clickOnElement(vistaPremium);
    }

    public void clickOnTotalCommander() {
        log.info("Click on total command" + totalCommander.toString());
        clickOnElement(totalCommander);
    }

    public String getPrice() {
        log.info("Get price" + price.toString());
        return getTextFromElement(price);
    }

    public void clickOnAddToCart() {
        log.info("Click on add to cart" + addToCartButton.toString());
        clickOnElement(addToCartButton);
    }

    public String getProductAddedText() {
        log.info("Get product added text" + productAddedText.toString());
        return getTextFromElement(productAddedText);
    }

    public void clickOnCloseButton() {
        log.info("Click on close button" + closeButton.toString());
        clickOnElement(closeButton);
    }

    public void mouseHoverOnShoppingCart() {
        log.info("Mouse hover on shopping cart" + hoverShoppingCart.toString());
        mouseHoverToElement(hoverShoppingCart);
    }

    public void clickOnGoToCartButton() {
        log.info("Click on go to cart button" + goToCart.toString());
        clickOnElement(goToCart);
    }
}
