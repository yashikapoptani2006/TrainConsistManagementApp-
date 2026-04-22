package com.train.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Reuse Bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("Luxury Coach", 80));

        // Filter bogies with capacity > 60
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        // Display original list
        System.out.println("All Bogies:");
        bogies.forEach(System.out::println);

        // Display filtered list
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        filteredBogies.forEach(System.out::println);
    }
}