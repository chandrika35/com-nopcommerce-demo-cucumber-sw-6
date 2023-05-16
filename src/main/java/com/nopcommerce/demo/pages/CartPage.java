package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CartPage extends Utility {
    private static final Logger log = LogManager.getLogger(CartPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Shopping cart']")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//input[@value='1']")
    WebElement clearQuantity;
    @CacheLookup
    @FindBy(xpath = "//input[@value='1']")
    WebElement addQuantity;
    @CacheLookup
    @FindBy(id = "updatecart")
    WebElement updateCart;
    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]/span[1]")
    WebElement total;
    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement checkBox;
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkout;
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Welcome, Please Sign In!']")
    WebElement welcomeText;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 checkout-as-guest-button']")
    WebElement checkOutAsGuest;

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Shopping cart']")
    WebElement verifyShoppingCartText;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'(2)')]")
    WebElement checkQuantity;
    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]/span[1]")
    WebElement checkTotal;
    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement checkbox;
    @CacheLookup
    @FindBy(id = "checkout")
    WebElement checkoutBtn;

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Welcome, Please Sign In!']")
    WebElement checkWelcomeMessage;
    @CacheLookup
    @FindBy(xpath = "//button[text()='Register']")
    WebElement register;

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Shopping cart']")
    WebElement checkShoppingCartText;


    public String getShoppingCartText() {
        log.info("Get shopping cart text" + shoppingCartText.toString());
        return getTextFromElement(shoppingCartText);
    }

    public void changeQuantity(String quantity) {
        log.info("Change quantity" + addQuantity.toString());
        driver.findElement(By.xpath("//input[@value='1']")).clear();
        sendTextToElement(addQuantity, quantity);
    }

    public void clickOnUpdateCart() {
        log.info("Click on update cart" + updateCart.toString());
        clickOnElement(updateCart);
    }

    public String getTotal() {
        log.info("Get total" + total.toString());
        return getTextFromElement(total);
    }

    public void clickOnCheckBox() {
        log.info("Click on check box" + checkBox.toString());
        clickOnElement(checkBox);
    }

    public void clickOnCheckoutButton() {
        log.info("Click on checkout button" + checkout.toString());
        clickOnElement(checkout);
    }

    public String getWelcomeText() {
        log.info("Get welcome text" + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void clickOnCheckoutAsGuest() {
        log.info("Click on checkout as guest" + checkOutAsGuest.toString());
        clickOnElement(checkOutAsGuest);
    }

    public String verifyShoppingCartText() {
        log.info("Verify shopping cart text" + verifyShoppingCartText.toString());
        return getTextFromElement(verifyShoppingCartText);
    }

    public String verifyTheQuantity() {
        log.info("Verify quantity" + checkQuantity.toString());
        return getTextFromElement(checkQuantity);
    }

    public String verifyTheTotal() {
        log.info("Verify total" + checkTotal.toString());
        return getTextFromElement(checkTotal);
    }

    public void clickOnCheckbox() {
        log.info("Click on check box" + checkbox.toString());
        clickOnElement(checkbox);
    }

    public void clickOnCheckoutBtn() {
        log.info("Click on checkout button" + checkoutBtn.toString());
        clickOnElement(checkoutBtn);
    }

    public String verifyWelcomeMessage() {
        log.info("Verify welcome message" + checkWelcomeMessage.toString());
        return getTextFromElement(checkWelcomeMessage);
    }

    public void clickOnRegisterTab() {
        log.info("Click on register tab" + register.toString());
        clickOnElement(register);
    }

    public String checkShoppingCartText() {
        log.info("Check shopping cart text" + checkShoppingCartText.toString());
        return getTextFromElement(checkShoppingCartText);
    }

    public void clickCheckBox() {
        clickOnElement(By.id("termsofservice"));
    }

    public void clickCheckOut() {
        clickOnElement(By.id("checkout"));
    }

}
