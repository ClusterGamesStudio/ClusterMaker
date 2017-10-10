package util;

import main.Block;

import java.awt.*;

public class MapRenderer {

    private Map map;
    private Vector2 mapLocation;

    public MapRenderer(Map map, Vector2 mapLocation) {
        this.map = map;
        this.mapLocation = mapLocation;
    }

    public void render(Graphics2D graphics2D) {
    }

    private Image getScaledBlock(Block block, int width, int height) {
        //TODO ADD SCALE FUNCTION
        return null;
    }
}
