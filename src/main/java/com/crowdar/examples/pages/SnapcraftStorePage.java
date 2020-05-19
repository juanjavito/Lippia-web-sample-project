package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SnapcraftStorePage extends PageBaseSnapcraft{
    private final String INPUT_SEARCH_XPATH = "//*[@id=\"search-input\"]";
    private final String SEARCH_BUTTON_XPATH="//*[@id=\"main-content\"]/div/form/button";

    public SnapcraftStorePage(RemoteWebDriver driver) {
        super(driver);
    }
    public void enterSearchCriteria(String text) {
        completeField(By.xpath(INPUT_SEARCH_XPATH), text);
    }

    public void clickSearchButton() {
        clickElement(By.xpath(SEARCH_BUTTON_XPATH));
    }
}
