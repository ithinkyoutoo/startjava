package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Arrays;

public class GuessNumber {

    private static final int ROUNDS_LIMIT = 3;
    private static final int ATTEMPTS = 10;

    private final Scanner scan;
    private final Player[] players;
    private final int len = Player.COUNT_PLAYERS;

    public GuessNumber(Scanner scan, Player... players) {
        this.scan = scan;
        for (int i = 0; i < len; i++) {
            players[i] = new Player(scan.nextLine());
        }
        this.players = players;
    }

    public void play() {
        drawLots(players);
        for (int i = 1; i <= ROUNDS_LIMIT; i++) {
            System.out.println("\nРаунд " + i);
            int hiddenNum = createHiddenNum();
            boolean hasWin = false;
            do {
                for (Player player : players) {
                    enterNum(player);
                    if (isGuessed(player.getNum(), hiddenNum)) {
                        System.out.printf("Игрок %s угадал число %d c %d попытки!%n",
                                    player.getName(),
                                    player.getNum(),
                                    player.getAttempt());
                        player.addWin();
                        hasWin = true;
                        break;
                    }
                    if (player.getAttempt() == ATTEMPTS) {
                        System.out.println("У " + player.getName() + " закончились попытки");
                    }
                }
            } while (!hasWin && players[len - 1].getAttempt() != ATTEMPTS);
            printPlayersNums();
        }
        checkWinner(players);
    }

    private void drawLots(Player[] players) {
        for (int i = len - 1; i > 0; i--) {
            int index = (int) (Math.random() * i);
            Player tempPlayer = players[i];
            players[i] = players[index];
            players[index] = tempPlayer;
        }
        System.out.print("\nПо итогу жеребьевки, порядок игроков в игре следующий:");
        for (Player player : players) {
            System.out.print(" " + player.getName());
        }
        System.out.println();
    }

    private int createHiddenNum() {
        System.out.println("\nКомпьютер загадал число от 1 до 100, попробуйте отгадать!\n" +
                "У каждого игрока по " + ATTEMPTS + " попыток");
        return 1 + (int) (Math.random() * 100);
    }

    private void enterNum(Player player) {
        do {
            System.out.print("\n" + player.getName() + " введите число: ");
        } while (player.addNum(scan.nextInt()));
        scan.nextLine();
    }

    private boolean isGuessed(int playerNum, int hiddenNum) {
        if (playerNum == hiddenNum) {
            return true;
        }
        System.out.println("Число " + playerNum +
                (playerNum > hiddenNum ? " больше" : " меньше") + " того, что загадал компьютер");
        return false;
    }

    private void printPlayersNums() {
        System.out.println();
        for (Player player : players) {
            print(player.getName(), player.getAllNums());
            player.clear();
        }
    }

    private void print(String playerName, int[] playerNums) {
        System.out.print("Числа игрока " + playerName + ":");
        for (int num : playerNums) {
            System.out.print(" " + num);
        }
        System.out.println();
    }

    private void checkWinner(Player[] players) {
        int[] winsPlayers = new int[len];
        for (int i = 0; i < len; i++) {
            winsPlayers[i] = players[i].getWin();
        }
        int[] sortWinsPlayers = Arrays.copyOf(winsPlayers, len);
        Arrays.sort(sortWinsPlayers);
        if (Arrays.equals(winsPlayers, sortWinsPlayers)) {
            System.out.println("\nПо итогу " + ROUNDS_LIMIT + " раундов ничья!");
        } else {
            for (Player player : players) {
                if (sortWinsPlayers[len - 1] == player.getWin()) {
                    System.out.println("\nПо итогу " + ROUNDS_LIMIT +
                            " раундов победил " + player.getName() + "!");
                }
                player.clearWin();
            }
        }
    }
}