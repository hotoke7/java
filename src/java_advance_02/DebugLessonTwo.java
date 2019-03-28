package java_advance_02;

public class DebugLessonTwo {
    // Lesson Java応用②（デバッグ）
    // ■ 以下のソースコードに潜んでいるバグを修正してください。

    // 機能詳細
    // 2～1000の中で「自分以外のすべての約数を足すと自分になる整数」を探し、該当整数と個数を出力する機能。
    // 例：整数6の約数は1，2，3，6。6以外の約数を全部足すと、1 + 2 + 3 = 6になる。
    // 予想結果：
    // 条件を果たす数字は
    // 6
    // 28
    // 496
    // 3個です。
    public static void main(String[] args) {
        int count = 0;
        int sum;
        int remain;

        System.out.println("条件を果たす数字は");

        // 2から1000までの整数を繰り返す。
        for (int number = 2; number <= 1000; number++) {
            sum = 0;

            // factor：numberの約数の候補となる整数
            // number自身を含まない整数を繰り返す。
            for (int factor = 1; factor < number; factor++) {

                // 整数を約数候補で割った余りが0の場合、factorをnumberの約数と判定する。
                remain = number % factor;
                if (remain == 0) {
                    sum += factor;
                }
            }

            // 約数候補の繰り返しが終了したところで、整数と約数の合計を比較する。
            // 整数と約数合計が同一の場合、求めた数だと判定する。
            if (number == sum) {
                System.out.println(number);
                count++;
            }
        }
        System.out.println(count + "個です。");
    }
}