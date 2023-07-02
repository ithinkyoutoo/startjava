package com.startjava.graduation.bookshelf;

public class Book {

    private final String author;
    private final String title;
    private final String yearPublished;
    private final int lengthInfo;

    public Book(String author, String title, String yearPublished) {
        this.author = author;
        this.title = title;
        this.yearPublished = yearPublished;
        lengthInfo = toString().length();
    }

    public String getTitle() {
        return title;
    }

    public int getLengthInfo() {
        return lengthInfo;
    }

    @Override
    public String toString() {
        return author + ", " + title + ", " + yearPublished;
    }
}