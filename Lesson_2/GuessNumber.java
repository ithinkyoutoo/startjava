import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private Scanner scan;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    public void playGame() {
        int counter = 1;
        int playerNum;
        int pcNum = 1 + (int) (Math.random() * 100);
        System.out.println("\nКомпьютер загадал число от 1 до 100, попробуйте отгадать!");
        do {
            String player;
            if (counter % 2 == 1) {
                player = player1.getName();
            } else {
                player = player2.getName();
            }
            System.out.print("\n" + player + " введите число: ");
            playerNum = scan.nextInt();
            scan.nextLine();
            if (playerNum == pcNum) {
                System.out.println("Вы угадали!");
            } else if (playerNum > pcNum) {
                System.out.println("Число " + playerNum + " больше того, что загадал компьютер");
            } else {
                System.out.println("Число " + playerNum + " меньше того, что загадал компьютер");
            }
            counter++;
        } while (playerNum != pcNum);
    }
}
