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
        int attempts = 10;
        int hiddenNum = 1 + (int) (Math.random() * 100);
        System.out.println("\nКомпьютер загадал число от 1 до 100, попробуйте отгадать!\n" +
                "У каждого игрока по " + attempts + " попыток");
        Player currentPlayer = player1;
        if (currentPlayer.getAttempt() != 0) {
            clearPlayersNums();
        }
        do {
            System.out.print("\n" + currentPlayer.getName() + " введите число: ");
            currentPlayer.addNum(scan.nextInt());
            scan.nextLine();
            if (isGuessed(currentPlayer.getNum(), hiddenNum)) {
                System.out.printf("Игрок %s угадал число %d c %d попытки!%n%n",
                        currentPlayer.getName(),
                        currentPlayer.getNum(),
                        currentPlayer.getAttempt());
                break;
            }
            if (currentPlayer.getAttempt() == attempts) {
                System.out.println("У " + currentPlayer.getName() + " закончились попытки");
            }
            currentPlayer = currentPlayer == player1 ? player2 : player1;
        } while (currentPlayer.getAttempt() < attempts);
        printPlayersNums();
    }

    private void clearPlayersNums() {
        player1.clear();
        player2.clear();
    }

    private boolean isGuessed(int playerNum, int hiddenNum) {
        if (playerNum == hiddenNum) {
            return true;
        }
        if (playerNum > hiddenNum) {
            System.out.println("Число " + playerNum + " больше того, что загадал компьютер");
        } else {
            System.out.println("Число " + playerNum + " меньше того, что загадал компьютер");
        }
        return false;
    }

    private void printPlayersNums() {
        print(player1.getName(), player1.getAllNums());
        print(player2.getName(), player2.getAllNums());
    }

    private void print(String playerName, int[] playerNums) {
        System.out.print("Числа игрока " + playerName + ":");
        for (int num : playerNums) {
            System.out.print(" " + num);
        }
        System.out.println();
    }
}
