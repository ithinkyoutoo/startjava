package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer = "yes";
        do {
            if ("yes".equals(answer)) {
                System.out.print("Введите математическое выражение: ");
                double result = calculator.calculate(scan.nextLine());
                print(result);
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scan.nextLine();
        } while (!"no".equals(answer));
    }

    private static void print(double num) {
        if (num % 1 == 0) {
            System.out.printf("Результат: %.0f%n", num);
        } else {
            System.out.printf("Результат: %.3f%n", num);
        }
    }
}