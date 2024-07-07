import java.util.ArrayList;
import java.util.Arrays;


public enum Scaffold {

    ZERO {
        @Override
        public String toString() {
            return " _________      \n" +
                    " |/      |      \n" +
                    " |              \n" +
                    " |              \n" +
                    " |              \n" +
                    " |              \n" +
                    " |              \n" +
                    " |              \n" +
                    " |              \n" +
                    "|+|=============\n";
        }
    },

    ONE {
        @Override
        public String toString() {
            return  " _________      \n" +
                    " |/      |      \n" +
                    " |     (o_0)    \n" +
                    " |              \n" +
                    " |              \n" +
                    " |              \n" +
                    " |              \n" +
                    " |              \n" +
                    " |              \n" +
                    "|+|=============\n";
        }
    },

    TWO {
        @Override
        public String toString() {
            return " _________      \n" +
                    " |/      |      \n" +
                    " |     (o_0)    \n" +
                    " |      _|_     \n" +
                    " |      | |     \n" +
                    " |      | |     \n" +
                    " |       -      \n" +
                    " |              \n" +
                    " |              \n" +
                    "|+|=============\n";
        }
    },

    THREE {
        @Override
        public String toString() {
            return " _________      \n" +
                    " |/      |      \n" +
                    " |     (o_0)    \n" +
                    " |      _|_     \n" +
                    " |     /| |     \n" +
                    " |    / | |     \n" +
                    " |       -      \n" +
                    " |              \n" +
                    " |              \n" +
                    "|+|=============\n";
        }
    },

    FOUR {
        @Override
        public String toString() {
            return " _________      \n" +
                    " |/      |      \n" +
                    " |     (o_0)    \n" +
                    " |      _|_     \n" +
                    " |     /| |\\   \n" +
                    " |    / | | \\  \n" +
                    " |       -      \n" +
                    " |              \n" +
                    " |              \n" +
                    "|+|=============\n";
        }
    },

    FIVE {
        @Override
        public String toString() {
            return " _________      \n" +
                    " |/      |      \n" +
                    " |     (o_0)    \n" +
                    " |      _|_     \n" +
                    " |     /| |\\   \n" +
                    " |    / | | \\  \n" +
                    " |      /-      \n" +
                    " |     /        \n" +
                    " |              \n" +
                    "|+|=============\n";
        }
    },

    SEVEN {
        @Override
        public String toString() {
            return " _________      \n" +
                    " |/      |      \n" +
                    " |     (o_0)    \n" +
                    " |      _|_     \n" +
                    " |     /| |\\   \n" +
                    " |    / | | \\  \n" +
                    " |      /-\\    \n" +
                    " |     /   \\   \n" +
                    " |              \n" +
                    "|+|=============\n";
        }
    };

    public static ArrayList<Scaffold> getAllScaffold() {
        return new ArrayList<>(Arrays.asList(Scaffold.values()));
    }

    public static String getWin() {
        return " _________      \n" +
                " |/             \n" +
                " |              \n" +
                " |    \\(^_^)/  \n" +
                " |     \\_|_/   \n" +
                " |      | |     \n" +
                " |      | |     \n" +
                " |      /-\\    \n" +
                " |     /   \\   \n" +
                "|+|=============\n";
    }


    public static String getLose() {
        return " _________      \n" +
                " |/      |      \n" +
                " |     (x_x)    \n" +
                " |      _|_     \n" +
                " |     /| |\\   \n" +
                " |     || ||    \n" +
                " |      /-\\    \n" +
                " |      | |     \n" +
                " |              \n" +
                "|+|=============\n";
    }
}

