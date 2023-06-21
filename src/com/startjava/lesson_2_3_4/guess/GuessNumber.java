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
        do {
            System.out.print("\n" + currentPlayer.getName() + " введите число: ");
            currentPlayer.setNum(scan.nextInt());
            scan.nextLine();
            if (checkNum(currentPlayer.getNum(), hiddenNum)) {
                System.out.printf("Игрок %s угадал число %d c %d попытки!%n%n",
                        currentPlayer.getName(),
                        currentPlayer.getNum(),
                        currentPlayer.getAttemptNum());
                break;
            }
            if (currentPlayer.getAttemptNum() == attempts) {
                System.out.println("У " + currentPlayer.getName() + " закончились попытки");
            }
            currentPlayer = changePlayer(currentPlayer);
        } while (currentPlayer.getAttemptNum() < attempts);
        printPlayersNums();
    }

    private boolean checkNum(int playerNum, int hiddenNum) {
        if (playerNum == hiddenNum) {
            return true;
        } else if (playerNum > hiddenNum) {
            System.out.println("Число " + playerNum + " больше того, что загадал компьютер");
        } else {
            System.out.println("Число " + playerNum + " меньше того, что загадал компьютер");
        }
        return false;
    }

    private Player changePlayer(Player player) {
        if (player == player1) {
            return player2;
        } else {
            return player1;
        }
    }

    private void printPlayersNums() {
        print(player1.getName(), player1.getPlayerNums());
        print(player2.getName(), player2.getPlayerNums());
    }

    private void print(String playerName, int[] playerNums) {
        String result = "";
        for (int num : playerNums) {
            result += num + " ";
        }
        System.out.println("Числа игрока " + playerName + ": " + result);
    }

    public void resetResult() {
        player1.resetPlayerNums();
        player2.resetPlayerNums();
    }
}
