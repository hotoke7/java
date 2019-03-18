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

        // ■ 以下の文字列を持つ文字列を宣言し、同じアルファベット単位で切り出して標準出力してください。
        // yyyy-MM-dd
        // 出力結果：
        // yyyy
        // MM
        // dd
        String dateString = "yyyy-MM-dd";
        System.out.println(dateString.substring(0, 4));
        System.out.println(dateString.substring(5, 7));
        System.out.println(dateString.substring(8, 10));

        // ■ 以下の文字列を比較し、比較結果を標準出力してください。
        // 出力結果：
        // a & b : true
        // b & c : false
        // c & a : false
        String a = "カレー";
        String b = "カレー";
        String c = "ハヤシライス";

        System.out.println("a & b : " + a.equals(b));
        System.out.println("b & c : " + b.equals(c));
        System.out.println("c & a : " + c.equals(a));
    }
}
