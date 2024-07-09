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

        list.forEach(this::findSurroundingCell);
        WorldPopulate.setEntityRandom(list);
    }

    public Cell getCellByCoordinates(int x, int y) {
        return list
                .stream()
                .filter(item -> item.getCoordinates().getX() == x && item.getCoordinates().getY() == y)
                .findFirst()
                .get();
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "GameMap:\n" + list;
    }

    private void findSurroundingCell(Cell cell) {
        List<Cell> temp = new ArrayList<>();

        for (Cell another : list) {
            if (cell.getCoordinates().getX() == another.getCoordinates().getX() + 1
                    && cell.getCoordinates().getY() == another.getCoordinates().getY()) {
                temp.add(another);
            } else if (cell.getCoordinates().getX() == another.getCoordinates().getX() - 1
                    && cell.getCoordinates().getY() == another.getCoordinates().getY()) {
                temp.add(another);
            } else if (cell.getCoordinates().getY() == another.getCoordinates().getY() + 1
                    && cell.getCoordinates().getX() == another.getCoordinates().getX()) {
                temp.add(another);
            } else if (cell.getCoordinates().getY() == another.getCoordinates().getY() - 1
                    && cell.getCoordinates().getX() == another.getCoordinates().getX()) {
                temp.add(another);
            }
        }

        cell.SetSurroundingCell(temp);
    }
}
