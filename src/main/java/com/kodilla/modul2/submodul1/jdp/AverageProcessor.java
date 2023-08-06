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

    public boolean isEmpty() {
        boolean isEmpty = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                isEmpty = true;
            }
        }
        return isEmpty;
    }

    public void printArray() {
        if (!isEmpty()) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(i + " element of array is " + array[i]);
            }
        } else {
            System.out.println("Array is empty");
        }
    }

    public void printAverageResult() {
        if (!isEmpty()) {
            System.out.println("Average number is " + count());
        }
    }
}
