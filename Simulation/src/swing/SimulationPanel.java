package swing;

import world.GameMap;

import javax.swing.*;
import java.awt.*;


public class SimulationPanel extends JPanel {

    public SimulationPanel(int appWidth, int appHeight) {
        this.setPreferredSize(new Dimension(appWidth / 3 * 2 - 20, appHeight - 20));
        this.setBackground(Color.GRAY);

        GameMap map = new GameMap(10,10);

        this.setLayout(new GridLayout(map.getWidth(), getHeight(), 1, 1));
        for (int i = 1; i <= map.getWidth(); i++) {
            for (int j = 1; j <= map.getHeight(); j++) {
                this.add(new Cell2D(map.getCellByCoordinates(i,j)));
            }
        }
    }
}
