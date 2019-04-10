package java_basic_06;

import java.util.Scanner;

/**
 * Lesson Java基礎⑥（メソッド）１
 * <p>
 * 【問題】
 * 以下の動作をする機能を作成してください。
 *     ・入力された数値が素数かを判別する。
 *     ・結果を標準出力する。
 * 以下の手順に従って作成してください
 *     1．メソッド作成
 *     2. メソッド呼び出し
 */
public class MethodLessonOne {

    /**
     * 処理を実行するためのメインメソッド。
     *
     * @param args -
     */
    public static void main(String[] args) {

        // 標準入力。入力された数字は、変数「number」に収納されます
        Scanner sc = new Scanner(System.in);
        System.out.print("数字を入力してください。\n：");
        int number = sc.nextInt();

        // 2．メソッドの呼び出し
        // ■ 作成したメソッドを呼び出してください
        isPrimeNumber(number);
    }

    // 1．メソッド作成
    // ■ 以下の動作をするメソッドを作成してください
    /**
     * 引数が素数かを判定し、判定結果を標準出力する。
     *
     * @param number 判定対象の数値
     */
    public static void isPrimeNumber(int number) {
        boolean isPrimeNumber = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrimeNumber = false;
            }
        }
        if (isPrimeNumber) {
            System.out.println(number + "は素数です。");
        } else {
            System.out.println(number + "は素数ではありません。");
        }
    }
}