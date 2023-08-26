package com.kodilla.modul3.submodul1.jdp;

import java.time.LocalDate;

public class Book {

    private String title;
    private int titleId;
    private String author;
    private int authorId;
    private int year;

    public Book(String title, int titleId, String author, int authorId, int year) {
        this.title = title;
        this.titleId = titleId;
        this.author = author;
        this.authorId = authorId;
        this.year = year;
    }

    @Override
    public int hashCode() {
        return (this.titleId * 23) + (this.authorId * 31) + (this.year * 41);
    }

    @Override
    public boolean equals(Object o) {
        Book b = (Book) o;
        return (this.title.equals(b.title)) &&
                (this.titleId == b.titleId) &&
                (this.author.equals(b.author)) &&
                (this.authorId == b.authorId) &&
                (this.year == b.year);
    }

    @Override
    public String toString() {
        return this.title + this.titleId + " " + this.author + this.authorId + " " + this.year;
    }

    public String getTitle() {
        return title;
    }

    public int getTitleId() {
        return titleId;
    }

    public String getAuthor() {
        return author;
    }

    public int getAuthorId() {
        return authorId;
    }

    public int getYear() {
        return year;
    }
}
