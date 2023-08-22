package com.kodilla.modul2.submodul6.kodilla;

import java.util.*;


class Student {

    private String firstName;
    private String lastName;
    private String group;

    public Student(String firstName, String lastName, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        final Student e = (Student) o;
        return this.firstName.equals(e.firstName) && this.lastName.equals(e.lastName) && this.group.equals(e.group);
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(group.substring(0,1));
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + "(grupa: " + group + ")";
    }
}

class ResultProcessor {

    private List<Integer> result;

    public ResultProcessor(List<Integer> result) {
        this.result = result;
    }

    public double average() {
        double sum = 0;
        for (int i = 0; i<result.size(); i++) {
            sum = sum + result.get(i);
        }
        return sum / result.size();
    }
}




class Application {

    private static final Random RANDOM = new Random();

    private static List<Integer> initResult() {
        int size = RANDOM.nextInt(10) + 1;
        List<Integer> result = new ArrayList<>();
        for (int i=0; i<size; i++) {
            result.add(RANDOM.nextInt(6) + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Imie1", "Nazwisko1", "1");
        Student student2 = new Student("Imie2", "Nazwisko2", "2");
        Student student3 = new Student("Imie3", "Nazwisko3", "3");

        ResultProcessor result1 = new ResultProcessor(initResult());
        ResultProcessor result2 = new ResultProcessor(initResult());
        ResultProcessor result3 = new ResultProcessor(initResult());

        Map<Student, ResultProcessor> resultProcessor = new HashMap<>();

        resultProcessor.put(student1, result1);
        resultProcessor.put(student2, result2);
        resultProcessor.put(student3, result3);

        for (Map.Entry<Student, ResultProcessor> entry: resultProcessor.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue().average());
        }
    }
}

