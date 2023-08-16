package com.kodilla.modul2.submodul5.jdp.informatics;

import java.util.List;

public class AverageResultProcessor {

    private List<Integer> results;
    private int min;
    private int max;
    private double average;

    public AverageResultProcessor(List<Integer> results) {
        this.results = results;
    }

    public List<Integer> getResults() {
        return results;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public double getAverage() {
        return average;
    }

    public int getIterateMin() {
        this.min = 6;
        int iteration = 0;
        for (int i = 0; i < results.size(); i++) {
            if (results.get(i) < min) {
                min = results.get(i);
                iteration = i;
            }
        }
        return iteration;
    }

    public int getIterateMax() {
        this.max = 0;
        int iteration = 0;
        for (int i = 0; i < results.size(); i++) {
            if (results.get(i) > max) {
                max = results.get(i);
                iteration = i;
            }
        }
        return iteration;
    }

    public void removeMaxResult() {
        int max = getIterateMax();
        this.results.remove(max);
    }

    public void removeMinResult() {
        int min = getIterateMin();
        this.results.remove(min);
    }

    public void countAverage() {

        if (results.size() < 3) {
            this.average = 0;
        } else {
            double sum = 0;
            for (double result : this.results) {
                sum += result;
            }
            this.average = sum / results.size();
    }

    public void printResults() {
        System.out.println("Results: ");
        for (int result : this.results) {
            System.out.println(result);
        }
        System.out.println("--------------------------");
    }

    public void printMin() {
        System.out.println("Min = " + this.min);
    }

    public void printMax() {
        System.out.println("Max = " + this.max);
    }

    public void printAverage() {
        System.out.println("Average = " + this.average);
    }

    public void executeAllProcess() {
        printResults();
        removeMaxResult();
        removeMinResult();
        printMin();
        printMax();
        System.out.println("Removing min and max results...");
        printResults();
        countAverage();
        printAverage();
    }
}

