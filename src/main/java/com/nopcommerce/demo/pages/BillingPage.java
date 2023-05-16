package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class BillingPage extends Utility {
    private static final Logger log = LogManager.getLogManager().getLogger(BillingPage.class.getName());
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
    @FindBy(xpath = "//div/button[4]")
    WebElement continueButton;


    public void fillDeliveryAddressFields() {


        log.info("Select country" + country.toString());
        selectByVisibleTextFromDropDown(country, "United Kingdom");
        log.info("Select city" + city.toString());
        sendTextToElement(city, "London");
        log.info("Enter address" + address.toString());
        sendTextToElement(address, "111,Moores Mension");
        log.info("Enter postcode" + postCode.toString());
        sendTextToElement(postCode, "WD23 5TD");
        log.info("Enter phone number" + phoneNumber.toString());
        sendTextToElement(phoneNumber, "07845364536");
    }

    public void clickOnContinueButton() {
        log.info("Click on continue button" + continueButton.toString());
        clickOnElement(continueButton);
    }
}
