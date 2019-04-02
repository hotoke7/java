package java_unite_03;

public class Score {
    private int match;
    private String winner;
    private boolean isDraw;

    public Score(int match, String winner, boolean isDraw) {
        this.match = match;
        this.winner = winner;
        this.isDraw = isDraw;
    }

    public int getMatch() {
        return match;
    }

    public String getWinner() {
        return winner;
    }

    public boolean isDraw() {
        return isDraw;
    }
}
