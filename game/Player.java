package game;

public abstract class Player implements Move {
    String name;
    private Player(String name) {
        this.name = name;
    }
    public Player() {
        this("");
    }
    public void setName(String name) {
        this.name = name;
    }
    public void getName() {
        System.out.println(this.name);
    }
}
