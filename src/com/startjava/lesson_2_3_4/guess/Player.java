package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    static final int COUNT_PLAYERS = 3;

    private final String name;
    private final int[] nums = new int[10];

    private int attempt;
    private int win;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addNum(int num) {
        if (num > 0 && num <= 100) {
            nums[attempt] = num;
            attempt++;
            return false;
        }
        System.out.print("Ошибка. Введите число от 1 до 100.");
            return true;
    }

    public int getNum() {
        return nums[attempt - 1];
    }

    public int getAttempt() {
        return attempt;
    }

    public void addWin() {
        win++;
    }

    public int getWin() {
        return win;
    }

    public int[] getAllNums() {
        return Arrays.copyOf(nums, attempt);
    }

    public void clear() {
        Arrays.fill(nums, 0, attempt, 0);
        attempt = 0;
    }

    public void clearWin() {
        win = 0;
    }
}