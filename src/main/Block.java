package main;

import util.Vector2;

public abstract class Block {

    private Tile tile;
    private Vector2 location;

    public Block(Tile tile, Vector2 location) {
        this.tile = tile;
        this.location = location;
    }

    public Tile getTile() {
        return tile;
    }

    public Vector2 getLocation() {
        return location;
    }

    public void setLocation(Vector2 location) {
        this.location = location;
    }

    public void setLocation(int x, int y) {
        setLocation(new Vector2(x, y));
    }
}
