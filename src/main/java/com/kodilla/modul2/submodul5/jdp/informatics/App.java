package com.kodilla.modul2.submodul5.jdp.informatics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> results = new ArrayList<>();
        for (int i = 0; results.size() < 11; i++) {
            results.add(random.nextInt(6)+1);
        }

        AverageResultProcessor averageResultProcessor = new AverageResultProcessor(results);
        averageResultProcessor.executeAllProcess();
    }
}
