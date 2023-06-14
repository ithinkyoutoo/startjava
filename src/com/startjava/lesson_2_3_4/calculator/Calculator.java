package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private int num1;
    private int num2;
    private String sign;

    public void setMathExpression(String string) {
        String[] partsMathExpression = string.split(" ");
        num1 = Integer.parseInt(partsMathExpression[0]);
        num2 = Integer.parseInt(partsMathExpression[2]);
        setSign((partsMathExpression[1]));
    }

    private void setSign(String sign) {
        switch (sign) {
            case "+":
            case "-":
            case "*":
            case "/":
            case "^":
            case "%":
                this.sign = sign;
                break;
        }
    }

    public double calculate() {
        double result = 0;
        switch (sign) {
            case "+":
                result = Math.addExact(num1, num2);
                break;
            case "-":
                result = Math.subtractExact(num1, num2);
                break;
            case "*":
                result = Math.multiplyExact(num1, num2);
                break;
            case "/":
                result = Math.floorDiv(num1, num2);
                break;
            case "^":
                result = Math.pow(num1, num2);
                break;
            case "%":
                result = Math.floorMod(num1, num2);
                break;
        }
        return result;
    }

    public void printResult(double num) {
        if (num % Math.floor(num) == 0 || num == 0) {
            System.out.printf("Результат: %.0f%n", num);
        } else {
            System.out.printf("Результат: %.3f%n", num);
        }
    }
}