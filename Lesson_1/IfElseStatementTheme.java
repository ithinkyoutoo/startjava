public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("\n1.Перевод псевдокода на язык Java\n");
        byte age = 21;
        if (age > 20) {
            System.out.println("Вы занимаетесь в старшей группе");
        } else {
            System.out.println("Вы занимаетесь в младшей группе");
        }
        boolean isMaleGender = true;
        if (!isMaleGender) {
            System.out.println("Вы занимаетесь в женской группе");
        } else {
            System.out.println("Вы занимаетесь в мужской группе");
        }
        float height = 1.65F;
        if (height > 1.80) {
            System.out.println("Ваш комплект для занятий 1 категории");
        } else {
            System.out.println("Ваш комплект для занятий 2 категории");
        }
        char firstCharName = "Ivan".charAt(0);
        if (firstCharName == 'M') {
            System.out.println("Ваш тренер Марина");
        } else if (firstCharName == 'I') {
            System.out.println("Ваш тренер Иван");
        } else {
            System.out.println("Ваш тренер Борис");
        }

        System.out.println("\n2.Поиск max и min числа\n");
        int num1 = 42;
        int num2 = 37;
        if (num1 == num2) {
            System.out.println("Числа " + num1 + " и " + num2 + " равны");
        } else if (num1 > num2) {
            System.out.println("Число " + num1 + " максимальное, а " + num2 + " минимальное");
        } else {
            System.out.println("Число " + num2 + " максимальное, а " + num1 + " минимальное");
        }

        System.out.println("\n3.Проверка числа\n");
        num1 = 36;
        if (num1 == 0) {
            System.out.println("Ошибка! Введите число отличное от нуля.");
        } else {
            String even = "нечетным";
            String sign = "отрицательным";
            if (num1 % 2 == 0) {
                even = "четным";
            }
            if (num1 > 0) {
                sign = "положительным";
            }
            System.out.println("Число " + num1 + " является " + even + ", " + sign);
        }

        System.out.println("\n4.Поиск одинаковых цифр в числах\n");
        num1 = 503;
        num2 = 563;
        System.out.println(num1 + "\n" + num2 + "\n");
        int numHundred1 = num1 / 100;
        int numTen1 = num1 / 10 % 10;
        int numOne1 = num1 % 10;
        int numHundred2 = num2 / 100;
        int numTen2 = num2 / 10 % 10;
        int numOne2 = num2 % 10;
        if (numHundred1 != numHundred2 && numTen1 != numTen2 && numOne1 != numOne2) {
            System.out.println("Нет совпадений");
        } else {
            System.out.println("Совпадения:\n");
            if (numHundred1 == numHundred2) {
                System.out.println("Число " + numHundred1 + " совпадает в 3-ем разряде");
            }
            if (numTen1 == numTen2) {
                System.out.println("Число " + numTen1 + " совпадает во 2-ом разряде");
            }
            if (numOne1 == numOne2) {
                System.out.println("Число " + numOne1 + " совпадает в 1-ом разряде");
            }
        }

        System.out.println("\n5.Определение символа по его коду\n");
        char ch1 = '\u0057';
        if (ch1 >= 'a' && ch1 <= 'z' ) {
            System.out.println(ch1 + " маленькая буква");
        } else if (ch1 >= 'A' && ch1 <= 'Z') {
            System.out.println(ch1 + " большая буква");
        } else if (ch1 >= '0' && ch1 <= '9') {
            System.out.println(ch1 + " число");
        } else {
            System.out.println("не буква и не число");
        }

        System.out.println("\n6.Подсчет суммы вклада и начисленных банком %\n");
        int sum = 300_000;
        int percent = sum / 100 * 5;
        if (sum >= 100_000 && sum < 300_000) {
            percent = sum / 100 * 7;
        } else if (sum >= 300_000) {
            percent = sum / 10;
        }
        System.out.println("Сумма вклада: " + sum +"\n" +
                "Начисленный %: " + percent + "\n" +
                "Итоговая сумма с %: " + (sum + percent));

        System.out.println("\n7.Определение оценки по предметам\n");
        int historyPercent = 59;
        int historyGrade = 5;
        if (historyPercent <= 60) {
            historyGrade = 2;
        } else if (historyPercent > 60 && historyPercent <= 73) {
            historyGrade = 3;
        } else if (historyPercent > 73 && historyPercent <= 91) {
            historyGrade = 4;
        }
        int programPercent = 91;
        int programGrade = 5;
        if (programPercent <= 60) {
            programGrade = 2;
        } else if (programPercent > 60 && programPercent <= 73) {
            programGrade = 3;
        } else if (programPercent > 73 && programPercent <= 91) {
            programGrade = 4;
        }
        int averageGrade = (historyGrade + programGrade) / 2;
        int averagePercent = (historyPercent + programPercent) / 2;
        System.out.println("Оценки: " + historyGrade + " история" + "\n" +
                "        " + programGrade + " программирование" + "\n" +
                "Средняя оценка: " + averageGrade + "\n" +
                "Средний процент: " + averagePercent);

        System.out.println("\n8.Расчет прибыли за год\n");
        int priceRent = 5_000;
        int soldGoods = 13_000;
        int costGoods = 9_000;
        int annualProfit = (soldGoods - costGoods - priceRent) * 12;
        if (annualProfit > 0) {
            System.out.println("Прибыль за год: +" + annualProfit);
        } else {
            System.out.println("Прибыль за год: " + annualProfit);
        }

        System.out.println("\n9.Подсчет количества банкнот\n");
        int srcUsd = 567;
        int reserveHundred = 10;
        int reserveTen = 5;
        int reserveOne = 50;
        int sumReserve = reserveHundred * 100 + reserveTen * 10 + reserveOne;
        if (srcUsd > sumReserve) {
            System.out.println("Банкнот не хватает для выдачи нужной суммы");
        } else {
            int numHundred = srcUsd / 100;
            int numTen = srcUsd / 10 % 10;
            int numOne = srcUsd % 10;
            if (srcUsd == sumReserve) {
                numHundred = reserveHundred;
                numTen = reserveTen;
                numOne = reserveOne;
            } else if (numTen > reserveTen) {
                numOne += (numTen - reserveTen) * 10;
                numTen = reserveTen;
                }
            System.out.println("К выдаче: " + "\n" +
                    numHundred + " по 100" + "\n" +
                    numTen + " по 10" + "\n" +
                    numOne + " по 1" + "\n" +
                    "К выдаче " + srcUsd + " USD");
        }
    }
}