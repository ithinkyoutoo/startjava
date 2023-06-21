package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] nums = new int[10];
    private Integer counter = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNum(int num) {
        nums[counter] = num;
        counter++;
    }

    public int getNum() {
        return nums[counter - 1];
    }

    public int getAttemptNum() {
        return counter;
    }

    public int[] getPlayerNums() {
        return Arrays.copyOf(nums, counter);
    }

    public void resetPlayerNums() {
        Arrays.fill(nums, 0, counter, 0);
        counter = 0;
    }
}