import swing.Window;
import world.GameMap;


public class Main {
    public static void main(String[] args) {
        new Window();

        GameMap map = new GameMap(10,10);

        System.out.println(map);
    }
}