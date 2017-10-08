package main;

public enum Tile {
    DIRT(0),
    STONE(1);

    int id;
    Tile(int id) {
        this.id = id;
    }

    public int getID() {
        return id;
    }
}
