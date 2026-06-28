package com.eduinsight.model;

public class EvaluationResult {

    private String studentName;
    private double score;
    private String missingConcepts;
    private String incorrectConcepts;
    private String feedback;

    public EvaluationResult() {
    }

    public EvaluationResult(String studentName,
                            double score,
                            String missingConcepts,
                            String incorrectConcepts,
                            String feedback) {
        this.studentName = studentName;
        this.score = score;
        this.missingConcepts = missingConcepts;
        this.incorrectConcepts = incorrectConcepts;
        this.feedback = feedback;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getMissingConcepts() {
        return missingConcepts;
    }

    public void setMissingConcepts(String missingConcepts) {
        this.missingConcepts = missingConcepts;
    }

    public String getIncorrectConcepts() {
        return incorrectConcepts;
    }

    public void setIncorrectConcepts(String incorrectConcepts) {
        this.incorrectConcepts = incorrectConcepts;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    public void saveEvaluationResult(EvaluationResult result) {
    	
    }

    @Override
    public String toString() {
        return "EvaluationResult{" +
                "studentName='" + studentName + '\'' +
                ", score=" + score +
                ", missingConcepts='" + missingConcepts + '\'' +
                ", incorrectConcepts='" + incorrectConcepts + '\'' +
                ", feedback='" + feedback + '\'' +
                '}';
    }
}