package java_advance_02;

public class DebugLessonTwo {
    // Lesson Java応用②（デバッグ）
    // ■ 以下のソースコードに潜んでいるバグを修正してください。

    // 機能詳細
    // 1～6までの値を持つサイコロがあります。
    // このサイコロを３回振って、A、B、Cの三つの値を取得します。
    // 取得した値で「AたすB」と「AかけるB」を取得します。
    // 得た結果の最大公約数、最小公倍数を計算します。
    // この処理を５回繰り返す機能です。
    public static void main(String[] args) {
        int[] result;
        int numberA, numberB;
        int addition, multiplication;

        for (int i = 0; i < 5; i++) {
            numberA = rollDice();
            numberB = rollDice();

            addition = numberA + numberB;
            multiplication = numberA * numberB;
            result = getGcmAndLcm(addition, multiplication);
            System.out.println(addition + "と" + multiplication + "の最大公約数：" + result[0] + "、最小公倍数：" + result[1]);
        }
    }

    /**
     * サイコロを振って値を返却するメソッド。
     *
     * @return number 実行結果
     */
    public static int rollDice() {
        int rollResult;
        java.util.Random random = new java.util.Random();
        rollResult = random.nextInt(6) + 1;
        return rollResult;
    }

    /**
     * 2つの整数の最大公約数、最小公倍数を計算するメソッド。
     *
     * @param numberOne 整数１
     * @param numberTwo 整数２
     * @return int[] 二つの整数の最大公約数と最小公倍数
     */
    public static int[] getGcmAndLcm(int numberOne, int numberTwo) {
        int bigNumber, smallNumber;
        int remain;
        int gcm, lcm;
        int[] gcmAndLcm = new int[2];

        // 二つの引数が同一だったら、最大公約数も引数のまま。
        if (numberOne == numberTwo) {
            gcmAndLcm[0] = numberOne;
            gcmAndLcm[1] = numberOne;
        }

        // 引数の値を比較し、大きい数字と小さい数字を区分する。
        if (numberOne > numberTwo) {
            bigNumber = numberOne;
            smallNumber = numberTwo;
        } else {
            bigNumber = numberTwo;
            smallNumber = numberOne;
        }

        while (true) {
            // 大きい数字を小さい数字で分けた余りを取得。
            remain = bigNumber % smallNumber;

            // 余りがなかったら、小さい数が最大公約数。
            if (remain == 0) {
                gcm = smallNumber;
                lcm = (numberOne * numberTwo) / gcm;
                break;
            }

            // 余りが発生したら、次の割り算を準備。
            // 小さい数と余りを割り算。
            bigNumber = smallNumber;
            smallNumber = remain;
        }

        gcmAndLcm[0] = gcm;
        gcmAndLcm[1] = lcm;
        return gcmAndLcm;
    }
}