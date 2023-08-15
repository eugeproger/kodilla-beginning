package com.kodilla.modul2.submodul5.jdp.books;

public class Book {

    private String title;
    private int years;

    public Book(String title, int years) {
        this.title = title;
        this.years = years;
    }

    public String getTitle() {
        return title;
    }

    public int getYears() {
        return years;
    }
}
