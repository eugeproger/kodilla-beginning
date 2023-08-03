package com.kodilla.modul1.submodul5.kod;

public class HourlySalaryEmployee implements Employee {

    private double hours;
    private double hourlyPay;

    public HourlySalaryEmployee(double hours, double hourlyPay) {
        this.hours = hours;
        this.hourlyPay = hourlyPay;
    }

    @Override
    public double calculateSalary() {
        return this.hourlyPay * this.hours;
    }
}
