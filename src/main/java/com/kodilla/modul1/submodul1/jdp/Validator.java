package com.kodilla.modul1.submodul1.jdp;

public class Validator {

    private String name;
    private double age;
    private double height;

    public Validator(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public boolean isNameExist() {
        if (name != null) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isAgeMoreThan30() {
        if (age > 30) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isHeightMoreThen160() {
        if (height > 160) {
            return true;
        } else {
            return false;
        }
    }

    public void printInfoAboutAgeAndHigh() {
        boolean resultAge = isAgeMoreThan30();
        boolean resultHeight = isHeightMoreThen160();
        if (resultAge && resultHeight) {
            System.out.println("User is older than 30 and higher then 160cm");
        } else {
            System.out.println("User is younger than 30 or lower than 160cm");
        }
    }

    public void validateUser() {
        if (isNameExist()) {
            printInfoAboutAgeAndHigh();
        }
    }
}

class Application {
    public static void main(String[] args) {
        Validator validator = new Validator("Adam", 7, 178);
        validator.validateUser();
    }
}
