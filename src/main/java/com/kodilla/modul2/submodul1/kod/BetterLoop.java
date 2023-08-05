package com.kodilla.modul2.submodul1.kod;

public class BetterLoop {

    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "Cat";
        names[1] = "Dog";
        names[2] = "Horse";
        names[3] = "Elephant";
        names[4] = "Tiger";

        for (int i=0; i< names.length; i++) {
            System.out.println("Array element names[" + i + "] = " + names[i]);
        }

        System.out.println(names.length);
    }
}
