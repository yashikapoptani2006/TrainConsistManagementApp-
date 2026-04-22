package com.train.app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Sample inputs
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        // Regex patterns
        String trainPatternText = "TRN-\\d{4}";
        String cargoPatternText = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern trainPattern = Pattern.compile(trainPatternText);
        Pattern cargoPattern = Pattern.compile(cargoPatternText);

        // Create matchers
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // Validate
        if (trainMatcher.matches()) {
            System.out.println("Train ID is valid: " + trainId);
        } else {
            System.out.println("Train ID is invalid: " + trainId);
        }

        if (cargoMatcher.matches()) {
            System.out.println("Cargo Code is valid: " + cargoCode);
        } else {
            System.out.println("Cargo Code is invalid: " + cargoCode);
        }
    }
}