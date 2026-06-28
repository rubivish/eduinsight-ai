package com.eduinsight.browser;
import org.openqa.selenium.WebDriver;

import com.eduinsight.factory.DriverFactory;

public class BrowserManager {

    private WebDriver driver;

    public void launchBrowser() {

        driver = DriverFactory.createDriver();

        driver.manage().window().maximize();

    }

    public void openMeeting(String url) {

        driver.get(url);

    }

    public WebDriver getDriver() {

        return driver;

    }

    public void closeBrowser() {

        driver.quit();

    }

}