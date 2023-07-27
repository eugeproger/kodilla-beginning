package com.kodilla.modul0.submodul5;

public class Cat {

    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Application4 {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom", 5);
        String name = cat.getName();
        int age = cat.getAge();

        System.out.println(name + " " + age);
    }
}
