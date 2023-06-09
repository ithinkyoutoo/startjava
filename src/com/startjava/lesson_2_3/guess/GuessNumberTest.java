package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nВведите имя первого игрока: ");
        Player player1 = new Player(scan.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scan.nextLine());
        GuessNumber game = new GuessNumber(player1, player2, scan);

        String answer;
        do {
            game.play();
            do {
                System.out.print("\nХотите продолжить игру? [yes/no]: ");
                answer = scan.nextLine();
            } while (!"yes".equals(answer) && !"no".equals(answer));
        } while ("yes".equals(answer));
    }
}