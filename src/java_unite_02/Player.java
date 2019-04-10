package java_unite_02;

/**
 * ゲームに参加するプレイヤーを表すクラス。
 */
public class Player {
    /**
     * 勝利回数
     */
    private int winCount;

    /**
     * コンストラクタ。
     * <p>
     * 勝利回数を0で初期化する。
     */
    public Player() {
        this.winCount = 0;
    }

    /**
     * 勝利回数を1増やす。
     */
    public void win() {
        this.winCount++;
    }

    /**
     * 勝利回数を返却する。
     *
     * @return 勝利回数
     */
    public int getWinCount() {
        return winCount;
    }
}
