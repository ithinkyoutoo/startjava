package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String answer = "yes";
        do {
            boolean hasResult = true;
            if ("yes".equals(answer)) {
                System.out.print("Введите математическое выражение: ");
                try {
                    double result = Calculator.calculate(scan.nextLine());
                    System.out.printf("Результат: " + (result % 1 == 0 ? "%.0f%n" : "%.3f%n"), result);
                } catch (Calculator.NegativeNumException | NumberFormatException e) {
                    System.out.println("Числа дожны быть целыми и положительными, используйте корректные значения");
                    hasResult = false;
                }
            }
            if (hasResult) {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scan.nextLine();
            }
        } while (!"no".equals(answer));
    }
}