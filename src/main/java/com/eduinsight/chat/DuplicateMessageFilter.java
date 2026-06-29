package com.eduinsight.chat;

import java.util.HashSet;
import java.util.Set;

public class DuplicateMessageFilter {

    private final Set<String> processedMessages = new HashSet<>();

    public boolean isDuplicate(ChatMessage message) {

        String key = message.getStudentName()
                + "_"
                + message.getMessage();

        if (processedMessages.contains(key)) {

            return true;

        }

        processedMessages.add(key);

        return false;
        

    }
    

}