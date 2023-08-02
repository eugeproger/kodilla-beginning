package com.kodilla.modul1.submodul4.kod.human;

abstract class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void voice();
}
