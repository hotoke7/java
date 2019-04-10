package java_unite_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ゲームマネージャクラス。
 * <p>
 * Lesson Java一貫③ じゃんけんゲーム③
 * <p>
 * 【問題】
 * mainメソッドを完成させてください。
 */
public class GameManager {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("あなたの名前を入力してください。");

        // ■ ユーザーを示す、ManualPlayerクラスのインスタンスを生成してください。
        // 引数はscan.next()としてください。
        ManualRpsPlayer you = new ManualRpsPlayer(scan.next());

        // ■ コンピューターを示す、AutoPlayerクラスのインスタンスを生成してください。
        // 引数は自由です。
        AutoRpsPlayer computer = new AutoRpsPlayer("コンピューター");

        // ■ ゲーム記録を格納する、「GameRecord」クラスのリストを宣言してください。
        List<GameRecord> gameRecords = new ArrayList<>();

        // じゃんけんゲームを行う、RockPaperScissorsクラスのインスタンス
        RockPaperScissors rockPaperScissors = new RockPaperScissors();

        System.out.println("じゃんけんゲームを始めます。");
        while (true) {
            // ■ 「RockPaperScissors」クラスの「play」メソッドを呼び出し、じゃんけん対決を行ってください。
            // ■ 「play」メソッドの返却値を、「GameRecord」クラスのリストに格納してください。
            GameRecord gameRecord = rockPaperScissors.play(you, computer);
            gameRecords.add(gameRecord);

            System.out.println("======================================");

            // ■ 「isGameOver」メソッドを呼び出し、結果に応じて以下の通り処理を行ってください。
            //   - trueの場合：繰り返しを終了し、reportMatchResult」メソッドを呼び出す。
            //   - falseの場合：繰り返しを継続する。
            boolean isGameOver = isGameOver(you, computer);
            if (isGameOver) {
                reportMatchResult(gameRecords, you, computer);
                break;
            }
        }
    }


    // 【問題】以下の動作をする「isGameOver」メソッドを作成してください。

    /**
     * ゲームが終了したかを判定する。
     * <p>
     * ユーザー、コンピューターの勝利回数に応じて、以下の通り処理を行う。
     * <p>
     * ・ユーザー、またはコンピューターのいずれかの勝利回数が2の場合
     * 　ゲーム終了のため、trueを返却する。
     * <p>
     * ・上記以外
     * 　ゲーム継続のため、falseを返却する。
     *
     * @param you      ユーザー
     * @param computer コンピューター
     * @return ゲームの終了判定結果 true:ゲームを終了する false:ゲームを継続する
     */
    public static boolean isGameOver(ManualRpsPlayer you, AutoRpsPlayer computer) {
        int yourWinCount = you.getWinCount();
        int computersWinCount = computer.getWinCount();

        if (yourWinCount == 2 || computersWinCount == 2) {
            return true;
        }
        return false;
    }

    // 【問題】ゲームの結果を出力する「reportMatchResult」メソッドを完成してください。
    // ■ 「reportMatchResult」メソッドを以下の通り修正してください。
    // 引数1：「GameRecord」クラスのリスト ゲーム記録一覧
    // 引数2：ManualRpsPlayer ユーザー
    // 引数3：AutoRpsPlayer コンピューター
    // 動作：すべてのゲームの記録を出力し、勝者を表示。
    // 返却値：なし
    public static void reportMatchResult(List<GameRecord> gameRecords, ManualRpsPlayer you, AutoRpsPlayer computer) {

        // ■ ゲーム回数を示す整数型の変数を宣言し、1で初期化してください。
        int gameCount = 1;

        // ■ ゲーム記録出力の開始アナウンスを標準出力してください。内容は自由です。
        System.out.println("Game Result");
        // 区切り線の出力
        System.out.println("======================================");

        // ■ 引数を使用して以下を出力する処理を作成してください。
        // 出力内容：
        //   ・何回戦目か
        //   ・ユーザの名前と手
        //   ・コンピュータの名前と手
        //   ・対戦結果
        //
        // 出力結果（サンプル）：
        //   1回戦
        //   テストユーザ：パー
        //   コンピューター：パー
        //   対戦結果：△
        //   ======================================
        //   2回戦
        //   テストユーザ：パー
        //   コンピューター：グー
        //   対戦結果：○
        for (GameRecord gameRecord : gameRecords) {
            System.out.println(gameCount + "回戦");
            System.out.println(you.getName() + "：" + gameRecord.getYourHand());
            System.out.println(computer.getName() + "：" + gameRecord.getComputersHand());
            System.out.println("対戦結果：" + gameRecord.getGameResult());
            gameCount += 1;
            System.out.println("======================================");
        }

        // ■ 勝利したユーザーを出力する処理を作成してください。
        // 出力結果（サンプル）：
        // 勝者：テストユーザ
        if (computer.getWinCount() == 2) {
            System.out.println("勝者：" + computer.getName());
        } else {
            System.out.println("勝者：" + you.getName());
        }
    }
}