package java_basic_06;

import java.util.Scanner;

public class MethodLessonOne {
    public static void main(String[] args) {
        // Lesson Java基礎⑥（メソッド）
        // 【問題１】数字を入力すると、その数字が素数かどうかを判別する機能を作成してください

        // 標準入力
        Scanner sc = new Scanner(System.in);
        System.out.print("数字を入力してください。\n："); //「\n」は改行文字です。
        int number = sc.nextInt(); // 入力された数字は、変数「number」に収納されます

        // ■ 作成したメソッドを呼び出してください
        isPrimeNumber(number);
    }

    // ■ 以下の動作をするメソッドを作成してください
    // 引数として数字をもらい、数字が素数かどうかを判別して標準出力する
    // 出力結果：
    //　 "「number」は素数です。"
    //　 "「number」は素数ではありません。"
    public static void isPrimeNumber(int number) {
        boolean isPrime = true; // 総数可否を判断する為、booleanで変数を宣言します

        for (int i = 2; i < number; i++) { // 2から「number-1」まで繰り返します。
            if (number % i == 0) {
                isPrime = false; // numberをiで割ったあまりが0だったら、numberは素数ではありません
            }
        }
        if (isPrime) {
            System.out.println(number + "は素数です。");
        } else {
            System.out.println(number + "は素数ではありません。");
        }
    }
}