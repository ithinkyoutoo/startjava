package com.startjava.lesson_1.base;

public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("\n1.Подсчет суммы четных и нечетных чисел\n");
        int sumEvens = 0;
        int sumOdds = 0;
        int counter = -10;
        do {
            if (counter % 2 == 0) {
                sumEvens += counter;
            } else {
                sumOdds += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEvens +
                ", а нечетных = " + sumOdds);

        System.out.println("\n2.Вывод чисел в интервале (min и max) в порядке убывания\n");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        if (num1 == num2 && num1 == num3) {
            System.out.println("Интервал равен 0");
        } else {
            int maxNum = num1 > num2 ? num1 : num2;
            maxNum = maxNum > num3 ? maxNum : num3;
            int minNum = num1 < num2 ? num1 : num2;
            minNum = minNum < num3 ? minNum : num3;
            System.out.print("(" + minNum + "," + maxNum + ")");
            for (int i = maxNum - 1; i > minNum; i--) {
                System.out.print(" " + i);
            }
        }

        System.out.println("\n\n3.Вывод реверсивного числа и суммы его цифр\n");
        int num = 1234;
        System.out.println(num);
        int sumDigits = 0;
        while (num > 0) {
            int remainder = num % 10;
            System.out.print(remainder);
            sumDigits += remainder;
            num /= 10;
        }
        System.out.println("\n" + sumDigits);

        System.out.println("\n4.Вывод чисел на консоль в несколько строк\n");
        counter = 1;
        int endSemiInterval = 24;
        int numsInLine = 5;
        for (int i = 0; i < endSemiInterval; i = counter) {
            for (int j = 0; j < numsInLine; j++) {
                if (counter < endSemiInterval) {
                    System.out.printf("%4d", counter);
                } else {
                    System.out.printf("%4d", 0);
                }
                counter += 2;
            }
            System.out.println();
        }

        System.out.println("\n5.Проверка количества двоек на четность/нечетность\n");
        num = 3242592;
        int searchDigit = 2;
        int countTwos = 0;
        int multiple = 1;
        while (multiple < num) {
            int remainder = num / multiple % 10;
            if (remainder == searchDigit) {
                countTwos++;
            }
            multiple *= 10;
        }
        String state = countTwos % 2 == 0 ? "четное" : "нечетное";
        System.out.printf("Число %d содержит %d (%s количество) %d",
                 num, countTwos, state, searchDigit);

        System.out.println("\n\n6.Отображение фигур в консоли\n");
        int numChars = 10;
        int numLines = 5;
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < numChars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        numChars = 5;
        numLines = numChars;
        while (numLines > 0) {
            while (numChars > 0) {
                System.out.print("#");
                numChars--;
            }
            numLines--;
            numChars = numLines;
            System.out.println();
        }
        System.out.println();

        int countChars = 0;
        numLines = 5;
        do {
            if (numLines > countChars) {
                countChars++;
            } else {
                countChars--;
            }
            numChars = countChars;
            do {
                System.out.print("$");
                numChars--;
            } while (numChars > 0);
            System.out.println();
            numLines--;
        } while (numLines > 0);

        System.out.println("\n7.Отображение ASCII-символов\n");
        System.out.println(" Dec  Char");
        for (int i = 0; i <= 122; i++) {
            if (i <= '/' && i % 2 == 1) {
                System.out.printf("%4d%6c%n", i, i);
            } else if (i >= 'a' && i <= 'z' && i % 2 == 0) {
                System.out.printf("%4d%6c%n", i, i);
            }
        }

        System.out.println("\n8.Проверка, является ли число палиндромом\n");
        num = 1234321;
        int reverseMultiple = 0;
        for (int i = 1; i < num; i *= 10) {
            reverseMultiple = i;
        }
        int reverseNum = 0;
        multiple = 0;
        for (int i = 1; i < num; i *= 10) {
            multiple = i;
            reverseNum += (num / multiple % 10) * reverseMultiple;
            reverseMultiple /= 10;
        }
        if (num == reverseNum) {
            System.out.println("число " + num + " является палиндромом");
        } else {
            System.out.println("число " + num + " не является палиндромом");
        }

        System.out.println("\n9.Определение, является ли число счастливым\n");
        num = 823373;
        multiple = 0;
        int countDigits = 0;
        for (int i = 1; i < num; i *= 10) {
            multiple = i;
            countDigits++;
        }
        int sumLeftHalfDigits = 0;
        int sumRightHalfDigits = 0;
        int leftHalfDigits = 0;
        int rightHalfDigits = 0;
        for (int i = 1; i <= countDigits; i++) {
            int remainder = num / multiple % 10;
            if (i <= countDigits / 2) {
                sumLeftHalfDigits += remainder;
                leftHalfDigits += remainder * multiple;
            } else {
                sumRightHalfDigits += remainder;
                rightHalfDigits += remainder * multiple;
                leftHalfDigits /= 10;
            }
            multiple /= 10;
        }
        state = sumLeftHalfDigits == sumRightHalfDigits ? "является" : "не является";
        System.out.println("Число " + num + "\n" +
                "Сумма цифр левой половины " +
                leftHalfDigits + " = " + sumLeftHalfDigits + "\n" +
                "Сумма цифр правой половины " +
                rightHalfDigits + " = " + sumRightHalfDigits + "\n" +
                "Число " + state + " счастливым");

        System.out.println("\n10.Вывод таблицы умножения Пифагора\n");
        for (int i = 0; i <= 9; i++) {
            if (i == 0) {
                System.out.print("   |");
            } else if (i == 1) {
                System.out.print("---|");
            } else {
                System.out.printf("%2d%2c", i, '|');
            }
            for (int j = 2; j <= 9; j++) {
                if (i == 0 ) {
                    System.out.printf("%3d", j);
                } else if (i == 1) {
                    System.out.print("---");
                } else {
                System.out.printf("%3d", j * i);
                }
            }
            System.out.println();
        }
    }
}