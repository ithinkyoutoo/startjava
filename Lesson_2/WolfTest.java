public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfAkela = new Wolf();
        wolfAkela.gender = "Мужской";
        wolfAkela.name = "Акела";
        wolfAkela.weight = 48.3f;
        wolfAkela.age = 5;
        wolfAkela.color = "Серый";
        System.out.println("\nПараметры волка :" + "\n" +
                "Пол = " + wolfAkela.gender + "\n" +
                "Имя = " + wolfAkela.name + "\n" +
                "Вес(кг) = " + wolfAkela.weight + "\n" +
                "Возраст(лет) = " + wolfAkela.age + "\n" +
                "Цвет = " + wolfAkela.color + "\n");
        wolfAkela.go();
        wolfAkela.sit();
        wolfAkela.run();
        wolfAkela.howl();
        wolfAkela.hunt();
    }
}