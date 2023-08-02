package com.kodilla.modul1.submodul4.kod.algorithm;

public class ComplicatedAlgorithmRunner extends ComplicatedAlgorithm {
    @Override
    protected void firstMethodToExecute() {
        System.out.println("This is first method to execute");
    }

    @Override
    protected void secondMethodToExecute() {
        System.out.println("This is second method to execute");
    }

    @Override
    public void run() {
        this.firstMethodToExecute();
        this.secondMethodToExecute();
    }
}
