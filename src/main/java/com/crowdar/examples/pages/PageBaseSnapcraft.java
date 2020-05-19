package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseWeb;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PageBaseSnapcraft extends PageBaseWeb {

    public PageBaseSnapcraft(RemoteWebDriver driver) {
        super(driver);
        BASE_URL = "https://snapcraft.io/";
    }


}
