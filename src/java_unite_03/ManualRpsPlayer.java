package java_unite_03;

import java.util.Scanner;

// Lesson Java一貫③ じゃんけんゲーム③
// 【問題】ManualRpsPlayerクラスを問題に従ってコードを作成してください。

// ■ 以下のソースコードをもとに、ManualRpsPlayerクラスを完成してください。
// 親クラス：Player
// インターフェース：RpsChoosable
public class ManualRpsPlayer extends Player implements RPSChoosable {
    private Scanner scan = new Scanner(System.in);

    // ■ コンストラクタを作成してください。
    // 引数：文字列型　名前
    // 動作：名前を引数で初期化する。
    public ManualRpsPlayer(String name) {
        super(name);
    }

    // ■ ユーザーが出す手を返却する「chooseHand」メソッドを作成してください。
    // 抽象メソッド「chooseHand」をオーバライドして作成してください。
    // 引数：文字列[]　「グー」「パー」「チョキ」の文字列の配列
    // 動作：ユーザーが出す手を決める。
    //   ・ユーザーが画面上で入力した数値を取得する。
    //   ・以下の出力形式に合わせて、文字列を標準出力する。
    //     ・出力形式
    //       ・「名前」の選択：じゃんけんの配列より取得したユーザーの選択値
    //     ・出力結果（例）
    //       ・「名前」の選択 : グー
    // 返却値：整数型　ユーザーが出す手
    // ※ Hint
    // じゃんけん配列は以下のクラスから取得できます。
    // RpsStringArrays
    // 「RpsStringArrays」クラスのインスタンスを宣言し、「rps」フィールドを取得してください。
    public int chooseHand() {
        RpsStringArrays rpsStringArrays = new RpsStringArrays();
        String[] rps = rpsStringArrays.getRps();

        int choice = scan.nextInt();
        System.out.println(getName() + "の選択 : " + rps[choice]);
        return choice;
    }
}
