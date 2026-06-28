package com.eduinsight.main;

import com.eduinsight.storage.FileManager;
import com.eduinsight.model.EvaluationResult;

public class Main {

    public static void main(String[] args) {

        FileManager fileManager =
                new FileManager();

        EvaluationResult result =
                new EvaluationResult(

                        "Priya",

                        80.0,

                        "Locators",

                        "None",

                        "Good understanding."

                );

        fileManager.saveEvaluationResult(result);

        System.out.println("Evaluation report saved.");

    }

}