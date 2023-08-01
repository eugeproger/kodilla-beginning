package com.kodilla.modul1.submodul2.kod.telephone;

public class Mobile implements Telephone {

    @Override
    public void callTo(String name) {
        System.out.println("Calling to " + name);
    }
}
