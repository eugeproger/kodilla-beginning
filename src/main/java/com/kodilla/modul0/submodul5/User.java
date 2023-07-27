package com.kodilla.modul0.submodul5;

public class User {

    private String name;
    private String sex;

    public User(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return this.name;
    }

    public String getSex() {
        return this.sex;
    }
}
class Application3 {
    public static void main(String[] args) {
        User andrew = new User("Andrew", "male");

        String name = andrew.getName();
        String sex = andrew.getSex();

        System.out.println(sex + " " + andrew);
    }
}
