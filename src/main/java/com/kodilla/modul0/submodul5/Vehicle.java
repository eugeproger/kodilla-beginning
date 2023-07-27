package com.kodilla.modul0.submodul5;

public class Vehicle {

    private String model;
    private String year;

    public Vehicle(String model, String year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }
}

class Car extends Vehicle {
    private double engineCapacity;

    public Car(double engineCapacity, String model, String year) {
        super(model, year);
        this.engineCapacity = engineCapacity;
    }

    public void turnOnEngine() {

    }
    public void turnOffEngine() {

    }
}

class Application5 {
    public static void main(String[] args) {
        Car car = new Car(2.5, "XYZ", "2004");
        String model = car.getModel();
        System.out.println(model);
    }
}