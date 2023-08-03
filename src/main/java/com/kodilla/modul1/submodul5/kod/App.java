package com.kodilla.modul1.submodul5.kod;

public class App {
    public static void main(String[] args) {
        FixedSalaryEmployee employee = new FixedSalaryEmployee(2000.0);
        HourlySalaryEmployee employee1 = new HourlySalaryEmployee(40, 19);
        SalaryPayoutProcess process = new SalaryPayoutProcess(employee1);
        process.processPayout();
    }
}
