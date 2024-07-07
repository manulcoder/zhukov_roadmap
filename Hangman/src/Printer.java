public class Printer {
    private static final String d = "\u001b[0m";

    private static final String r = "\u001b[31m";
    private static final String g = "\u001b[32m";
    private static final String y = "\u001b[33m";

    private static final String db = "\u001b[48;5;17m";


    public static void printWarning(String s) {
        System.out.println(y + s + d);
    }

    public static void printLose(String s) {
        System.out.println(r + s + d);
    }

    public static void printWin(String s) {
        System.out.println(g + s + d);
    }

    public static void print(String s) {
        System.out.println(s);
    }

    public static void printSpecial(String s) {
        System.out.println(db + s + d);
    }
}
