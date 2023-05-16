package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ConfirmOrderPage extends Utility {
    private static final Logger log = LogManager.getLogger(ConfirmOrderPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Credit Card')]")
    WebElement creditCardText;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/span[2]")
    WebElement nextDayAirText;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement confirm;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement thankYouText;
    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement successfullyMessage;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButtonClick;

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Credit Card']")
    WebElement checkCreditCardText;
    @CacheLookup
    @FindBy(xpath = "//div[2]/div[2]/ul[1]/li[1]/span[2]")
    WebElement check2ndDayAirText;
    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]/span[1]")
    WebElement checkLastTotal;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement confirmButton;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement checkThankYouText;
    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement successMessage;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement clickOnContinue;


    public String getCreditCardText() {
        log.info("Get credit card text" + creditCardText.toString());
        return getTextFromElement(creditCardText);
    }

    public String getNextDayAirText() {
        log.info("Get next day air text" + nextDayAirText.toString());
        return getTextFromElement(nextDayAirText);
    }

    public void clickOnConfirmButton() {
        log.info("Click on confirm button" + confirm.toString());
        clickOnElement(confirm);
    }

    public String getThankYouText() {
        log.info("Get thank you text" + thankYouText.toString());
        return getTextFromElement(thankYouText);
    }

    public String getSuccessfullyMessage() {
        log.info("Get success message" + successfullyMessage.toString());
        return getTextFromElement(successfullyMessage);
    }

    public void setContinueButtonClick() {
        log.info("Click on continue button" + continueButtonClick.toString());
        clickOnElement(continueButtonClick);
    }

    public String verifyCreditCardText() {
        log.info("Verify Credit card text" + checkCreditCardText.toString());
        return getTextFromElement(checkCreditCardText);
    }

    public String verify2ndDayAirText() {
        log.info("Verify 2nd day air text" + check2ndDayAirText.toString());
        return getTextFromElement(check2ndDayAirText);
    }

    public String verifyFinalTotal() {
        log.info("Verify final total" + checkLastTotal.toString());
        return getTextFromElement(checkLastTotal);
    }

    public void clickOnConfirmBtn() {
        log.info("Click on confirm button" + confirmButton.toString());
        clickOnElement(confirmButton);
    }

    public String verifyThankYouText() {
        log.info("Verify thank you text" + checkThankYouText.toString());
        return getTextFromElement(checkThankYouText);
    }

    public String verifySuccessfullyProcessedMessage() {
        log.info("Verify success message" + successMessage.toString());
        return getTextFromElement(successMessage);
    }

    public void clickOnContinue() {
        log.info("Click on continue" + clickOnContinue.toString());
        clickOnElement(clickOnContinue);
    }
}
