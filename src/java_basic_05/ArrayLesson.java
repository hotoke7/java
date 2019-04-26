package java_basic_05;

/**
 * Lesson Java基礎⑤（配列）
 * <p>
 * 【問題】
 * 配列を利用し、昨日飲んだ飲み物を出力してください。
 */
public class ArrayLesson {

    /**
     * 処理を実行するためのメインメソッド。
     *
     * @param args -
     */
    public static void main(String[] args) {
        // ■ 飲み物を格納する配列を宣言してください。


        // ■ 1杯目から5杯目までの飲み物を配列に代入してください。
        String[] drinks = new String[]{"ビール", "ハイボール", "白ワイン", "黒ホッピー", "レモンサワー"};

//        System.out.println(drinks[0]);
        /*
         ■ 想定する結果が出るように、標準出力をしてください。
         想定出力結果：
         1杯目は、ビールを飲みました。
         2杯目は、ハイボールを飲みました。
         3杯目は、白ワインを飲みました。
         4杯目は、黒ホッピーを飲みました。
         5杯目は、レモンサワーを飲みました。
        */

        for (int i = 0; i < drinks.length; i++) {
            System.out.println((i + 1) + "杯目は、" + drinks[i] + "を飲みました。");
        }

    }
}
