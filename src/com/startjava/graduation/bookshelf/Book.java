package com.startjava.graduation.bookshelf;

public class Book {

    private final String author;
    private final String title;
    private final String yearPublished;
    private final int lengthBook;

    public Book(String author, String title, String yearPublished) {
        this.author = author;
        this.title = title;
        this.yearPublished = yearPublished;
        lengthBook = toString().length();
    }

    public String getTitle() {
        return title;
    }

    public int getLengthBook() {
        return lengthBook;
    }

    @Override
    public String toString() {
        return author + ", " + title + ", " + yearPublished;
    }
}