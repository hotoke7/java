package java_unite_03;

public class GameRecord {
    private String yourHand;
    private String computersHand;
    private String outcome;

    public GameRecord(String yourHand, String computersHand, String outcome) {
        this.yourHand = yourHand;
        this.computersHand = computersHand;
        this.outcome = outcome;
    }

    public String getYourHand() {
        return yourHand;
    }

    public String getComputersHand() {
        return computersHand;
    }

    public String getOutcome() {
        return outcome;
    }
}
