package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SnapcraftDocumentationResultPage extends PageBaseSnapcraft{

    private final String FIRST_RESULT_CSS ="body > div.row > div:nth-child(2) > div > p";

    public SnapcraftDocumentationResultPage(RemoteWebDriver driver) {
        super(driver);
    }
    private WebElement pharagraph() {
        return getWebElement(By.cssSelector(FIRST_RESULT_CSS));
    }
    public String getParagraph() {
        return pharagraph().getText();
    }



}
