package com.kodilla.modul1.submodul3.jdp;

public class EliteKnightQuest implements Quest {
    @Override
    public void process() {
        System.out.print(getName());
    }
    @Override
    public String getName() {
        return "Elite Knight Quest";
    }
}
