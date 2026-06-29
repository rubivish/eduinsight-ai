package com.eduinsight.browser;

import org.openqa.selenium.WebDriver;

import com.eduinsight.factory.DriverFactory;

public class BrowserManager {

    private WebDriver driver;

    public void launchBrowser() {

        driver = DriverFactory.createDriver();

    }

    public WebDriver getDriver() {

        return driver;

    }

    public void closeBrowser() {

        if (driver != null) {

            driver.quit();

        }

    }

}