public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("\n1.Вывод характеристик компьютера\n");
        int numСoreCpu = 10;
        float frequencyCpu = 4.4F;
        char letterD = 'D';
        char letterR = 'R';
        byte typeRam = 4;
        short volumeRam = 8;
        double frequencyRam = 3.2;
        long volumeSsd = 512L;
        boolean isSuitable = true;
        System.out.println("Кол-во ядер CPU: " + numСoreCpu + "\n" +
                "Тактовая частота CPU: до " + frequencyCpu + "GHz"+ "\n" +
                "Тип RAM: " + letterD + letterD + letterR + typeRam + "\n" +
                "Объем RAM: " + volumeRam + "Gb" + "\n" +
                "Тактовая частота RAM: " + frequencyRam + "GHz" + "\n" +
                "Объем SSD: " + volumeSsd + "Gb" + "\n" +
                "Правда, что этот ноутбук подходит для учебы?: " + isSuitable);

        System.out.println("\n2.Расчет стоимости товара со скидкой\n");
        int penPrice = 100;
        int bookPrice = 200;
        int totalPrice = penPrice + bookPrice;
        int discount = 11;
        int discountSum = (totalPrice / 100) * discount;
        int discountPrice = totalPrice - discountSum;
        System.out.println("Общая стоимость товаров без скидки: " + totalPrice + "\n" +
                "Сумма скидки: " + discountSum + "\n" +
                "Общая стоимость товаров со скидкой: " + discountPrice);

        System.out.println("\n3.Вывод слова JAVA\n\n" +
                "   J    a  v     v  a\n" +
                "   J   a a  v   v  a a\n" +
                "J  J  aaaaa  V V  aaaaa\n" +
                " JJ  a     a  V  a     a");

        System.out.println("\n4.Вывод min и max значений целых числовых типов\n");
        byte byteMax = 127;
        System.out.println(byteMax + "\n" +
                ++byteMax + "\n" +
                --byteMax + "\n");
        short shortMax = 32767;
        System.out.println(shortMax + "\n" +
                ++shortMax + "\n" +
                --shortMax + "\n");
        int intMax = 2147483647;
        System.out.println(intMax + "\n" +
                ++intMax + "\n" +
                --intMax + "\n");
        long longMax = 9223372036854775807L;
        System.out.println(longMax + "\n" +
                ++longMax + "\n" +
                --longMax);

        System.out.println("\n5.Перестановка значений переменных\n");
        int x = 2;
        int y = 5;
        System.out.println("С помощью третьей переменной" + "\n" +
                x + " " + y);
        int z = x;
        x = y;
        y = z;
        System.out.println(x + " " + y);
        System.out.println("\nС помощью арифметических операций" + "\n" +
                x + " " + y);
        x -= y;
        y += x;
        x = y - x;
        System.out.println(x + " " + y);
        System.out.println("\nС помощью побитовой операции ^" + "\n" +
                x + " " + y);
        x ^= y;
        y ^= x;
        x ^= y;
        System.out.println(x + " " + y);

        System.out.println("\n6.Вывод символов и их кодов\n");
        char hash = '#';
        char ampersand = '&';
        char at = '@';
        char caret = '^';
        char underscore = '_';
        System.out.println((int) hash + " " + hash + "\n" +
                (int) ampersand + " " + ampersand + "\n" +
                (int) at + " " + at + "\n" +
                (int) caret + " " + caret + "\n" +
                (int) underscore + " " + underscore);

        System.out.println("\n7.Вывод в консоль ASCII-арт Дюка\n");
        char forwardSlash = '/';
        char backSlash = '\\';
        char openParenthesis = '(';
        char closeParenthesis = ')';
        System.out.println("    " + forwardSlash + backSlash + "\n" +
                "   " + forwardSlash + "  " + backSlash + "\n" +
                "  " + forwardSlash + underscore + openParenthesis +
                " " + closeParenthesis + backSlash + "\n" +
                " " + forwardSlash + "      " + backSlash + "\n" +
                "" + forwardSlash + underscore + underscore + underscore +
                underscore + forwardSlash + backSlash + underscore + underscore + backSlash);

        System.out.println("\n8.Вывод количества сотен, десятков и единиц числа\n");
        int srcNum = 123;
        int numHundred = srcNum / 100;
        int numTen = srcNum / 10 % 10;
        int numOne = srcNum % 10;
        System.out.println("Число 123 содержит:\n" +
                numHundred + " сотня\n" +
                numTen + " десятка\n" +
                numOne + " единицы\n");
        int sum = numHundred + numTen + numOne;
        int prod = numHundred * numTen * numOne;
        System.out.println("Сумма цифр = " + sum + "\n" +
                "Произведение = " + prod);

        System.out.println("\n9.Вывод времени\n");
        srcNum = 86399;
        int hour = srcNum / 3600;
        int min = srcNum / 60 % 60;
        int sec = srcNum % 60;
        System.out.println(hour + ":" + min + ":" + sec);
    }
}