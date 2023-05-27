package com.startjava.lesson_1.final_;

public class MyFirstGame {

    public static void main(String[] args) {
        int searchNum = 7;
        for (int i = 1; i <= 100; i++) {
            if (i == searchNum) {
                System.out.println("Вы победили!");
                i = 100;
            } else {
                System.out.printf("число %d меньше того, что загадал компьютер %n", i);
            }
        }
    }
}