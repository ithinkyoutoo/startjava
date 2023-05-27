package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer;
        do {
            System.out.print("Введите первое число: ");
            calculator.setNum1(scan.nextInt());
            scan.nextLine();
            do {
                System.out.print("Введите знак математической операции: ");
            } while (calculator.setSign(scan.nextLine()));
            System.out.print("Введите второе число: ");
            calculator.setNum2(scan.nextInt());
            scan.nextLine();
            calculator.calculate();
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scan.nextLine();
            } while (!"yes".equals(answer) && !"no".equals(answer));
        } while ("yes".equals(answer));
    }
}