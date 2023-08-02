package com.kodilla.modul1.submodul4.kod.human;

public class Male extends Person{

    public Male(String name) {
        super(name);
    }

    @Override
    void voice() {
        System.out.println("Hey there!");
    }
}
