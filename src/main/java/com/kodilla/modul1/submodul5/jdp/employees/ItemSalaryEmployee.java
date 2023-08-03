package com.kodilla.modul1.submodul5.jdp.employees;

import com.kodilla.modul1.submodul5.jdp.Employee;

public class ItemSalaryEmployee implements Employee {

    private final double itemPay = 5;
    private double item;

    public ItemSalaryEmployee(double item) {
        this.item = item;
    }


    @Override
    public double calculateSalary() {
        return this.item * this.itemPay;
    }
}
