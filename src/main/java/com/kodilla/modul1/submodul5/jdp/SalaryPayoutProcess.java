package com.kodilla.modul1.submodul5.jdp;

public class SalaryPayoutProcess extends SalaryPayout {

    public SalaryPayoutProcess(Employee employee) {
        super(employee);
    }

    @Override
    protected void payout() {
        System.out.println("Sending money to employee");
    }
}
