package java_basic_06;

import java.util.Scanner;

public class MethodLessonOne {
    // Lesson Java基礎⑥（メソッド）
    // 【問題１】数字を入力すると、その数字が素数かどうかを判別する機能を作成してください

    // 以下の手順に従って作成
    // 1．メソッド作成
    // 2. メソッド呼び出し

    public static void main(String[] args) {

        // 標準入力
        // 入力された数字は、変数「number」に収納されます
        Scanner sc = new Scanner(System.in);
        System.out.print("数字を入力してください。\n："); //「\n」は改行文字です。
        int number = sc.nextInt();

        // 2．メソッドの呼び出し
        // ■ 作成したメソッドを呼び出してください
        isPrimeNumber(number);
    }

    // 1．メソッド作成
    // ■ 以下の動作をするメソッドを作成してください
    // 引数：数字
    // 動作：数字が素数かどうかを判別して標準出力する
    // 返却値：なし
    // 出力結果：
    //　 "「number」は素数です。"
    //　 "「number」は素数ではありません。"
    public static void isPrimeNumber(int number) {
        // 素数判定を収納する変数を宣言します
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