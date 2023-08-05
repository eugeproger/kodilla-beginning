package com.kodilla.modul2.submodul1.jdp;

public class App {

    public static void main(String[] args) {
        Array array = new Array();

        AverageProcessor averageProcessor = new AverageProcessor(array.createRandom(20, 20));
        AverageProcessor averageProcessor1 = new AverageProcessor(array.createEmpty(20));
        averageProcessor1.printArray();
        averageProcessor1.printAverageResult();

    }
}
