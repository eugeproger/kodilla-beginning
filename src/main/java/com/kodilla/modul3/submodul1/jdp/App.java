package com.kodilla.modul3.submodul1.jdp;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class App {

    public static void main(String[] args) {
        Random random = new Random();
        Set<Book> books = new HashSet<>();
        for (int i = 0; books.size() < 10; i++) {
            int titleId = random.nextInt(8999) + 1000;
            int authorId = random.nextInt(8999) + 1000;
            int year = random.nextInt(70) + 1950;
            Book book = new Book("title", titleId, "author", authorId, year);
            books.add(book);
        }

//        FictionLibraryCreator fictionLibrary = new FictionLibraryCreator();
//        fictionLibrary.createFakeLibrary(
//                10,
//                fictionLibrary.createRandomTitleId(1000,9999),
//                fictionLibrary.createRandomAuthorId(1000, 9999),
//                fictionLibrary.createRandomYear(1950,2023)
//        );

        BookProcessor bookProcessor = new BookProcessor(books);
        bookProcessor.displayHallList();
        bookProcessor.displayBookIssuedBefore(2010);
    }
}
