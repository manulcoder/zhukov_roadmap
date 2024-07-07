import java.util.*;


public class Game {
    private static final Scanner scanner = new Scanner(System.in);

    private static Set<Character> alreadyEntered;
    private static List<Pair> hiddenWord;
    private static List<Scaffold> scaffolds;
    private static Iterator<Scaffold> scaffoldIterator;

    public Game() {
        alreadyEntered = new HashSet<>();
        hiddenWord = WordGetter.getWordLikeList();
        scaffolds = Scaffold.getAllScaffold();
        scaffoldIterator = scaffolds.iterator();
    }

    public boolean start() {
        Printer.print("Игра \"Висилица\". Вам загадано слово, количство * совпадает с буквами в словепп.\n" +
                "Вводите по одной букве чтобы отгадать слово.");

        while (true) {
            Printer.print("\n");
            printHiddenWord();
            printEnteredLetters();
            String input = scanner.nextLine();

            if (input.length() != 1) {
                Printer.printWarning("Enter only one letter.");
                continue;
            }

            char inputChar = Character.toLowerCase(input.charAt(0));

            if (!Character.isLetter(inputChar)) {
                Printer.printWarning("Enter only Cyrillic letter.");
                continue;
            }

            if (!alreadyEntered.add(inputChar)) {
                Printer.printWarning("You have already entered this letter.");
                continue;
            }

            boolean isGuess = false;
            boolean isWordGuested = true;
            for (Pair pair : hiddenWord) {
                if (pair.getSymbol().equals(inputChar)) {
                    pair.setGuested();
                    isGuess = true;
                }

                if (!pair.isGuested()) {
                    isWordGuested = false;
                }
            }


            if (isWordGuested) {
                Printer.printWin("Game over. Your win");
                printWord();
                System.out.println(Scaffold.getWin());
                return true;
            }

            if (isGuess) continue;

            if (scaffoldIterator.hasNext()) {
                System.out.println(scaffoldIterator.next());
            } else {
                System.out.println();
                Printer.printLose("Game over. Your lose");
                printWord();
                System.out.println(Scaffold.getLose());
                return false;
            }

        }
    }

    private static void printHiddenWord() {
        StringBuilder result = new StringBuilder();
        for (Pair pair : hiddenWord) result.append(pair);
        Printer.printSpecial(" " + result.toString() + " ");
    }

    private static void printEnteredLetters() {
        StringBuilder result = new StringBuilder();
        for (char ch : alreadyEntered) {
            result.append(ch);
            result.append(" ");
        }

        if (!result.isEmpty()) {
            Printer.print("You already tried: " + result);
        }
    }

    private static void printWord() {
        Printer.print("Hidden word is: " + WordGetter.getHiddenWord());
    }
}


