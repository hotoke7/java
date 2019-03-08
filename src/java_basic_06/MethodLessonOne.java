package java_basic_06;

import java.util.Scanner;

public class MethodLessonOne {
    public static void main(String[] args) {
        // Lesson Java基礎⑥（メソッド）
        // Mainクラスからメソッドを呼び出す
        // 引数を複数指定
        // 呼び出されるメソッドは、戻り値があるものとないものを指定
        // メソッド呼んで、戻り値を受けて、その値をまた別のメソッドにわたすようなものにする

        // 【問題１】数字を入力して引数として渡すと、その数字が素数かどうかを判別するメソッドを作成してください
        // ※素数とは？：１とその数自身との外には約数がない正の整数

        // 以下の作業で、標準入力ができます。
        // 入力された数字は、変数「number」に収納されます。
        Scanner sc = new Scanner(System.in);
        // 「\n」は改行文字です。
        System.out.print("数字を入力してください。\n：");
        int number = sc.nextInt();

        // ■ メソッドを作成してください。
        // そしてnumberを引数としてメソッドに渡してください。
        isPrimeNumber(number);
    }

    // ■ 引数をもらい、処理結果を標準出力するメソッド（返却値なし）
    // 引数が素数かどうかを判断するメソッドを作成してください。
    // このメソッドを実行することで、以下の結果が出力されます。
    // 出力結果：
    // "「number」は素数です。"
    // "「number」は素数ではありません。"
    public static void isPrimeNumber(int number) {
        // 総数可否を判断する為、booleanで変数を宣言します。
        boolean isPrime = true;

        // ■ 素数を判断するロジックを作成してください。
        // Hint：
        // 素数は１とその数自身でしか分けることができません。
        // ⇒「2」から「素数-1」の数では分けることができません。
        // ⇒「2」から「素数-1」の数で分けたら、余りが発生します。
        // ⇒「2」から「素数-1」の数で分けるところで、一回でもあまりが「0」だったら素数ではありません。

        // 「%」を使って剰余算をしましょう。
        // 剰余算：割ったときの余りを計算
        // ex)「5 / 2」の結果は「2 あまり1」となる。このときの「1」が剰余算の結果。
        // あまり = 数字 % 数字;
        // ex) x = 5 % 2　→　x=1;
        for (int i = 2; i < number; i++) {
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