package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bookshelf bookshelf = new Bookshelf();

        boolean isExit = false;
        do {
            bookshelf.printAllBooks();
            System.out.println("""
                    1. добавить книгу
                    2. найти книгу
                    3. удалить книгу
                    4. очистить шкаф
                    5. выход из программы
                    """);
            switch (scan.nextLine()) {
                case "1" -> {
                    if (bookshelf.getCountFreeBookshelves() == 0) {
                        System.out.println("Свободных полок нет, вы не можете добавить новую книгу");
                        break;
                    }
                    System.out.print("Введите автора: ");
                    String author = scan.nextLine();
                    System.out.print("Введите название книги: ");
                    String title = scan.nextLine();
                    System.out.print("Введите год издания: ");
                    String yearPublished = scan.nextLine();
                    bookshelf.addBook(new Book(author, title, yearPublished));
                }
                case "2" -> {
                    System.out.print("Введите название книги: ");
                    System.out.println(bookshelf.searchBook(scan.nextLine()));
                }
                case "3" -> {
                    System.out.print("Введите название книги: ");
                    System.out.println(bookshelf.deleteBook(scan.nextLine()));
                }
                case "4" -> bookshelf.clear();
                case "5" -> isExit = true;
                default -> System.out.println("Введен неверный пункт меню");
            }
            if (!isExit) {
                System.out.println("Для продолжения работы нажмите Enter");
                scan.nextLine();
            }
        } while (!isExit);
    }
}