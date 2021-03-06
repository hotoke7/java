package java_basic_03;

/**
 * Lesson Java基礎③（条件分岐）
 * <p>
 * 【問題】
 * 条件分岐と算術演算子を使って、2019年/2020年/2022年がオリンピックの開催される年か判定してください。
 */
public class OlympicYear {

    /**
     * 処理を実行するためのメインメソッド。
     *
     * @param args -
     */
    public static void main(String[] args) {
        // ■ 2019年を格納する変数を宣言してください。
        int year = 2019;

        // ■ 判定の条件分岐と条件式を書いて、標準出力してください。
        if (year % 4 == 0 ){
            System.out.println(year + "年は、夏季オリンピックが開催されます。");
        } else if (year % 4 == 2) {
            System.out.println(year + "年は、冬季オリンピックが開催されます。");
        } else {
            System.out.println(year + "年は、オリンピックが開催されません。");
        }

        // ■ 2020年を格納する変数を宣言してください。
        year = 2020;

        // ■ 判定の条件分岐と条件式を書いて、標準出力してください。
        if (year % 4 == 0 ){
            System.out.println(year + "年は、夏季オリンピックが開催されます。");
        } else if (year % 4 == 2) {
            System.out.println(year + "年は、冬季オリンピックが開催されます。");
        } else {
            System.out.println(year + "年は、オリンピックが開催されません。");
        }

        // ■ 2022年を格納する変数を宣言してください。
        year = 2022;

        // ■ 判定の条件分岐と条件式を書いて、標準出力してください。
        if (year % 4 == 0 ){
            System.out.println(year + "年は、夏季オリンピックが開催されます。");
        } else if (year % 4 == 2) {
            System.out.println(year + "年は、冬季オリンピックが開催されます。");
        } else {
            System.out.println(year + "年は、オリンピックが開催されません。");
        }
    }
}
