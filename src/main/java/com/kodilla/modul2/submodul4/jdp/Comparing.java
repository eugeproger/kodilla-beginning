package com.kodilla.modul2.submodul4.jdp;

public class Comparing {
    public static void main(String[] args) {
        int number = 10;
        boolean positive = true;
        char a = 'a';

        Integer wrapperNumber = 10;
        Boolean wrapperPositive = true;
        Character wrapperA = 'a';

        if (number == wrapperNumber) {
            System.out.println("Equal");
        }

        if (positive == wrapperPositive) {
            System.out.println("Equal");
        }

        if (a == wrapperA) {
            System.out.println("Equal");
        }
    }
}
