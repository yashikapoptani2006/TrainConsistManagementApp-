package com.train.app;
import java.util.LinkedList;
public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        LinkedList<String> trainConsist = new LinkedList<>();
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");
        System.out.println("Initial Train Consist: " + trainConsist);
        trainConsist.add(2, "Pantry Car");
        System.out.println("After Adding Pantry Car: " + trainConsist);
        trainConsist.removeFirst();
        trainConsist.removeLast();
        System.out.println("Final Train Consist: " + trainConsist);
    }
}