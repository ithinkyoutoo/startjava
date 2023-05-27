package com.startjava.lesson_1.final_;

public class Calculator {

    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 4;
        char sign = '^';
        int result = 1;
        if (sign == '+') {
            result = num1 + num2;
        } else if (sign == '-') {
            result = num1 - num2;
        } else if (sign == '*') {
            result = num1 * num2;
        } else if (sign == '/') {
            result = num1 / num2;
        } else if (sign == '^') {
            for (int i = num2; i > 0; i--) {
                result *= num1;
            }
        } else {
            result = num1 % num2;
        }
        System.out.println("\n" + num1 + " " + sign + " " + num2 + " = " + result);
    }
}