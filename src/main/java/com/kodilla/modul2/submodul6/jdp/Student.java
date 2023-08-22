package com.kodilla.modul2.submodul6.jdp;

public class Student {

    private Integer id;
    private String name;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public boolean equals(Object o) {

        Student s = (Student) o;
        return this.id.equals(s.id) && this.name.equals(s.name);
    }

    @Override
    public String toString() {
        return " (" + this.id + ") " + this.name;
    }
}
