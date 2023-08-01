package com.kodilla.modul1.submodul2.jdp;

public class ATMImpl implements ATM{
    @Override
    public void deposit() {
        System.out.println("Deposit execution");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdraw execution");
    }
}
