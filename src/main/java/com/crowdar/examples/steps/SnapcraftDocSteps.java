package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.SnapcraftDocumentationPage;
import com.crowdar.examples.pages.SnapcraftDocumentationResultPage;
import com.crowdar.examples.pages.SnapcraftHomePage;
import com.crowdar.examples.pages.SnapcraftStoreResultPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SnapcraftDocSteps extends PageSteps {

    @Given("The client is in snapcraft page")
    public void inHome(){
        Injector._page(SnapcraftHomePage.class).go();
    }

    @When("The client click the documentation button")
    public void clickDoc(){
        Injector._page(SnapcraftHomePage.class).clickDocButton();
    }

    @And("The client search topic (.*)")
    public void searchTopic(String criteria){
        Injector._page(SnapcraftDocumentationPage.class).enterSearchCriteria(criteria);
        Injector._page(SnapcraftDocumentationPage.class).clickSearchButton();

    }

    @Then("The client verify that results are shown for (.*)")
    public void verifyRes(String para){
        Assert.assertTrue(Injector._page(SnapcraftDocumentationResultPage.class).getParagraph().contains(para));
    }

    //scenario 2

    @And("The client click in \"Install the daemon\"")
    public void clickInstallDaemon(){
        Injector._page(SnapcraftDocumentationPage.class).clickSeccionInstallDemon();
    }
    @Then("The client show the selected topic")
    public void verifyTopic(){
        Assert.assertEquals(Injector._page(SnapcraftDocumentationPage.class).getTitle(),"Installing snapd");
    }

    //scenario 3

    @And("The client search the character (.*)")
    public void searchSpecialChar(String criteria){
        Injector._page(SnapcraftDocumentationPage.class).enterSearchCriteria(criteria);
        Injector._page(SnapcraftDocumentationPage.class).clickSearchButton();
    }
    @Then("The client see an error")
    public void verifyResError(){
        Assert.assertEquals(Injector._page(SnapcraftDocumentationResultPage.class).getParagraph(),"Error");
    }

}
