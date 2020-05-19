package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SnapcraftHomePage extends PageBaseSnapcraft {
    private final String STORE_CSS ="#navigation > div > nav > ul:nth-child(2) > li:nth-child(1) > a";
    private final String DOC_CSS ="#navigation > div > nav > ul:nth-child(2) > li:nth-child(5) > a";
    public SnapcraftHomePage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }
    public void go() {
        navigateToCompleteURL();
    }
    public void clickSearchButton() {
        clickElement(By.cssSelector(STORE_CSS));
    }
    public void clickDocButton() {
        clickElement(By.cssSelector(DOC_CSS));
    }

}
