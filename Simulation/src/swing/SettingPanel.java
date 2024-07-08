package swing;

import javax.swing.*;
import java.awt.*;


public class SettingPanel extends JPanel {

    public SettingPanel(int appWidth, int appHeight) {
        this.setPreferredSize(new Dimension(appWidth / 3 - 20, appHeight - 20));
        this.setBackground(Color.GREEN);
    }
}
