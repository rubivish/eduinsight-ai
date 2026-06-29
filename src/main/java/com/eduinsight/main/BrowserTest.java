package com.eduinsight.main;

import org.openqa.selenium.WebDriver;

import com.eduinsight.browser.BrowserManager;
import com.eduinsight.meeting.GoogleMeetLauncher;

public class BrowserTest {

    public static void main(String[] args) {

        BrowserManager browserManager = new BrowserManager();

        browserManager.launchBrowser();

        WebDriver driver = browserManager.getDriver();

        GoogleMeetLauncher launcher = new GoogleMeetLauncher(driver);

        launcher.openMeeting("https://meet.google.com/");

    }

}