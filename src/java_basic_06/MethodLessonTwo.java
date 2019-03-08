package java_basic_06;

import java.util.Scanner;

public class MethodLessonTwo {
    public static void main(String[] args) {
        // Lesson Java基礎⑥（メソッド）
        // Mainクラスからメソッドを呼び出す
        // 引数を複数指定
        // 呼び出されるメソッドは、戻り値があるものとないものを指定
        // メソッド呼んで、戻り値を受けて、その値をまた別のメソッドにわたすようなものにする

        // 【問題２】数字を入力して引数として渡すと、以下の動作をするメソッドを作成してください。
        //　・1から数字までのすべての数を表示する。
        //　・数字が3の倍数なら｢Fizz｣、5の倍数なら｢Buzz｣、両方の倍数なら｢FizzBuzz｣を数字の代わりに出力する。
        //　・｢Fizz｣、｢Buzz｣、｢FizzBuzz｣が全部で何回出力されたかを表示する。

        Scanner sc = new Scanner(System.in);
        System.out.print("数字を入力してください。\n：");
        int number = sc.nextInt();
        int countFizzBuzz = 0;

        // 1から入力値までを繰り返します。
        for (int i = 1; i <= number; i++){
            // ■ メソッド１を作成してください。
            String fbResult = toFizzBuzz(i);
            System.out.println(fbResult);

            // ■ メソッド２を作成してください。
            countFizzBuzz += addCountFizzBuzz(fbResult);
        }

        // ｢Fizz｣、｢Buzz｣、｢FizzBuzz｣の総件数を出力してください。
        System.out.println("｢Fizz｣、｢Buzz｣、｢FizzBuzz｣の総件数：" + countFizzBuzz + "件");
    }

    // ■ メソッド１：引数をもらい、値を返却するメソッド
    // 引数が3の倍数なら｢Fizz｣、5の倍数なら｢Buzz｣、両方の倍数なら｢FizzBuzz｣を数字の代わりに出力するメソッドを作成してください。
    // 引数が｢Fizz｣｢Buzz｣｢FizzBuzz｣のどちらでもない場合は、数字をそのまま返却してください。
    // Hint①：MethodLessonOneで使った「%」を利用します。
    // Hint➁：このメソッドの返却値タイプはStringです。数字を返却するにはintをStringにキャストする必要があります。
    // このメソッドは以下の値を返却します。
    // 返却値：
    // "Fizz"
    // "Buzz"
    // "FizzBuzz"
    // "targetNum（引数）"
    public static String toFizzBuzz(int targetNum){
       String result = new String();
        if (targetNum % 15 == 0) {
            result = "FizzBuzz";
        } else if (targetNum % 3 == 0) {
            result = "Fizz";
        } else if (targetNum % 5 == 0) {
            result = "Buzz";
        } else {
            result = Integer.toString(targetNum);
        }
        return result;
    }

    // ■ メソッド２：引数をもらい、値を返却するメソッド
    // メソッド１の返却値が｢Fizz｣、｢Buzz｣、｢FizzBuzz｣の場合、1を返却するメソッドを作成してください。
    // 引数が｢Fizz｣｢Buzz｣｢FizzBuzz｣のどちらでもない場合は、0を返却してください。
    // 返却値：
    // 0
    // 1
    public static int addCountFizzBuzz(String fizzBuzzResult){
        if (fizzBuzzResult == "Fizz" || fizzBuzzResult == "Buzz" || fizzBuzzResult == "FizzBuzz") {
            return 1;
        } else {
            return 0;
        }
    }
}
