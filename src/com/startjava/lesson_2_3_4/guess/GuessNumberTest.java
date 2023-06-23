package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nВведите имя первого игрока: ");
        Player player1 = new Player(scan.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scan.nextLine());
        System.out.print("Введите имя третьего игрока: ");
        Player player3 = new Player(scan.nextLine());
        GuessNumber game = new GuessNumber(scan, player1, player2, player3);

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