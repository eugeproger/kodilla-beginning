package com.kodilla.modul1.submodul6.jdp.mine;

public class App {

    public static void main(String[] args) {
        Name name1 = new Name("Alan");
        Name name2 = new Name("Mark");

        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());

    }
}
