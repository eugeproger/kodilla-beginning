package com.kodilla.modul3.submodul1.jdp;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class FictionLibraryCreator {
    private final Random random = new Random();
    private final Set<Book> books = new HashSet<>();;

    public Set<Book> getBooks() {
        return books;
    }

    public void createFakeLibrary(int size, int titleId, int authorId, int year) {
        for (int i = 0; books.size() < size; i++) {
            Book book = new Book("title", titleId, "author", authorId, year);
            books.add(book);
        }
    }

    public int createRandomTitleId(int from, int to) {
        int randomScale = to-from;
        return this.random.nextInt(randomScale)+from;
    }

    public int createRandomAuthorId(int from, int to) {
        int randomScale = to-from;
        return this.random.nextInt(randomScale)+from;
    }

    public int createRandomYear(int from, int to) {
        int randomScale = to-from;
        return this.random.nextInt(randomScale)+from;
    }
}
