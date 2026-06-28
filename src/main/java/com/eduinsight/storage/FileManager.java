package com.eduinsight.storage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.logging.log4j.Logger;

import com.eduinsight.config.ConfigManager;
import com.eduinsight.model.EvaluationResult;
import com.eduinsight.model.InstructorTranscript;
import com.eduinsight.util.Constants;
import com.eduinsight.util.LoggerUtil;

import java.nio.file.Files;
import java.nio.file.Paths;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;
import com.eduinsight.model.StudentSummary;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class FileManager {

    private static final Logger logger =
            LoggerUtil.getLogger(FileManager.class);

    private final ConfigManager config =
            ConfigManager.getInstance();
    
    public void saveTranscript(InstructorTranscript transcript) {

        String folderPath = config.getProperty(Constants.TRANSCRIPT_PATH);

        String filePath = folderPath + Constants.TRANSCRIPT_FILE;

        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));

            writer.write("====================================================");
            writer.newLine();

            writer.write("Topic : " + transcript.getTopic());
            writer.newLine();
            writer.newLine();

            writer.write("Instructor : " + transcript.getInstructorName());
            writer.newLine();
            writer.newLine();

            writer.write("Date : " + transcript.getLectureDate());
            writer.newLine();
            writer.newLine();

            writer.write("Transcript");
            writer.newLine();
            writer.newLine();

            writer.write(transcript.getTranscript());
            writer.newLine();

            writer.write("====================================================");

            writer.close();

            logger.info("Instructor transcript saved successfully.");

        } catch (IOException e) {

            logger.error("Unable to save transcript.", e);

        }

    }
    //Read Transcript
    public String readTranscript() {

        String folderPath = config.getProperty(Constants.TRANSCRIPT_PATH);

        String filePath = folderPath + Constants.TRANSCRIPT_FILE;

        try {

            String transcript = Files.readString(Paths.get(filePath));

            logger.info("Instructor transcript loaded successfully.");

            return transcript;

        } catch (IOException e) {

            logger.error("Unable to read transcript.", e);

            return "";
        }

    }
    //saveStudentSummary
    
    public void saveStudentSummary(StudentSummary summary) {

        String folderPath = config.getProperty(Constants.SUMMARY_PATH);

        String filePath = folderPath + Constants.SUMMARY_FILE;

        File file = new File(filePath);

        try {

            boolean fileExists = file.exists();

            CSVWriter writer = new CSVWriter(new FileWriter(file, true));

            // Write header only once
            if (!fileExists) {

                String[] header = {
                        "Student Name",
                        "Topic",
                        "Summary",
                        "Timestamp"
                };

                writer.writeNext(header);
            }

            String[] data = {
                    summary.getStudentName(),
                    summary.getTopic(),
                    summary.getSummary(),
                    summary.getTimestamp()
            };

            writer.writeNext(data);

            writer.close();

            logger.info("Student summary saved for {}",
                    summary.getStudentName());

        }

        catch (IOException e) {

            logger.error("Unable to save student summary.", e);

        }

    }
    //SaveStudentSummary
    
    public List<StudentSummary> readStudentSummaries() {

        List<StudentSummary> summaryList = new ArrayList<>();

        String folderPath = config.getProperty(Constants.SUMMARY_PATH);

        String filePath = folderPath + Constants.SUMMARY_FILE;

        try {

            CSVReader reader = new CSVReader(new FileReader(filePath));

            // Skip header row
            reader.readNext();

            String[] row;

            while ((row = reader.readNext()) != null) {

                StudentSummary summary = new StudentSummary();

                summary.setStudentName(row[0]);
                summary.setTopic(row[1]);
                summary.setSummary(row[2]);
                summary.setTimestamp(row[3]);

                summaryList.add(summary);
            }

            reader.close();

            logger.info("Loaded {} student summaries.", summaryList.size());

        } catch (IOException | CsvValidationException e) {

            logger.error("Unable to read student summaries.", e);

        }

        return summaryList;
    }
    //saveEvaluationResult
    
    public void saveEvaluationResult(EvaluationResult result) {

        String folderPath =
                config.getProperty(Constants.REPORT_PATH);

        String filePath =
                folderPath + Constants.REPORT_FILE;

        File file = new File(filePath);

        try {

            boolean fileExists = file.exists();

            CSVWriter writer =
                    new CSVWriter(new FileWriter(file, true));

            if (!fileExists) {

                String[] header = {

                        "Student Name",
                        "Score",
                        "Missing Concepts",
                        "Incorrect Concepts",
                        "Feedback"

                };

                writer.writeNext(header);

            }

            String[] data = {

                    result.getStudentName(),

                    String.valueOf(result.getScore()),

                    result.getMissingConcepts(),

                    result.getIncorrectConcepts(),

                    result.getFeedback()

            };

            writer.writeNext(data);

            writer.close();

            logger.info("Evaluation report saved for {}",
                    result.getStudentName());

        }

        catch (IOException e) {

            logger.error("Unable to save evaluation report.", e);

        }

    }

}