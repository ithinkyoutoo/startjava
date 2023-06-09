package com.startjava.lesson_2_3_4.person;

public class Person {

    String gender = "Мужской";
    String name = "Иван";
    float height = 1.78f;
    float weight = 78.4f;
    int age = 37;

    String walk() {
        return "Сделал шаг";
    }

    boolean sit() {
        System.out.println("Сидит");
        return true;
    }

    String run() {
        return "Бежит";
    }

    String speak() {
        return "Хватит мной командовать!";
    }

    String learnJava() {
        return "+1 к пониманию Java";
    }
}