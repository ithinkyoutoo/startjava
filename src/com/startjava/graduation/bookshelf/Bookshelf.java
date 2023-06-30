package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    private final Book[] books = new Book[10];

    private int countBooks;
    private int lengthBookshelf;

    public void printAllBooks() {
        if (countBooks == 0) {
            System.out.println("\nШкаф пуст. Вы можете добавить в него первую книгу.\n");
        } else {
            System.out.println(checkBookshelves());
            for (int i = 0; i < countBooks; i++) {
                System.out.println("|" + books[i] + " ".repeat(lengthBookshelf - books[i].getLengthBook()) + "|");
                System.out.println("|" + "-".repeat(lengthBookshelf) + "|");
            }
            System.out.println("|" + " ".repeat(lengthBookshelf) + "|\n");
        }
    }

    private String checkBookshelves() {
        return switch (countBooks) {
            case 1 -> "В шкафу " + countBooks + " книга и свободно " + getCountFreeBookshelves() + " полок\n";
            case 2,3,4 -> "В шкафу " + countBooks + " книги и свободно " + getCountFreeBookshelves() + " полок\n";
            case 5 -> "В шкафу " + countBooks + " книг и свободно " + getCountFreeBookshelves() + " полок\n";
            case 6,7,8 -> "В шкафу " + countBooks + " книг и свободны " + getCountFreeBookshelves() + " полоки\n";
            case 9 -> "В шкафу " + countBooks + " книг и свободна " + getCountFreeBookshelves() + " полока\n";
            default -> "В шкафу " + countBooks + " книг и нет свободных полок\n";
        };
    }

    public int getCountFreeBookshelves() {
        return books.length - countBooks;
    }

    public void addBook(Book book) {
        books[countBooks] = book;
        countBooks++;
        if (lengthBookshelf < books[countBooks - 1].getLengthBook()) {
            lengthBookshelf = changeLength();
        }
        System.out.println("Вы добавили книгу: " + books[countBooks - 1]);
    }

    public String searchBook(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (title.equals(books[i].getTitle())) {
                return "Книга \"" + books[i] + "\" находится на " + (i + 1) + " полке";
            }
        }
        return "Данной книги нет в шкафу";
    }

    public String deleteBook(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (title.equals(books[i].getTitle())) {
                Book tempBook = books[i];
                countBooks--;
                System.arraycopy(books, i + 1, books, i, countBooks - i);
                books[countBooks] = null;
                if (lengthBookshelf == tempBook.getLengthBook()) {
                    lengthBookshelf = changeLength();
                }
                return "Вы удалили книгу: " + tempBook;
            }
        }
        return "Данной книги нет в шкафу";
    }

    public void clear() {
        Arrays.fill(books, 0, countBooks, null);
        System.out.println("Вы очистили шкаф от книг");
        countBooks = 0;
    }

    private int changeLength() {
        lengthBookshelf = 0;
        for (int i = 0; i < countBooks; i++) {
            lengthBookshelf = Math.max(books[i].getLengthBook(), lengthBookshelf);
        }
        return lengthBookshelf;
    }
}