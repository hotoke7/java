package java_basic_06;

import java.util.Scanner;

public class MethodLessonOne {
    public static void main(String[] args) {
        // Lesson Java基礎⑥（メソッド）
        // 【問題１】数字を入力して引数として渡すと、その数字が素数かどうかを判別するメソッドを作成してください
        // ※素数とは？：１とその数自身との外には約数がない正の整数

        // 以下の作業で、標準入力ができます。
        // 入力された数字は、変数「number」に収納されます。
        Scanner sc = new Scanner(System.in);
        // 「\n」は改行文字です。
        System.out.print("数字を入力してください。\n：");
        int number = sc.nextInt();

        // ■ メソッドを呼び出してください。
        // numberを引数としてメソッドに渡してください。
        isPrimeNumber(number);
    }

    // ■ 引数をもらい、処理結果を標準出力するメソッド（返却値なし）
    // 引数が素数かどうかを判断するメソッドを作成してください。
    // このメソッドを実行することで、以下の結果が出力されます。
    // 出力結果：
    // "「number」は素数です。"
    // "「number」は素数ではありません。"
    // Hint1：
    // 素数は１とその数自身でしか割ることができません。
    // ⇒数字Xを2～X-1で割った余りが一回でも「0」だったら、Xは素数ではありません。
    // Hint2：
    // 「%」を使って剰余算をしましょう。
    // ex) x = 5 % 2　→　x=1;
    public static void isPrimeNumber(int number) {
        // 総数可否を判断する為、booleanで変数を宣言します。
        boolean isPrime = true;

        // 2から「number-1」まで繰り返します。
        for (int i = 2; i < number; i++) {
            // numberをiで割ったあまりが0だったら、numberは素数ではありません。
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println(number + "は素数です。");
        } else {
            System.out.println(number + "は素数ではありません。");
        }
    }
}