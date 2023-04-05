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
        } else if (num1 > num2){
            System.out.println("Число " + num1 + " максимальное, а " + num2 + " минимальное");
        } else {
            System.out.println("Число " + num2 + " максимальное, а " + num1 + " минимальное");
        }

        System.out.println("\n3.Проверка числа\n");
        String even;
        String sign;
        num1 = 36;
        if (num1 == 0) {
            System.out.println("Ошибка! Введите число отличное от нуля.");
        } else {
            if (num1 % 2 == 0){
                even = "четным";
            } else {
                even = "нечетным";
            }
            if (num1 > 0) {
                sign = "положительным";
            } else {
                sign = "отрицательным";
            }
            System.out.println("Число " + num1 + " является " + even + ", " + sign);
        }

        System.out.println("\n4.Поиск одинаковых цифр в числах\n");
        num1 = 503;
        num2 = 563;
        System.out.println(num1 + "\n" + num2 + "\n");
        int numHundred1 = num1 / 100;
        int numTen1 = num1 % 100 / 10;
        int numOne1 = num1 % 100 % 10;
        int numHundred2 = num2 / 100;
        int numTen2 = num2 % 100 / 10;
        int numOne2 = num2 % 100 % 10;
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
        if (ch1 > '`' && ch1 < '{' ) {
            System.out.println(ch1 + " маленькая буква");
        } else if (ch1 > '@' && ch1 < '[') {
            System.out.println(ch1 + " большая буква");
        } else if (ch1 > '/' && ch1 < ':') {
            System.out.println(ch1 + " число");
        } else {
            System.out.println("не буква и не число");
        }

        System.out.println("\n6.Подсчет суммы вклада и начисленных банком %\n");
        int sum = 300_000;
        int percent;
        if (sum < 100_000) {
            percent = sum / 100 * 5;
        } else if (sum >= 100_000 && sum < 300_000) {
            percent = sum / 100 * 7;
        } else {
            percent = sum / 10;
        }
        System.out.println("Сумма вклада: " + sum +"\n" +
                "Начисленный %: " + percent + "\n" +
                "Итоговая сумма с %: " + (sum + percent));

        System.out.println("\n7.Определение оценки по предметам\n");
        int historyPer = 59;
        int programPer = 91;
        int historyGrade;
        if (historyPer <= 60) {
            historyGrade = 2;
        } else if (historyPer > 60 && historyPer <= 73) {
            historyGrade = 3;
        } else if (historyPer > 73 && historyPer <= 91) {
            historyGrade = 4;
        } else {
            historyGrade = 5;
        }
        int programGrade;
        if (programPer <= 60) {
            programGrade = 2;
        } else if (programPer > 60 && programPer <= 73) {
            programGrade = 3;
        } else if (programPer > 73 && programPer <= 91) {
            programGrade = 4;
        } else {
            programGrade = 5;
        }
        int avrGrade = (historyGrade + programGrade) / 2;
        int avrPer = (historyPer + programPer) / 2;
        System.out.println("Оценки: " + historyGrade + " история" + "\n" +
                "        " + programGrade + " программирование" + "\n" +
                "Средняя оценка: " + avrGrade + "\n" +
                "Средний процент: " + avrPer);

        System.out.println("\n8.Расчет прибыли за год\n");
        int priceRent = 5_000;
        int soldGoods = 13_000;
        int purchGoods = 9_000;
        int annProfit = (soldGoods - purchGoods - priceRent) * 12;
        if (annProfit > 0) {
            System.out.println("Прибыль за год: +" + annProfit);
        } else {
            System.out.println("Прибыль за год: " + annProfit);
        }

        System.out.println("\n9.Подсчет количества банкнот\n");
        int srcNum = 567;
        numHundred1 = srcNum / 100;
        numTen1 = srcNum % 100 / 10;
        numOne1 = srcNum % 100 % 10;
        if (srcNum > 1100) {
            System.out.println("Банкнот не хватает для выдачи нужной суммы");
        } else {
            if (srcNum == 1100) {
                numHundred1 = 10;
                numTen1 = 5;
                numOne1 = 50;
            } else if (numTen1 > 5) {
                switch (numTen1) {
                    case 6:
                        numTen1 = 5;
                        numOne1 = numOne1 + 10;
                        break;
                    case 7:
                        numTen1 = 5;
                        numOne1 = numOne1 + 20;
                        break;
                    case 8:
                        numTen1 = 5;
                        numOne1 = numOne1 + 30;
                        break;
                    case 9:
                        numTen1 = 5;
                        numOne1 = numOne1 + 40;
                        break;
                }
            }
            System.out.println("К выдаче: " +"\n" +
                numHundred1 + " по 100" + "\n" +
                numTen1 + " по 10" + "\n" +
                numOne1 + " по 1" +"\n" +
                "К выдаче " + srcNum + " USD");
        }
    }
}