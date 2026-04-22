package com.train.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create test dataset
        List<Bogie> bogies = new ArrayList<>();

        for (int i = 1; i <= 10000; i++) {
            bogies.add(new Bogie("Bogie-" + i, i % 100));
        }

        // ---------------- LOOP BENCHMARK ----------------
        long loopStart = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();

        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                loopResult.add(b);
            }
        }

        long loopEnd = System.nanoTime();
        long loopTime = loopEnd - loopStart;

        // ---------------- STREAM BENCHMARK ----------------
        long streamStart = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        long streamEnd = System.nanoTime();
        long streamTime = streamEnd - streamStart;

        // Display results
        System.out.println("Loop Result Size   : " + loopResult.size());
        System.out.println("Loop Time (ns)     : " + loopTime);

        System.out.println();

        System.out.println("Stream Result Size : " + streamResult.size());
        System.out.println("Stream Time (ns)   : " + streamTime);
    }
}