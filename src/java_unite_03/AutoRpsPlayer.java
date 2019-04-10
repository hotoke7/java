package java_unite_03;

import java.util.Map;
import java.util.Random;

// Lesson Java一貫③ じゃんけんゲーム③
// 【問題】AutoRpsPlayerクラスを問題に従ってコードを作成してください。

// ■ AutoRpsPlayerクラスを完成してください。

/**
 * コンピューターを表すクラス
 * 親クラス：Player
 * インターフェース：RpsChoosable
 */
public class AutoRpsPlayer extends Player implements RPSChoosable {
    private Random random = new Random();

    // ■ コンストラクタを作成してください。
    // 引数：文字列型　名前
    // 動作：親クラスのフィールド：名前を引数で初期化する。
    public AutoRpsPlayer(String name) {
        super(name);
    }

    // ■ 「chooseHand」メソッドをオーバライドして作成してください。
    // 引数：なし
    // 動作：コンピューターが出す手を決める。
    //   ・ランダム値(1～3)を取得する
    //   ・コンピュータの名前と、手を出力する。
    //   ・出力結果（サンプル）
    //       ・コンピュータの選択 : グー
    // 返却値：整数型　コンピューターが出す手
    //
    // ※ Hint
    // 手の出力は、RockPaperScissorsクラスのじゃんけんMapを使用する。


    @Override
    public int chooseHand() {
        Map<Integer, String> rps = RockPaperScissors.rps;

        int choice = random.nextInt(rps.keySet().size()) + 1;
        System.out.println(getName() + "の選択 : " + rps.get(choice));
        return choice;
    }
}
