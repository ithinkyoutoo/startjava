package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public double calculate(String expression) {
        String[] elements = expression.split(" ");
        int num1 = Integer.parseInt(elements[0]);
        int num2 = Integer.parseInt(elements[2]);
        String sign = elements[1];
        switch (sign) {
            case "+":
                return Math.addExact(num1, num2);
            case "-":
                return Math.subtractExact(num1, num2);
            case "*":
                return Math.multiplyExact(num1, num2);
            case "/":
                return Math.floorDiv(num1, num2);
            case "^":
                return Math.pow(num1, num2);
            case "%":
                return Math.floorMod(num1, num2);
            default:
                System.out.println("Введенный знак не поддерживается");
                return 0;
        }
    }
}