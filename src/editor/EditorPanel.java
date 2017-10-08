package editor;

import javax.swing.JPanel;
import java.awt.*;

public class EditorPanel extends JPanel {

    private EditorUIRenderer editorUIRenderer;

    public EditorPanel() {
        this.setLayout(null);
        this.editorUIRenderer = new EditorUIRenderer(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics2D = (Graphics2D) g;
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        //UI
        editorUIRenderer.draw(graphics2D, EditorTool.PENCIL);

        repaint();
    }

    public enum EditorTool {
        PENCIL(0),
        ERASER(1),
        FILL(2);

        int id;
        EditorTool(int id) {
            this.id = id;
        }
        public int getID() {
            return id;
        }
    }
}
