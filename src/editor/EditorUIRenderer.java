package editor;

import main.Var;

import java.awt.*;

public class EditorUIRenderer {

    private int iconSize;
    private int padding = 20;
    private int toolLength;
    public EditorUIRenderer() {
        iconSize = Var.width/16;
        toolLength = EditorPanel.EditorTool.values().length;
    }

    public void render() {

    }

    public void draw(Graphics2D graphics2D) {
        for(int i = 0; i<toolLength; i++) {
            graphics2D.fillRect(padding, (i*padding+i*iconSize)+(toolLength*padding+toolLength*iconSize)/2+padding, iconSize, iconSize);
        }
    }

}
