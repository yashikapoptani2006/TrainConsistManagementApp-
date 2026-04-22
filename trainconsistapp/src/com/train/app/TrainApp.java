package com.train.app;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.print("Original Capacities: ");
        printArray(capacities);

        // Bubble Sort
        for (int i = 0; i < capacities.length - 1; i++) {

            for (int j = 0; j < capacities.length - 1 - i; j++) {

                if (capacities[j] > capacities[j + 1]) {

                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted Capacities:   ");
        printArray(capacities);
    }

    // Helper method
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}