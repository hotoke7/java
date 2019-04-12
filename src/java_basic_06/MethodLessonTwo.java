package java_basic_06;

import java.util.Scanner;

/**
 * Lesson Java基礎⑥（メソッド）２
 * <p>
 * 【問題】
 * 以下の動作をする機能を作成してください
 *     ・1から入力した数値までの全ての数値を標準出力する。
 *     ・入力された数値が3、または5の倍数の場合、数値の代わりに"-"を標準出力する。
 * 以下の手順に従って作成してください
 *     1．メソッド作成
 *     2. メソッドの呼び出し
 */
public class MethodLessonTwo {

    /**
     * 処理を実行するためのメインメソッド
     *
     * @param args -
     */
    public static void main(String[] args) {
        // 標準入力。入力された数字は、変数「number」に収納されます
        Scanner sc = new Scanner(System.in);
        System.out.print("数字を入力してください。\n：");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            // 2．メソッドの呼び出し
            // ■ 作成したメソッドを呼び出し、結果に応じて標準出力してください。

        }
    }

    // 1．メソッド作成
    // ■ 以下の動作をするメソッドを作成してください
    /**
     * 判定対象の数値が3の倍数、もしくは5の倍数かを判定する。
     *
     * @param number 判定対象の数値
     * @return 3もしくは5の倍数の場合true, 以外はfalse
     */


}