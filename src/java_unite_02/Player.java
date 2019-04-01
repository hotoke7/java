package java_unite_02;

public class Player {
    private int winCount;

    public Player() {
        this.winCount = 0;
    }

    public void win() {
        this.winCount++;
    }

    public int getWinCount() {
        return winCount;
    }
}
