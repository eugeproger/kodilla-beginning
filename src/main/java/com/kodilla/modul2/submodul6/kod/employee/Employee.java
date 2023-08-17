package com.kodilla.modul2.submodul6.kod.employee;

public class Employee {

    String firstName;
    String lastName;
    String peselId;

    public Employee(String firstName, String lastName, String peselId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.peselId = peselId;
    }

    @Override
    public boolean equals(Object o) {
        Employee e = (Employee) o;

        return this.firstName.equals(e.firstName) &&
                this.lastName.equals(e.lastName) &&
                this.peselId.equals(e.peselId);
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(peselId.substring(0, 5));
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + peselId + ")";
    }
}
