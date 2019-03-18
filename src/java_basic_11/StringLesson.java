package java_basic_11;

public class StringLesson {
    public static void main(String[] args) {
        // Lesson Java基礎⑪（Java基礎クラス）
        // 【問題】Stringクラスのメソッドを使ってみましょう。

        // ■ 以下の文字列を持つString変数を宣言してください。
        // 昼はカレーパンを食べました。
        // 夕食ではグリーンカレーを食べる予定です。
        String lunch = "昼はカレーパンを食べました。";
        String dinner = "夕食ではグリーンカレーを食べる予定です。";

        // ■ 各文字列の長さを標準出力してください。
        // 出力結果：
        // lunch : 14
        // dinner : 20
        System.out.println("lunch : " + lunch.length());
        System.out.println("dinner : " + dinner.length());

        // ■ 以下の文字列を宣言し、年月日を別々で切り出して標準出力してください。
        // 2019/05/14
        // 出力結果：
        // 2019
        // 05
        // 14
        String dateString = "2019/05/14";
        System.out.println(dateString.substring(0, 4));
        System.out.println(dateString.substring(5, 7));
        System.out.println(dateString.substring(8, 10));

        // ■ 以下の文字列から「カレー」を切り出し、その値を新しい変数に収納してください。
        // 昼はカレーパンを食べて、夕食ではグリーンカレーを食べました。
        String curry = "昼はカレーパンを食べて、夕食ではグリーンカレーを食べました。";
        String curryA = curry.substring(2, 5);
        String curryB = curry.substring(20, 23);

        // ■ 二つの文字列の比較結果を標準出力してください。
        // 出力結果：
        // true
        System.out.println(curryA.equals(curryB));
    }
}
