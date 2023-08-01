package com.kodilla.modul1.submodul2.jdp;

public class App {
    public static void main(String[] args) {
        ATMImpl session = new ATMImpl();
        session.informConnection();
        session.deposit();
        session.withdraw();
        ATM.informFinishSession();
    }
}
