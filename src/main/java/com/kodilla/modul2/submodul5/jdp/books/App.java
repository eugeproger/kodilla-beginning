package com.kodilla.modul2.submodul5.jdp.books;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class App {

    public static void main(String[] args) {
        Random random = new Random();
        List<Book> books = new LinkedList<>();
        for (int i = 0; books.size() < 10; i++) {
            String title = "Book " + (random.nextInt(8999)+1000);
            int year = random.nextInt(53)+1970;
            Book book = new Book(title, year);
            books.add(book);
        }

        BooksProcessor booksProcessor = new BooksProcessor(books);
        booksProcessor.print(booksProcessor.filterLess(2000));
    }
}
