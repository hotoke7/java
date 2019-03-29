package java_advance_02;

public class DebugLessonTwo {

    // Lesson Java応用②（デバッグ）
    // ■ 以下のソースコードに潜んでいるバグを修正してください。
    /**
     * 2～1000の中で条件にマッチする数と、個数を出力する。
     * <p>
     * 条件：その数を除く全ての約数の合計が、その数自身となること
     * 例：整数6の約数は1，2，3，6。6以外の約数を全部足すと、1 + 2 + 3 = 6のため、マッチ。
     *
     * @param args -
     */
    public static void main(String[] args) {
        int count = 0;
        System.out.println("条件を果たす数字は");

        // 予想結果：
        // 条件を果たす数字は
        // 6
        // 28
        // 496
        // 3個です。
        for (int number = 2; number <= 1000; number++) {
            if (judgeCondition(number)) {
                System.out.println(number);
                count++;
            }
        }
        System.out.println(count + "個です。");
    }

    /**
     * 引数は条件にマッチするか判定し、結果を返却する。
     * <p>
     * 条件１：引数の約数の個数の合計が、その数となること
     * 条件２：引数の約数自身は約数としてカウントしないこと
     *
     * @param target 判定対象の数
     * @return true:マッチ false:アンマッチ
     */
    private static boolean judgeCondition(int target) {
        int remain = 0;
        int sum = 0;

        // target自身を含まない整数を繰り返す
        for (int i = 1; i < target; i++) {
            // 剰余算の結果が0の場合、約数
            remain = target % i;
            if (remain == 0) {
                sum += i;
            }
        }

        // 対象と約数の合計が同じ場合、条件にマッチ
        if (target == sum) {
            return true;
        }
        return false;
    }
}