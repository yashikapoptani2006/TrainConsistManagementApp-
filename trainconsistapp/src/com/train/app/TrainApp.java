package com.train.app;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));
        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}