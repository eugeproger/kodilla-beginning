package com.kodilla.modul2.submodul6.kod.employee;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {
        Employee worker1 = new Employee("Jennifer", "Nowak", "12345678901");
        Employee worker2 = new Employee("Sarah", "Taylor", "12345678901");
        Employee worker3 = new Employee("Laura", "Pinelli", "12345678901");
        Employee worker4 = new Employee("Laura", "Pinelli", "12345678901");

        SalaryParameters params1 = new SalaryParameters(
                5000.0, 3000.0, 0.0, 0.0
        );
        SalaryParameters params2 = new SalaryParameters(
                4000.0, 2000.0, 1000.0, 0.0
        );
        SalaryParameters params3 = new SalaryParameters(
                4500.0, 3500.0, 0.0, 0.0
        );
        SalaryParameters params4 = new SalaryParameters(
                11000.0, 0.0, 2000.0, 1000.0
        );

        Map<Employee, SalaryParameters> paymentParameters = new HashMap<>();
        paymentParameters.put(worker1, params1);
        paymentParameters.put(worker2, params2);
        paymentParameters.put(worker3, params3);
        paymentParameters.put(worker4, params4);

        System.out.println(paymentParameters.get(worker1));
        System.out.println(paymentParameters.get(worker3));
        System.out.println(paymentParameters.get(worker4));

        for (Map.Entry<Employee, SalaryParameters> entry: paymentParameters.entrySet()) {

            if (entry.getValue().getBaseSalary() >= 5000) {
                System.out.println("Salary of " + entry.getKey() + " equals " + entry.getValue());
            }

            System.out.println("Salary of " + entry.getKey() + " equals " + entry.getValue());
        }

    }
}
