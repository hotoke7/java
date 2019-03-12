package java_basic_06;

import java.util.Scanner;

public class MethodLessonTwo {
    // Lesson Java基礎⑥（メソッド）
    // 【問題２】以下の動作をする機能を作成してください
    // ・数字を入力すると、1から入力した数字までのすべての数字を出力する
    // ・「3または5の倍数」の場合、数字の代わりに"Rakuten!"を出力する

    // 以下の手順に従って作成
    // 1．メソッド①作成
    // 2. メソッド②作成
    // 3. 機能作成

    public static void main(String[] args) {
        // 標準入力
        // 入力された数字は、変数「number」に収納されます
        Scanner sc = new Scanner(System.in);
        System.out.print("数字を入力してください。\n："); //「\n」は改行文字です。
        int number = sc.nextInt();

        // 3．機能作成
        // ■ 作成したメソッド１、２を利用し、問題２の機能を作成してください
        for (int i = 1; i <= number; i++){
            // メソッド①・②を呼び出し、結果をconvertResultに収納
            String convertResult = convertRakuten(i, isMultiple(i));
            System.out.println(convertResult); // 結果出力

            // 一行でも書けます
            // System.out.println(convertRakuten(i, isMultiple(i)));
        }
    }

    // 1．メソッド①作成
    // ■ 以下の動作をするメソッドを作成してください
    // 引数：数字
    // 動作：数字が「3または5の倍数」ならTRUEを、そうではない場合はFALSEを返却する
    // 返却値：真偽値
    public static boolean isMultiple(int num){
        if (num % 3 == 0 || num % 5 == 0) {
            return true;
        }
        return false;

        // 以下も可能です
        // return num % 3 == 0 || num % 5 == 0;
    }

    // 2．メソッド②作成
    // ■ 以下の動作をするメソッドを作成してください
    // 引数：数字、真偽値
    // 動作：真偽値が「true」だったら「RAKUTEN!」を、そうではない場合は数字を返却
    // 返却値："Rakuten!"　または　引数の数字
    public static String convertRakuten(int num, boolean isRakuten){
        if (isRakuten) {
            return "Rakuten!";
        }
        return String.valueOf(num);
    }
}