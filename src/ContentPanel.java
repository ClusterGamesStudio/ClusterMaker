public enum ContentPanel {
    MAINMENUE(0),
    EDITOR(0);

    int id;
    ContentPanel(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
