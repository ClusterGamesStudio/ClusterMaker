package main;

public abstract class Block {

    private Tile tile;

    public Block(Tile tile) {
        this.tile = tile;
    }

    public Tile getTile() {
        return tile;
    }
}
