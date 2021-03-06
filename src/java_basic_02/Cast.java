package java_basic_02;

/**
 * Lesson Java基礎②（変数/型/キャスト）
 * <p>
 * 【問題】
 * キャストしてください。
 */
public class Cast {

    /**
     * 処理を実行するためのメインメソッド。
     *
     * @param args -
     */
    public static void main(String[] args) {
        // 小数から整数へキャスト
        // ■ 小数点型の変数「x」を宣言して、10.12345を代入してください。
        double x = 10.12345;

        // ■ xを整数型にキャストし、処理結果を標準出力してください。
        System.out.println((int)x);
        int i;
        for (i=2; i < 10; i+=2) {
            System.out.println(i);
        }
    }
}
