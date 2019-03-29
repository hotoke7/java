package java_unite_01;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    static Random random = new Random();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // Lesson Java一貫① じゃんけんゲーム①
        // 【問題】一発勝負のじゃんけんゲームを作成してください。

        // ■ ユーザーの選択値を収納する、整数型の変数を作成してください。
        int yourChoice;

        // ■ コンピューターの選択値を収納する、整数型の変数を作成してください。
        int computersChoice;

        // ■ サイズが３の文字列の配列を宣言し、「グー」「パー」「チョキ」の文字列を配列に格納してください。
        String[] rps = new String[3];
        rps[0] = "グー";
        rps[1] = "パー";
        rps[2] = "チョキ";

        // ■ 以下の文字列を標準出力してください。
        // じゃんけんゲームを始めます。
        // 以下の選択肢の中で一つを選んでください。
        System.out.println("じゃんけんゲームを始めます。");
        System.out.println("以下の選択肢の中で一つを選んでください。");

        // 配列を繰り返し、ユーザーが選択可能な値を出力してください。
        // 出力形式
        //   配列のインデックス：配列の値
        // 出力結果
        //   0  : グー
        //   1  : パー
        //   2  : チョキ
        for (int i = 0; i < rps.length; i++) {
            System.out.println(i + "：" + rps[i]);
        }

        //=======================================================================================
        // ユーザーとコンピューターの選択値を変数に格納する
        //=======================================================================================
        // コンピュータが出す手を決めます。
        // ■ 以下のソースコードは配列の長さ分の整数をランダムで返却します。
        //    ソースコードの返却値を、コンピューターの選択を示す変数に格納してください。
        computersChoice = random.nextInt(rps.length);

        // 標準入力の為のガイドメッセージを出力します。
        // ■ 以下の文字列を標準出力してください。
        // 番号を入力してください：
        System.out.println("番号を入力してください：");

        // ユーザーが出す手を決めます。
        // ■ 以下のソースコードは、プログラム実行時にユーザーが画面上で入力した数値を取得できます。
        //    ソースコードの返却値を、ユーザーの選択を示す変数に格納してください。
        yourChoice = scan.nextInt();

        //=======================================================================================

        // ■ ユーザーとコンピュータのじゃんけんの手を、以下の形式で出力してください。
        // 出力形式
        //   あなたの選択：じゃんけんの配列にユーザーの選択値を代入
        //   コンピューターの選択：じゃんけんの配列にコンピューターの選択値を代入
        // 出力結果（例）：
        //   あなたの選択 : グー
        //   コンピューターの選択 : パー
        System.out.println("あなたの選択 : " + rps[yourChoice]);
        System.out.println("コンピュータの選択 : " + rps[computersChoice]);

        // ■ 条件分岐を利用し、じゃんけんの結果を出力してください。
        // ユーザーとコンピュータの選択値から、勝ち/負け/あいこを決めて標準出力してください。
        // 出力する文字列：
        //   勝ちました！
        //   あいこです。
        //   負けました…
        if (yourChoice == computersChoice) {
            System.out.println("あいこです。");
        } else {
            if (yourChoice == 0) {
                if (computersChoice == 1) {
                    System.out.println("負けました…");
                } else {
                    System.out.println("勝ちました！");
                }
            } else if (yourChoice == 1) {
                if (computersChoice == 2) {
                    System.out.println("負けました…");
                } else {
                    System.out.println("勝ちました！");
                }
            } else {
                if (computersChoice == 0) {
                    System.out.println("負けました…");
                } else {
                    System.out.println("勝ちました！");
                }
            }
        }
    }
}
