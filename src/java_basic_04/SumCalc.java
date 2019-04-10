package java_basic_04;

/**
 * Lesson Java基礎④（繰り返し）
 *
 * 【問題】
 * 1から100までを加算して、合計値を出力してください。
 */
public class SumCalc {

    /**
     * 処理を実行するためのメインメソッド。
     *
     * @param args -
     */
    public static void main(String[] args) {
        // ■ 結果格納用変数の宣言してください。
        int result = 0;
        // ■ 繰り返し処理を記述してください。
        for (int i = 1; i <= 100; i++) {
            result += i;
            // 以下の記述でも可
            // result = result + i;
        }
        // ■ 結果を標準出力してください。
        // 想定出力結果
        // 1から100までの合計は、5050です。
        System.out.println("1から100までの合計は、" + result + "です。");
    }
}
