package java_basic_05;

public class ArrayLesson {
    public static void main(String[] args) {
        // Lesson Java基礎⑤（配列）
        // 配列を宣言する
        // 配列に要素を代入する
        // 配列から要素を取り出してコンソールに出力する

        // 【問題】配列を利用し、昨日の飲み会での飲んだ飲み物を5杯目まで順番で出力してください。

        // 出力結果：
        // 1杯目は、ビールを飲みました。
        // 2杯目は、ハイボールを飲みました。
        // 3杯目は、白ワインを飲みました。
        // 4杯目は、黒ホッピーを飲みました。
        // 5杯目は、レモンサワーを飲みました。

        // ■ 飲み物を格納する配列を宣言してください。
        String[] alcoholOrder = new String[5];

        // ■ 1杯目から5杯目までの飲み物を配列に代入してください。
        alcoholOrder[0] = "ビール";
        alcoholOrder[1] = "ハイボール";
        alcoholOrder[2] = "白ワイン";
        alcoholOrder[3] = "黒ホッピー";
        alcoholOrder[4] = "レモンサワー";

        // ■ 想定する結果が出るように、標準出力をしてください。
        for (int i = 0; i < alcoholOrder.length; i++) {
            System.out.println((i + 1) + "杯目は、" + alcoholOrder[i] + "を飲みました。");
        }
    }
}
