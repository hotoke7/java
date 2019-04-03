package java_unite_03;

public class Player {
    // Lesson Java一貫③ じゃんけんゲーム③
    // 【問題】Playerクラスを問題に従ってコードを作成してください。

    // ■ プレイヤーの名前を表す以下のフィールドを追加してください。
    // 文字列型　名前
    private String name;
    private int winCount;

    // ■ コンストラクタを以下のように修正してください。
    // 引数：文字列型　名前
    // 動作：名前を引数で初期化する。
    //       勝利回数を0に初期化する。
    public Player(String name) {
        this.name = name;
        this.winCount = 0;
    }

    public void win() {
        this.winCount++;
    }

    // ■ 名前のGetterを作成してください。
    public String getName() {
        return name;
    }

    public int getWinCount() {
        return winCount;
    }
}