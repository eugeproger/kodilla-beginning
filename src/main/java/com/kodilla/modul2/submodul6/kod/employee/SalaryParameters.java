package com.kodilla.modul2.submodul6.kod.employee;

public class SalaryParameters {

    Double baseSalary;
    Double regulatedBonus;
    Double chefBonus;
    Double functionAddSalary;

    public SalaryParameters(Double baseSalary, Double regulatedBonus, Double chefBonus, Double functionAddSalary) {
        this.baseSalary = baseSalary;
        this.regulatedBonus = regulatedBonus;
        this.chefBonus = chefBonus;
        this.functionAddSalary = functionAddSalary;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    @Override public String toString() {
        return baseSalary + " + " + regulatedBonus + " + " + chefBonus + " + " + functionAddSalary;
    }
}
