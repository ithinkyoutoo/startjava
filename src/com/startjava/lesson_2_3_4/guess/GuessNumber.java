package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private Scanner scan;

    public GuessNumber(Player player1, Player player2, Scanner scan) {
        this.player1 = player1;
        this.player2 = player2;
        this.scan = scan;
    }

    public void play() {
        Player currentPlayer = player1;
        int playerNum;
        int hiddenNum = 1 + (int) (Math.random() * 100);
        System.out.println("\nКомпьютер загадал число от 1 до 100, попробуйте отгадать!");
        do {
            System.out.print("\n" + currentPlayer.getName() + " введите число: ");
            playerNum = scan.nextInt();
            scan.nextLine();
            if (playerNum == hiddenNum) {
                System.out.println("Вы угадали!");
                break;
            }
            if (playerNum > hiddenNum) {
                System.out.println("Число " + playerNum + " больше того, что загадал компьютер");
            } else {
                System.out.println("Число " + playerNum + " меньше того, что загадал компьютер");
            }
            if (currentPlayer == player1) {
                currentPlayer = player2;
            } else {
                currentPlayer = player1;
            }
        } while (true);
    }
}
