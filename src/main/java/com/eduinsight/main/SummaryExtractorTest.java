package com.eduinsight.main;

import com.eduinsight.chat.ChatMessage;
import com.eduinsight.chat.SummaryExtractor;

public class SummaryExtractorTest {

    public static void main(String[] args) {

        ChatMessage message = new ChatMessage();

        message.setStudentName("Rubi");

        message.setMessage("Summary# Selenium is an automation framework.");

        SummaryExtractor extractor = new SummaryExtractor();

        System.out.println(extractor.isSummary(message));

        System.out.println(extractor.extractSummary(message));

    }

}