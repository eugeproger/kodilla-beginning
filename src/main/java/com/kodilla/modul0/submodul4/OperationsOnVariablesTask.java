package com.kodilla.modul0.submodul4;

public class OperationsOnVariablesTask {
    public static void main(String[] args) {

        int x = 8;
        int seven = 7;

        int result = x % seven;

        if (result == 0) {
            System.out.println("Liczba " + seven + " jest dzielnikiem liczby " + x );
        } else {
            System.out.println("Liczba " + seven + " NIE jest dzielnikiem liczby " + x + " :(");
        }

    }
}
