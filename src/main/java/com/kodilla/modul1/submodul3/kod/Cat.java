package com.kodilla.modul1.submodul3.kod;

public class Cat implements Animal{
    @Override
    public String voice() {
        return "miau!";
    }

    @Override
    public String name() {
        return "Cat";
    }
}
