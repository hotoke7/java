package java_basic_06;

import java.util.Scanner;

public class MethodLessonTwo {
    public static void main(String[] args) {
        // Lesson Java基礎⑥（メソッド）
        // 【問題２】以下の動作をする機能を作成してください
        // ・数字を入力すると、1から入力した数字までのすべての数字を出力する
        // ・「3または5の倍数」の場合、数字の代わりに"Rakuten!"を出力する
        // 出力結果：
        //   1
        //   2
        //   Rakuten!
        //   4
        // 　Rakuten!
        // 　...

        // 標準入力
        Scanner sc = new Scanner(System.in);
        System.out.print("数字を入力してください。\n："); //「\n」は改行文字です。
        int number = sc.nextInt(); // 入力された数字は、変数「number」に収納されます

        // ■ 作成したメソッド１、２を利用し、問題２の機能を作成してください
        for (int i = 1; i <= number; i++){ // 1から入力値までを繰り返します
            boolean checkMultipleRes = checkMultiple(i); // メソッド１呼び出し
            String checkRakutenRes = checkRakuten(i, checkMultipleRes); // メソッド２呼び出し
            System.out.println(checkRakutenRes); // 結果出力
        }
    }

    // ■ メソッド１
    // 以下の動作をするメソッドを作成してください
    // 引数として数字をもらい、数字が「3または5の倍数」ならTRUEを、そうではない場合はFALSEを返却する
    // 返却値：true　または　false
    public static boolean checkMultiple(int num){
        if (num % 3 == 0) {
            return true;
        } else if (num % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // ■ メソッド２
    // 以下の動作をするメソッドを作成してください
    // 引数として数字と真偽値をもらい、真偽値が「true」だったら「RAKUTEN!」を、そうではない場合は数字を返却する
    // 返却値："Rakuten!"　または　引数の数字
    public static String checkRakuten(int num, boolean res){
        if (res) {
            return "Rakuten!";
        } else {
            return String.valueOf(num);
        }
    }
}