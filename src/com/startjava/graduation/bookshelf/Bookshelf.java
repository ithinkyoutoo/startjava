package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    private static final int NUM_SHELVES = 10;

    private final Book[] books = new Book[NUM_SHELVES];

    private int countBooks;
    private int lengthShelf;

    public Book getBook(int num) {
        return books[num];
    }

    public int getCountBooks() {
        return countBooks;
    }

    public int getLengthShelf() {
        return lengthShelf;
    }

    public int getFreeShelves() {
        return books.length - countBooks;
    }

    public void add(Book book) {
        books[countBooks] = book;
        countBooks++;
        if (lengthShelf < books[countBooks - 1].getLengthBook()) {
            lengthShelf = changeLength();
        }
        System.out.println("Вы добавили книгу: " + books[countBooks - 1]);
    }

    public Book search(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (title.equals(books[i].getTitle())) {
                return books[i];
            }
        }
        return null;
    }

    public boolean delete(Book book) {
        for (int i = 0; i < countBooks; i++) {
            if (book == books[i]) {
                Book tempBook = books[i];
                countBooks--;
                System.arraycopy(books, i + 1, books, i, countBooks - i);
                books[countBooks] = null;
                if (lengthShelf == tempBook.getLengthBook()) {
                    lengthShelf = changeLength();
                }
                return true;
            }
        }
        return false;
    }

    public void clear() {
        Arrays.fill(books, 0, countBooks, null);
        System.out.println("Вы очистили шкаф от книг");
        countBooks = 0;
    }

    private int changeLength() {
        lengthShelf = 0;
        for (int i = 0; i < countBooks; i++) {
            lengthShelf = Math.max(books[i].getLengthBook(), lengthShelf);
        }
        return lengthShelf;
    }
}