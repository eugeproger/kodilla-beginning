package com.kodilla.modul1.submodul5.kod;

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
