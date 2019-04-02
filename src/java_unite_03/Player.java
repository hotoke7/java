package java_unite_03;

public class Player {
    private String name;
    private int winCount;

    public Player(String name) {
        this.name = name;
        this.winCount = 0;
    }

    public void win() {
        this.winCount++;
    }

    public String getName() {
        return name;
    }

    public int getWinCount() {
        return winCount;
    }
}