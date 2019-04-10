package java_unite_03;

import java.util.Map;
import java.util.Random;

/**
 * コンピューターを表すクラス。
 *
 * Lesson Java一貫③ じゃんけんゲーム③
 *
 * 【問題】
 * AutoRpsPlayerクラスを問題に従ってコードを作成してください。
 *
 */
public class AutoRpsPlayer extends Player implements RPSChoosable {
    private Random random = new Random();

    // ■ コンストラクタを作成してください。
    /**
     * コンストラクタ。
     *
     * 名前を初期化する。
     *
     * @param name 名前
     */
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


    /**
     * じゃんけんの手を決定する。
     *
     * 以下の通り処理を行う。
     *     ・ランダム値(1～3)を取得する
     *     ・コンピュータの名前と、手を出力する。
     *     ・出力結果（サンプル）
     *         ・コンピュータの選択 : グー
     *
     * @return じゃんけんの手
     */
    @Override
    public int chooseHand() {
        Map<Integer, String> rps = RockPaperScissors.rps;

        int choice = random.nextInt(rps.keySet().size()) + 1;
        System.out.println(getName() + "の選択 : " + rps.get(choice));
        return choice;
    }
}
