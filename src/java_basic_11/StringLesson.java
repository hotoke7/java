package java_basic_11;

/**
 * Lesson Java基礎⑪（Java基礎クラス）
 * <p>
 * 【問題】
 * Stringを使用して処理を実行してください。
 */
public class StringLesson {

    /**
     * 処理を実行するためのメインメソッド。
     *
     * @param args -
     */
    public static void main(String[] args) {
        // ■ 以下の文字列のString変数を宣言してください。
        // 昼はカレーパンを食べました。
        String lunch = "昼はカレーパンを食べました。";
        // ■ 以下の文字列のString変数を宣言してください。
        // 夕食ではグリーンカレーを食べる予定です。
        String dinner = "夕食ではグリーンカレーを食べる予定です。";

        // ■ 各文字列の長さを標準出力してください。
        // 出力結果：
        // lunch : 14
        // dinner : 20
        System.out.println("lunch : " + lunch.length());
        System.out.println("dinner : " + dinner.length());

        // ■ 以下の文字列を宣言してください。
        // 2019/05/14
        String dateString = "2019/05/14";

        // ■ 宣言した文字列から年月日を別々で切り出して標準出力してください。
        // 出力結果：
        // 2019
        // 05
        // 14
        System.out.println(dateString.substring(0, 4));
        System.out.println(dateString.substring(5, 7));
        System.out.println(dateString.substring(8, 10));

        // ■ 以下の文字列を宣言してください。
        // lorem ipsum dolor sit amet lolem
        String lorem = "lorem ipsum dolor sit amet lorem";

        // ■ 宣言した文字列から最初の5桁と最後の5桁を切り出し、変数に収納してください。
        String loremA = lorem.substring(0, 5);
        String loremB = lorem.substring(lorem.length() - 5);

        // ■ 二つの文字列の比較結果を標準出力してください。
        // 出力結果：
        // true
        System.out.println(loremA.equals(loremB));
    }
}
