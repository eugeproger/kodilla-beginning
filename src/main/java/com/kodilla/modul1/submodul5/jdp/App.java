package com.kodilla.modul1.submodul5.jdp;

import com.kodilla.modul1.submodul5.jdp.employees.FixedPlusPercentSalaryEmployee;
import com.kodilla.modul1.submodul5.jdp.employees.FixedSalaryEmployee;
import com.kodilla.modul1.submodul5.jdp.employees.HourlySalaryEmployee;
import com.kodilla.modul1.submodul5.jdp.employees.ItemSalaryEmployee;

public class App {
    public static void main(String[] args) {
        FixedSalaryEmployee employee = new FixedSalaryEmployee(2001);
        HourlySalaryEmployee employee1 = new HourlySalaryEmployee(40, 19);
        FixedPlusPercentSalaryEmployee employee2 = new FixedPlusPercentSalaryEmployee(true);
        ItemSalaryEmployee employee3 = new ItemSalaryEmployee(5);


        SalaryPayoutProcess process = new SalaryPayoutProcess(employee2);
        process.processPayout();
    }
}
