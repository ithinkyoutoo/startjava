package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer = "yes";
        do {
            double result = 0;
            if ("yes".equals(answer)) {
                System.out.print("Введите математическое выражение: ");
                result = calculator.calculate(scan.nextLine());
            }
            if (result % 1 == 0) {
                System.out.printf("Результат: %.0f%n", result);
            } else {
                System.out.printf("Результат: %.3f%n", result);
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scan.nextLine();
        } while (!"no".equals(answer));
    }
}