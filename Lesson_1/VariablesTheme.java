public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("\n1.Вывод характеристик компьютера\n");
        int numСore = 10;
        float freqCpu = 4.4F;
        char ch1 = 'D';
        char ch2 = 'R';
        byte typeRam = 4;
        short volRam = 8;
        double freqRam = 3.2;
        long volSsd= 512L;
        boolean isSuitable = true;
        System.out.println("Кол-во ядер CPU: " + numСore + "\n" +
                "Тактовая частота CPU: до " + freqCpu + "GHz"+ "\n" +
                "Тип RAM: " + ch1 + ch1 + ch2 + typeRam + "\n" +
                "Объем RAM: " + volRam + "Gb" +"\n" +
                "Тактовая частота RAM: " + freqRam + "GHz" + "\n" +
                "Объем SSD: " + volSsd + "Gb" + "\n" +
                "Правда, что этот ноутбук подходит для учебы?: " + isSuitable);

        System.out.println("\n2.Расчет стоимости товара со скидкой\n");
        int penPrice = 100;
        int bookPrice = 200;
        int totalPrice = penPrice + bookPrice;
        int discount = 11;
        int discountCount = (totalPrice/100) * discount;
        int discountPrice = totalPrice - discountCount;
        System.out.println("Общая стоимость товаров без скидки: " + totalPrice + "\n" +
                "Сумма скидки: " + discountCount + "\n" +
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
        int z;
        z = x;
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
        ch1 = '#';
        ch2 = '&';
        char ch3 = '@';
        char ch4 = '^';
        char ch5 = '_';
        int intCh1 = (int) ch1;
        int intCh2 = (int) ch2;
        int intCh3 = (int) ch3;
        int intCh4 = (int) ch4;
        int intCh5 = (int) ch5;
        System.out.println(intCh1 + " " + ch1 + "\n" +
                intCh2 + " " + ch2 + "\n" +
                intCh3 + " " + ch3 + "\n" +
                intCh4 + " " + ch4 + "\n" +
                intCh5 + " " + ch5);

        System.out.println("\n7.Вывод в консоль ASCII-арт Дюка\n");
        ch1 = '/';
        ch2 = '\\';
        ch3 = '(';
        ch4 = ')';
        System.out.println("    " + ch1 + ch2 + "\n" +
                "   " + ch1 + "  " + ch2 + "\n" +
                "  " + ch1 + ch5 + ch3 + " " + ch4 + ch2 + "\n" +
                " " + ch1 +"      " + ch2 + "\n" +
                "" + ch1 + ch5 + ch5 + ch5 + ch5 + ch1 + ch2 + ch5 + ch5 + ch2);

        System.out.println("\n8.Вывод количества сотен, десятков и единиц числа\n");
        int srcNum = 123;
        int numHundred = srcNum / 100;
        int numTen = (srcNum % 100) / 10;
        int numOne = (srcNum % 100) % 10;
        System.out.println("Число 123 содержит:\n" +
                numHundred + " сотня\n" +
                numTen + " десятка\n" +
                numOne + " единицы\n");
        int Sum = numHundred + numTen + numOne;
        int Prod = numHundred * numTen * numOne;
        System.out.println("Сумма цифр = " + Sum + "\n" +
                "Произведение = " + Prod);

        System.out.println("\n9.Вывод времени\n");
        srcNum = 86399;
        int hour = srcNum / 3600;
        int min = srcNum % 3600 / 60;
        int sec = srcNum % 3600 % 60;
        System.out.println(hour + ":" + min + ":" + sec);
    }
}