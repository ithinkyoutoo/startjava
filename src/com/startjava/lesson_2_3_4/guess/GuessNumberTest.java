package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nВведите имена игроков: ");
        GuessNumber game = new GuessNumber(scan,
                new Player(scan.nextLine()),
                new Player(scan.nextLine()),
                new Player(scan.nextLine()));

        String answer = "yes";
        do {
            if ("yes".equals(answer)) {
                game.play();
            }
            System.out.print("\nХотите продолжить игру? [yes/no]: ");
            answer = scan.nextLine();
        } while (!"no".equals(answer));
    }
}