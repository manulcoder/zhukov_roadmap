package swing;

import javax.swing.*;
import java.awt.*;


public class Cell extends JPanel {

    public Cell() {
        Dimension dim = new Dimension(10, 10);
        this.setPreferredSize(dim);
        this.setMinimumSize(dim);
        this.setBackground(Color.BLUE);
    }
}
