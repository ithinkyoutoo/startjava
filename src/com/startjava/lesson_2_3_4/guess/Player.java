package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] nums = new int[10];
    private int attempt;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addNum(int num) {
        nums[attempt] = num;
    }

    public int getNum() {
        return nums[attempt - 1];
    }

    public void addAttemptNum() {
        attempt++;
    }

    public int getAttemptNum() {
        return attempt;
    }

    public int[] getAllNums() {
        return Arrays.copyOf(nums, attempt);
    }

    public void clear() {
        Arrays.fill(nums, 0, attempt, 0);
        attempt = 0;
    }
}