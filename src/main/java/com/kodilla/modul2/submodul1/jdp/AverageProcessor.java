package com.kodilla.modul2.submodul1.jdp;

public class AverageProcessor {

    private int[] array;

    public AverageProcessor(int[] array) {
        this.array = array;
    }

    public double count() {
        double sum = 0;
        double result;
        for (int i = 0; i < array.length; i++) {
            sum = array[i] + sum;
        }
        result = sum / array.length;
        return result;
    }

    public void printArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " element of array is " + array[i]);
        }
    }

    public void printAverageResult() {
        System.out.println("Average number is " + count());
    }
}
