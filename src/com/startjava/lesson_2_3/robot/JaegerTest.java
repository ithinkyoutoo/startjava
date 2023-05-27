package com.startjava.lesson_2_3.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger gipsy = new Jaeger();
        gipsy.setModelName("Gipsy Danger");
        gipsy.setMark("Mark-3");
        gipsy.setOrigin("USA");
        gipsy.setHeight(79.25f);
        gipsy.setWeight(1.980f);
        gipsy.setStrength(8);
        gipsy.setArmor(6);

        Jaeger typhoon = new Jaeger("Crimson Typhoon", "Mark-4", "China", 76.2f, 1.722f, 8, 6);
        System.out.printf("%nОбнаружен кайдзю Otachi! Джагерам %s и %s приготовиться%n%n",
                gipsy.getModelName(), typhoon.getModelName());
        System.out.println(gipsy.drift() + "\n");
        System.out.println(typhoon.drift() + "\n");
        typhoon.move();
        typhoon.useWeapon();
        typhoon.attack();
        typhoon.setArmor(4);
        System.out.printf("Статус брони %s %d%n%n", typhoon.getModelName(), typhoon.getArmor());
        gipsy.move();
        gipsy.useWeapon();
        gipsy.attack();
        System.out.println("Отличная работа! Возвращайтесь на базу");
    }
}