package com.startjava.graduation.bookshelf;

public class Book {

    private static final int PUNCTUATION_MARKS = 4;

    private final String author;
    private final String title;
    private final String yearPublished;
    private final int lengthBook;

    public Book(String author, String title, String yearPublished) {
        this.author = author;
        this.title = title;
        this.yearPublished = yearPublished;
        lengthBook = author.length() + title.length() + yearPublished.length() + PUNCTUATION_MARKS;
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
