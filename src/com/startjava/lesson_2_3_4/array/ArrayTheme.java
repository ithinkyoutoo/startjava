package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {

    private int[] intArr;
    private int index = 0;

    public static void main(String[] args) {
        ArrayTheme start = new ArrayTheme();

        start.exerciseOne();
        start.exerciseTwo();
        start.exerciseThree();
        start.exerciseFour();
        start.exerciseFive();
        start.exerciseSix();
    }

    private void exerciseOne() {
        System.out.println("\n1. Реверс значений массива\n");
        intArr = new int[]{5, 2, 1, 7, 3, 6, 4};
        for (int num : intArr) {
            System.out.print(num + " ");
        }
        System.out.println();
        int[] reverseIntArr = new int[7];
        for (int i = 0; i < intArr.length; i++) {
            reverseIntArr[i] = intArr[intArr.length - (1 + i)];
        }
        for (int num : reverseIntArr) {
            System.out.print(num + " ");
        }
    }

    private void exerciseTwo() {
        System.out.println("\n\n2. Вывод произведения элементов массива\n");
        intArr = new int[10];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i;
        }
        int productNums = 1;
        String result;
        for (int i = 1; i < intArr.length - 1; i++) {
            productNums *= intArr[i];
            result = intArr[i] != 8 ? intArr[i] + " * " : intArr[i] + " = " + productNums;
            System.out.print(result);
        }
        System.out.println("\n" + intArr[0] + "  " + intArr[9]);
    }

    private void exerciseThree() {
        System.out.println("\n3. Удаление элементов массива\n");
        double[] doubleArr = new double[15];
        int length = doubleArr.length;
        for (int i = 0; i < length; i++) {
            doubleArr[i] = Math.random();
            if (doubleArr[i] == 0) {
                System.out.printf("%8.0f", doubleArr[i]);
            } else {
                System.out.printf("%8.3f", doubleArr[i]);
            }
            if (i == length / 2) {
                System.out.println();
            }
        }
        System.out.println("\n");
        int countNull = 0;
        for (int i = 0; i < length; i++) {
            if (doubleArr[i] > doubleArr[length / 2]) {
                doubleArr[i] = 0;
                System.out.printf("%8.0f", doubleArr[i]);
                countNull++;
            } else {
                System.out.printf("%8.3f", doubleArr[i]);
            }
            if (i == length / 2) {
                System.out.println();
            }
        }
        System.out.println("\n\nКол-во обнуленных ячеек = " + countNull);
    }

    private void exerciseFour() {
        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке\n");
        char[] charArr = new char[26];
        index = 0;
        for (char i = 'A'; i <= 'Z'; i++) {
            charArr[index] = i;
            index++;
        }
        int length = charArr.length;
        String result = "";
        for (int i = 0; i < length; i++) {
            result += charArr[length - (1 + i)];
            System.out.println(result);
        }
    }

    private void exerciseFive() {
        System.out.println("\n5. Генерация уникальных чисел\n");
        intArr = new int[30];
        int length = intArr.length;
        for (int i = 0; i < length; i++) {
            intArr[i] = (int) (60 + Math.random() * 40);
            for (int j = 0; j < i; j++) {
                if (intArr[i] == intArr[j]) {
                    intArr[i] = (int) (60 + Math.random() * 40);
                    j = -1;
                }
            }
        }
        index = 0;
        int[] editIntArr = new int[30];
        for (int i = 0; i < length; i++) {
            boolean isLess = true;
            for (int j = 0; j < length; j++) {
                if (intArr[i] > intArr[j]) {
                    isLess = false;
                    break;
                }
            }
            if (isLess) {
                editIntArr[index] = intArr[i];
                intArr[i] = 100;
                i = -1;
                index++;
            }
            if (index == length) {
                break;
            }
        }
        for (int num : editIntArr) {
            System.out.print(" " + num);
            length--;
            if (length % 10 == 0) {
                System.out.println();
            }
        }
    }

    private void exerciseSix() {
        System.out.println("\n6. Копирование не пустых строк\n");
        String[] stringArr = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        for (String string : stringArr) {
            System.out.print(string + " ");
        }
        System.out.println();
        int length = stringArr.length;
        int lengthCopyStringArr = 0;
        for (String string : stringArr) {
            if (!string.isBlank()) {
                lengthCopyStringArr++;
            }
        }
        String[] copyStringArr = new String[lengthCopyStringArr];
        index = 0;
        int countFullString = 0;
        for (int i = 0; i < length; i++) {
            if (!stringArr[i].isBlank()) {
                index++;
                countFullString++;
            }
            if (stringArr[i].isBlank()) {
                System.arraycopy(stringArr, i - countFullString,
                        copyStringArr, index - countFullString, countFullString);
                countFullString = 0;
            }
        }
        for (String string : copyStringArr) {
            System.out.print(string + " ");
        }
    }
}
