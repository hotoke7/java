package java_basic_03;

public class LeepYear {
    public static void main(String[] args){
        // Lesson Java基礎③（条件分岐）
        // 年を宣言する
        // うるう年なのか判定する

        // 【問題】2019年と2020年のうるう年判定をしてください。

        // 出力結果：
        // 2019年は、うるう年ではありません。
        // 2020年は、うるう年です。

        // ■ 2019年を格納する変数を宣言してください。
        int year = 2019;
        // ■ うるう年判定の条件分岐を書いて、標準出力してください。
        if(year % 4 == 0){
            System.out.println(year + "年は、うるう年です。");
        }else{
            System.out.println(year + "年は、うるう年ではありません。");
        }

        // ■ 2020年を格納する変数を宣言してください。
        year = 2020;
        // ■ うるう年判定の条件分岐を書いて、標準出力してください。
        if(year % 4 == 0){
            System.out.println(year + "年は、うるう年です。");
        }else{
            System.out.println(year + "年は、うるう年ではありません。");
        }

    }
}
