package java_unite_01;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Lesson Java一貫① じゃんけんゲーム①
 * <p>
 * じゃんけんクラス。
 * <p>
 * 【問題】
 * 一発勝負のじゃんけんゲームを作成してください。
 */
public class RockPaperScissors {

    /** ランダム */
    private static Random random = new Random();
    /** スキャナ */
    private static Scanner scan = new Scanner(System.in);

    /**
     * じゃんけんゲームを実行するメインメソッド。
     *
     * @param args -
     */
    public static void main(String[] args) {
        // ■ ユーザーの選択値を格納する、整数型の変数を宣言してください。
            int userChoice;


        // ■ コンピューターの選択値を格納する、整数型の変数を宣言してください。
            int comChoice;

        // ■ サイズが３の文字列の配列を宣言し、「グー」「パー」「チョキ」の文字列を配列に格納してください。
            String[] rps = new String[]{"グー", "チョキ", "パー"};

        // ■ 以下の文字列を標準出力してください。
        System.out.println( "じゃんけんゲームを始めます。");
        System.out.println("以下の選択肢の中で一つを選んでください。");



        // ■ 配列を繰り返し、配列の値を以下の出力形式で標準出力してください。
        // 出力形式
        //   配列のインデックス：配列の値
        // 出力結果
        //   0  : グー
        //   1  : パー
        //   2  : チョキ
        for (int i = 0; i < rps.length; i++){
            System.out.println(i + " : " + rps[i] );
        }

        //=======================================================================================
        // ユーザーとコンピューターの選択値を変数に格納する
        //=======================================================================================
        // コンピューターが出す手を決めます。
        // ■ 以下のソースコードは指定した数値分の整数をランダムで返却します。
        //    現在の設定値「0」を、配列の長さに変更してください。
        //    また、ソースコードの返却値をコンピューターの選択を示す変数に格納してください。
//        random.nextInt(2);
        int comNum = random.nextInt(rps.length);
        // 標準入力の為のガイドメッセージを出力します。
        // ■ 以下の文字列を標準出力してください。
        // 番号を入力してください：

        System.out.println("番号を入力してください:");
        int oppNum = scan.nextInt();



//        try{
//            System.out.println("あなたの選択：" + rps[oppNum] );
//        }catch(InputMismatchException e){
//            System.out.println("0～2の中から選択してください。");
//        }


        while (true){
            if (oppNum > 2){
                System.out.println("0～2の中から選択してください。");
                System.out.println("番号を入力してください:");
                oppNum = scan.nextInt();
            } else if (oppNum <= 2){
                System.out.println("あなたの選択：" + rps[oppNum] );
            } else {
                System.out.println("0～2の中から選択してください。");
                System.out.println("番号を入力してください:");
                oppNum = scan.nextInt();
            }
            break;
        }
//        scan.close();
//        if (oppNum > 2){
//
//        }
        // ユーザーが出す手を決めます。
        // ■ 以下のソースコードは、プログラム実行時にユーザーが画面上で入力した数値を取得できます。
        //    ソースコードの返却値を、ユーザーの選択を示す変数に格納してください。

//        System.out.println("あなたの選択：" + rps[oppNum] );
        System.out.println("コンピューターの選択：" + rps[comNum]);


        //=======================================================================================

        // ■ ユーザーとコンピューターのじゃんけんの手を、以下の形式で標準出力してください。
        // 出力形式
        //   あなたの選択：じゃんけんの配列より取得したユーザーの選択値
        //   コンピューターの選択：じゃんけんの配列より取得したコンピューターの選択値
        // 出力結果（例）：
        //   あなたの選択 : グー
        //   コンピューターの選択 : パー


        // ■ 条件分岐を利用し、じゃんけんの結果を標準出力してください。
        // ユーザーとコンピューターの選択値から、勝ち/負け/あいこを決めて標準出力してください。
        // 出力結果
        //   ユーザーが勝った場合：
        //     勝ちました！
        //   コンピューターが勝った場合：
        //     負けました…
        //   無勝負の場合：
        //     あいこです。
        if (oppNum == comNum){
            System.out.println("あいこです。");
        } else if ((oppNum == 0 && comNum == 1) || (oppNum == 1 && comNum ==2) || (oppNum == 2 && comNum == 0)) {
            System.out.println("勝ちました！");
        } else {
            System.out.println("負けました…");
        }

    }

    //   0  : グー
    //   1  : パー
    //   2  : チョキ
}
