package java_unite_03;

import java.util.Map;
import java.util.Scanner;

/**
 * ユーザーを表すクラス。
 * <p>
 * Lesson Java一貫③ じゃんけんゲーム③
 * <p>
 * 【問題】
 * ManualRpsPlayerクラス問題に従ってコードを作成してください。
 */
public class ManualRpsPlayer extends Player implements RPSChoosable {

    /** スキャナ */
    private Scanner scan = new Scanner(System.in);

    // ■ コンストラクタを作成してください。
    /**
     * コンストラクタ。
     * <p>
     * 名前を初期化する。
     *
     * @param name 名前
     */
    public ManualRpsPlayer(String name) {
        super(name);
    }

    // ■ 「chooseHand」メソッドをオーバライドして作成してください。
    // ※ Hint
    // 手の出力は、RockPaperScissorsクラスのじゃんけんMapを使用する。
    /**
     * じゃんけんの手を決定する。
     * <p>
     * 以下の通り処理を行う。
     * ・ユーザーが画面上で入力した数値を取得する。
     * ・ユーザの名前と、手を出力する。
     * ・出力結果（サンプル）
     * ・テストユーザの選択 : グー
     *
     * @return じゃんけんの手
     */
    @Override
    public int chooseHand() {
        Map<Integer, String> rps = RockPaperScissors.rps;

        int choice = scan.nextInt();
        System.out.println(getName() + "の選択 : " + rps.get(choice));
        return choice;
    }
}
