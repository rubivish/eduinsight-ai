package com.eduinsight.model;

public class InstructorTranscript {

    private String topic;
    private String transcript;
    private String instructorName;
    private String lectureDate;

    public InstructorTranscript() {
    }

    public InstructorTranscript(String topic,
                                String transcript,
                                String instructorName,
                                String lectureDate) {
        this.topic = topic;
        this.transcript = transcript;
        this.instructorName = instructorName;
        this.lectureDate = lectureDate;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTranscript() {
        return transcript;
    }

    public void setTranscript(String transcript) {
        this.transcript = transcript;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getLectureDate() {
        return lectureDate;
    }

    public void setLectureDate(String lectureDate) {
        this.lectureDate = lectureDate;
    }
    public void saveTranscript(InstructorTranscript transcript) {
    	
    }
    public String readTranscript() {
		return instructorName;
    	
    }
    
    @Override
    public String toString() {
        return "InstructorTranscript{" +
                "topic='" + topic + '\'' +
                ", transcript='" + transcript + '\'' +
                ", instructorName='" + instructorName + '\'' +
                ", lectureDate='" + lectureDate + '\'' +
                '}';
    }
    
}