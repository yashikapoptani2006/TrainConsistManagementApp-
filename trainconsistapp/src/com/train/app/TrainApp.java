package com.train.app;

import java.util.Arrays;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Bogie IDs (can be unsorted)
        String[] bogieIds = {
                "BG309",
                "BG101",
                "BG550",
                "BG205",
                "BG412"
        };

        // Search key
        String searchKey = "BG205";

        // Sort first (required for Binary Search)
        Arrays.sort(bogieIds);

        boolean found = binarySearch(bogieIds, searchKey);

        // Display sorted array
        System.out.println("Sorted Bogie IDs: " + Arrays.toString(bogieIds));

        // Result
        if (found) {
            System.out.println("Bogie ID " + searchKey + " found.");
        } else {
            System.out.println("Bogie ID " + searchKey + " not found.");
        }
    }

    public static boolean binarySearch(String[] arr, String key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int compare = key.compareTo(arr[mid]);

            if (compare == 0) {
                return true; // found
            } else if (compare < 0) {
                high = mid - 1; // search left
            } else {
                low = mid + 1; // search right
            }
        }

        return false; // not found
    }
}