package com.kodilla.modul2.submodul6.kod.employee;

public class App {

    public static void main(String[] args) {
        Employee worker1 = new Employee("Zachary", "Taylor", "12345678901");
        Employee worker2 = new Employee("Elizabeth", "Kowalski", "10987654321");

        System.out.println("worker1 == worker2: " + (worker1 == worker2));

        Employee worker3 = new Employee("Monica", "Smith", "99998888777");
        Employee worker4 = new Employee("Monica", "Smith", "99998888777");

        System.out.println("worker3 == worker4: " + (worker3 == worker4));

        Employee worker5 = new Employee("Monika", "Nowak", "99999888000");
        Employee worker6 = new Employee("Monika", "Nowak", "99999888000");

        System.out.println("worker5.equals(worker6): " + (worker5.equals(worker6)));
    }
}
