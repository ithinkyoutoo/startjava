package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean isExit = false;
        do {
            Bookshelf.printAllBooks();
            System.out.println("""
                    1. добавить книгу
                    2. найти книгу
                    3. удалить книгу
                    4. очистить шкаф
                    5. выход из программы
                    """);
            switch (scan.nextLine()) {
                case "1" -> System.out.println(Bookshelf.addBook(scan));
                case "2" -> {
                    System.out.print("Введите название книги: ");
                    System.out.println(Bookshelf.searchBook(scan.nextLine()));
                }
                case "3" -> {
                    System.out.print("Введите название книги: ");
                    System.out.println(Bookshelf.deleteBook(scan.nextLine()));
                }
                case "4" -> Bookshelf.clear();
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
