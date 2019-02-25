package ConditionalBranch;

public class ConditionalBranch {
    public static void main(String[] args) {
        // うるう年なのかを判定してみよう！
        int year;
        // うるう年の場合
        year = 2019;
        // 結果表示の処理
        if (year % 4 == 0) {
            System.out.println(year + "年は、うるう年です！");
        }
        else {
            System.out.println(year + "年は、うるう年ではありません！");
        }
        // うるう年でない場合
        year = 2020;
        // 結果表示の処理
        if (year % 4 == 0) {
            System.out.println(year + "年は、うるう年です！");
        }
        else {
            System.out.println(year + "年は、うるう年ではありません！");
        }
    }
}
