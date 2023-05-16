package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.TopMenuPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
public class HomePageSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I select computers$")
    public void iSelectComputers() {
        new TopMenuPage().selectMenu("Computers");
    }

    @Then("^Computers text displayed$")
    public void computersTextDisplayed() {
        String expectedText = "Computers";
        Assert.assertEquals("Computers text is not displayed", expectedText, new TopMenuPage().getVerifyComputer());
    }

    @When("^I select electronics$")
    public void iSelectElectronics() {
        new TopMenuPage().selectMenu("Electronics");
    }

    @Then("^Electronics text displayed$")
    public void electronicsTextDisplayed() {
        Assert.assertEquals("Electronics is not displayed", "Electronics", new TopMenuPage().getVerifyElectronics());
    }

    @When("^I select apparel$")
    public void iSelectApparel() {
        new TopMenuPage().selectMenu("Apparel");
    }

    @Then("^Apparel text displayed$")
    public void apparelTextDisplayed() {
        Assert.assertEquals("Apparel is not displayed", "Apparel", new TopMenuPage().getVerifyApparel());
    }
}
