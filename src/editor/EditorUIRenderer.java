package editor;

import main.Var;

import javax.swing.*;
import java.awt.*;

public class EditorUIRenderer {

    private int iconSize;
    private int padding = 20;
    private int toolLength;

    private JLabel[] tools;

    public EditorUIRenderer(EditorPanel panel) {
        iconSize = Var.width/16;
        toolLength = EditorPanel.EditorTool.values().length;
        tools = new JLabel[toolLength];


        for(int i = 0; i<toolLength; i++) {
            tools[i] = new JLabel(getScaledIcon("coins animation1.jpeg", iconSize, iconSize));
            tools[i].setBounds(padding,(i*padding+i*iconSize)+(toolLength*padding+toolLength*iconSize)/2+padding, iconSize, iconSize);
            panel.add(tools[i]);
        }
    }

    private ImageIcon getScaledIcon(String filename, int width, int height) {
        ImageIcon i1 = new ImageIcon(filename);
        Image newImage = i1.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT);
        return new ImageIcon(newImage);
    }

}
