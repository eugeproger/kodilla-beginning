package com.kodilla.modul0.submodul5;

public class Animal {

    public void drink() {}
    public void eat() {}
}

class Dog extends Animal {}

class Application6 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.drink();
        dog.eat();
    }
}
