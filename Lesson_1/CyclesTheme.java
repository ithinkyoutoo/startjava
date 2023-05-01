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
        int remainder = 0;
        int sumDigits = 0;
        while (num > 0) {
            remainder = num % 10;
            System.out.print(remainder);
            sumDigits += remainder;
            num /= 10;
        }
        System.out.println("\n" + sumDigits);

        System.out.println("\n4.Вывод чисел на консоль в несколько строк\n");
        counter = 1;
        int countOfDigitsCounter = 0;
        for (int i = counter; i > 0 || i < 0; i /= 10) {
            countOfDigitsCounter++;
        }
        int endOfSemiInterval = 24;
        int countOfDigitsEndOfSemiInterval = 0;
        for (int i = endOfSemiInterval; i > 0 || i < 0; i /= 10) {
            countOfDigitsEndOfSemiInterval++;
        }
        int countOfDigits = countOfDigitsCounter > countOfDigitsEndOfSemiInterval ?
                countOfDigitsCounter : countOfDigitsEndOfSemiInterval;
        int distanceBetweenNums = 2 + countOfDigits;
        int numsInLine = 5;
        for (int i = 0; i < endOfSemiInterval; i = counter) {
            for (int j = 0; j < numsInLine; j++) {
                if (counter < endOfSemiInterval) {
                    System.out.printf("%" + distanceBetweenNums + "d", counter);
                } else {
                    System.out.printf("%" + distanceBetweenNums + "d", 0);
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
            remainder = num / multiple % 10;
            if (remainder == searchDigit) {
                countTwos++;
            }
            multiple *= 10;
        }
        String state = countTwos % 2 == 0 ? "четное" : "нечетное";
        System.out.printf("Число %d содержит %d (%s количество) %d",
                 num, countTwos, state, searchDigit);

        System.out.println("\n\n6.Отображение фигур в консоли\n");
        int numOfChars = 10;
        int numOfLines = 5;
        for (int i = 0; i < numOfLines; i++) {
            for (int j = 0; j < numOfChars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        numOfChars = 5;
        numOfLines = numOfChars;
        while (numOfLines > 0) {
            while (numOfChars > 0) {
                System.out.print("#");
                numOfChars--;
            }
            numOfLines--;
            numOfChars = numOfLines;
            System.out.println();
        }
        System.out.println();

        int countOfChars = 0;
        numOfLines = 5;
        do {
            if (numOfLines > countOfChars) {
                countOfChars++;
            } else {
                countOfChars--;
            }
            numOfChars = countOfChars;
            do {
                System.out.print("$");
                numOfChars--;
            } while (numOfChars > 0);
            System.out.println();
            numOfLines--;
        } while (numOfLines > 0);

        System.out.println("\n7.Отображение ASCII-символов\n");
        System.out.println(" Dec  Char");
        for (int i = 0; i <= 122; i++) {
            if (i <= '/' && i % 2 == 1) {
                System.out.printf("%4d%6c%n", (int) i, i);
            } else if (i >= 'a' && i <= 'z' && i % 2 == 0) {
                System.out.printf("%4d%6c%n", (int) i, i);
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
        for (int j = 1; j < num; j *= 10) {
            multiple = j;
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
        countOfDigits = 0;
        for (int i = 1; i < num; i *= 10) {
            multiple = i;
            countOfDigits++;
        }
        int sumLeftHalfNums = 0;
        int sumRightHalfNums = 0;
        int leftHalfNums = 0;
        int rightHalfNums = 0;
        for (int j = 1; j <= countOfDigits; j++) {
            if (j <= countOfDigits / 2) {
                sumLeftHalfNums += num / multiple % 10;
                leftHalfNums += (num / multiple % 10) * multiple;
            } else {
                sumRightHalfNums += num / multiple % 10;
                rightHalfNums += (num / multiple % 10) * multiple;
                leftHalfNums /= 10;
            }
            multiple /= 10;
        }
        state = sumLeftHalfNums == sumRightHalfNums ? "является" : "не является";
        System.out.println("Число " + num + "\n" +
                "Сумма цифр левой половины " + leftHalfNums + " = " + sumLeftHalfNums + "\n" +
                "Сумма цифр правой половины " + rightHalfNums + " = " + sumRightHalfNums + "\n" +
                "Число " + state + " счастливым");

        System.out.println("\n10.Вывод таблицы умножения Пифагора\n");
        num1 = 2;
        num2 = 9;
        char pipe = '|';
        char dash = '-';
        for (int i = num1 - 2; i <= num2; i++) {
            if (i == num1 - 2) {
                System.out.printf("%4c", pipe);
            } else if (i == num1 - 1) {
                System.out.printf("%c%c%c%c", dash, dash, dash, pipe);
                for (int k = num1; k <= num2; k++) {
                    System.out.printf("%c%c%c", dash, dash, dash);
                }
            } else {
                System.out.printf("%2d%2c", i, pipe);
            }
            for (int j = num1; j <= num2; j++) {
                if (i == num1 - 2 ) {
                    System.out.printf("%3d", j);
                } else if (i == num1 - 1) {
                    j = num2;
                } else {
                    System.out.printf("%3d", j * i);
                }
            }
            System.out.println();
        }
    }
}