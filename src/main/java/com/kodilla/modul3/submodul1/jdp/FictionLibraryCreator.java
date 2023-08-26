package com.kodilla.modul3.submodul1.jdp;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class FictionLibraryCreator {
    private final Random random = new Random();
    private final Set<Book> books = new HashSet<>();
    private int size;
    private int titleFrom;
    private int titleTo;
    private int authorFrom;
    private int authorTo;
    private int yearFrom;
    private int yearTwo;

    public FictionLibraryCreator(
            int size,
            int titleFrom,
            int titleTo,
            int authorFrom,
            int authorTo,
            int yearFrom,
            int yearTwo) {
        this.size = size;
        this.titleFrom = titleFrom;
        this.titleTo = titleTo;
        this.authorFrom = authorFrom;
        this.authorTo = authorTo;
        this.yearFrom = yearFrom;
        this.yearTwo = yearTwo;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public int getTitleFrom() {
        return titleFrom;
    }

    public int getTitleTo() {
        return titleTo;
    }

    public int getAuthorFrom() {
        return authorFrom;
    }

    public int getAuthorTo() {
        return authorTo;
    }

    public int getYearFrom() {
        return yearFrom;
    }

    public int getYearTwo() {
        return yearTwo;
    }

    public void createFakeLibrary() {
        for (int i = 0; books.size() < this.size; i++) {
            Book book = new Book(
                    "title",
                    createRandomTitleId(this.titleFrom, this.titleTo),
                    "author",
                    createRandomAuthorId(this.authorFrom, this.authorTo),
                    createRandomYear(this.yearFrom, this.yearTwo)
            );
            books.add(book);
        }
    }

    public int createRandomTitleId(int from, int to) {
        int randomScale = to-from+1;
        return this.random.nextInt(randomScale)+from;
    }

    public int createRandomAuthorId(int from, int to) {
        int randomScale = to-from+1;
        return this.random.nextInt(randomScale)+from;
    }

    public int createRandomYear(int from, int to) {
        int randomScale = to-from+1;
        return this.random.nextInt(randomScale)+from;
    }
}
