package java_basic_03;

public class OlympicYear {
    public static void main(String[] args){
        // Lesson Java基礎③（条件分岐）
        // 年を宣言する
        // 夏季オリンピックの年なのか判定する

        // 【問題】条件分岐と算術演算子を使って、2019年と2020年が夏季オリンピックの開催される年か判定してください。

        // 出力結果：
        // 2019年は、夏季オリンピックは開催されません。
        // 2020年は、夏季オリンピックが開催されます。

        // ■ 2019年を格納する変数を宣言してください。
        int year = 2019;
        // ■ 判定の条件分岐と条件式を書いて、標準出力してください。
        if(year % 4 == 0){
            System.out.println(year + "年は、夏季オリンピックが開催されます。");
        }else{
            System.out.println(year + "年は、夏季オリンピックは開催されません。");
        }

        // ■ 2020年を格納する変数を宣言してください。
        year = 2020;
        // ■ 判定の条件分岐と条件式を書いて、標準出力してください。
        if(year % 4 == 0){
            System.out.println(year + "年は、夏季オリンピックが開催されます。");
        }else{
            System.out.println(year + "年は、夏季オリンピックは開催されません。");
        }

    }
}
