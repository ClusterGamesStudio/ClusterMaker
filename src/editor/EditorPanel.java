package editor;

import javax.swing.JPanel;
import java.awt.*;

public class EditorPanel extends JPanel {

    public EditorPanel() {

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics2D = (Graphics2D) g;
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        repaint();
    }
}
