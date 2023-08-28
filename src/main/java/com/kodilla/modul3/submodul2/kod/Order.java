package com.kodilla.modul3.submodul2.kod;

import java.time.LocalDate;

public class Order {

    private Book book;
    private LocalDate dateOfOrder;

    public Order(Book book, int year, int month, int day) {
        this.book = book;
        this.dateOfOrder = LocalDate.of(year, month, day);
    }

    @Override
    public String toString() {
        return "Order created: " + dateOfOrder + "\n" + " ordered book: " + book;
    }

    public Book getBook() {
        return book;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }
}
