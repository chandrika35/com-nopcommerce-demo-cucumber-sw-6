package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//ul[1]/li/a[text()='Computers ']")
    WebElement computerMenu;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement welcomeToStoreText;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Electronics ']")
    WebElement hoverOnElectronic;

    @CacheLookup
    @FindBy(xpath = "//ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement clickOnCellPhone;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logoutLink;


    public void clickOnComputerMenu() {
        log.info("Click on computer menu" + computerMenu.toString());
        clickOnElement(computerMenu);
    }

    public String getWelcomeToStoreText() {
        log.info("Get welcome to store text" + welcomeToStoreText.toString());
        return getTextFromElement(welcomeToStoreText);
    }

    public void mouseHoverOnElectronicTab() {
        log.info("Hover on electronic" + hoverOnElectronic.toString());
        mouseHoverToElement(hoverOnElectronic);
    }

    public void clickOnCellPhones() {
        log.info("Click on cell phones" + clickOnCellPhone.toString());
        clickOnElement(clickOnCellPhone);
    }

    public void clickOnLogoutLink() {
        log.info("Click on logout link" + logoutLink.toString());
        clickOnElement(logoutLink);
    }
}
