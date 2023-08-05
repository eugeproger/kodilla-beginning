package com.kodilla.modul2.submodul1.jdp;

import java.util.Random;

public class App {

    public static void main(String[] args) {
        InputData inputData = new InputData();
        AverageProcessor averageProcessor = new AverageProcessor(inputData.array(20, 20));
        averageProcessor.printArray();
        averageProcessor.printAverageResult();

    }
}
