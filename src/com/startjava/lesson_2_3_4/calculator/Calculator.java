package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public double calculate(String string) {
        String[] partsMathExpression = string.split(" ");
        int num1 = Integer.parseInt(partsMathExpression[0]);
        int num2 = Integer.parseInt(partsMathExpression[2]);
        String sign = partsMathExpression[1];
        double errorNum = 0;
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
                return errorNum;
        }
    }
}