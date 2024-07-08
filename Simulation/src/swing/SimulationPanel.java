package swing;

import javax.swing.*;
import java.awt.*;


public class SimulationPanel extends JPanel {

    public SimulationPanel(int appWidth, int appHeight) {
        this.setPreferredSize(new Dimension(appWidth / 3 * 2 - 20, appHeight - 20));
        this.setBackground(Color.GRAY);

        this.setLayout(new GridLayout(10, 10, 1, 1));
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                this.add(new Cell());
            }
        }
    }
}
