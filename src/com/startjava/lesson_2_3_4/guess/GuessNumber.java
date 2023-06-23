package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    static final int ATTEMPTS = 10;
    static final int DRAW_LOTS_ROUNDS = 3;

    private Player[] players;
    private Scanner scan;

    public GuessNumber(Scanner scan, Player... players) {
        this.scan = scan;
        this.players = players;
    }

    public void play() {
        int hiddenNum = 1 + (int) (Math.random() * 100);
        System.out.println("\nКомпьютер загадал число от 1 до 100, попробуйте отгадать!\n" +
                "У каждого игрока по " + ATTEMPTS + " попыток");
        Player currentPlayer = drawLots(players);
        if (currentPlayer.getAttempt() != 0) {
            clearPlayersNums();
        }
        do {
            System.out.print("\n" + currentPlayer.getName() + " введите число: ");
            enterNum(currentPlayer);
            if (isGuessed(currentPlayer.getNum(), hiddenNum)) {
                System.out.printf("Игрок %s угадал число %d c %d попытки!%n%n",
                        currentPlayer.getName(),
                        currentPlayer.getNum(),
                        currentPlayer.getAttempt());
                break;
            }
            if (currentPlayer.getAttempt() == ATTEMPTS) {
                System.out.println("У " + currentPlayer.getName() + " закончились попытки");
            }
            currentPlayer = changePlayer(currentPlayer);
        } while (currentPlayer.getAttempt() < ATTEMPTS);
        printPlayersNums();
    }

    private Player drawLots(Player[] players) {
        for (int i = 1; i <= DRAW_LOTS_ROUNDS; i++) {
            for (int j = players.length - 1; j > 0; j--) {
                int index = (int) (Math.random() * 3);
                Player tempPlayer = players[j];
                players[j] = players[index];
                players[index] = tempPlayer;
            }
        }
        System.out.print("\nПо итогу жеребьевки, порядок игроков в игре следующий:");
        for (Player player : players) {
            System.out.print(" " + player.getName());
        }
        System.out.println();
        return players[0];
    }

    private void clearPlayersNums() {
        for (Player player : players) {
            player.clear();
        }
    }

    private void enterNum(Player player) {
        do {
            try {
                player.addNum(scan.nextInt());
                scan.nextLine();
                break;
            } catch (Player.NumException e) {
                System.out.print("Ошибка. Введите число от 1 до 100: ");
            }
        } while (true);
    }

    private boolean isGuessed(int playerNum, int hiddenNum) {
        if (playerNum == hiddenNum) {
            return true;
        }
        System.out.println("Число " + playerNum +
                (playerNum > hiddenNum ? " больше" : " меньше") + " того, что загадал компьютер");
        return false;
    }

    private Player changePlayer(Player player) {
        if (player == players[0]) {
            return players[1];
        }
        return player == players[1] ? players[2] : players[0];
    }

    private void printPlayersNums() {
        for (Player player : players) {
            print(player.getName(), player.getAllNums());
        }
    }

    private void print(String playerName, int[] playerNums) {
        System.out.print("Числа игрока " + playerName + ":");
        for (int num : playerNums) {
            System.out.print(" " + num);
        }
        System.out.println();
    }
}