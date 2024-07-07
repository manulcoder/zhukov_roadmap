import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WordGetter {
    private static final List<String> list = new ArrayList<>();
    private static String word;

    private static String getWord() {
        fillList();
        int index = (int) Math.floor(Math.random() * list.size());
        word = list.get(index);
        return word;
    }

    private static void fillList() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/source.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                list.add(line);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static ArrayList<Pair> getWordLikeList() {
        char[] splitWord = getWord().toCharArray();
        ArrayList<Pair> result = new ArrayList<>();
        for (char ch : splitWord) {
            result.add(new Pair(ch));
        }
        return result;
    }

    public static String getHiddenWord() {
        return word;
    }
}
