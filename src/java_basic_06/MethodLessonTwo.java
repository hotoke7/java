package java_basic_06;

import java.util.Scanner;

public class MethodLessonTwo {
    public static void main(String[] args) {
        // Lesson Java基礎⑥（メソッド）
        // 【問題２】以下の動作をするメソッドを作成してください。
        //　・メソッド１
        // 　　：数字を引数でもらい、数字が3の倍数、5の倍数ならTRUEを、そうではない場合はFALSEを返却する。
        //　・メソッド２
        // 　　：数字とメソッド１の結果を引数でもらい、メソッド１の結果がTRUEだったら「RAKUTEN!」を、そうではない場合は数字を返却する。

        Scanner sc = new Scanner(System.in);
        System.out.print("数字を入力してください。\n：");
        int number = sc.nextInt();

        // 1から入力値までを繰り返します。
        for (int i = 1; i <= number; i++){
            // ■ メソッド１を呼び出してください。
            boolean checkMultipleRes = checkMultiple(i);

            // ■ メソッド２を呼び出してください。
            String checkRakutenRes = checkRakuten(i, checkMultipleRes);

            // ■ メソッド２の結果を出力してください。
            System.out.println(checkRakutenRes);
        }
    }

    // ■ メソッド１：引数をもらい、値を返却するメソッド
    // 数字を引数でもらい、数字が3の倍数、5の倍数ならTRUEを、そうではない場合はFALSEを返却する。
    // このメソッドは以下の値を返却します。
    // 返却値：TRUE、FALSE
    // Hint：MethodLessonOneで使った「%」を利用します。
    public static boolean checkMultiple(int num){
        if (num % 3 == 0) {
            return true;
        } else if (num % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // ■ メソッド２：引数をもらい、値を返却するメソッド
    // 数字とメソッド１の結果を引数でもらい、メソッド１の結果がTRUEだったら「RAKUTEN!」を、そうではない場合は数字を返却する。
    // このメソッドは以下の値を返却します。
    // 返却値："Rakuten!"、引数の数字
    // Hint : 返却値はStringなので、引数の数字を返却するにはキャストが必要です。
    public static String checkRakuten(int num, boolean res){
        if (res) {
            return "Rakuten!";
        } else {
            return String.valueOf(num);
        }
    }
}