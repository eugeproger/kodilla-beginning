package com.kodilla.modul2.submodul6.jdp;

import java.util.*;

public class App {

    public static void main(String[] args) {
        Random random = new Random();
        Map<Student, List<Integer>> group = new HashMap<>();
        for (int i = 0; group.size() < 20; i++) {

            String name = "Student";
            int id = random.nextInt(88889)+10000;
            Student student = new Student(id, name);

            List<Integer> grades = new ArrayList<>();
            for (int n = 0; grades.size() < 20; n++) {
                grades.add(random.nextInt(6)+1);
            }
            group.put(student, grades);
        }

        Map<Student, List<Integer>> group2 = new HashMap<>();

        Student student1 = new Student(1, "Alan");
        Student student2 = new Student(2, "Max");

        List<Integer> grades1 = new ArrayList<>();
        grades1.add(2);
        grades1.add(3);
        grades1.add(4);

        List<Integer> grades2 = new ArrayList<>();
        grades2.add(4);
        grades2.add(5);
        grades2.add(6);

        group2.put(student1, grades1);
        group2.put(student2, grades2);

        AverageProcessor averageProcessor = new AverageProcessor(group);
        averageProcessor.printAllGrades();
        averageProcessor.countAverage();
        averageProcessor.printAverageGrades();
    }
}
