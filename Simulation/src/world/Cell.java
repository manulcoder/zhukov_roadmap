package world;

import entity.Entity;
import entity.animal.Herbivore;

import java.util.ArrayList;
import java.util.List;


public class Cell {
    private final Coordinates coordinates;
    private Entity entity;
    private List<Cell> surroundingCells = new ArrayList<>();

    public Cell(Coordinates coordinates) {
        this.coordinates = coordinates;
        entity = new Herbivore();
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void SetSurroundingCell(List<Cell> list) {
        surroundingCells = list;
    }

    @Override
    public String toString() {
        return "\n\tCell:\n" +
                "\t\tcoordinates: " + coordinates +
                "\t\tentity: " + entity +
                "\t\tsurroundingCells: " + surroundingCells.size() ;
    }
}
