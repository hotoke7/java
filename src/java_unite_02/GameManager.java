package java_unite_02;

/**
 * ゲームマネージャクラス。
 *
 * Lesson Java一貫② じゃんけんゲーム②
 *
 * 【問題】
 * mainメソッドを完成させてください。
 */
public class GameManager {

    /**
     * じゃんけんゲームを実施するメインメソッド。
     *
     * ゲームが終了するまでじゃんけんゲームを繰り返す。
     *
     * @param args -
     */
    public static void main(String[] args) {
        // ■ ユーザーを示す、Playerクラスのインスタンスを宣言してください。
        Player you = new Player();

        // ■ コンピューターを示す、Playerクラスのインスタンスを宣言してください。
        Player computer = new Player();

        // ■ じゃんけんゲームを行う、RockPaperScissorsクラスのインスタンスを作成してください。
        RockPaperScissors rockPaperScissors = new RockPaperScissors();

        // ■ ゲーム回数を示す整数型の変数を宣言し、1で初期化してください。
        int gameCount = 1;

        // ■ ゲームの開始アナウンスを標準出力してください。
        // 出力内容：じゃんけんゲームを始めます。
        System.out.println("じゃんけんゲームを始めます。");

        // ■ 繰り返しの処理を以下の通り作成してください。
        //
        // ユーザーかコンピューター、どちらかが2勝するまでゲームを繰り返してください。
        // 繰り返しの中では、以下の作業を行います。
        //
        // ・対戦回数を標準出力
        //   出力内容：「ゲーム回数」回戦
        //
        // ・じゃんけん対決
        //   「RockPaperScissors」クラスの「play」メソッドを呼び出し、じゃんけん対決を行う。
        //
        // ・ゲーム終了可否判定
        //  「isGameOver」メソッドを呼び出し、その結果を取得する。
        //
        // ・ゲーム終了条件分岐作成
        //  「isGameOver」メソッドより取得した結果によって、以下の処理を行う。
        //   - trueの場合：繰り返しを終了する。
        //   - falseの場合：「ゲーム回数」を１増やす。
        //
        // ※ Tip
        // 適切なところに以下の区分線を標準出力することで、毎回のゲームの状況が確認しやすくなります。
        // 出力内容：======================================
        while (true) {
            System.out.println(gameCount + "回戦");
            rockPaperScissors.play(you, computer);

            System.out.println("======================================");

            boolean isGameOver = isGameOver(you, computer);
            if (isGameOver) {
                break;
            }
            gameCount++;
        }
    }

    // 【問題】以下の動作をする「isGameOver」メソッドを作成してください。

    /**
     * ゲームが終了したかを判定する。
     *
     * ユーザー、コンピューターの勝利回数に応じて、以下の通り処理を行う。
     *
     * ・ユーザーの勝利回数が2の場合
     * 　以下の文字列を標準出力し、trueを返却する。
     * 　出力内容：「ユーザーの勝利回数」：「コンピューターの勝利回数」で勝ちました！
     *
     * ・コンピューターの勝利回数が2の場合
     * 　以下の文字列を標準出力し、trueを返却する。
     * 　出力内容：「ユーザーの勝利回数」：「コンピューターの勝利回数」で負けました…
     *
     * ・上記以外
     * 　ゲーム継続のため、falseを返却する。
     *
     * @param you      ユーザー
     * @param computer コンピューター
     * @return ゲームの終了判定結果 true:ゲームを終了する false:ゲームを継続する
     */
    public static boolean isGameOver(Player you, Player computer) {
        int yourWinCount = you.getWinCount();
        int computersWinCount = computer.getWinCount();

        if (yourWinCount == 2) {
            System.out.println(yourWinCount + "：" + computersWinCount + "で勝ちました！");
            return true;
        } else if (computersWinCount == 2) {
            System.out.println(yourWinCount + "：" + computersWinCount + "で負けました…");
            return true;
        }
        return false;
    }
}
