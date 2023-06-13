package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {

    public static void main(String[] args) {
        ArrayTheme array = new ArrayTheme();

        array.reverse();
        array.printProduct();
        array.delete();
        array.printReverseStairs();
        array.generateUniqueNums();
        array.copyNonEmptyStrings();
    }

    private void reverse() {
        System.out.println("\n1. Реверс значений массива\n");
        int[] intArr = {5, 2, 1, 7, 3, 6, 4};
        print(intArr);
        int length = intArr.length;
        for (int i = 0; i < length; i++) {
            int tempNum = intArr[i];
            intArr[i] = intArr[--length];
            intArr[length] = tempNum;
        }
        print(intArr);
    }

    private void printProduct() {
        System.out.println("\n2. Вывод произведения элементов массива\n");
        int[] multipliers = new int[10];
        int length = multipliers.length;
        for (int i = 0; i < length; i++) {
            multipliers[i] = i;
        }
        int productNums = 1;
        String result;
        for (int i = 1; i < length - 1; i++) {
            productNums *= multipliers[i];
            result = i != length - 2 ? " * " : " = " + productNums;
            System.out.print(multipliers[i] + result);
        }
        System.out.println("\n" + multipliers[0] + "  " + multipliers[9]);
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
        double middleCellValue = randomDoubles[length / 2];
        for (int i = 0; i < length; i++) {
            if (randomDoubles[i] > middleCellValue) {
                randomDoubles[i] = 0;
                countZeros++;
            }
        }
        print(randomDoubles);
        System.out.println("Кол-во обнуленных ячеек = " + countZeros);
    }

    private void print(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%8.3f", array[i]);
            if (i == array.length / 2) {
                System.out.println();
            }
        }
        System.out.println("\n");
    }

    private void printReverseStairs() {
        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке\n");
        char[] alphabet = new char[26];
        int length = alphabet.length;
        for (char i = 0; i < length; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        String result = "";
        for (int i = 0; i < length; i++) {
            result += alphabet[length - (1 + i)];
            System.out.println(result);
        }
    }

    private void generateUniqueNums() {
        System.out.println("\n5. Генерация уникальных чисел\n");
        int[] uniqueNums = new int[30];
        int length = uniqueNums.length;
        for (int i = 0; i < length; i++) {
            int num = 0;
            for (int j = i; j >= 0; j--) {
                if (num == uniqueNums[j]) {
                    num = (int) (60 + Math.random() * 40);
                    j = i;
                }
            }
            uniqueNums[i] = num;
        }
        for (int i = length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (uniqueNums[j] > uniqueNums[j + 1]) {
                    int tempNum = uniqueNums[j + 1];
                    uniqueNums[j + 1] = uniqueNums[j];
                    uniqueNums[j] = tempNum;
                }
            }
        }
        print(uniqueNums);
    }

    private void copyNonEmptyStrings() {
        System.out.println("\n6. Копирование не пустых строк\n");
        String[] srcStrings = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        print(srcStrings);
        int length = 0;
        for (String string : srcStrings) {
            if (!string.isBlank()) {
                length++;
            }
        }
        String[] nonEmptyStrings = new String[length];
        int index = 0;
        int countFullStrings = 0;
        for (int i = 0; i < srcStrings.length; i++) {
            if (!srcStrings[i].isBlank()) {
                index++;
                countFullStrings++;
            } else {
                System.arraycopy(srcStrings, i - countFullStrings,
                        nonEmptyStrings, index - countFullStrings, countFullStrings);
                countFullStrings = 0;
            }
        }
        print(nonEmptyStrings);
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