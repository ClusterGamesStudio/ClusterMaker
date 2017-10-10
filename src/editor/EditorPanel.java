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
        PENCIL(0, "assets/dirt ohne grass.jpg"),
        ERASER(1, "assets/dirt mit schatten.jpg"),
        FILL(2, "assets/dirt ecke links mit schatten.jpg");

        int id;
        String imagePath;
        EditorTool(int id, String imagePath) {
            this.id = id;
            this.imagePath = imagePath;
        }

        public String getImagePath() {
            return imagePath;
        }

        public int getID() {
            return id;
        }

        public static EditorTool getNameByCode(int code){
            for(EditorTool e : EditorTool.values()){
                if(code == e.id) return e;
            }
            return null;
        }

        public static String getImagePathByCode(int code){
            for(EditorTool e : EditorTool.values()){
                if(code == e.id) return e.getImagePath();
            }
            return null;
        }

    }
}
