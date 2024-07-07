import java.util.Scanner;

public class Main {
    private static int wins = 0;
    private static int lose = 0;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            Printer.printSpecial("Your score: wins-" + wins + " / lose-" + lose);
            Printer.print("Do you wanna play? (y/n)");
            String input = scanner.nextLine();

            if (input.equals("y")) {
                Game game = new Game();
                if(game.start()) {
                    wins++;
                } else {
                    lose++;
                }

            } else if (input.equals("n")) {
                Printer.printWin("Bye)");
                break;
            } else {
                Printer.printWarning("Enter y or n");
            }
        }

    }
}
