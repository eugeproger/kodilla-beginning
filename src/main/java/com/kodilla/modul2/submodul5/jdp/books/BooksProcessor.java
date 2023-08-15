package com.kodilla.modul2.submodul5.jdp.books;

import java.util.List;

public class BooksProcessor {

    private List<Book> books;

    public BooksProcessor(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void showBooks2000YearAndMore() {
        for (Book book : books) {
            if (book.getYears() >= 2000) {
                System.out.println("\"" + book.getTitle() + "\" " + book.getYears() + " year");
            }
        }
    }
}
