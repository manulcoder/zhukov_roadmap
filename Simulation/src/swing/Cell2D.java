package swing;

import world.Cell;

import javax.swing.*;
import java.awt.*;


public class Cell2D extends JPanel {
    private Icon icon;

    public Cell2D(Cell cell) {
        Dimension dim = new Dimension(10, 10);
        this.setPreferredSize(dim);
        this.setMinimumSize(dim);
        this.setBackground(Color.BLUE);

        if (cell.getEntity() != null) {
            String s = switch (cell.getEntity().toString()) {
                case "entity.animal.Herbivore" -> "src/assets/rabbit.png";
                case "entity.animal.Predator" -> "src/assets/wolf.png";
                case "entity.objects.Grass" -> "src/assets/grass.png";
                case "entity.objects.Rock" -> "src/assets/rock.png";
                case "entity.objects.Tree" -> "src/assets/tree.png";
                default -> "";
            };

            if (!s.isEmpty()) getImage(s);
        }
    }

    public void getImage(String path) {
        icon = new ImageIcon(path);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (icon != null) {
            int panelW = this.getWidth();
            int panelH = this.getHeight();

            int iconW = icon.getIconWidth();
            int iconH = icon.getIconHeight();

            int x = (panelW - iconW) / 2;
            int y = (panelH - iconH) / 2;

            icon.paintIcon(this, g, x, y);
        }
    }
}
