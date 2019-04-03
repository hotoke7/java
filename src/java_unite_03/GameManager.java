package java_unite_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameManager {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("あなたの名前を入力してください。");

        // ■ ユーザーを示す、ManualPlayerクラスのインスタンスを宣言してください。
        // ManualPlayerクラスのコンストラクタは文字列の引数「名前」を必要とします。
        // 以下のソースコードは、プログラム実行時にユーザーが画面上で入力した文字列を取得できます。
        // ソースコードの返却値を、インスタンス宣言時に引数として使ってください。
        ManualRpsPlayer you = new ManualRpsPlayer(scan.next());

        // ■ コンピューターを示す、AutoPlayerクラスのインスタンスを宣言してください。
        // インスタンス宣言時に引数は、文字列「コンピューター」で設定してください。
        AutoRpsPlayer computer = new AutoRpsPlayer("コンピューター");

        // ■ ゲーム記録を格納する、「GameRecord」クラスのリストを宣言してください。
        // 「GameRecord」クラスに毎回のゲームの内容を記録し、こちらのリストに格納します。
        List<GameRecord> gameRecords = new ArrayList<>();

        // じゃんけんゲームを行う、RockPaperScissorsクラスのインスタンス
        RockPaperScissors rockPaperScissors = new RockPaperScissors();

        System.out.println("じゃんけんゲームを始めます。");
        while (true) {
            // ■ 「RockPaperScissors」クラスの「play」メソッドを呼び出し、じゃんけん対決を行ってください。
            // また、「play」メソッドの返却値を、「GameRecord」クラスのリストに格納してください。
            GameRecord gameRecord = rockPaperScissors.play(you, computer);
            gameRecords.add(gameRecord);

            System.out.println("======================================");

            // ■ 「isGameOver」メソッドより取得した結果によって、以下の処理を行う。
            //   - trueの場合：繰り返しを終了し、reportMatchResult」メソッドを呼び出す。
            //   - falseの場合：繰り返しを継続する。
            boolean isGameOver = isGameOver(you, computer);
            if (isGameOver) {
                reportMatchResult(gameRecords, you, computer);
                break;
            }
        }
    }

    // 【問題】「isGameOver」メソッドを以下のように作成してください。
    // 引数1：ManualRpsPlayer ユーザー
    // 引数2：AutoRpsPlayer コンピューター
    // 返却値：真偽値 ゲームを終了するかどうか（詳細は動作の方で記載）
    //   ・true ゲームを終了する
    //   ・false ゲームを継続する
    // 動作：ユーザー、コンピューターの勝利回数を取得し、その値によって以下の動作を行う。
    // ・ユーザーまたはコンピューターの勝利回数が2の場合
    //   trueを返却する。
    // ・その他
    //   ゲーム継続のため、falseを返却する。
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

        // ■ ゲーム記録出力の開始アナウンスを標準出力してください。
        // 出力内容：Game Result
        // ※ Tip
        // 適切なところに以下の区分線を標準出力することで、毎回のゲームの状況が確認しやすくなります。
        // 出力内容：======================================
        System.out.println("Game Result");
        System.out.println("======================================");

        // ■ 「GameRecord」クラスのリストの長さ分、以下の処理を繰り返してください。
        // ForEach分を使って作成してください。
        // 処理詳細
        // 1. 引数と変数の内容を以下の内容を出力形式で標準出力してください。
        // ユーザーから取得：「ユーザーの名前」
        // コンピューターから取得：「コンピューターの名前」
        // ゲーム記録から取得：「ユーザーの手」「コンピューターの手」「ゲーム結果」
        // 出力形式：
        //   「ゲーム回数」回戦
        //   「ユーザーの名前」：「ユーザーの手」
        //   「コンピューターの名前」：「コンピューターの手」
        //    対戦結果：「ゲーム結果」
        // 出力結果（例）：
        //   1回戦
        //   テスト：パー
        //   コンピューター：パー
        //   対戦結果：△
        // 2. 「ゲーム回数」を１増やしてください。
        for (GameRecord gameRecord : gameRecords) {
            System.out.println(gameCount + "回戦");
            System.out.println(you.getName() + "：" + gameRecord.getYourHand());
            System.out.println(computer.getName() + "：" + gameRecord.getComputersHand());
            System.out.println("対戦結果：" + gameRecord.getOutcome());
            gameCount += 1;
            System.out.println("======================================");
        }

        // ■ 先に2回勝利した、このゲームの勝者を以下の内容を出力形式で標準出力してください。
        // 出力内容は、先に2回勝利した対象によって異なります。
        // ・ユーザーの勝利回数が2の場合
        //   以下の文字列を標準出力する。
        //   出力内容： 勝者：「ユーザーの名前」
        // ・コンピューターの勝利回数が2の場合
        //   以下の文字列を標準出力する。
        //   出力内容： 勝者：「コンピューターの名前」
        if (computer.getWinCount() == 2) {
            System.out.println("勝者：" + computer.getName());
        } else {
            System.out.println("勝者：" + you.getName());
        }
    }
}