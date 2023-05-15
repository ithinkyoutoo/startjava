import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();
        do {
            System.out.print("Введите первое число: ");
            calculator.setNum1(scan.nextInt());
            scan.nextLine();
            do {
                System.out.print("Введите знак математической операции: ");
                calculator.setSign(scan.nextLine());
            } while (calculator.getSign().equals(""));
            System.out.print("Введите второе число: ");
            calculator.setNum2(scan.nextInt());
            scan.nextLine();
            calculator.calculate();
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                calculator.setAnswer(scan.nextLine());
            } while (calculator.getAnswer().equals(""));
        } while (calculator.getAnswer().equals("yes"));
    }
}