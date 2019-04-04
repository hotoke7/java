package java_unite_03;

import java.util.Random;

// Lesson Java一貫③ じゃんけんゲーム③
// 【問題】AutoRpsPlayerクラスを問題に従ってコードを作成してください。

// ■ 以下のソースコードをもとに、AutoRpsPlayerクラスを完成してください。
// 親クラス：Player
// インターフェース：RpsChoosable
public class AutoRpsPlayer extends Player implements RPSChoosable {
    private Random random = new Random();

    // ■ コンストラクタを作成してください。
    // 引数：文字列型　名前
    // 動作：名前を引数で初期化する。
    AutoRpsPlayer(String name) {
        super(name);
    }

    // ■ コンピューターが出す手を返却する「chooseHand」メソッドを作成してください。
    // 抽象メソッド「chooseHand」をオーバライドして作成してください。
    // 引数：文字列[]　「グー」「パー」「チョキ」の文字列の配列
    // 動作：コンピューターが出す手を決める。
    //   ・配列の長さ分の整数をランダムで取得する
    //   ・以下の出力形式に合わせて、文字列を標準出力する。
    //     ・出力形式
    //       ・「名前」の選択：じゃんけんの配列より取得したコンピューターの選択値
    //     ・出力結果（例）
    //       ・「名前」の選択 : グー
    // 返却値：整数型　コンピューターが出す手
    // ※ Hint
    // じゃんけん配列は以下のクラスから取得できます。
    // RockPaperScissors
    // 「RockPaperScissors」クラスのインスタンスを宣言し、「rps」フィールドを取得してください。
    public int chooseHand() {
        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        String[] rps = rockPaperScissors.rps;

        int choice = random.nextInt(rps.length);
        System.out.println(getName() + "の選択 : " + rps[choice]);
        return choice;
    }
}
