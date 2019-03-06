package java_basic_04;

public class SumCalc {
    public static void main(String[] args){

        // Lesson Java基礎④（繰り返し）
        // 結果格納用の変数を宣言する
        // 繰り返し処理で加算処理をする
        // 計算結果を標準出力する

        // 【問題】1から100までを加算して、合計値を出力してください。
        // 出力結果
        // 1から100までの合計は、5050です。

        // ■ 結果格納用変数の宣言してください。
        int result = 0;
        // ■ 繰り返し処理を記述してください。
        for(int i=1;i<=100;i++){
            result += i;
        }
        // ■ 結果を標準出力してください。
        System.out.println("1から100までの合計は、" + result + "です。");
    }
}
