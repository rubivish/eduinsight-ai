package com.eduinsight.meeting;

import org.openqa.selenium.WebDriver;

public class GoogleMeetLauncher {

    private final WebDriver driver;

    public GoogleMeetLauncher(WebDriver driver) {
        this.driver = driver;
    }

    public void openMeeting(String meetingUrl) {

        driver.get(meetingUrl);

        System.out.println("Google Meet opened successfully.");

    }

}