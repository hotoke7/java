package java_unite_03;

// RPSゲームの中で使われる、Immutable/Read-only属性の値を管理するクラス
public final class RpsStringArrays {

    // 以下のコードで「グー」「パー」「チョキ」の文字列を配列を宣言します。
    // 同じパッケージに属すクラスで使えるように、アクセス修飾子をdefaultで設定しました。
    private static final String[] rps = {"グー", "パー", "チョキ"};

    // 以下の配列は、ゲームの結果を表す文字列を格納します。
    // GameRecordクラスのインスタンスを宣言するときに、配列の中の文字列を引数として渡します。
    // 各文字列の意味は以下の通りです。
    // 〇：ユーザーの勝ち
    // △：無勝負
    // ×：コンピューターの勝ち
    private static final String[] outcomes = {"〇", "△", "×"};

    public static String[] getRps() {
        return rps;
    }

    public static String[] getOutcomes() {
        return outcomes;
    }
}
