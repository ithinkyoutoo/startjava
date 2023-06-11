package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {

    public static void main(String[] args) {
        ArrayTheme array = new ArrayTheme();

        array.reverse();
        array.printProduct();
        array.delete();
        array.printReverseStairs();
        array.generateNums();
        array.copyFullStrings();
    }

    private void reverse() {
        System.out.println("\n1. Реверс значений массива\n");
        int[] intArr = {5, 2, 1, 7, 3, 6, 4};
        print(intArr);
        int tempNum;
        int length = intArr.length - 1;
        for (int i = 0; i < length / 2; i++) {
            tempNum = intArr[i];
            intArr[i] = intArr[length - i];
            intArr[length - i] = tempNum;
        }
        print(intArr);
    }

    private void printProduct() {
        System.out.println("\n2. Вывод произведения элементов массива\n");
        int[] intArr = new int[10];
        int length = intArr.length;
        for (int i = 0; i < length; i++) {
            intArr[i] = i;
        }
        int productNums = 1;
        String result;
        for (int i = 1; i < length - 1; i++) {
            productNums *= intArr[i];
            result = intArr[i] != intArr[length - 2] ? " * " : " = " + productNums;
            System.out.print(intArr[i] + result);
        }
        System.out.println("\n" + intArr[0] + "  " + intArr[9]);
    }

    private void delete() {
        System.out.println("\n3. Удаление элементов массива\n");
        double[] randomDoubles = new double[15];
        int length = randomDoubles.length;
        for (int i = 0; i < length; i++) {
            randomDoubles[i] = Math.random();
        }
        print(randomDoubles);
        int countZeros = 0;
        for (int i = 0; i < length; i++) {
            if (randomDoubles[i] > randomDoubles[length / 2]) {
                randomDoubles[i] = 0;
                countZeros++;
            }
        }
        print(randomDoubles);
        System.out.println("Кол-во обнуленных ячеек = " + countZeros);
    }

    private void print(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                System.out.printf("%8.0f", array[i]);
            } else {
                System.out.printf("%8.3f", array[i]);
            }
            if (i == array.length / 2) {
                System.out.println();
            }
        }
        System.out.println("\n");
    }

    private void printReverseStairs() {
        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке\n");
        char[] charArr = new char[26];
        int index = 0;
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

    private void generateNums() {
        System.out.println("\n5. Генерация уникальных чисел\n");
        int[] intArr = new int[30];
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
        int tempNum;
        for (int i = length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (intArr[j] > intArr[j + 1]) {
                    tempNum = intArr[j + 1];
                    intArr[j + 1] = intArr[j];
                    intArr[j] = tempNum;
                }
            }
        }
        print(intArr);
    }

    private void copyFullStrings() {
        System.out.println("\n6. Копирование не пустых строк\n");
        String[] stringArr = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        print(stringArr);
        int length = 0;
        for (String string : stringArr) {
            if (!string.isBlank()) {
                length++;
            }
        }
        String[] copyStringArr = new String[length];
        int index = 0;
        int countFullString = 0;
        for (int i = 0; i < stringArr.length; i++) {
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
        print(copyStringArr);
    }

    private void print(String[] array) {
        for (String string : array) {
            System.out.print(string + " ");
        }
        System.out.println();
    }

    private void print(int[] array) {
        int length = array.length;
        for (int num : array) {
            System.out.print(" " + num);
            length--;
            if (length % 10 == 0) {
                System.out.println();
            }
        }
    }
}