package java_unite_03;

/**
 * ゲーム結果格納クラス。
 */
public class GameRecord {
    private String yourHand;
    private String computersHand;
    private String gameResult;

    /**
     * 初期化処理。
     *
     * @param yourHand      ユーザの手（グー、パー、チョキ）
     * @param computersHand コンピュータの手（グー、パー、チョキ）
     * @param gameResult    ゲーム結果（○、△、×）
     */
    public GameRecord(String yourHand, String computersHand, String gameResult) {
        this.yourHand = yourHand;
        this.computersHand = computersHand;
        this.gameResult = gameResult;
    }

    /**
     * ユーザの手を取得する。
     *
     * @return ユーザの手（グー、パー、チョキ）
     */
    public String getYourHand() {
        return yourHand;
    }

    /**
     * コンピュータの手を取得する。
     *
     * @return コンピュータの手（グー、パー、チョキ）
     */
    public String getComputersHand() {
        return computersHand;
    }

    /**
     * ゲーム結果を取得する。
     *
     * @return ゲーム結果（○、△、×）
     */
    public String getGameResult() {
        return gameResult;
    }
}
