package swing;

import javax.swing.*;
import java.awt.*;


public class Window extends JFrame {

    public Window() throws HeadlessException {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setTitle("Simulation");
        getRootPane().setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int appWidth = screenSize.width / 2;
        int appHeight = screenSize.height / 2;
        this.setSize(appWidth,appHeight);
        this.setLocationRelativeTo(null);

        this.add(new SimulationPanel(appWidth, appHeight), BorderLayout.WEST);
        this.add(new SettingPanel(appWidth, appHeight), BorderLayout.EAST);

        this.setVisible(true);
    }
}
