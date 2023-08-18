package com.kodilla.modul2.submodul6.jdp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AverageProcessor {

    private Map<Student, Double> averageGrades = new HashMap<>();
    private Map<Student, List<Integer>> group;

    public AverageProcessor(Map<Student, List<Integer>> group) {
        this.group = group;
    }

    public Map<Student, List<Integer>> getGroup() {
        return group;
    }

    public Map<Student, Double> getAverageGrades() {
        return averageGrades;
    }

    public void countAverage() {
        for (Map.Entry<Student, List<Integer>> entry: this.group.entrySet()) {
            Double result = 0.0;
            for (Integer grade : entry.getValue()) {
                result = result + grade;
            }
            result = result / entry.getValue().size();
            this.averageGrades.put(entry.getKey(), result);
        }
    }

    public void printAverageGrades() {
        for (Map.Entry<Student, Double> averageGrade: this.averageGrades.entrySet()) {
            System.out.println(averageGrade.getKey() + ": " + averageGrade.getValue());
        }
    }

    public void printAllGrades() {
        for (Map.Entry<Student, List<Integer>> entry : this.group.entrySet()) {
            System.out.print(entry.getKey());
            for (int grade: entry.getValue()) {
                System.out.print(" " + grade + " ");
            }
            System.out.println(" ");
        }
    }
}
