package com.startjava.lesson_2_3.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfAkela = new Wolf();
        wolfAkela.setGender("Мужской");
        wolfAkela.setName("Акела");
        wolfAkela.setWeight(48.3f);
        wolfAkela.setAge(5);
        wolfAkela.setColor("Серый");
        System.out.println("\nПараметры волка :" + "\n" +
                "Пол = " + wolfAkela.getGender() + "\n" +
                "Имя = " + wolfAkela.getName() + "\n" +
                "Вес(кг) = " + wolfAkela.getWeight() + "\n" +
                "Возраст(лет) = " + wolfAkela.getAge() + "\n" +
                "Цвет = " + wolfAkela.getColor() + "\n");
        wolfAkela.go();
        wolfAkela.sit();
        wolfAkela.run();
        wolfAkela.howl();
        wolfAkela.hunt();
    }
}