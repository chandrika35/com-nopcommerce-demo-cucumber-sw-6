package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ComputerSteps {
    @When("^I click on computer$")
    public void iClickOnComputer() {
        new HomePage().clickOnComputerMenu();
    }

    @And("^I click on desktop$")
    public void iClickOnDesktop() {
        new ComputersPage().clickOnDesktops();
    }

    @And("^I select sort by position Name: Z to A$")
    public void iSelectSortByPositionNameZToA() {
        new DesktopsPage().selectSortZToA("Name: Z to A");
    }

    @Then("^Verify the Product will arrange in Descending order$")
    public void verifyTheProductWillArrangeInDescendingOrder() {
    }

    @And("^I select sort by position Name: A to Z$")
    public void iSelectSortByPositionNameAToZ() {
        new DesktopsPage().selectSortAToZ("Name: A to Z");
    }

    @And("^CLick on Add to cart$")
    public void clickOnAddToCart() throws InterruptedException {
        Thread.sleep(5000);
        new DesktopsPage().clickOnAddToCartButton();
    }

    @And("^Verify the Text Build your own computer$")
    public void verifyTheTextBuildYourOwnComputer() {
        Assert.assertEquals("Build your own computer message is not displayed", "Build your own computer", new BuildYourOwnComputerPage().getBuildYourOwnComputerText());
    }


    @And("^I can Select processor \"([^\"]*)\"$")
    public void iCanSelectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessor(processor);
    }

    @And("^I can Select ram \"([^\"]*)\"$")
    public void iCanSelectRam(String ram) {
        new BuildYourOwnComputerPage().selectRam(ram);
    }

    @And("^I can Select HDD radio \"([^\"]*)\"$")
    public void iCanSelectHDDRadio(String hdd) {
        new BuildYourOwnComputerPage().selectHdd();
    }

    @And("^I can Select OS radio \"([^\"]*)\"$")
    public void iCanSelectOSRadio(String os) {
        new BuildYourOwnComputerPage().selectVistaPremiumOs();
    }

    @And("^I can Select check box \"([^\"]*)\"$")
    public void iCanSelectCheckBox(String arg0) {
        new BuildYourOwnComputerPage().clickOnTotalCommander();
    }

    @And("^Verify the price \"([^\"]*)\"$")
    public void verifyThePrice(String expPrice) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals("$1,475.00 is not displayed", expPrice, new BuildYourOwnComputerPage().getPrice());
    }

    @And("^I can Click on add to cart button$")
    public void iCanClickOnAddToCartButton() {
        new BuildYourOwnComputerPage().clickOnAddToCart();
    }

    @And("^Verify the Message \"([^\"]*)\" on Top green Bar$")
    public void verifyTheMessageOnTopGreenBar(String expMess) {
        Assert.assertEquals("Product added message is not displayed", expMess, new BuildYourOwnComputerPage().getProductAddedText());
    }

    @And("^I can close the bar clicking on close button$")
    public void iCanCloseTheBarClickingOnCloseButton() {
        new BuildYourOwnComputerPage().clickOnCloseButton();
    }

    @And("^I can MouseHover on Shopping cart and Click on GO TO CART button$")
    public void iCanMouseHoverOnShoppingCartAndClickOnGOTOCARTButton() {
        new BuildYourOwnComputerPage().mouseHoverOnShoppingCart();
        new BuildYourOwnComputerPage().clickOnGoToCartButton();
    }

    @And("^I can Verify the message \"([^\"]*)\"$")
    public void iCanVerifyTheMessage(String expMess) {
        Assert.assertEquals("Shopping cart is not displayed", expMess, new CartPage().getShoppingCartText());
    }

    @And("^I can change the Qty to \"([^\"]*)\" and Click on Update shopping cart$")
    public void iCanChangeTheQtyToAndClickOnUpdateShoppingCart(String quantity) {
        new CartPage().changeQuantity(quantity);
        new CartPage().clickOnUpdateCart();
    }

    @And("^Verify the Total \"([^\"]*)\"$")
    public void verifyTheTotal(String expTotal) {
        Assert.assertEquals("$2,950.00 is not displayed", expTotal, new CartPage().getTotal());
    }

    @And("^I can click on checkbox I agree with the terms of service$")
    public void iCanClickOnCheckboxIAgreeWithTheTermsOfService() {
        new CartPage().clickOnCheckBox();
    }

    @And("^I can click on checkout$")
    public void iCanClickOnCheckout() {
        new CartPage().clickOnCheckoutButton();
    }

    @And("^Verify the Text \"([^\"]*)\"$")
    public void verifyTheText(String expMess) {
        Assert.assertEquals("Welcome message is not displayed", expMess, new CartPage().getWelcomeText());
    }

    @And("^I can click on checkout as a guest tab$")
    public void iCanClickOnCheckoutAsAGuestTab() {
        new CartPage().clickOnCheckoutAsGuest();
    }

    @And("^I can fill all mandatory field$")
    public void iCanFillAllMandatoryField() {
        new CheckoutPage().fillMandatoryField();
    }

    @And("^I can click on next day air radio button$")
    public void iCanClickOnNextDayAirRadioButton() {
        new CheckoutPage().clickOnNextDayAirButton();
    }

    @And("^Click on continue$")
    public void clickOnContinue() {
        new CheckoutPage().setClickContinue();
    }

    @And("^Select credit card radio button$")
    public void selectCreditCardRadioButton() {
        new PaymentPage().clickOnCreditCardRadioButton();
    }

    @And("^Click on the continue$")
    public void clickOnTheContinue() {
        new PaymentPage().setClickOnContinue();
    }

    @And("^I can select master card$")
    public void iCanSelectMasterCard() {
        new PaymentPage().selectMasterCard();
    }

    @And("^I can fill all mandatory field for payment$")
    public void iCanFillAllMandatoryFieldForPayment() {
        new PaymentPage().fillPaymentDetails();
    }

    @And("^Verify payment method is \"([^\"]*)\"$")
    public void verifyPaymentMethodIs(String card) {
        Assert.assertEquals("Credit card text is not displayed", card, new ConfirmOrderPage().getCreditCardText());
    }

    @And("^Verify shipping method is \"([^\"]*)\"$")
    public void verifyShippingMethodIs(String nextDay) {
        Assert.assertEquals("Next day air shipping method is not displayed",nextDay,new ConfirmOrderPage().getNextDayAirText());
    }

    @And("^I can click on confirm button$")
    public void iCanClickOnConfirmButton() {
        new ConfirmOrderPage().clickOnConfirmButton();
    }

    @And("^I can Verify text \"([^\"]*)\"$")
    public void iCanVerifyText(String text) {
        Assert.assertEquals("Thank you text is not displayed",text,new ConfirmOrderPage().getThankYouText());
    }

    @And("^Verify the message \"([^\"]*)\"$")
    public void verifyTheMessage(String text) {
        Assert.assertEquals("Success message is not displayed",text,new ConfirmOrderPage().getSuccessfullyMessage());
    }

    @And("^Click on the continue button$")
    public void clickOnTheContinueButton() {
        new ConfirmOrderPage().setContinueButtonClick();
    }

    @Then("^Verify text \"([^\"]*)\"$")
    public void verifyText(String welcomeText) {
        Assert.assertEquals("Welcome text is not displayed",welcomeText,new HomePage().getWelcomeToStoreText());
    }
}
