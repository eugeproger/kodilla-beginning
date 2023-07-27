package com.kodilla.modul0.submodul5;

public class SubtractFloatingPoints {

    public double subtract(double a, double b) {
        return a - b;
    }
}

class Application2 {
    public static void main(String[] args) {
        SubtractFloatingPoints subtractFloatingPoints = new SubtractFloatingPoints();
        double result = subtractFloatingPoints.subtract(5.5, 5);

        System.out.println(result);
    }

}