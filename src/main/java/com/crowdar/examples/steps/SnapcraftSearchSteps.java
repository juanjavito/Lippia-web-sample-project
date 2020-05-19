package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class SnapcraftSearchSteps extends PageSteps {


    @Given("The client is in snapcraft home page")
    public void home() {
        Injector._page(SnapcraftHomePage.class).go();
    }

    @When("The client click the store button")
    public void clickSearch(){
        Injector._page(SnapcraftHomePage.class).clickSearchButton();
    }

    @And("The client search for (.*)")
    public void search(String criteria) {

        Injector._page(SnapcraftStorePage.class).enterSearchCriteria(criteria);
        Injector._page(SnapcraftStorePage.class).clickSearchButton();

    }

    @Then("The client verify that results are shown properly")
    public void statVerfication() {
        Assert.assertTrue(Injector._page(SnapcraftStoreResultPage.class).getStats().contains("We’ve found"));
    }

    //steps scenario 2


    @Then("The client verify that no results are shown for (.*)")
    public void statVerficationDsntExist(String app) {
        Assert.assertEquals(Injector._page(SnapcraftStoreResultPage.class).getTitleQuan(),"We couldn't find anything for your search\n"+app+".");

    }

    // Scenario 3

    @Then("The client sees an error")
      public void statVerificationWithError(){
        Assert.assertEquals(Injector._page(SnapcraftStoreResultPage.class).getStats(),"Error");
    }




}
