package com.kodilla.modul2.submodul2.kod;

public class NestedLoop {

    public static void main(String[] args) {
        int sum = 0;
        int quantity = 0;
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 8; k++) {
                sum = sum + i + k;
                quantity ++;
            }
        }

        System.out.println("Sum of elements: " + sum);
        System.out.println("Quantity of elements: " + quantity);
        System.out.println("Average value: " + sum / quantity);
    }
}
