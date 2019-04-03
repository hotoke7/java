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
        AutoRpsPlayer computer = new AutoRpsPlayer("コンピューター");

        // ■ Scoreクラスのリストを宣言してください。
        // Scoreクラスに毎回のゲームの内容を記録し、こちらのリストに格納します。
        List<GameRecord> gameRecords = new ArrayList<>();

        // じゃんけんゲームを行う、RockPaperScissorsクラスのインスタンス
        RockPaperScissors rockPaperScissors = new RockPaperScissors();

        System.out.println("じゃんけんゲームを始めます。");
        while (true) {
            GameRecord gameRecord = rockPaperScissors.play(you, computer);
            gameRecords.add(gameRecord);

            System.out.println("======================================");

            if (isGameOver(you, computer)) {
                reportMatchResult(gameRecords, you, computer);
                break;
            }
        }
    }

    // 【問題】「isGameOver」メソッドを以下のように変更してください。
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

    // 【問題】試合の結果を出力する「reportMatchResult」メソッドを作成してください。
    // 引数1：Scoreクラスのリスト 試合結果記録
    // 返却値：GameRecord ゲーム結果の記録
    public static void reportMatchResult(List<GameRecord> gameRecords, ManualRpsPlayer you, AutoRpsPlayer computer) {
        int gameCount = 1;
        System.out.println("Summary");
        System.out.println("======================================");
        for (GameRecord gameRecord : gameRecords) {
            System.out.println(gameCount + "回戦");
            System.out.println(you.getName() + "：" + gameRecord.getYourHand());
            System.out.println(computer.getName() + "：" + gameRecord.getComputersHand());
            System.out.println("対戦結果：" + gameRecord.getOutcome());
            gameCount += 1;
            System.out.println("======================================");
        }
        if (computer.getWinCount() == 2) {
            System.out.println("勝者：" + computer.getName());
        } else if (you.getWinCount() == 2) {
            System.out.println("勝者：" + you.getName());
        } else {
            System.out.println("ゲームが終わってありません！");
        }
    }
}