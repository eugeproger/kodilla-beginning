package com.kodilla.modul1.submodul5.jdp.employees;

import com.kodilla.modul1.submodul5.jdp.Employee;

public class FixedSalaryEmployee implements Employee {

    private double salary;

    public FixedSalaryEmployee(double salary) {
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return this.salary;
    }
}
