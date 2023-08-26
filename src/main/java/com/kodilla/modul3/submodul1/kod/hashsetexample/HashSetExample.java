package com.kodilla.modul3.submodul1.kod.hashsetexample;

import com.kodilla.modul3.submodul1.kod.hashsetexample.Employee;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {
        Employee worker1 = new Employee(
                "Steven", "Newmack", 1987, 6, 30
        );
        Employee worker2 = new Employee(
                "Jennifer", "Nowak", 1988, 2, 28
        );
        Employee worker3 = new Employee(
                "Robert", "Gfeenfield", 1987, 6, 15
        );
        Employee worker4 = new Employee(
                "Monica", "Smith", 1984, 10, 18
        );

        Employee worker41 = new Employee(
                "Monica", "Smith", 1984, 10, 18
        );

        Employee worker5 = new Employee(
                "Stephanie", "Jackson", 1985, 4, 3
        );

        Set<Employee> workersSet = new HashSet<>();
        workersSet.add(worker1);
        workersSet.add(worker2);
        workersSet.add(worker3);
        workersSet.add(worker4);
        workersSet.add(worker41);
        workersSet.add(worker5);

        System.out.println(worker1.hashCode());
        System.out.println("existing worker3 in the set: " + workersSet.contains(worker3));

        for (Employee theWorker: workersSet) {
            if (theWorker.getBirthDate().getYear() >= 1986)
            System.out.println(theWorker);
        }
    }
}
