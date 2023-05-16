package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckoutPage.class.getName());

    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstName;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastName;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement emailId;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement country;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement city;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement address;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement postCode;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumber;
    @CacheLookup
    @FindBy(name = "save")
    WebElement continueButton;
    @CacheLookup
    @FindBy(id = "shippingoption_1")
    WebElement nextDayButton;
    @CacheLookup
    @FindBy(xpath = "//button[@onclick='ShippingMethod.save()']")
    WebElement clickContinue;
    @CacheLookup
    @FindBy(id = "shippingoption_2")
    WebElement on2ndDayAir;
    @CacheLookup
    @FindBy(xpath = "//form/div[2]/button[1]")
    WebElement clickContinueBtn;
    @CacheLookup
    @FindBy(id = "paymentmethod_1")
    WebElement creditCardRadioButton;
    @CacheLookup
    @FindBy(xpath = "//li[4]/div[2]/div[1]/button[1]")
    WebElement clickCon;
    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement visa;
    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardholderName;
    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumber;
    @CacheLookup
    @FindBy(id = "ExpireMonth")
    WebElement expireMonth;
    @CacheLookup
    @FindBy(id = "ExpireYear")
    WebElement expireYear;
    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement cardCode;
    @CacheLookup
    @FindBy(xpath = "//li[5]/div[2]/div[1]/button[1]")
    WebElement clickConBtn;

    public void fillMandatoryField() {
        log.info("Enter first name" + firstName.toString());
        sendTextToElement(firstName, "Sita");
        log.info("Enter last name" + lastName.toString());
        sendTextToElement(lastName, "Ram");
        log.info("Enter email id" + emailId.toString());
        sendTextToElement(emailId, "sitaram123@gmail.com");
        log.info("Select country" + country.toString());
        selectByVisibleTextFromDropDown(country, "United Kingdom");
        log.info("Select city" + city.toString());
        sendTextToElement(city, "London");
        log.info("Enter address" + address.toString());
        sendTextToElement(address, "111, Moores Mension");
        log.info("Enter postcode" + postCode.toString());
        sendTextToElement(postCode, "WD23 5TD");
        log.info("Enter phone number" + phoneNumber.toString());
        sendTextToElement(phoneNumber, "07845364536");
        log.info("Click on continue button" + continueButton.toString());
        clickOnElement(continueButton);
    }

    public void clickOnNextDayAirButton() {
        log.info("Click on next day button" + nextDayButton.toString());
        clickOnElement(nextDayButton);
    }

    public void setClickContinue() {
        log.info("Click on continue" + clickContinue.toString());
        clickOnElement(clickContinue);
    }

    public void clickOn2ndDayAirButton() {
        log.info("Click on 2nd day air button" + on2ndDayAir.toString());
        clickOnElement(on2ndDayAir);
    }

    public void clickContinue() {
        log.info("Click on continue button" + clickContinueBtn.toString());
        clickOnElement(clickContinueBtn);
    }

    public void selectCreditCardRadioButton() {
        log.info("Select credit card radio button" + creditCardRadioButton.toString());
        clickOnElement(creditCardRadioButton);
    }

    public void clickCon() {
        log.info("Click on continue" + clickCon.toString());
        clickOnElement(clickCon);
    }

    public void selectVisaFromDropDown() {
        log.info("Select visa from drop down" + visa.toString());
        selectByVisibleTextFromDropDown(visa, "Visa");
    }

    public void fillCardDetails() {
        log.info("Enter card holder name" + cardholderName.toString());
        sendTextToElement(cardholderName, "Mrs.Sita Ram");
        log.info("Enter card number" + cardNumber.toString());
        sendTextToElement(cardNumber, "89766667436");
        log.info("Select expire month" + expireMonth.toString());
        selectByVisibleTextFromDropDown(expireMonth, "12");
        log.info("Select expire year" + expireYear.toString());
        selectByVisibleTextFromDropDown(expireYear, "2030");
        log.info("Enter card code" + cardCode.toString());
        sendTextToElement(cardCode, "456");
    }

    public void clickConBtn() {
        log.info("Click on continue button" + clickConBtn.toString());
        clickOnElement(clickConBtn);
    }
}
