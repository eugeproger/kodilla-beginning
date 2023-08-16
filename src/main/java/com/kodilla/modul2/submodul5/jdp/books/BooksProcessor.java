package com.kodilla.modul2.submodul5.jdp.books;

import java.util.LinkedList;
import java.util.List;

public class BooksProcessor {

    private List<Book> books;

    public BooksProcessor(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return this.books;
    }

    public List<Book> filterLess(int year) {
        List<Book> filteredBooks = new LinkedList<>();
        for (Book book : this.books) {
            if (book.getYears() < year) {
                filteredBooks.add(book);
            }
        }
        return filteredBooks;
    }

    public void print(List<Book> filteredBooks) {
        for (Book book : filteredBooks) {
            System.out.println("\"" + book.getTitle() + "\" " + book.getYears() + " year");
        }
    }

}
