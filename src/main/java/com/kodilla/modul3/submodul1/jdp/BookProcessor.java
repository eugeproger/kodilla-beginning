package com.kodilla.modul3.submodul1.jdp;

import javax.sound.midi.Soundbank;
import java.util.Set;

public class BookProcessor {

    private Set<Book> books;

    public BookProcessor(Set<Book> books) {
        this.books = books;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void displayBookIssuedBefore(int year) {
        for (Book book: books) {
            if (book.getYear() < year) {
                System.out.println(book);
            }
        }
        printEnd();
    }

    public void displayHallList() {
        for (Book book: books) {
            System.out.println(book);
        }
        printEnd();
    }

    public void printEnd() {
        System.out.println("===========END===========");
    }
}
