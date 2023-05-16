package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TopMenuPage extends Utility {
    private static final Logger log = LogManager.getLogger(TopMenuPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[@href='/computers']")
    WebElement verifyComputer;
    @CacheLookup
    @FindBy(xpath = "//a[@href='/electronics']")
    WebElement verifyElectronics;
    @CacheLookup
    @FindBy(xpath = "//a[@href='/apparel']")
    WebElement verifyApparel;

    public void selectMenu(String menu) {
        List<WebElement> menuList = driver.findElements(By.xpath("//div[@class = 'header-menu']/ul/li"));
        try {
            for (WebElement options : menuList) {
                if (options.getText().equals(menu)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            menuList = driver.findElements(By.xpath("//div[@class = 'header-menu']/ul/li"));
        }
    }

    public String getVerifyComputer() {
        log.info("Verify Computer text" + verifyComputer.toString());
        return getTextFromElement(verifyComputer);
    }

    public String getVerifyElectronics() {
        log.info("Verify electronics text" + verifyElectronics.toString());
        return getTextFromElement(verifyElectronics);
    }

    public String getVerifyApparel() {
        log.info("Verify apparel text" + verifyApparel.toString());
        return getTextFromElement(verifyApparel);
    }
}
