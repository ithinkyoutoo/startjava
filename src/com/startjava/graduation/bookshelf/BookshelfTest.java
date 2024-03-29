package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {

    static Scanner scan = new Scanner(System.in);
    static Bookshelf bookshelf = new Bookshelf();

    public static void main(String[] args) {
        do {
            printBookshelf();
            printMenu();
        } while (selectMenuItem());
    }

    private static void printBookshelf() {
        if (checkShelves()) {
            for (Book book : bookshelf.getAllBooks()) {
                int freeSpace = bookshelf.getLengthShelf() - book.getLengthInfo();
                System.out.println("|" + book + " ".repeat(freeSpace) + "|");
                System.out.println("|" + "-".repeat(bookshelf.getLengthShelf()) + "|");
            }
            System.out.println("|" + " ".repeat(bookshelf.getLengthShelf()) + "|\n");
        }
    }

    private static boolean checkShelves() {
        int countBooks = bookshelf.getCountBooks();
        if (countBooks == 0) {
            System.out.println("\nШкаф пуст. Вы можете добавить в него первую книгу.\n");
            return false;
        }
        int freeShelves = bookshelf.getFreeShelves();
        switch (countBooks) {
            case 1 -> System.out.printf("В шкафу %d книга и свободно %d полок%n%n", countBooks, freeShelves);
            case 2, 3, 4 -> System.out.printf("В шкафу %d книги и свободно %d полок%n%n", countBooks, freeShelves);
            case 5 -> System.out.printf("В шкафу %d книг и свободно %d полок%n%n", countBooks, freeShelves);
            case 6, 7, 8 -> System.out.printf("В шкафу %d книг и свободны %d полоки%n%n", countBooks, freeShelves);
            case 9 -> System.out.printf("В шкафу %d книг и свободна %d полока%n%n", countBooks, freeShelves);
            default -> System.out.printf("В шкафу %d книг и нет свободных полок%n%n", countBooks);
        }
        return true;
    }

    private static void printMenu() {
        System.out.println("""
                1. добавить книгу
                2. найти книгу
                3. удалить книгу
                4. очистить шкаф
                5. выход из программы
                """);
    }

    private static boolean selectMenuItem() {
        switch (scan.nextLine()) {
            case "1" -> add();
            case "2" -> search();
            case "3" -> delete();
            case "4" -> bookshelf.clear();
            case "5" -> {return false;}
            default -> System.out.println("Введен неверный пункт меню");
        }
        System.out.println("Для продолжения работы нажмите Enter");
        scan.nextLine();
        return true;
    }

    private static void add() {
        if (bookshelf.getFreeShelves() == 0) {
            System.out.println("Свободных полок нет, вы не можете добавить новую книгу");
        } else {
            System.out.print("Введите автора: ");
            String author = scan.nextLine();
            System.out.print("Введите название книги: ");
            String title = scan.nextLine();
            System.out.print("Введите год издания: ");
            String yearPublished = scan.nextLine();
            bookshelf.add(new Book(author, title, yearPublished));
        }
    }

    private static void search() {
        System.out.print("Введите название книги: ");
        Book book = bookshelf.search(scan.nextLine());
        System.out.println(book != null ? "Результат поиска: " + book : "Данной книги нет в шкафу");
    }

    private static void delete() {
        System.out.print("Введите название книги: ");
        String title = scan.nextLine();
        Book book = bookshelf.search(title);
        System.out.println(bookshelf.delete(title) ? "Вы удалили книгу: " + book : "Данной книги нет в шкафу");
    }
}