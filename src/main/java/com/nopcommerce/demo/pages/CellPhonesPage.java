package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CellPhonesPage extends Utility {
    private static final Logger log = LogManager.getLogger(CellPhonesPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Cell phones']")
    WebElement cellPhoneText;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement listViewTab;
    @CacheLookup
    @FindBy(xpath = "//div[3]/div[1]/div[2]/h2[1]/a")
    WebElement nokiaLumia;
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Nokia Lumia 1020']")
    WebElement nokiaLumiaText;
    @CacheLookup
    @FindBy(id = "price-value-20")
    WebElement price;
    @CacheLookup
    @FindBy(name = "addtocart_20.EnteredQuantity")
    WebElement changeQuantity;
    @CacheLookup
    @FindBy(id = "add-to-cart-button-20")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement productAddedInShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement closeButton;
    @CacheLookup
    @FindBy(xpath = "//span[text()='Shopping cart']")
    WebElement hoverOnShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//button[text()='Go to cart']")
    WebElement clickGoToCart;

    public String getCellPhoneText() {
        log.info("Get cell phone text" + cellPhoneText.toString());
        return getTextFromElement(cellPhoneText);
    }

    public void clickOnListViewTab() {
        log.info("Click on list view tab" + listViewTab.toString());
        clickOnElement(listViewTab);
    }

    public void clickOnNokiaLumiaProduct() {
        log.info("Click on nokia lumia product" + nokiaLumia.toString());
        clickOnElement(nokiaLumia);
    }

    public String verifyNokiaLumiaText() {
        log.info("Verify nokia lumia text" + nokiaLumiaText.toString());
        return getTextFromElement(nokiaLumiaText);
    }

    public String verifyPrice() {
        log.info("Verify price" + price.toString());
        return getTextFromElement(price);
    }

    public void changeTheQuantity() {
        log.info("Change quantity" + changeQuantity.toString());
        driver.findElement(By.name("addtocart_20.EnteredQuantity")).clear();
        sendTextToElement(changeQuantity, "2");
    }

    public void clickOnAddToCartButton() {
        log.info("Click on add to cart" + addToCart.toString());
        clickOnElement(addToCart);
    }

    public String verifyProductAddedInShoppingCartText() {
        log.info("Verify product added in shopping cart text" + productAddedInShoppingCart.toString());
        return getTextFromElement(productAddedInShoppingCart);
    }

    public void clickOnCloseButton() {
        log.info("Click on close button" + closeButton.toString());
        clickOnElement(closeButton);
    }

    public void hoverOnShoppingCartAndClickOnGoToCartButton() {
        log.info("Mouse hover on shopping cart" + hoverOnShoppingCart.toString());
        log.info("Click on go to cart" + clickGoToCart.toString());
        mouseHoverToElement(hoverOnShoppingCart);
        clickOnElement(clickGoToCart);
    }
}
