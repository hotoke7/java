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


        // 実務で使いそうなSubstringの使い方を教えてほしい。
        // ■ 「substring」メソッドを使って、各文字列から「カレー」を切り出してください。


        // 切り出した結果を、新しいString変数に収納してください。


        // Under Construction
        // ■ 「substring」メソッドを使って、各文字列から「カレー」を切り出してください。
        // 切り出した結果を、新しいString変数に収納してください。
        String lunchCurry = lunch.substring(2, 5);
        String dinnerCurry = dinner.substring(8, 11);

        // ■ 「カレー」を切り出して収納した変数を標準出力してください。
        // 出力結果：
        // lunch : カレー
        // dinner : カレー
        System.out.println("lunch : " + lunchCurry);
        System.out.println("dinner : " + dinnerCurry);

        // ■ 「equals」メソッドを使って、切り取った文字列を比較してください。
        // 比較結果は標準出力してください。
        // 出力結果：
        // true
        System.out.println("「equals」比較：");
        System.out.println(lunchCurry.equals(dinnerCurry));
    }
}
