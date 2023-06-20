package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static double calculate(String expression) {
        String[] elements = expression.split(" ");
        int num1 = Integer.parseInt(elements[0]);
        int num2 = Integer.parseInt(elements[2]);
        if (num1 > 0 && num2 > 0) {
            return switch (elements[1]) {
                case "+" -> Math.addExact(num1, num2);
                case "-" -> Math.subtractExact(num1, num2);
                case "*" -> Math.multiplyExact(num1, num2);
                case "/" -> Math.floorDiv(num1, num2);
                case "^" -> Math.pow(num1, num2);
                case "%" -> Math.floorMod(num1, num2);
                default -> {
                    System.out.println("Введенный знак не поддерживается");
                    yield 0;
                }
            };
        } else {
            throw new PositiveNumException();
        }
    }

    static class PositiveNumException extends RuntimeException {
    }
}