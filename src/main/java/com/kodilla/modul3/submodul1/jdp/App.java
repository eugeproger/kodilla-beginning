package com.kodilla.modul3.submodul1.jdp;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class App {

    public static void main(String[] args) {
        FictionLibraryCreator fictionLibrary = new FictionLibraryCreator(
                10,
                1000, 9999,
                1000, 9999,
                2000, 2023
        );
        fictionLibrary.createFakeLibrary();

        BookProcessor bookProcessor = new BookProcessor(fictionLibrary.getBooks());
        bookProcessor.displayHallList();
        bookProcessor.displayBookIssuedBefore(2010);
    }
}
