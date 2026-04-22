package com.train.app;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Unsorted bogie IDs
        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG550"
        };

        // Search key
        String searchKey = "BG309";

        boolean found = false;

        // Linear Search
        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                found = true;
                break; // stop immediately if found
            }
        }

        // Display result
        if (found) {
            System.out.println("Bogie ID " + searchKey + " found in the train consist.");
        } else {
            System.out.println("Bogie ID " + searchKey + " not found.");
        }
    }
}