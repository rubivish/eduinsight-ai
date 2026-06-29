package com.eduinsight.chat;

public class SummaryExtractor {

    public boolean isSummary(ChatMessage chatMessage) {

        if (chatMessage == null)
            return false;

        if (chatMessage.getMessage() == null)
            return false;

        String text = chatMessage.getMessage()
                .trim()
                .toLowerCase();

        return text.startsWith("summary");

    }

    public String extractSummary(ChatMessage chatMessage) {

        String text = chatMessage.getMessage();

        text = text.replaceFirst("(?i)summary[:#-]*", "");

        return text.trim();

    }

}