package com.eduinsight.model;

import java.util.List;

public class StudentSummary {

    private String studentName;
    private String topic;
    private String summary;
    private String timestamp;

    public StudentSummary() {
    }

    public StudentSummary(String studentName,
                          String topic,
                          String summary,
                          String timestamp) {
        this.studentName = studentName;
        this.topic = topic;
        this.summary = summary;
        this.timestamp = timestamp;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
    public void saveStudentSummary(StudentSummary summary) {
    	
    }
    public List<StudentSummary> readStudentSummaries(){
		return null;
    	
    }
    @Override
    public String toString() {
        return "StudentSummary{" +
                "studentName='" + studentName + '\'' +
                ", topic='" + topic + '\'' +
                ", summary='" + summary + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}