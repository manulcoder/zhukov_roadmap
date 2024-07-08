package world;

import java.util.ArrayList;
import java.util.List;


public class GameMap {
    private final List<Cell> list = new ArrayList<>();
    private final int height;
    private final int width;

    public GameMap(int height, int width) {
        this.height = height;
        this.width = width;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                list.add(new Cell(new Coordinates(i, j)));
            }
        }
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }


    public Cell getCellByCoordinates(Coordinates c) {
        return list.stream().filter(data -> data.getCoordinates().equals(c)).findFirst().get();
    }

    @Override
    public String toString() {
        return "GameMap:\n" + list;
    }
}
