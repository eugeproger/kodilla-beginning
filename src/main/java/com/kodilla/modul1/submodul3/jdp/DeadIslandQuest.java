package com.kodilla.modul1.submodul3.jdp;

public class DeadIslandQuest implements Quest {
    @Override
    public void process() {
        System.out.print(getName());
    }
    @Override
    public String getName() {
        return "Dead Island Quest";
    }
}