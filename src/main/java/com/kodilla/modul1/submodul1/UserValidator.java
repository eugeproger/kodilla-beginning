package com.kodilla.modul1.submodul1;

public class UserValidator {
    public boolean validateAge(int age) {
        if (age <= 15) {
            System.out.println("Too young!");
            return false;
        } else {
            System.out.println("User age is okay!");
            return true;
        }
    }

    public void validateSex(char sex) {
        if (sex == 'm') {
            System.out.println("User is a male");
        } else if (sex == 'f') {
            System.out.println("User is a female");
        } else {
            System.out.println("Unknown sex!");
        }
    }
}

class Application {
    public static void main(String[] args) {
        System.out.println("Starting... ");

        int age = 15;
        char sex = 'm';

        UserValidator userValidator = new UserValidator();
        boolean isHigherThanFifteen = userValidator.validateAge(age);
        if (isHigherThanFifteen) {
            userValidator.validateSex(sex);
        }
        System.out.println("End of the program");
    }
}
