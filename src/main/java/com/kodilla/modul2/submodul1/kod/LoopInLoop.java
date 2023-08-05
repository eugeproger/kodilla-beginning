package com.kodilla.modul2.submodul1.kod;

public class LoopInLoop {
    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            System.out.println("i = " + i);
            for (int n=0; n<5; n++) {
                System.out.println("n = " + n);
            }
        }
    }
}
