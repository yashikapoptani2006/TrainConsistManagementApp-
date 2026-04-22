package com.train.app;

import java.util.ArrayList;
import java.util.List;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("Luxury Coach", 80));

        // Calculate total seating capacity
        int totalSeats = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        // Display bogies
        System.out.println("Bogies:");
        bogies.forEach(System.out::println);

        // Display total
        System.out.println("\nTotal Seating Capacity: " + totalSeats);
    }
}