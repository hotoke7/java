package java_advance_02;

public class DebugLessonTwo {
    // Lesson Java応用②（デバッグ）
    // ■ 以下のソースコードに潜んでいるバグを修正してください。

    // コード詳細
    // 1～6までの値を持つサイコロがあります。
    // このサイコロを振って得た値と、整数12との最大公約数を計算します。
    // この処理を10回繰り返す機能です。
    public static void main(String[] args) {
        int result;
        for (int i = 0; i < 10; i++) {
            result = getGreatestCommonDivisor(12, rollDice());
            System.out.println(result);
        }
    }

    // サイコロを振るメソッド。
    public static int rollDice() {
        int rollResult;
        java.util.Random random = new java.util.Random();
        rollResult = random.nextInt(6) + 1;
        return rollResult;
    }

    // 最大公約数を計算するメソッド
    public static int getGreatestCommonDivisor(int bigNumber, int smallNumber) {
        int remain;
        int gcm;

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
