package com.kodilla.modul0.submodul5;

public class SimpleCalculator {
    public int addAToB(int a, int b) {
        return a + b;
    }
    public int subtractAFromB(int a, int b) {
        return b - a;
    }
}

class Application {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        int result = calculator.addAToB(5, 5);
        System.out.println(result);
    }
}
