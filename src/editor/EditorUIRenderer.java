package editor;

import main.Var;

import java.awt.*;

public class EditorUIRenderer {

    private int iconSize;
    private int padding = 20;
    public EditorUIRenderer() {
        iconSize = Var.width/16;
    }

    public void render() {

    }

    public void draw(Graphics2D graphics2D) {
        for(int i = 0; i<EditorPanel.EditorTool.values().length; i++) {
            graphics2D.fillRect(padding, padd);
        }
    }

}
