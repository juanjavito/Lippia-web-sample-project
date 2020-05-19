package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SnapcraftDocumentationPage extends PageBaseSnapcraft{

    private final String INPUT_SEARCH_CSS ="#search-docs > div > form > input";
    private final String BUTTON_SEARCH_XPATH ="//*[@id=\"search-docs\"]/div/form/button[2]";
    private final String SECCION_INSTALL_DEMON_XPATH="//*[@id=\"navigation\"]/div[2]/nav/ul[1]/li[2]/ul/li[1]/a";
    private final String TITLE_DOC_CSS="body > div.docs-container.u-fixed-width > div > div:nth-child(1) > div > h1";

    public SnapcraftDocumentationPage(RemoteWebDriver driver) {
        super(driver);
    }

    public void enterSearchCriteria(String text) {
        completeField(By.cssSelector(INPUT_SEARCH_CSS), text);
    }

    public void clickSearchButton() {
        clickElement(By.xpath(BUTTON_SEARCH_XPATH));
    }

    private WebElement title() {
        return getWebElement(By.cssSelector(TITLE_DOC_CSS));
    }

    public String getTitle() {
        return title().getText();
    }

    public void clickSeccionInstallDemon(){
        clickElement(By.xpath(SECCION_INSTALL_DEMON_XPATH));
    }

}
