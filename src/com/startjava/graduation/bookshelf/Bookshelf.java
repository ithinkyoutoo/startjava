package com.startjava.graduation.bookshelf;

import java.util.Scanner;
import java.util.Arrays;

public class Bookshelf {

    private static final Book[] BOOKS = new Book[10];

    private static int countBooks;
    private static int lengthBookshelf;

    public static void printAllBooks() {
        if (countBooks == 0) {
            System.out.println("\nШкаф пуст. Вы можете добавить в него первую книгу.\n");
        } else {
            System.out.println(checkBookshelves());
            for (int i = 0; i < countBooks; i++) {
                System.out.println("|" + BOOKS[i] + " ".repeat(lengthBookshelf - BOOKS[i].getLengthBook()) + "|");
                System.out.println("|" + "-".repeat(lengthBookshelf) + "|");
            }
            System.out.println("|" + " ".repeat(lengthBookshelf) + "|\n");
        }
    }

    private static String checkBookshelves() {
        int countFreeBookshelves = BOOKS.length - countBooks;
        return switch (countBooks) {
            case 1 -> "В шкафу " + countBooks + " книга и свободно " + countFreeBookshelves + " полок\n";
            case 2,3,4 -> "В шкафу " + countBooks + " книги и свободно " + countFreeBookshelves + " полок\n";
            case 5 -> "В шкафу " + countBooks + " книг и свободно " + countFreeBookshelves + " полок\n";
            case 6,7,8 -> "В шкафу " + countBooks + " книг и свободны " + countFreeBookshelves + " полоки\n";
            case 9 -> "В шкафу " + countBooks + " книг и свободна " + countFreeBookshelves + " полока\n";
            default -> "В шкафу " + countBooks + " книг и нет свободных полок\n";
        };
    }

    public static String addBook(Scanner scan) {
        if (countBooks == BOOKS.length) {
            return "Свободных полок нет, вы не можете добавить новую книгу";
        }
        System.out.print("Введите автора: ");
        String author = scan.nextLine();
        System.out.print("Введите название книги: ");
        String title = scan.nextLine();
        System.out.print("Введите год издания: ");
        String yearPublished = scan.nextLine();
        BOOKS[countBooks] = new Book(author, title, yearPublished);
        countBooks++;
        if (lengthBookshelf < BOOKS[countBooks - 1].getLengthBook()) {
            lengthBookshelf = changeLength();
        }
        return "Вы добавили книгу: " + BOOKS[countBooks - 1];
    }

    public static String searchBook(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (title.equals(BOOKS[i].getTitle())) {
                return "Книга \"" + BOOKS[i] + "\" находится на " + (i + 1) + " полке";
            }
        }
        return "Данной книги нет в шкафу";
    }

    public static String deleteBook(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (title.equals(BOOKS[i].getTitle())) {
                Book tempBook = BOOKS[i];
                countBooks--;
                System.arraycopy(BOOKS, i + 1, BOOKS, i, countBooks - i);
                BOOKS[countBooks] = null;
                if (lengthBookshelf == tempBook.getLengthBook()) {
                    lengthBookshelf = changeLength();
                }
                return "Вы удалили книгу: " + tempBook;
            }
        }
        return "Данной книги нет в шкафу";
    }

    public static void clear() {
        Arrays.fill(BOOKS, 0, countBooks, null);
        System.out.println("Вы очистили шкаф от книг");
        countBooks = 0;
    }

    private static int changeLength() {
        lengthBookshelf = 0;
        for (int i = 0; i < countBooks; i++) {
            lengthBookshelf = Math.max(BOOKS[i].getLengthBook(), lengthBookshelf);
        }
        return lengthBookshelf;
    }
}
