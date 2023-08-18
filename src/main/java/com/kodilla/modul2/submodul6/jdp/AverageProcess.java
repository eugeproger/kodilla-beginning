package com.kodilla.modul2.submodul6.jdp;

import java.util.List;
import java.util.Map;

public class AverageProcess {

    private Map<Student, List<Integer>> group;

    public AverageProcess(Map<Student, List<Integer>> group) {
        this.group = group;
    }

    public Map<Student, List<Integer>> getGroup() {
        return group;
    }

    public void countAverage() {
        int sum = 0;
        for (Map.Entry<Student, List<Integer>> entry: this.group.entrySet()) {
            for (int grade : entry.getValue()) {
                sum = grade;
            }
        }
    }
}
