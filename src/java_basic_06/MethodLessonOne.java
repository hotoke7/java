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
        sub1(number);

    }

    // 1．メソッド作成
    // ■ 以下の動作をするメソッドを作成してください
    public static void sub1(int x) {
        int a = 0;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                a++;
            }
        }

        switch (a) {
            case 0:
                System.out.println("は素数です。");
                break;
            default:
                System.out.println("は素数ではありません。");
        }
    }
}
