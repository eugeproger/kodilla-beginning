package com.kodilla.modul1.submodul2.jdp;

public interface ATM {
    void deposit();
    void withdraw();
    default void informConnection() {
        System.out.println("Connection...");
    }
    static void informFinishSession() {
        System.out.println("Session is over");
    }
}
