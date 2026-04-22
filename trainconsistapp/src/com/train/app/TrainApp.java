package com.train.app;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Example 1: Empty train
        String[] bogieIds = {};

        String searchKey = "BG101";

        try {
            boolean found = searchBogie(bogieIds, searchKey);

            if (found) {
                System.out.println("Bogie ID " + searchKey + " found.");
            } else {
                System.out.println("Bogie ID " + searchKey + " not found.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues safely.");
    }

    public static boolean searchBogie(String[] bogieIds, String key) {

        // Fail-fast validation
        if (bogieIds.length == 0) {
            throw new IllegalStateException(
                    "Cannot search: train consist is empty."
            );
        }

        // Linear Search
        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }
}