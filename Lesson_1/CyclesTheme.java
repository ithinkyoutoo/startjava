public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("\n1.Подсчет суммы четных и нечетных чисел\n");
        int sumEvens = 0;
        int sumOdds = 0;
        int num = -10;
        do {
            if (num % 2 == 0) {
                sumEvens += num;
            } else {
                sumOdds += num;
            }
            num++;
        } while (num <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEvens +
                ", а нечетных = " + sumOdds);

        System.out.println("\n2.Вывод чисел в интервале (min и max) в порядке убывания\n");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        if (num1 == num2 && num1 == num3) {
            System.out.println("Интервал равен 0");
        } else {
            int maxNum = num1;
            int minNum = num2 > num3 ? num3 : num2;
            if (num2 >= num1 && num2 >= num3) {
                maxNum = num2;
                minNum = num1 > num3 ? num3 : num1;
            } else if (num3 >= num1 && num3 >= num2) {
                maxNum = num3;
                minNum = num1 > num2 ? num2 : num1;
            }
            String intervalNums = "";
            for (int i = maxNum - 1; i > minNum; i--) {
                intervalNums += i + " ";
            }
            System.out.println("(" + minNum + "," + maxNum + ") " + intervalNums);
        }

        System.out.println("\n3.Вывод реверсивного числа и суммы его цифр\n");
        num = 1234;
        int multiple = 1;
        int reverseMultiple = 1;
        int sumNums = 0;
        int reverseNum = 0;
        while (multiple <= num) {
            sumNums += num / multiple % 10;
            multiple *= 10;
        }
        while (multiple > 1) {
            multiple /= 10;
            reverseNum += (num / multiple % 10) * reverseMultiple;
            reverseMultiple *= 10;
        }
        System.out.println(num + "\n" + reverseNum + "\n" + sumNums);

        System.out.println("\n4.Вывод чисел на консоль в несколько строк\n");
        num1 = 1;
        num2 = 23;
        int intervalNum1 = 2;
        int intervalNum2 = 2;
        for (int i = num1; i > 0 || i < 0; i /= 10) {
            intervalNum1++;
        }
        for (int j = num2; j > 0 || j < 0; j /= 10) {
            intervalNum2++;
        }
        int interval = intervalNum2 > intervalNum1 ? intervalNum2 : intervalNum1;
        int step = 2;
        int numsInLine = 5;
        for (int i = 0; i >= 0; i = num2 - num1) {
            for (int j = 0; j < numsInLine; j++) {
                if (num2 >= num1) {
                    System.out.printf("%" + interval + "d", num1);
                } else {
                    System.out.printf("%" + interval + "d", 0);
                }
                num1 += step;
            }
            System.out.println();
        }

        System.out.println("\n5.Проверка количества двоек на четность/нечетность\n");
        num = 3242592;
        int searchNum = 2;
        int multipleNum = 0;
        int countNums = 0;
        multiple = 1;
        while (multiple <= num) {
            multipleNum = num / multiple % 10;
            if (multipleNum == searchNum) {
                countNums += 1;
            }
            multiple *= 10;
        }
        String even = countNums % 2 == 0 ? "четное" : "нечетное";
        System.out.printf("Число %d содержит %d (%s количество) %d",
                 num, countNums, even, searchNum);

        System.out.println("\n\n6.Отображение фигур в консоли\n");
        char star = '*';
        int numsStar = 10;
        int numsLine = 5;
        for (int i = 0; i < numsLine; i++) {
            for (int j = 0; j < numsStar; j++) {
                System.out.print(star);
            }
            System.out.println();
        }
        System.out.println();
        char hash = '#';
        int numsHash = 5;
        numsLine = numsHash;
        while (numsLine > 0) {
            while (numsHash > 0) {
                System.out.print(hash);
                numsHash--;
            }
            numsLine--;
            numsHash = numsLine;
            System.out.println();
        }
        System.out.println();
        char dollarSign = '$';
        int numsDollarSign = 0;
        int countDollarSign = 0;
        numsLine = 5;
        do {
            if (numsLine > countDollarSign) {
                countDollarSign++;
            } else {
                countDollarSign--;
            }
            numsDollarSign = countDollarSign;
            do {
                System.out.print(dollarSign);
                numsDollarSign--;
            } while (numsDollarSign > 0);
            System.out.println();
            numsLine--;
        } while (numsLine > 0);

        System.out.println("\n7.Отображение ASCII-символов\n");
        char characters = 0;
        for (int i = characters; i <= 122; i++) {
            if (i == 0) {
                System.out.println(" Dec  Char");
            } else if (i <= '/' && i % 2 == 1) {
                System.out.printf("%4d%6c%n", (int) i, i);
            } else if (i >= 'a' && i <= 'z' && i % 2 == 0) {
                System.out.printf("%4d%6c%n", (int) i, i);
            }
        }

        System.out.println("\n8.Проверка, является ли число палиндромом\n");
        num = 1234321;
        reverseMultiple = 0;
        for (int i = 1; i < num; i *= 10) {
            reverseMultiple = i;
        }
        reverseNum = 0;
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
        countNums = 0;
        multiple = 0;
        for (int i = 1; i < num; i *= 10) {
            countNums++;
            multiple = i;
        }
        int sumLeftHalfNums = 0;
        int sumRightHalfNums = 0;
        int leftHalfNums = 0;
        int rightHalfNums = 0;
        for (int j = 1; j <= countNums; j++) {
            if (j <= countNums / 2) {
                sumLeftHalfNums += num / multiple % 10;
                leftHalfNums += (num / multiple % 10) * multiple;
            } else {
                sumRightHalfNums += num / multiple % 10;
                rightHalfNums += (num / multiple % 10) * multiple;
                leftHalfNums /= 10;
            }
            multiple /= 10;
        }
        String happy = "";
        happy = sumLeftHalfNums == sumRightHalfNums ? "является" : "не является";
        System.out.println("Число " + num + "\n" +
                "Сумма цифр левой половины " + leftHalfNums + " = " + sumLeftHalfNums + "\n" +
                "Сумма цифр правой половины " + rightHalfNums + " = " + sumRightHalfNums + "\n" +
                "Число " + happy + " счастливым");

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