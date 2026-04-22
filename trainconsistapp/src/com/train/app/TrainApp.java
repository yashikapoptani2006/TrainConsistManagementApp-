package com.train.app;

import java.util.Arrays;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Array of bogie names
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // Display original
        System.out.println("Original Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));

        // Sort alphabetically
        Arrays.sort(bogieNames);

        // Display sorted
        System.out.println("\nSorted Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));
    }
}