package com.eduinsight.chat;

public class ChatMessage {

    private String studentName;
    private String message;
    private String timestamp;

    public ChatMessage() {

    }

    public ChatMessage(String studentName, String message, String timestamp) {
        this.studentName = studentName;
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "ChatMessage [studentName=" + studentName
                + ", message=" + message
                + ", timestamp=" + timestamp + "]";
    }

}