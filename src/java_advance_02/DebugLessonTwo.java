package java_advance_02;

public class DebugLessonTwo {
    // Lesson Java応用②（デバッグ）
    // ■ 以下のソースコードに潜んでいるバグを修正してください。

    // 機能詳細
    // 1～6までの値を持つサイコロがあります。
    // このサイコロを2回振って、AとBの二つの値を取得します。
    // 取得した値で「AかけるB」と「AたすB」を取得します。
    // 得た結果の最大公約数を計算します。
    // この処理を10回繰り返す機能です。
    public static void main(String[] args) {
        int result;
        int multiplication;
        int addition;
        int numberA;
        int numberB;

        for (int i = 0; i < 10; i++) {
            numberA = rollDice();
            numberB = rollDice();

            multiplication = numberA * numberB;
            addition = numberA + numberB;
            result = getGreatestCommonDivisor(multiplication, addition);
            System.out.println(addition + "と" + multiplication + "の最大公約数：" + result);
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
     * 2つの整数の最大公約数を計算するメソッド。
     *
     * @param numberOne 整数１
     * @param numberTwo 整数２
     * @return number 二つの整数の最大公約数
     */
    public static int getGreatestCommonDivisor(int numberOne, int numberTwo) {
        int bigNumber;
        int smallNumber;
        int remain;
        int gcm;

        // 二つの引数が同一だったら、最大公約数も引数のまま。
        if (numberOne == numberTwo) {
            return numberOne;
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
            // 大きい数字を小さい数字で分け、その余りを取得。
            remain = bigNumber % smallNumber;

            // 余りがなかったら、小さい数が最大公約数。
            if (remain == 0) {
                gcm = smallNumber;
                break;
            }

            // 余りが発生したら、次の割り算を準備。
            // 小さい数と余りを割り算。
            bigNumber = smallNumber;
            smallNumber = remain;
        }
        return gcm;
    }
}