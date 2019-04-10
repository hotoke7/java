package java_unite_03;

/**
 * ゲームに参加するプレイヤーを表すクラス
 * <p>
 * Lesson Java一貫③ じゃんけんゲーム③
 * <p>
 * 【問題】
 * Playerクラスを問題に従ってコードを作成してください。
 */
public class Player {

    // ■ プレイヤーの名前を表す以下のフィールドを追加してください。
    /** 名前 */
    private String name;
    /** 勝利回数 */
    private int winCount;

    // ■ コンストラクタを以下のように修正してください。
    /**
     * 各フィールドに対して初期化処理を行う。
     * 名前：引数で初期化
     * 勝利回数：0に初期化
     *
     * @param name 名前
     */
    public Player(String name) {
        this.name = name;
        this.winCount = 0;
    }

    /**
     * 勝利回数を1増やす。
     */
    public void win() {
        this.winCount++;
    }

    // ■ 名前のGetterを作成してください。
    /**
     * 名前を返却する。
     *
     * @return 名前
     */
    public String getName() {
        return name;
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