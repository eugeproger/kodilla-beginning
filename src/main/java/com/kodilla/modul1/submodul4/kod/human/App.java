package com.kodilla.modul1.submodul4.kod.human;

public class App {
    public static void main(String[] args) {
        Male male = new Male("John");
        String name = male.getName();

        System.out.println(name);
        male.voice();
    }
}
