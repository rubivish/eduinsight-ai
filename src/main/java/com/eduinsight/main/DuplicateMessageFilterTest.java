package com.eduinsight.main;

import com.eduinsight.chat.ChatMessage;
import com.eduinsight.chat.DuplicateMessageFilter;

public class DuplicateMessageFilterTest {

    public static void main(String[] args) {

        ChatMessage message = new ChatMessage();

        message.setStudentName("Rubi");

        message.setMessage("Summary# Selenium is an automation framework.");

        DuplicateMessageFilter filter = new DuplicateMessageFilter();

        System.out.println(filter.isDuplicate(message));

        System.out.println(filter.isDuplicate(message));

    }

}