package com.kodilla.modul1.submodul5.jdp.employees;

import com.kodilla.modul1.submodul5.jdp.Employee;

public class FixedPlusPercentSalaryEmployee implements Employee {

    private final double FIXED = 2000;
    private final double PERCENT = 20;
    private boolean isProductSold;

    public FixedPlusPercentSalaryEmployee(boolean isProductSold) {
        this.isProductSold = isProductSold;
    }

    @Override
    public double calculateSalary() {
        if (isProductSold) {
            return ((PERCENT / 100) * FIXED) + this.FIXED;
        } else {
            return this.FIXED;
        }
    }
}
