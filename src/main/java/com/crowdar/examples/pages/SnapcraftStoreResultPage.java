package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SnapcraftStoreResultPage extends PageBaseSnapcraft {

    private final String RESULT_CSS = "body > section.p-strip.is-shallow > div > h2";
    private final String TITLE_XPATH="/html/body/section[2]/div/h2";

    private WebElement stats() {
        return getWebElement(By.cssSelector(RESULT_CSS));
    }
    private WebElement resultsQuan() {
        return getWebElement(By.xpath(TITLE_XPATH));
    }
    public SnapcraftStoreResultPage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public String getStats() {
        return stats().getText();
    }
    public String getTitleQuan(){return resultsQuan().getText();}

}
