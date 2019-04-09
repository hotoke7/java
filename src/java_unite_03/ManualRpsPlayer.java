package java_unite_03;

import java.util.Map;
import java.util.Scanner;

// Lesson Java一貫③ じゃんけんゲーム③
// 【問題】ManualRpsPlayerクラスを問題に従ってコードを作成してください。

// ■ ManualRpsPlayerクラスを完成してください。
// 親クラス：Player
// インターフェース：RpsChoosable
public class ManualRpsPlayer extends Player implements RPSChoosable {
    private Scanner scan = new Scanner(System.in);

    // ■ コンストラクタを作成してください。
    // 引数：文字列型　名前
    // 動作：親クラスのフィールド：名前を引数で初期化する。
    public ManualRpsPlayer(String name) {
        super(name);
    }

    // ■ 「chooseHand」メソッドをオーバライドして作成してください。
    // 引数：なし
    // 動作：ユーザーが出す手を決める。
    //   ・ユーザーが画面上で入力した数値を取得する。
    //   ・ユーザの名前と、手を出力する。
    //   ・出力結果（サンプル）
    //       ・テストユーザの選択 : グー
    // 返却値：整数型　ユーザーが出す手
    //
    // ※ Hint
    // 手の出力は、RockPaperScissorsクラスのじゃんけんMapを使用する。
    @Override
    public int chooseHand() {
        Map<Integer, String> rps = RockPaperScissors.rps;

        int choice = scan.nextInt();
        System.out.println(getName() + "の選択 : " + rps.get(choice));
        return choice;
    }
}
