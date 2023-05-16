package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
public class ElectronicsSteps {
    @When("^I can mouse hover on electronics tab$")
    public void iCanMouseHoverOnElectronicsTab() {
        new HomePage().mouseHoverOnElectronicTab();
    }

    @And("^I can mouse hover on cell phones and click$")
    public void iCanMouseHoverOnCellPhonesAndClick() {
        new HomePage().clickOnCellPhones();
    }

    @Then("^I can verify the text \"([^\"]*)\"$")
    public void iCanVerifyTheText(String text) {
        Assert.assertEquals("Cell phones text is not displayed", text, new CellPhonesPage().getCellPhoneText());
    }

    @And("^I should click on list view tab$")
    public void iShouldClickOnListViewTab() {
        new CellPhonesPage().clickOnListViewTab();
    }

    @And("^I should click on nokia lumia product$")
    public void iShouldClickOnNokiaLumiaProduct() throws InterruptedException {
        Thread.sleep(5000);
        new CellPhonesPage().clickOnNokiaLumiaProduct();
    }

    @And("^Verify the text \"([^\"]*)\"$")
    public void verifyTheText(String productName) {
        Assert.assertEquals("Nokia lumia is not displayed", productName, new CellPhonesPage().verifyNokiaLumiaText());
    }

    @And("^I should verify the price \"([^\"]*)\"$")
    public void iShouldVerifyThePrice(String price) {
        Assert.assertEquals("$349.00 is not displayed", price, new CellPhonesPage().verifyPrice());
    }

    @And("^I should change the quantity to (\\d+)$")
    public void iShouldChangeTheQuantityTo(int arg0) {
        new CellPhonesPage().changeTheQuantity();
    }

    @And("^I should click on add to cart tab$")
    public void iShouldClickOnAddToCartTab() {
        new CellPhonesPage().clickOnAddToCartButton();
    }

    @And("^I should Verify the Message \"([^\"]*)\" on Top green Bar$")
    public void iShouldVerifyTheMessageOnTopGreenBar(String expMess) {
        Assert.assertEquals("Product add in shopping cart is not displayed", expMess, new CellPhonesPage().verifyProductAddedInShoppingCartText());
    }

    @And("^I should click on close button$")
    public void iShouldClickOnCloseButton() {
        new CellPhonesPage().clickOnCloseButton();
    }

    @And("^I should mouse hover on shopping cart and click on go to cart button$")
    public void iShouldMouseHoverOnShoppingCartAndClickOnGoToCartButton() {
        new CellPhonesPage().hoverOnShoppingCartAndClickOnGoToCartButton();
    }

    @And("^I should verify msg \"([^\"]*)\"$")
    public void iShouldVerifyMsg(String text) {
        Assert.assertEquals("Shopping cart is not displayed", text, new CartPage().verifyShoppingCartText());
    }

    @And("^I should verify the quantity (\\d+)$")
    public void iShouldVerifyTheQuantity(int arg0) {
        Assert.assertEquals("Quantity 2 is not displayed", "(2)", new CartPage().verifyTheQuantity());
    }

    @And("^I should verify total \"([^\"]*)\"$")
    public void iShouldVerifyTotal(String total) {
        Assert.assertEquals("$698.00 is not displayed", total, new CartPage().verifyTheTotal());
    }

    @And("^I should click on the checkbox of agree terms of service$")
    public void iShouldClickOnTheCheckboxOfAgreeTermsOfService() {
        new CartPage().clickOnCheckBox();
    }

    @And("^I should click on the checkout$")
    public void iShouldClickOnTheCheckout() {
        new CartPage().clickOnCheckoutButton();
    }

    @And("^I should verify text \"([^\"]*)\"$")
    public void iShouldVerifyText(String expMsg) {
        Assert.assertEquals("Welcome, Please Sign In! text not displayed", expMsg, new CartPage().verifyWelcomeMessage());
    }

    @And("^I should click on register tab$")
    public void iShouldClickOnRegisterTab() {
        new CartPage().clickOnRegisterTab();
    }

    @And("^I should verify \"([^\"]*)\"$")
    public void iShouldVerify(String expText) {
        Assert.assertEquals("Register is not displayed", expText, new RegisterPage().verifyRegisterText());
    }

    @And("^I should able to fill all mandatory fields$")
    public void iShouldAbleToFillAllMandatoryFields() {
        new RegisterPage().mandatoryFields();
    }

    @And("^I should click on register button$")
    public void iShouldClickOnRegisterButton() {
        new RegisterPage().clickOnRegistrationButton();
    }

    @And("^Verify message \"([^\"]*)\"$")
    public void verifyMessage(String expText) {
        Assert.assertEquals("Your registration completed is not displayed", expText, new RegisterPage().verifyRegistrationText());
    }

    @And("^I should click on continue tab$")
    public void iShouldClickOnContinueTab() {
        new RegisterPage().clickOnContinueTab();
    }

    @And("^I should Verify visible text \"([^\"]*)\"$")
    public void iShouldVerifyVisibleText(String expText) {
        Assert.assertEquals("Shopping cart is not displayed", expText, new CartPage().checkShoppingCartText());
    }

    @And("^Click on the check box$")
    public void clickOnTheCheckBox() throws InterruptedException {
        Thread.sleep(1000);
        new CartPage().clickCheckBox();
    }

    @And("^click on checkout$")
    public void clickOnCheckout() {
        new CartPage().clickCheckOut();
    }

    @And("^I should able to fill all delivery address mandatory field$")
    public void iShouldAbleToFillAllDeliveryAddressMandatoryField() {
        new BillingPage().fillDeliveryAddressFields();
    }

    @And("^Click continue$")
    public void clickContinue() {
        new BillingPage().clickOnContinueButton();
    }

    @And("^Click on the air radio button$")
    public void clickOnTheAirRadioButton() {
        new CheckoutPage().clickOn2ndDayAirButton();
    }

    @And("^click continue button$")
    public void clickContinueButton() {
        new CheckoutPage().clickContinue();
    }

    @And("^I should select credit card radio button$")
    public void iShouldSelectCreditCardRadioButton() {
        new CheckoutPage().selectCreditCardRadioButton();
    }

    @And("^I should click continue$")
    public void iShouldClickContinue() {
        new CheckoutPage().clickCon();
    }

    @And("^I should select visa from select credit card drop down$")
    public void iShouldSelectVisaFromSelectCreditCardDropDown() {
        new CheckoutPage().selectVisaFromDropDown();
    }

    @And("^I should able to fill mandatory field of checkout$")
    public void iShouldAbleToFillMandatoryFieldOfCheckout() {
        new CheckoutPage().fillCardDetails();
    }

    @And("^continue button click$")
    public void continueButtonClick() {
        new CheckoutPage().clickConBtn();
    }

    @And("^I should verify the payment method is \"([^\"]*)\"$")
    public void iShouldVerifyThePaymentMethodIs(String expMethod) {
        Assert.assertEquals("Credit Card is not visible", expMethod, new ConfirmOrderPage().verifyCreditCardText());
    }

    @And("^I should able to verify the shipping method is \"([^\"]*)\"$")
    public void iShouldAbleToVerifyTheShippingMethodIs(String expMethod) {
        Assert.assertEquals("2nd Day Air is not displayed", expMethod, new ConfirmOrderPage().verify2ndDayAirText());
    }

    @And("^I should able to verify the total is \"([^\"]*)\"$")
    public void iShouldAbleToVerifyTheTotalIs(String expTotal) {
        Assert.assertEquals("$698.00 is not displayed", expTotal, new ConfirmOrderPage().verifyFinalTotal());
    }

    @And("^I should click on the confirm button$")
    public void iShouldClickOnTheConfirmButton() {
        new ConfirmOrderPage().clickOnConfirmButton();
    }

    @And("^I should verify the text \"([^\"]*)\"$")
    public void iShouldVerifyTheText(String expText) {
        Assert.assertEquals("Thank you is not displayed", expText, new ConfirmOrderPage().verifyThankYouText());
    }

    @And("^I should verify the message \"([^\"]*)\"$")
    public void iShouldVerifyTheMessage(String expText) {
        Assert.assertEquals("Successfully processed message is not displayed", expText, new ConfirmOrderPage().verifySuccessfullyProcessedMessage());
    }

    @And("^I should able to click on to the continue button$")
    public void iShouldAbleToClickOnToTheContinueButton() {
        new ConfirmOrderPage().clickOnContinue();
    }

    @And("^I should able to verify the text \"([^\"]*)\"$")
    public void iShouldAbleToVerifyTheText(String expText) {
        Assert.assertEquals("Welcome to our store is not displayed", expText, new HomePage().getWelcomeToStoreText());
    }

    @And("^I should click on the logout link$")
    public void iShouldClickOnTheLogoutLink() {
        new HomePage().clickOnLogoutLink();
    }

    @Then("^I should verify the URL$")
    public void iShouldVerifyTheURL() {
    }
}
