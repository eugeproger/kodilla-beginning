package com.kodilla.modul1.submodul3.kod;

public class Dog implements Animal {
    @Override
    public String voice() {
        return "hau hau!";
    }

    @Override
    public String name() {
        return "Dog";
    }
}
